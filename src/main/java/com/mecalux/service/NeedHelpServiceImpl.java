package com.mecalux.service;

import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * TODO: 7. La clase com.mecalux.service.NeedHelpServiceImpl.java es difícil de testear y está muy acoplada a otras clases, ¿cómo resolverías este problema?
 * Impleméntalo o propón una solución teórica.
 */
@Service
public class NeedHelpServiceImpl implements INeedHelpService {

    public String method() {
        Testeable testeable = new Testeable();
        String ret = testeable.metodo1("TEST");
        Date date = new Date();
        return ret + "_" + date.getTime();
    }
}
