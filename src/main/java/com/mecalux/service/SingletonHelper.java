package com.mecalux.service;

import java.util.UUID;

/**
 * TODO: 1. Implementar un singleton (com.mecalux.service.SingletonHelper) que proporcione a su vez un método que devuelva un id Random
 */
public class SingletonHelper {
    private static SingletonHelper instance;

    private SingletonHelper(){}; // we made the constructor not accessible
    public static SingletonHelper getInstance() {
        if(instance == null) {
            instance = new SingletonHelper();
        }
        return instance;
    }

    public String getRandomId(){
        return UUID.randomUUID().toString();
    }
}
