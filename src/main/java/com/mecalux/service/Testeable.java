package com.mecalux.service;

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
}
