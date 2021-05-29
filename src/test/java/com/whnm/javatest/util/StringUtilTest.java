package com.whnm.javatest.util;

import org.junit.Assert;

public class StringUtilTest {
    public static void main(String[] args) {
        Assert.assertEquals("holaholahola", StringUtil.repeat("hola", 3));
        Assert.assertEquals("hola" , StringUtil.repeat("hola", 1));
    }
}