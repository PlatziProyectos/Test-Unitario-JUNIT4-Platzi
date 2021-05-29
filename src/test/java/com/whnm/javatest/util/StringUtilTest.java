package com.whnm.javatest.util;

import org.junit.Assert;

public class StringUtilTest {
    public static void main(String[] args) {
        Assert.assertEquals(StringUtil.repeat("hola", 3), "holaholahol");
        Assert.assertEquals(StringUtil.repeat("hola", 1), "hola");
    }
}