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

import com.jdcloud.sdk.annotation.Required;

/**
 * workLoadSpec
 */
public class WorkLoadSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 容器名。 标准输出模式下，为空表示全部容器。
     */
    private String container;

    /**
     * 工作负载的类型
     * Required:true
     */
    @Required
    private String kind;

    /**
     * labelSelectorSpec
     */
    private K8sLabelSelectorSpec labelSelectorSpec;

    /**
     * 工作负载的名称
     * Required:true
     */
    @Required
    private String name;

    /**
     * 命名空间
     */
    private String namespace;



    /**
     * get 容器名。 标准输出模式下，为空表示全部容器。
     *
     * @return
     */
    public String getContainer() {
        return container;
    }

    /**
     * set 容器名。 标准输出模式下，为空表示全部容器。
     *
     * @param container
     */
    public void setContainer(String container) {
        this.container = container;
    }


    /**
     * get 工作负载的类型
     *
     * @return
     */
    public String getKind() {
        return kind;
    }

    /**
     * set 工作负载的类型
     *
     * @param kind
     */
    public void setKind(String kind) {
        this.kind = kind;
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
     * get 工作负载的名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 工作负载的名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * get 命名空间
     *
     * @return
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * set 命名空间
     *
     * @param namespace
     */
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }



    /**
     * set 容器名。 标准输出模式下，为空表示全部容器。
     *
     * @param container
     */
    public WorkLoadSpec container(String container) {
        this.container = container;
        return this;
    }


    /**
     * set 工作负载的类型
     *
     * @param kind
     */
    public WorkLoadSpec kind(String kind) {
        this.kind = kind;
        return this;
    }


    /**
     * set labelSelectorSpec
     *
     * @param labelSelectorSpec
     */
    public WorkLoadSpec labelSelectorSpec(K8sLabelSelectorSpec labelSelectorSpec) {
        this.labelSelectorSpec = labelSelectorSpec;
        return this;
    }


    /**
     * set 工作负载的名称
     *
     * @param name
     */
    public WorkLoadSpec name(String name) {
        this.name = name;
        return this;
    }


    /**
     * set 命名空间
     *
     * @param namespace
     */
    public WorkLoadSpec namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }


}