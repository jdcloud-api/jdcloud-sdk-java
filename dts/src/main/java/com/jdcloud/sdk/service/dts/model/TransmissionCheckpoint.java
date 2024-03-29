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

package com.jdcloud.sdk.service.dts.model;

import java.util.List;
import java.util.ArrayList;

/**
 * transmissionCheckpoint
 */
public class TransmissionCheckpoint  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 数据传输任务起始位点 MySQL GTID，当源库为MySQL，且为增量传输时，可传递此参数（仅限源为MySQL）
     */
    private String gtid;

    /**
     * 数据传输任务起始位点，MASTER_LOG_FILE，当源库为MySQL，且为增量传输时，可选择GTID或者LOG_FILE_POS（仅限源为MySQL）
     */
    private String logFile;

    /**
     * MySQL 数据传输任务开始位点，MASTER_LOG_POS（仅限源为MySQL）
     */
    private Integer logPos;

    /**
     * 数据传输任务延迟（仅限源为MySQL）
     */
    private Integer delay;

    /**
     * MongoDB checkpoint
     */
    
    private List<MongoDBCheckpoint> mongoDbCheckpoints;
    /**
     * TiCDC checkpoint tso
     */
    private Integer checkpointTSO;

    /**
     * TiCDC checkpoint timestamp
     */
    private String checkpointTime;



    /**
     * get 数据传输任务起始位点 MySQL GTID，当源库为MySQL，且为增量传输时，可传递此参数（仅限源为MySQL）
     *
     * @return
     */
    public String getGtid() {
        return gtid;
    }

    /**
     * set 数据传输任务起始位点 MySQL GTID，当源库为MySQL，且为增量传输时，可传递此参数（仅限源为MySQL）
     *
     * @param gtid
     */
    public void setGtid(String gtid) {
        this.gtid = gtid;
    }


    /**
     * get 数据传输任务起始位点，MASTER_LOG_FILE，当源库为MySQL，且为增量传输时，可选择GTID或者LOG_FILE_POS（仅限源为MySQL）
     *
     * @return
     */
    public String getLogFile() {
        return logFile;
    }

    /**
     * set 数据传输任务起始位点，MASTER_LOG_FILE，当源库为MySQL，且为增量传输时，可选择GTID或者LOG_FILE_POS（仅限源为MySQL）
     *
     * @param logFile
     */
    public void setLogFile(String logFile) {
        this.logFile = logFile;
    }


    /**
     * get MySQL 数据传输任务开始位点，MASTER_LOG_POS（仅限源为MySQL）
     *
     * @return
     */
    public Integer getLogPos() {
        return logPos;
    }

    /**
     * set MySQL 数据传输任务开始位点，MASTER_LOG_POS（仅限源为MySQL）
     *
     * @param logPos
     */
    public void setLogPos(Integer logPos) {
        this.logPos = logPos;
    }


    /**
     * get 数据传输任务延迟（仅限源为MySQL）
     *
     * @return
     */
    public Integer getDelay() {
        return delay;
    }

    /**
     * set 数据传输任务延迟（仅限源为MySQL）
     *
     * @param delay
     */
    public void setDelay(Integer delay) {
        this.delay = delay;
    }


    /**
    * get MongoDB checkpoint
    *
    * @return
    */
    public List<MongoDBCheckpoint> getMongoDbCheckpoints() {
        return mongoDbCheckpoints;
    }

    /**
    * set MongoDB checkpoint
    *
    * @param mongoDbCheckpoints
    */
    public void setMongoDbCheckpoints(List<MongoDBCheckpoint> mongoDbCheckpoints) {
        this.mongoDbCheckpoints = mongoDbCheckpoints;
    }


    /**
     * get TiCDC checkpoint tso
     *
     * @return
     */
    public Integer getCheckpointTSO() {
        return checkpointTSO;
    }

    /**
     * set TiCDC checkpoint tso
     *
     * @param checkpointTSO
     */
    public void setCheckpointTSO(Integer checkpointTSO) {
        this.checkpointTSO = checkpointTSO;
    }


    /**
     * get TiCDC checkpoint timestamp
     *
     * @return
     */
    public String getCheckpointTime() {
        return checkpointTime;
    }

    /**
     * set TiCDC checkpoint timestamp
     *
     * @param checkpointTime
     */
    public void setCheckpointTime(String checkpointTime) {
        this.checkpointTime = checkpointTime;
    }



    /**
     * set 数据传输任务起始位点 MySQL GTID，当源库为MySQL，且为增量传输时，可传递此参数（仅限源为MySQL）
     *
     * @param gtid
     */
    public TransmissionCheckpoint gtid(String gtid) {
        this.gtid = gtid;
        return this;
    }


    /**
     * set 数据传输任务起始位点，MASTER_LOG_FILE，当源库为MySQL，且为增量传输时，可选择GTID或者LOG_FILE_POS（仅限源为MySQL）
     *
     * @param logFile
     */
    public TransmissionCheckpoint logFile(String logFile) {
        this.logFile = logFile;
        return this;
    }


    /**
     * set MySQL 数据传输任务开始位点，MASTER_LOG_POS（仅限源为MySQL）
     *
     * @param logPos
     */
    public TransmissionCheckpoint logPos(Integer logPos) {
        this.logPos = logPos;
        return this;
    }


    /**
     * set 数据传输任务延迟（仅限源为MySQL）
     *
     * @param delay
     */
    public TransmissionCheckpoint delay(Integer delay) {
        this.delay = delay;
        return this;
    }


    /**
    * set MongoDB checkpoint
    *
    * @param mongoDbCheckpoints
    */
    public TransmissionCheckpoint mongoDbCheckpoints(List<MongoDBCheckpoint> mongoDbCheckpoints) {
        this.mongoDbCheckpoints = mongoDbCheckpoints;
        return this;
    }


    /**
     * set TiCDC checkpoint tso
     *
     * @param checkpointTSO
     */
    public TransmissionCheckpoint checkpointTSO(Integer checkpointTSO) {
        this.checkpointTSO = checkpointTSO;
        return this;
    }


    /**
     * set TiCDC checkpoint timestamp
     *
     * @param checkpointTime
     */
    public TransmissionCheckpoint checkpointTime(String checkpointTime) {
        this.checkpointTime = checkpointTime;
        return this;
    }



    /**
     * add item to MongoDB checkpoint
     *
     * @param mongoDbCheckpoint
     */
    public void addMongoDbCheckpoint(MongoDBCheckpoint mongoDbCheckpoint) {
        if (this.mongoDbCheckpoints == null) {
            this.mongoDbCheckpoints = new ArrayList<>();
        }
        this.mongoDbCheckpoints.add(mongoDbCheckpoint);
    }
}