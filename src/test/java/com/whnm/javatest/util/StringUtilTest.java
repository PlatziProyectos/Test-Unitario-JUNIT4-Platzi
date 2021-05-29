package com.whnm.javatest.util;

import static org.junit.Assert.*;
import org.junit.Test;

public class StringUtilTest {

    @Test
    public void testRepeatStringOnce() {
        assertEquals("hola" , StringUtil.repeat("hola", 1));
    }

    @Test
    public void testRepeatStringMultipleTimes() {
        assertEquals("holaholahola", StringUtil.repeat("hola", 3));
    }

    @Test
    public void testRepeatStringZeroTimes() {
        assertEquals("" , StringUtil.repeat("hola", 0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRepeatStringNegativeTimes() {
        assertEquals("" , StringUtil.repeat("hola", -1));
    }

    /*
     * Probar que un string cualquiera no es vacío
     * Probar que “” es un string vacío
     * Probar que null también es un string vacío
     * Extra: un string con espacios " " también lo queremos considerar como vacío (pista: puedes usar la función trim)
     */
    @Test
    public void testStringNoEmpty() {
        String string = "Hola";

        boolean result = StringUtil.isEmpty(string);

        assertFalse(result);
    }

    @Test
    public void testStringIsEmpty() {
        String string = "";

        boolean result = StringUtil.isEmpty(string);

        assertTrue(result);
    }

    @Test
    public void testStringNullIsEmpty() {
        String string = null;

        boolean result = StringUtil.isEmpty(string);

        assertTrue(result);
    }

    @Test
    public void testStringEspacioIsEmpty() {
        String string = " ";

        boolean result = StringUtil.isEmpty(string);

        assertTrue(result);
    }
}