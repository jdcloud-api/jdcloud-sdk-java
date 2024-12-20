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

package com.jdcloud.sdk.service.logs.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;

/**
 * k8sStdoutSpec
 */
public class K8sStdoutSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * container为空表所有的，不为空采集指定的容器
     */
    private String container;

    /**
     * labelSelectorSpec
     */
    private K8sLabelSelectorSpec labelSelectorSpec;

    /**
     * nameSpaceSelectorSpec
     * Required:true
     */
    @Required
    private K8sNameSpaceSelectorSpec nameSpaceSelectorSpec;

    /**
     * 选择器类型。Enum&lt;string&gt;: allContainers, workload, labels
     * Required:true
     */
    @Required
    private String selectorType;

    /**
     * 工作负载信息。注意：此字段可能返回 null，表示取不到有效值。
     */
    
    private List<WorkLoadSpec> workLoads;


    /**
     * get container为空表所有的，不为空采集指定的容器
     *
     * @return
     */
    public String getContainer() {
        return container;
    }

    /**
     * set container为空表所有的，不为空采集指定的容器
     *
     * @param container
     */
    public void setContainer(String container) {
        this.container = container;
    }


    /**
     * get labelSelectorSpec
     *
     * @return
     */
    public K8sLabelSelectorSpec getLabelSelectorSpec() {
        return labelSelectorSpec;
    }

    /**
     * set labelSelectorSpec
     *
     * @param labelSelectorSpec
     */
    public void setLabelSelectorSpec(K8sLabelSelectorSpec labelSelectorSpec) {
        this.labelSelectorSpec = labelSelectorSpec;
    }


    /**
     * get nameSpaceSelectorSpec
     *
     * @return
     */
    public K8sNameSpaceSelectorSpec getNameSpaceSelectorSpec() {
        return nameSpaceSelectorSpec;
    }

    /**
     * set nameSpaceSelectorSpec
     *
     * @param nameSpaceSelectorSpec
     */
    public void setNameSpaceSelectorSpec(K8sNameSpaceSelectorSpec nameSpaceSelectorSpec) {
        this.nameSpaceSelectorSpec = nameSpaceSelectorSpec;
    }


    /**
     * get 选择器类型。Enum&lt;string&gt;: allContainers, workload, labels
     *
     * @return
     */
    public String getSelectorType() {
        return selectorType;
    }

    /**
     * set 选择器类型。Enum&lt;string&gt;: allContainers, workload, labels
     *
     * @param selectorType
     */
    public void setSelectorType(String selectorType) {
        this.selectorType = selectorType;
    }


    /**
    * get 工作负载信息。注意：此字段可能返回 null，表示取不到有效值。
    *
    * @return
    */
    public List<WorkLoadSpec> getWorkLoads() {
        return workLoads;
    }

    /**
    * set 工作负载信息。注意：此字段可能返回 null，表示取不到有效值。
    *
    * @param workLoads
    */
    public void setWorkLoads(List<WorkLoadSpec> workLoads) {
        this.workLoads = workLoads;
    }



    /**
     * set container为空表所有的，不为空采集指定的容器
     *
     * @param container
     */
    public K8sStdoutSpec container(String container) {
        this.container = container;
        return this;
    }


    /**
     * set labelSelectorSpec
     *
     * @param labelSelectorSpec
     */
    public K8sStdoutSpec labelSelectorSpec(K8sLabelSelectorSpec labelSelectorSpec) {
        this.labelSelectorSpec = labelSelectorSpec;
        return this;
    }


    /**
     * set nameSpaceSelectorSpec
     *
     * @param nameSpaceSelectorSpec
     */
    public K8sStdoutSpec nameSpaceSelectorSpec(K8sNameSpaceSelectorSpec nameSpaceSelectorSpec) {
        this.nameSpaceSelectorSpec = nameSpaceSelectorSpec;
        return this;
    }


    /**
     * set 选择器类型。Enum&lt;string&gt;: allContainers, workload, labels
     *
     * @param selectorType
     */
    public K8sStdoutSpec selectorType(String selectorType) {
        this.selectorType = selectorType;
        return this;
    }


    /**
    * set 工作负载信息。注意：此字段可能返回 null，表示取不到有效值。
    *
    * @param workLoads
    */
    public K8sStdoutSpec workLoads(List<WorkLoadSpec> workLoads) {
        this.workLoads = workLoads;
        return this;
    }



    /**
     * add item to 工作负载信息。注意：此字段可能返回 null，表示取不到有效值。
     *
     * @param workLoad
     */
    public void addWorkLoad(WorkLoadSpec workLoad) {
        if (this.workLoads == null) {
            this.workLoads = new ArrayList<>();
        }
        this.workLoads.add(workLoad);
    }
}