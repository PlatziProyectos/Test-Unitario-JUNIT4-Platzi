package com.whnm.javatest.util;

import org.junit.Test;

import static org.junit.Assert.*;

public class DateUtilLeapYearShould {

    /*
        All years divisible by 400 ARE Leap years (1600, 2000, 2400)
        All years divisible by 100 but not by 400 are NOT leap years (1700, 1800, 1900),
        All years divisible by 4 but not by 100 ARE 1eap years (1996, 2004, 2008),
        All years not divisible by 4 are NOT Leap years (2017, 2018, 2019)
     */
    @Test
    public void returnTrueWhenYearIsdivisibleBy400() {
        assertTrue(DateUtil.leapYear(1600));
        assertTrue(DateUtil.leapYear(2000));
        assertTrue(DateUtil.leapYear(2400));
    }

    @Test
    public void returnFalseWhenYearIsDivisibleBy100ButNotBy400() {
        assertFalse(DateUtil.leapYear(1700));
        assertFalse(DateUtil.leapYear(1800));
        assertFalse(DateUtil.leapYear(1900));
    }

    @Test
    public void returnTrueWhenYearIsDivisibleBy4ButNotBy100() {
        assertTrue(DateUtil.leapYear(1996));
        assertTrue(DateUtil.leapYear(2004));
        assertTrue(DateUtil.leapYear(2008));
    }

    @Test
    public void returnFalseWhenYearIsNotDivisibleBy4() {
        assertFalse(DateUtil.leapYear(2017));
        assertFalse(DateUtil.leapYear(2018));
        assertFalse(DateUtil.leapYear(2019));
    }
}