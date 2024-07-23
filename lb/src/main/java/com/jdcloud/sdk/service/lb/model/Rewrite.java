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

package com.jdcloud.sdk.service.lb.model;


/**
 * rewrite
 */
public class Rewrite  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 重写后的域名
1.支持输入IP地址及域名。域名仅支持输入大小写字母、数字、英文中划线“-”和点“.”，最少包括一个点&quot;.&quot;，不能以点&quot;.&quot;和中划线&quot;-&quot;开头或结尾，中划线&quot;-&quot;前后不能为点&quot;.&quot;，不区分大小写，且不能超过110字符。
2.默认为${host}，表示重写后不修改域名
3.不支持通配符

     */
    private String host;

    /**
     * 重写后的路径，重写原则：a.重写的内容为url path全路径 b.重写前和重写后通配符*表示的内容一致。支持的场景如下：
1.支持精确path1→精确path2，如：/path1/abc→/bbb  或 /path1/abc-&gt;/path1
2.模糊匹配path1→模糊匹配path2 ，如：/path1/*→/*，表示重写后把“path1/”部分截取掉了；www.www.baidu.com/a/*——&gt;www.baidu.com/*
3.模糊匹配path→精确path ，如配置的urlmap rule为：/path1/*→/aaa，表示所有以“path1”为前缀的请求都重写为了“/aaa”
4.精确path-&gt;模糊path————不支持
输入限制：
1.必须以/开头，仅支持输入大小写字母、数字和特殊字符：$-.+!&#39;()%:@&amp;&#x3D;/，区分大小写，且不能超过128字符
2.支持输入通配符*，*表示匹配0或多个字符，仅支持输入一个*
3.默认为${path}，表示重写后不修改路径

     */
    private String path;

    /**
     * 查询参数：
1.输入限制同urlmap重定向字段
2.默认为${query}，表示重写后不修改查询字段
3.不支持通配符
     */
    private String query;



    /**
     * get 重写后的域名
1.支持输入IP地址及域名。域名仅支持输入大小写字母、数字、英文中划线“-”和点“.”，最少包括一个点&quot;.&quot;，不能以点&quot;.&quot;和中划线&quot;-&quot;开头或结尾，中划线&quot;-&quot;前后不能为点&quot;.&quot;，不区分大小写，且不能超过110字符。
2.默认为${host}，表示重写后不修改域名
3.不支持通配符

     *
     * @return
     */
    public String getHost() {
        return host;
    }

    /**
     * set 重写后的域名
1.支持输入IP地址及域名。域名仅支持输入大小写字母、数字、英文中划线“-”和点“.”，最少包括一个点&quot;.&quot;，不能以点&quot;.&quot;和中划线&quot;-&quot;开头或结尾，中划线&quot;-&quot;前后不能为点&quot;.&quot;，不区分大小写，且不能超过110字符。
2.默认为${host}，表示重写后不修改域名
3.不支持通配符

     *
     * @param host
     */
    public void setHost(String host) {
        this.host = host;
    }


    /**
     * get 重写后的路径，重写原则：a.重写的内容为url path全路径 b.重写前和重写后通配符*表示的内容一致。支持的场景如下：
1.支持精确path1→精确path2，如：/path1/abc→/bbb  或 /path1/abc-&gt;/path1
2.模糊匹配path1→模糊匹配path2 ，如：/path1/*→/*，表示重写后把“path1/”部分截取掉了；www.www.baidu.com/a/*——&gt;www.baidu.com/*
3.模糊匹配path→精确path ，如配置的urlmap rule为：/path1/*→/aaa，表示所有以“path1”为前缀的请求都重写为了“/aaa”
4.精确path-&gt;模糊path————不支持
输入限制：
1.必须以/开头，仅支持输入大小写字母、数字和特殊字符：$-.+!&#39;()%:@&amp;&#x3D;/，区分大小写，且不能超过128字符
2.支持输入通配符*，*表示匹配0或多个字符，仅支持输入一个*
3.默认为${path}，表示重写后不修改路径

     *
     * @return
     */
    public String getPath() {
        return path;
    }

    /**
     * set 重写后的路径，重写原则：a.重写的内容为url path全路径 b.重写前和重写后通配符*表示的内容一致。支持的场景如下：
1.支持精确path1→精确path2，如：/path1/abc→/bbb  或 /path1/abc-&gt;/path1
2.模糊匹配path1→模糊匹配path2 ，如：/path1/*→/*，表示重写后把“path1/”部分截取掉了；www.www.baidu.com/a/*——&gt;www.baidu.com/*
3.模糊匹配path→精确path ，如配置的urlmap rule为：/path1/*→/aaa，表示所有以“path1”为前缀的请求都重写为了“/aaa”
4.精确path-&gt;模糊path————不支持
输入限制：
1.必须以/开头，仅支持输入大小写字母、数字和特殊字符：$-.+!&#39;()%:@&amp;&#x3D;/，区分大小写，且不能超过128字符
2.支持输入通配符*，*表示匹配0或多个字符，仅支持输入一个*
3.默认为${path}，表示重写后不修改路径

     *
     * @param path
     */
    public void setPath(String path) {
        this.path = path;
    }


    /**
     * get 查询参数：
1.输入限制同urlmap重定向字段
2.默认为${query}，表示重写后不修改查询字段
3.不支持通配符
     *
     * @return
     */
    public String getQuery() {
        return query;
    }

    /**
     * set 查询参数：
1.输入限制同urlmap重定向字段
2.默认为${query}，表示重写后不修改查询字段
3.不支持通配符
     *
     * @param query
     */
    public void setQuery(String query) {
        this.query = query;
    }



    /**
     * set 重写后的域名
1.支持输入IP地址及域名。域名仅支持输入大小写字母、数字、英文中划线“-”和点“.”，最少包括一个点&quot;.&quot;，不能以点&quot;.&quot;和中划线&quot;-&quot;开头或结尾，中划线&quot;-&quot;前后不能为点&quot;.&quot;，不区分大小写，且不能超过110字符。
2.默认为${host}，表示重写后不修改域名
3.不支持通配符

     *
     * @param host
     */
    public Rewrite host(String host) {
        this.host = host;
        return this;
    }


    /**
     * set 重写后的路径，重写原则：a.重写的内容为url path全路径 b.重写前和重写后通配符*表示的内容一致。支持的场景如下：
1.支持精确path1→精确path2，如：/path1/abc→/bbb  或 /path1/abc-&gt;/path1
2.模糊匹配path1→模糊匹配path2 ，如：/path1/*→/*，表示重写后把“path1/”部分截取掉了；www.www.baidu.com/a/*——&gt;www.baidu.com/*
3.模糊匹配path→精确path ，如配置的urlmap rule为：/path1/*→/aaa，表示所有以“path1”为前缀的请求都重写为了“/aaa”
4.精确path-&gt;模糊path————不支持
输入限制：
1.必须以/开头，仅支持输入大小写字母、数字和特殊字符：$-.+!&#39;()%:@&amp;&#x3D;/，区分大小写，且不能超过128字符
2.支持输入通配符*，*表示匹配0或多个字符，仅支持输入一个*
3.默认为${path}，表示重写后不修改路径

     *
     * @param path
     */
    public Rewrite path(String path) {
        this.path = path;
        return this;
    }


    /**
     * set 查询参数：
1.输入限制同urlmap重定向字段
2.默认为${query}，表示重写后不修改查询字段
3.不支持通配符
     *
     * @param query
     */
    public Rewrite query(String query) {
        this.query = query;
        return this;
    }


}