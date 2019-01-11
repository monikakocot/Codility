package com.company;

/*
OutPut: pairs from Array
 */

import java.util.*;

public class ArrayPairs {
    public static void solution(int[] A) {

        HashMap<Integer, Integer> pairs= new HashMap<>();
        List<Integer> all = new ArrayList<>();
        int counter = 0;

        for (int i = 0; i < A.length; i++) {

            all.add(A[i]);
            Collections.sort(all,(p1, p2) -> p1.compareTo(p2));
            if (pairs.containsKey(A[i]) && pairs.get(A[i]) > 0) {

                pairs.computeIfPresent(A[i], (k, v) -> v + 1);

            } else {
                pairs.put(A[i], 1);
            }
        }

        System.out.println("Array converted to sorted ArrayList: " + all);
        for (Map.Entry<Integer, Integer> entry : pairs.entrySet()) {

            if (entry.getValue().equals(1)) {
                all.remove(entry.getKey());

            }
        }
        System.out.println("The pairs where key is a number from Array and Value is a number of occuring in Array: " + pairs);
        System.out.println("Array converted to sorted ArrayList without number which doesnt have a pair: " + all);

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
        //System.out.println(solution(test));
    }

}
