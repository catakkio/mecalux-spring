package com.mecalux.service;

import org.springframework.stereotype.Service;

/**
 * TODO: 7. La clase com.mecalux.service.NeedHelpServiceImpl.java es difícil de testear y está muy acoplada a otras clases, ¿cómo resolverías este problema?
 * Impleméntalo o propón una solución teórica.
 */
@Service
public class NeedHelpServiceImpl implements INeedHelpService {

//    public String method() {
//        Testeable testeable = new Testeable();
//        String ret = testeable.metodo1("TEST");
//        Date date = new Date();
//        return ret + "_" + date.getTime();
//    }

    /**
     * Proposed solution for the 7th point of the technical test:
     *
     * The Testeable class seems to be focused on the concatenation of the strings.
     * My proposal is to move there the 'method' logic to isolate the concatenation logic in a single class.
     *
     * Under a testing point of view, due that here we're only calling the testeable.method(), we won't have much to test.
     * The testeable.method() should be already tested in the Testeable class.
     */

    public String method() {
        Testeable testeable = new Testeable();
        return testeable.method();
    }
}
