// Copyright 2018-2025 JDCLOUD.COM
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
// This utils is modified from AWS utils.

package com.jdcloud.sdk.utils;

import java.net.InetAddress;
import java.net.URI;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Author xumanyi1
 * 2017/7/18
 * 16:38
 * function 服务器名工具类
 */
public class HostNameUtils {
    private static final Pattern S3_ENDPOINT_PATTERN =
            Pattern.compile("^(?:.+\\.)?s3[.-]([a-z0-9-]+)$");

    private static final Pattern STANDARD_CLOUDSEARCH_ENDPOINT_PATTERN =
            Pattern.compile("^(?:.+\\.)?([a-z0-9-]+)\\.cloudsearch$");

    private static final Pattern EXTENDED_CLOUDSEARCH_ENDPOINT_PATTERN =
            Pattern.compile("^(?:.+\\.)?([a-z0-9-]+)\\.cloudsearch\\..+");

    /**
     * @deprecated in favor of {@link #parseRegionName(String, String)}.
     */
    @Deprecated
    public static String parseRegionName(URI endpoint) {
        return parseRegion(endpoint.getHost(), null);
    }

    /**
     * Attempts to parse the region name from an endpoint based on conventions
     * about the endpoint format.
     *
     * @param host         the hostname to parse
     * @param serviceHint  an optional hint about the service for the endpoint
     * @return the region parsed from the hostname, or
     *                     &quot;us-east-1&quot; if no region information
     *                     could be found.
     * @deprecated in favor of {@link #parseRegion(String, String)}.
     */
    @Deprecated
    public static String parseRegionName(final String host,
                                         final String serviceHint) {
        String region = parseRegion(host, serviceHint);

        // If region is null, then endpoint is totally non-standard;
        // guess us-east-1 for lack of a better option.
        return region == null ? "us-east-1" : region;
    }

    /**
     * Attempts to parse the region name from an endpoint based on conventions
     * about the endpoint format.
     *
     * @param host         the hostname to parse
     * @param serviceHint  an optional hint about the service for the endpoint
     * @return the region parsed from the hostname, or
     *                     null if no region information could be found.
     */
    public static String parseRegion(final String host,
                                     final String serviceHint) {

        if (host == null) {
            throw new IllegalArgumentException("hostname cannot be null");
        }
        String regionNameInInternalConfig = parseRegionNameByInternalConfig(host);
        if (regionNameInInternalConfig != null) {
            return regionNameInInternalConfig;
        }

        if (serviceHint != null) {
            if ("cloudsearch".equals(serviceHint)
                    && !host.startsWith("cloudsearch.")) {

                // CloudSearch domains use the nonstandard domain format
                // [domain].[region].cloudsearch.[suffix].

                Matcher matcher = EXTENDED_CLOUDSEARCH_ENDPOINT_PATTERN
                        .matcher(host);

                if (matcher.matches()) {
                    return matcher.group(1);
                }
            }

            // If we have a service hint, look for 'service.[region]' or
            // 'service-[region]' in the endpoint's hostname.
            Pattern pattern = Pattern.compile(
                    "^(?:.+\\.)?"
                            + Pattern.quote(serviceHint)
                            + "[.-]([a-z0-9-]+)\\."
            );

            Matcher matcher = pattern.matcher(host);
            if (matcher.find()) {
                return matcher.group(1);
            }
        }

        // If region is null, then endpoint is totally non-standard;
        // guess cn-north-1 for lack of a better option.
        return "cn-north-1";
    }

    /**
     * @return the configured region name if the given host name matches any of
     *         the host-to-region mappings in the internal config; otherwise
     *         return null.
     */
    private static String parseRegionNameByInternalConfig(String host) {
//        InternalConfig internConfig = InternalConfig.Factory.getInternalConfig();
//
//        for (HostRegexToRegionMapping mapping : internConfig.getHostRegexToRegionMappings()) {
//            if (mapping.isHostNameMatching(host)) {
//                return mapping.getRegionName();
//            }
//        }

        return null;
    }

    /**
     * Returns the host name for the local host. If the operation is not allowed
     * by the security check, the textual representation of the IP address of
     * the local host is returned instead. If the ip address of the local host
     * cannot be resolved or if there is any other failure, "localhost" is
     * returned as a fallback.
     */
    public static String localHostName() {
        try {
            InetAddress localhost = InetAddress.getLocalHost();
            return localhost.getHostName();
        } catch (Exception e) {
//            InternalLogFactory.getLog(HostNameUtils.class)
//                    .debug(
//                            "Failed to determine the local hostname; fall back to "
//                                    + "use \"localhost\".", e);
            return "localhost";
        }
    }
}
