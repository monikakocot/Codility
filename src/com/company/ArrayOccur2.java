package com.company;

import java.util.*;

public class ArrayOccur2 {

    public static int solution(int[] A) {

        HashMap<Integer, Integer> pairs = new HashMap<>();
        int counter = 0;

        for (int i = 0; i < A.length; i++) {
            if (pairs.containsKey(A[i]) && pairs.get(A[i]) > 0) {

                pairs.computeIfPresent(A[i], (k, v) -> v + 1);
                //pairs.put(A[i],pairs.get((A[i])+1));
                //hashmap.put(key, hashmap.get(key) + 1); HashMap nie może mieć powtarzających się kluczy
            } else {
                pairs.put(A[i], 1);
            }
        }

        int single = 0;

        for (Map.Entry<Integer, Integer> entry : pairs.entrySet()) {
            if (entry.getValue().equals(1)) {
                single = entry.getKey();

            }
        }
        return single;
    }


    public static void main(String[] args) {

        int[] test = new int[7];
        test[0] = 9;
        test[1] = 3;
        test[2] = 9;
        test[3] = 3;
        test[4] = 9;
        test[5] = 7;
        test[6] = 9;


        solution(test);
        System.out.println(solution(test));
    }

}
