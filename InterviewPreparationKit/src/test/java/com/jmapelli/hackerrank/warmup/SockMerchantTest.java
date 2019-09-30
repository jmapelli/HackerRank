package com.jmapelli.hackerrank.warmup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SockMerchantTest {

    private SockMerchant sockMerchant = new SockMerchant();

    @Test
    void case01() {
        int expected = 4;
        int n = 10;
        int[] arr = new int[]{1, 1, 3, 1, 2, 1, 3, 3, 3, 3};

        int actual = sockMerchant.execute(n, arr);

        assertEquals(expected, actual);
    }

    @Test
    void case02() {
        int expected = 3;
        int n = 9;
        int[] arr = new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20};

        int actual = sockMerchant.execute(n, arr);

        assertEquals(expected, actual);
    }
}