package com.mecalux.service;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

/**
 * TODO: 2. Implementa los Tests unitarios de la clase TesteableTest.java. Tienes las librerías de JUnit y Mockito en el proyecto, pero puedes usar lo que
 * consideres oportuno.
 */
public class TesteableTest {


    private Testeable testeable = new Testeable();


    @Test
    public void testMetodo1WithoutNullValues() {
        assertEquals(testeable.metodo1("STRING_0"), "TESTED_STRING_0");

        assertEquals(testeable.metodo1("test one"), "TESTED_test one");

        assertEquals(testeable.metodo1("name"), "TESTED_name");
    }

    @Test
    public void testMetodo1WithNullValues() {
        assertEquals(testeable.metodo1(null), null);
    }

    @Test
    public void testMetodo2(){
        IValuable mockValuable = mock(IValuable.class);
        Mockito.when(mockValuable.getValue()).thenReturn("MOCKED_VALUE_0");
        assertEquals(testeable.metodo2(mockValuable), "TESTED_MOCKED_VALUE_0");

        Mockito.when(mockValuable.getValue()).thenReturn("GET/VALUE&0");
        assertEquals(testeable.metodo2(mockValuable), "TESTED_GET/VALUE&0");

        Mockito.when(mockValuable.getValue()).thenReturn("");
        assertEquals(testeable.metodo2(mockValuable), "TESTED_");

        Mockito.when(mockValuable.getValue()).thenReturn(null);
        assertEquals(testeable.metodo2(mockValuable), "TESTED_null");
    }
}
