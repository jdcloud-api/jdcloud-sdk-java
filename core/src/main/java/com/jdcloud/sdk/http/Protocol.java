package com.jdcloud.sdk.http;

public enum Protocol {
	HTTP {
		@Override
		public String toString() {
			return "http";
		}
	},
	HTTPS {
		@Override
		public String toString() {
			return "https";
		}
	}
}
