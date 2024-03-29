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

package com.jdcloud.sdk.service.starshield.model;

import java.util.List;
import java.util.ArrayList;

/**
 * opZoneRecordDetails
 */
public class OpZoneRecordDetails  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * opZoneRecords
     */
    private OpZoneRecords opZoneRecords;

    /**
     * sameContentZones
     */
    
    private List<SameContentZones> sameContentZones;


    /**
     * get opZoneRecords
     *
     * @return
     */
    public OpZoneRecords getOpZoneRecords() {
        return opZoneRecords;
    }

    /**
     * set opZoneRecords
     *
     * @param opZoneRecords
     */
    public void setOpZoneRecords(OpZoneRecords opZoneRecords) {
        this.opZoneRecords = opZoneRecords;
    }


    /**
    * get sameContentZones
    *
    * @return
    */
    public List<SameContentZones> getSameContentZones() {
        return sameContentZones;
    }

    /**
    * set sameContentZones
    *
    * @param sameContentZones
    */
    public void setSameContentZones(List<SameContentZones> sameContentZones) {
        this.sameContentZones = sameContentZones;
    }



    /**
     * set opZoneRecords
     *
     * @param opZoneRecords
     */
    public OpZoneRecordDetails opZoneRecords(OpZoneRecords opZoneRecords) {
        this.opZoneRecords = opZoneRecords;
        return this;
    }


    /**
    * set sameContentZones
    *
    * @param sameContentZones
    */
    public OpZoneRecordDetails sameContentZones(List<SameContentZones> sameContentZones) {
        this.sameContentZones = sameContentZones;
        return this;
    }



    /**
     * add item to sameContentZones
     *
     * @param sameContentZone
     */
    public void addSameContentZone(SameContentZones sameContentZone) {
        if (this.sameContentZones == null) {
            this.sameContentZones = new ArrayList<>();
        }
        this.sameContentZones.add(sameContentZone);
    }
}