package com.whnm.javatest.util;

public class StringUtilTest {
    public static void main(String[] args) {
        String word = StringUtil.repeat("hola", 3);
        assertEquals(word, "holaholahola");

        String word2 = StringUtil.repeat("hola", 1);
        assertEquals(word2, "hola");
    }

    private static void assertEquals(String word, String holaholahola) {

        if (!word.equals("holaholahola")){
            //System.out.println("ERROR");
            throw new RuntimeException("ERROR");
        }

    }
}