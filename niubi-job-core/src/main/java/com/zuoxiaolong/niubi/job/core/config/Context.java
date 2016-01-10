/*
 * Copyright 2002-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.zuoxiaolong.niubi.job.core.config;

import com.zuoxiaolong.niubi.job.core.bean.JobBeanFactory;

import java.io.InputStream;
import java.net.URL;

/**
 * @author Xiaolong Zuo
 * @since 16/1/9 23:19
 */
public interface Context {

    String DATA_MAP_KEY = "____context";

    <T> Class<T> loadClass(String className);

    <T> T initializeBean(Class<T> clazz);

    URL getResource(String name);

    InputStream getResourceAsStream(String name);

    JobBeanFactory getJobBeanFactory();

    Configuration getConfiguration();

}