package com.whnm.javatest.util;

public class StringUtil {
    
    public static String repeat(String word, int times){
        String result = Constantes.VACIO;

        for (int i = 0; i < times; i++) {
            result += word;
        }
        
        return result;
    }
}
