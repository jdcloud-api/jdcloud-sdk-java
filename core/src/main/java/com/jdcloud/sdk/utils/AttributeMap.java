package com.jdcloud.sdk.utils;

import java.util.HashMap;
import java.util.Map;


public final class AttributeMap {

    private final Map<Key<?>, Object> attributes;

    private AttributeMap(Map<? extends Key<?>, ?> attributes) {
        this.attributes = new HashMap<>(attributes);
    }

    /**
     * Return true if the provided key is configured in this map. Useful for differentiating between whether the provided key was
     * not configured in the map or if it is configured, but its value is null.
     */
    public <T> boolean containsKey(Key<T> typedKey) {
        return attributes.containsKey(typedKey);
    }

    /**
     * Get the value associated with the provided key from this map. This will return null if the value is not set or if the
     * value
     * stored is null. These cases can be disambiguated using {@link #containsKey(Key)}.
     */
    public <T> T get(Key<T> key) {
        Validate.notNull(key, "Key to retrieve must not be null.");
        return key.convertValue(attributes.get(key));
    }

    public static AttributeMap empty() {
        return builder().build();
    }

    /**
     * An abstract class extended by pseudo-enums defining the key for data that is stored in the {@link AttributeMap}. For
     * example, a {@code ClientOption<T>} may extend this to define options that can be stored in an {@link AttributeMap}.
     */
    public abstract static class Key<T> {

        private final Class<T> valueClass;

        /**
         * Configure the class of {@code T}.
         */
        protected Key(Class<T> valueClass) {
            this.valueClass = valueClass;
        }

        /**
         * Validate the provided value is of the correct type.
         */
        final void validateValue(Object value) {
            if (value != null) {
                Validate.isAssignableFrom(valueClass, value.getClass(),
                        "Invalid option: %s. Required value of type %s, but was %s.",
                        this, valueClass, value.getClass());
            }
        }

        /**
         * Validate the provided value is of the correct type and convert it to the proper type for this option.
         */
        final T convertValue(Object value) {
            validateValue(value);
            return valueClass.cast(value);
        }
    }

    @Override
    public String toString() {
        return attributes.toString();
    }

    @Override
    public int hashCode() {
        return attributes.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof AttributeMap && attributes.equals(((AttributeMap) obj).attributes);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {

        private final Map<Key<?>, Object> configuration = new HashMap<>();

        private Builder() {
        }

        public <T> T get(Key<T> key) {
            Validate.notNull(key, "Key to retrieve must not be null.");
            return key.convertValue(configuration.get(key));
        }

        /**
         * Add a mapping between the provided key and value.
         */
        public <T> Builder put(Key<T> key, T value) {
            Validate.notNull(key, "Key to set must not be null.");
            configuration.put(key, value);
            return this;
        }

        public AttributeMap build() {
            return new AttributeMap(configuration);
        }
    }

}
