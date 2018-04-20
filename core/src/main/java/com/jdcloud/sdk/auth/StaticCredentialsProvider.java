package com.jdcloud.sdk.auth;

public class StaticCredentialsProvider implements CredentialsProvider {

    private ICredentials credential;

    public StaticCredentialsProvider(String accessKeyId, String secretKey) {
        credential = new StaticCredential(accessKeyId, secretKey);
    }

    @Override
    public ICredentials getCredentials() {
        return credential;
    }

    private static class StaticCredential implements ICredentials {

        private String accessKeyId;
        private String secretAccessKey;

        private StaticCredential(String accessKeyId, String secretKey) {
            this.accessKeyId = accessKeyId;
            this.secretAccessKey = secretKey;
        }

        @Override
        public String accessKeyId() {
            return accessKeyId;
        }

        @Override
        public String secretAccessKey() {
            return secretAccessKey;
        }

    }

}
