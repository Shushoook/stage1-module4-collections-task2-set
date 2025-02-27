package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int x : sourceList) {
            if (x % 2 == 0) {
                while (x % 2 == 0) {
                    hashSet.add(x);
                    x /= 2;
                }
                hashSet.add(x);
            } else {
                hashSet.add(x);
                hashSet.add(2 * x);
            }
        }
        return hashSet;
    }
}
