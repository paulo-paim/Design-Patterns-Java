package com.DesignPatterns.Singleton;

import java.util.Objects;

public class ConfigorationAPI {

    private static ConfigorationAPI instance;

    private ConfigorationAPI() {
    }

    public static ConfigorationAPI getInstance(){
        synchronized (ConfigorationAPI.class){
            if (Objects.isNull(instance)){
                instance = new ConfigorationAPI();
            }
        }

        return instance;
    }
}
