package com.hedera.hcsapp;

/*-
 * ‌
 * hcs-sxc-java
 * ​
 * Copyright (C) 2019 - 2020 Hedera Hashgraph, LLC
 * ​
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
 * ‍
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import lombok.extern.log4j.Log4j2;

/**
 * Manages configuration
 */
@Log4j2
public final class Config {
    private AppYAML yamlConfig = new AppYAML();

    public Config() throws FileNotFoundException, IOException {
        this("./config/apps.yaml");
    }

    // constructor with parameter for testing
    public Config(String configFilePath) throws FileNotFoundException, IOException {
        Yaml yaml = new Yaml(new Constructor(AppYAML.class));

        File configFile = new File(configFilePath);
        if (configFile.exists()) {
            log.debug("Loading apps.yaml from " + configFilePath);
            // config file exists outside of jar, use it
            InputStream inputStream = new FileInputStream(configFile.getCanonicalPath());
            yamlConfig = yaml.load(inputStream);
        } else {
            log.error("Unable to find file " + configFilePath);
        }
    }

    public AppYAML getConfig() {
        return this.yamlConfig;
    }
}
