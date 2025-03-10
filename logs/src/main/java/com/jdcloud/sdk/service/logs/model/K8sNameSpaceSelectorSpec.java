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
 * k8sNameSpaceSelectorSpec
 */
public class K8sNameSpaceSelectorSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 是否全部命名空间
     * Required:true
     */
    @Required
    private Boolean allNamespace;

    /**
     * 需要排除的namespace。可以多个，用分隔号分割,例如A,B
     */
    private String excludeNamespace;

    /**
     * namespace-&gt; stdout+全部容器 模式下 可以多个，用分隔号分割,例如A,B;
     */
    private String namespace;



    /**
     * get 是否全部命名空间
     *
     * @return
     */
    public Boolean getAllNamespace() {
        return allNamespace;
    }

    /**
     * set 是否全部命名空间
     *
     * @param allNamespace
     */
    public void setAllNamespace(Boolean allNamespace) {
        this.allNamespace = allNamespace;
    }


    /**
     * get 需要排除的namespace。可以多个，用分隔号分割,例如A,B
     *
     * @return
     */
    public String getExcludeNamespace() {
        return excludeNamespace;
    }

    /**
     * set 需要排除的namespace。可以多个，用分隔号分割,例如A,B
     *
     * @param excludeNamespace
     */
    public void setExcludeNamespace(String excludeNamespace) {
        this.excludeNamespace = excludeNamespace;
    }


    /**
     * get namespace-&gt; stdout+全部容器 模式下 可以多个，用分隔号分割,例如A,B;
     *
     * @return
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * set namespace-&gt; stdout+全部容器 模式下 可以多个，用分隔号分割,例如A,B;
     *
     * @param namespace
     */
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }



    /**
     * set 是否全部命名空间
     *
     * @param allNamespace
     */
    public K8sNameSpaceSelectorSpec allNamespace(Boolean allNamespace) {
        this.allNamespace = allNamespace;
        return this;
    }


    /**
     * set 需要排除的namespace。可以多个，用分隔号分割,例如A,B
     *
     * @param excludeNamespace
     */
    public K8sNameSpaceSelectorSpec excludeNamespace(String excludeNamespace) {
        this.excludeNamespace = excludeNamespace;
        return this;
    }


    /**
     * set namespace-&gt; stdout+全部容器 模式下 可以多个，用分隔号分割,例如A,B;
     *
     * @param namespace
     */
    public K8sNameSpaceSelectorSpec namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }


}