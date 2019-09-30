package com.jmapelli.hackerrank.warmup;

import java.util.*;

public class SockMerchant {

    public int execute(int n, int[] arr) {
        Set<Integer> mem = new HashSet<Integer>();

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (mem.contains(arr[i])) {
                mem.remove(arr[i]);
                count++;
            } else {
                mem.add(arr[i]);
            }
        }

        return count;
    }

}
