package com.jdcloud.sdk.utils;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/**
 * Author xumanyi1
 * 2017/7/18
 * 11:12
 * function  串验证
 */
public class Validate {
    private static final String DEFAULT_IS_NULL_EX_MESSAGE = "The validated object is null";

    public Validate() {}

    public static void isTrue(final boolean expression, final String message, final Object... values) {
        if (!expression) {
            throw new IllegalArgumentException(String.format(message, values));
        }
    }

    public static <T> T notNull(final T object, final String message, final Object... values) {
        if (object == null) {
            throw new NullPointerException(String.format(message, values));
        }
        return object;
    }

    public static <T> T paramNotNull(final T object, final String paramName) {
        if (object == null) {
            throw new NullPointerException(String.format("%s must not be null.", paramName));
        }
        return object;
    }

    public static <T> T[] notEmpty(final T[] array, final String message, final Object... values) {
        if (array == null) {
            throw new NullPointerException(String.format(message, values));
        }
        if (array.length == 0) {
            throw new IllegalArgumentException(String.format(message, values));
        }
        return array;
    }

    public static <T extends Collection<?>> T notEmpty(final T collection, final String message, final Object... values) {
        if (collection == null) {
            throw new NullPointerException(String.format(message, values));
        }
        if (collection.isEmpty()) {
            throw new IllegalArgumentException(String.format(message, values));
        }
        return collection;
    }

    public static <T extends Map<?, ?>> T notEmpty(final T map, final String message, final Object... values) {
        if (map == null) {
            throw new NullPointerException(String.format(message, values));
        }
        if (map.isEmpty()) {
            throw new IllegalArgumentException(String.format(message, values));
        }
        return map;
    }

    public static <T extends CharSequence> T notEmpty(final T chars, final String message, final Object... values) {
        if (chars == null) {
            throw new NullPointerException(String.format(message, values));
        }
        if (chars.length() == 0) {
            throw new IllegalArgumentException(String.format(message, values));
        }
        return chars;
    }

    public static <T extends CharSequence> T notBlank(final T chars, final String message, final Object... values) {
        if (chars == null) {
            throw new NullPointerException(String.format(message, values));
        }
        if (StringUtils.isBlank(chars)) {
            throw new IllegalArgumentException(String.format(message, values));
        }
        return chars;
    }

    public static <T> T[] noNullElements(final T[] array, final String message, final Object... values) {
        Validate.notNull(array, message);
        for (T anArray : array) {
            if (anArray == null) {
                throw new IllegalArgumentException(String.format(message, values));
            }
        }
        return array;
    }

    public static <T extends Iterable<?>> T noNullElements(final T iterable, final String message, final Object... values) {
        Validate.notNull(iterable, DEFAULT_IS_NULL_EX_MESSAGE);
        int i = 0;
        for (final Iterator<?> it = iterable.iterator(); it.hasNext(); i++) {
            if (it.next() == null) {
                throw new IllegalArgumentException(String.format(message, values));
            }
        }
        return iterable;
    }

    public static void validState(final boolean expression, final String message, final Object... values) {
        if (!expression) {
            throw new IllegalStateException(String.format(message, values));
        }
    }

    public static <T extends Comparable<U>, U> T inclusiveBetween(final U start, final U end, final T value,
                                                                  final String message, final Object... values) {
        if (value.compareTo(start) < 0 || value.compareTo(end) > 0) {
            throw new IllegalArgumentException(String.format(message, values));
        }
        return value;
    }

    public static long inclusiveBetween(final long start, final long end, final long value, final String message) {
        if (value < start || value > end) {
            throw new IllegalArgumentException(message);
        }
        return value;
    }

    public static double inclusiveBetween(final double start, final double end, final double value, final String message) {
        if (value < start || value > end) {
            throw new IllegalArgumentException(message);
        }
        return value;
    }

    public static <T extends Comparable<U>, U> T exclusiveBetween(final U start, final U end, final T value,
                                                                  final String message, final Object... values) {
        if (value.compareTo(start) <= 0 || value.compareTo(end) >= 0) {
            throw new IllegalArgumentException(String.format(message, values));
        }
        return value;
    }

    public static long exclusiveBetween(final long start, final long end, final long value, final String message) {
        if (value <= start || value >= end) {
            throw new IllegalArgumentException(message);
        }
        return value;
    }

    public static double exclusiveBetween(final double start, final double end, final double value, final String message) {
        if (value <= start || value >= end) {
            throw new IllegalArgumentException(message);
        }
        return value;
    }

    public static String isInstanceOf(final Class<?> type, final Object obj, final String message, final Object... values) {
        // TODO when breaking BC, consider returning obj
        if (!type.isInstance(obj)) {
            throw new IllegalArgumentException(String.format(message, values));
        }
        return message;
    }

    public static void isAssignableFrom(final Class<?> superType, final Class<?> type,
                                        final String message, final Object... values) {
        if (!superType.isAssignableFrom(type)) {
            throw new IllegalArgumentException(String.format(message, values));
        }
    }

}
