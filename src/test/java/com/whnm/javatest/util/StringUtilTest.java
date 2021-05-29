package com.whnm.javatest.util;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {

    @Test
    public void testRepeatStringOnce() {
        Assert.assertEquals("hola" , StringUtil.repeat("hola", 1));
    }

    @Test
    public void testRepeatStringMultipleTimes() {
        Assert.assertEquals("holaholahola", StringUtil.repeat("hola", 3));
    }

    @Test
    public void testRepeatStringZeroTimes() {
        Assert.assertEquals("" , StringUtil.repeat("hola", 0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRepeatStringNegativeTimes() {
        Assert.assertEquals("" , StringUtil.repeat("hola", -1));
    }
}