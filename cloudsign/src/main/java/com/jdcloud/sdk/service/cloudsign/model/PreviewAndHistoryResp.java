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

package com.jdcloud.sdk.service.cloudsign.model;

import java.util.List;
import java.util.ArrayList;

/**
 * previewAndHistoryResp
 */
public class PreviewAndHistoryResp  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 合同操作历史记录
     */
    
    private List<HistoryContractInfo> historyInfo;
    /**
     * 用户名
     */
    
    private List<String> names;
    /**
     * pdfViewInfo
     */
    private PdfViewInfo pdfViewInfo;



    /**
    * get 合同操作历史记录
    *
    * @return
    */
    public List<HistoryContractInfo> getHistoryInfo() {
        return historyInfo;
    }

    /**
    * set 合同操作历史记录
    *
    * @param historyInfo
    */
    public void setHistoryInfo(List<HistoryContractInfo> historyInfo) {
        this.historyInfo = historyInfo;
    }


    /**
    * get 用户名
    *
    * @return
    */
    public List<String> getNames() {
        return names;
    }

    /**
    * set 用户名
    *
    * @param names
    */
    public void setNames(List<String> names) {
        this.names = names;
    }


    /**
     * get pdfViewInfo
     *
     * @return
     */
    public PdfViewInfo getPdfViewInfo() {
        return pdfViewInfo;
    }

    /**
     * set pdfViewInfo
     *
     * @param pdfViewInfo
     */
    public void setPdfViewInfo(PdfViewInfo pdfViewInfo) {
        this.pdfViewInfo = pdfViewInfo;
    }



    /**
    * set 合同操作历史记录
    *
    * @param historyInfo
    */
    public PreviewAndHistoryResp historyInfo(List<HistoryContractInfo> historyInfo) {
        this.historyInfo = historyInfo;
        return this;
    }


    /**
    * set 用户名
    *
    * @param names
    */
    public PreviewAndHistoryResp names(List<String> names) {
        this.names = names;
        return this;
    }


    /**
     * set pdfViewInfo
     *
     * @param pdfViewInfo
     */
    public PreviewAndHistoryResp pdfViewInfo(PdfViewInfo pdfViewInfo) {
        this.pdfViewInfo = pdfViewInfo;
        return this;
    }



    /**
     * add item to 合同操作历史记录
     *
     * @param historyInfo
     */
    public void addHistoryInfo(HistoryContractInfo historyInfo) {
        if (this.historyInfo == null) {
            this.historyInfo = new ArrayList<>();
        }
        this.historyInfo.add(historyInfo);
    }

    /**
     * add item to 用户名
     *
     * @param name
     */
    public void addName(String name) {
        if (this.names == null) {
            this.names = new ArrayList<>();
        }
        this.names.add(name);
    }
}