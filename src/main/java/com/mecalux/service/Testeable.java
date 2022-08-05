package com.mecalux.service;

import java.util.Date;

/**
 * Created by JCastillo on 01/03/2017.
 */
public class Testeable {

	public String metodo1(String parametro) {
		String obt = parametro;
		if (obt != null) {
			return "TESTED_" + obt;
		}
		return obt;
	}

	public String metodo2(IValuable testeable) {

		if (testeable != null) {
			return "TESTED_" + testeable.getValue();
		}
		return "NOT_VALID";
	}

	/**
	 * Proposed solution for the 7th point of the technical test:
	 * Move here the method function.
	 * More details about it in com.mecalux.service.NeedHelpServiceImpl.java file
	 */
	    public String method() {
        String ret = this.metodo1("TEST");
        Date date = new Date();
        return ret + "_" + date.getTime();
    }
}
