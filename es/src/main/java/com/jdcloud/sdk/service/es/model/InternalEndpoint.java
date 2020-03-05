/*
 * Copyright 2018 JDCLOUD.COM
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http:#www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * 
 * 
 *
 * 
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.es.model;

import java.util.List;
import java.util.ArrayList;

/**
 * internalEndpoint
 */
public class InternalEndpoint  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * es http endpoint
     */
    private String esHttpEndpoint;

    /**
     * es tcp endpoint
     */
    private List<String> esTcpEndpoint;

    /**
     * kibana endpoint
     */
    private String kibanaEndpoint;


    /**
     * get es http endpoint
     *
     * @return
     */
    public String getEsHttpEndpoint() {
        return esHttpEndpoint;
    }

    /**
     * set es http endpoint
     *
     * @param esHttpEndpoint
     */
    public void setEsHttpEndpoint(String esHttpEndpoint) {
        this.esHttpEndpoint = esHttpEndpoint;
    }

    /**
     * get es tcp endpoint
     *
     * @return
     */
    public List<String> getEsTcpEndpoint() {
        return esTcpEndpoint;
    }

    /**
     * set es tcp endpoint
     *
     * @param esTcpEndpoint
     */
    public void setEsTcpEndpoint(List<String> esTcpEndpoint) {
        this.esTcpEndpoint = esTcpEndpoint;
    }

    /**
     * get kibana endpoint
     *
     * @return
     */
    public String getKibanaEndpoint() {
        return kibanaEndpoint;
    }

    /**
     * set kibana endpoint
     *
     * @param kibanaEndpoint
     */
    public void setKibanaEndpoint(String kibanaEndpoint) {
        this.kibanaEndpoint = kibanaEndpoint;
    }


    /**
     * set es http endpoint
     *
     * @param esHttpEndpoint
     */
    public InternalEndpoint esHttpEndpoint(String esHttpEndpoint) {
        this.esHttpEndpoint = esHttpEndpoint;
        return this;
    }

    /**
     * set es tcp endpoint
     *
     * @param esTcpEndpoint
     */
    public InternalEndpoint esTcpEndpoint(List<String> esTcpEndpoint) {
        this.esTcpEndpoint = esTcpEndpoint;
        return this;
    }

    /**
     * set kibana endpoint
     *
     * @param kibanaEndpoint
     */
    public InternalEndpoint kibanaEndpoint(String kibanaEndpoint) {
        this.kibanaEndpoint = kibanaEndpoint;
        return this;
    }


    /**
     * add item to es tcp endpoint
     *
     * @param esTcpEndpoint
     */
    public void addEsTcpEndpoint(String esTcpEndpoint) {
        if (this.esTcpEndpoint == null) {
            this.esTcpEndpoint = new ArrayList<>();
        }
        this.esTcpEndpoint.add(esTcpEndpoint);
    }

}