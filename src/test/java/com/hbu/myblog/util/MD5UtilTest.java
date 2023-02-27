package com.hbu.myblog.util;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author vigilr
 * @since 2021/03/01
 */
class MD5UtilTest {

    @BeforeEach
    void setUp() {
        System.out.println("开始单元测试");
    }

    @AfterEach
    void tearDown() {
        System.out.println("结束单元测试");
    }

    @Test
    void MD5Encode() {
        assertEquals("e10adc3949ba59abbe56e057f20f883e",MD5Util.MD5Encode("123456","utf-8"),"MD5Encode方法异常");
        System.out.println("MD5Encode测试成功");
    }
}