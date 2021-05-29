package com.whnm.javatest.util;

public class DateUtil {

    public static boolean leapYear(int year){

        if ((year % Constantes.INT_4 == 0 &&
                year % Constantes.INT_100 != 0)
          || year % Constantes.INT_400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
