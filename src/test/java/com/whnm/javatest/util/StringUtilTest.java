package com.whnm.javatest.util;

public class StringUtilTest {
    public static void main(String[] args) {
        String word = StringUtil.repeat("hola", 3);
        assertEquals(word, "holaholahol");

        String word2 = StringUtil.repeat("hola", 1);
        assertEquals(word2, "hola");
    }

    private static void assertEquals(String resultado, String resultadoEsperado) {

        if (!resultado.equals(resultadoEsperado)){
            throw new RuntimeException("ERROR");
        }

    }
}