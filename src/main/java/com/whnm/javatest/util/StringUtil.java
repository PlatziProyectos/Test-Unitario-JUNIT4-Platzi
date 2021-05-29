package com.whnm.javatest.util;

public class StringUtil {
    
    public static String repeat(String word, int times){

        if(times < 0) {
            throw new IllegalArgumentException("No puede ser negativo times");
        }

        String result = Constantes.VACIO;

        for (int i = 0; i < times; i++) {
            result += word;
        }
        
        return result;
    }
}
