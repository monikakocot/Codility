package com.company;

import java.util.HashSet;
/*
Write a function:
    class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.
Given A = [−1, −3], the function should return 1.

Write an efficient algorithm for the following assumptions:
N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].

 */
public class DemoTest {

    public static int solution(int[] A)  {

        int min = 1;
        HashSet<Integer> B = new HashSet<>();

        for (int i = 0 ; i < A.length; i++) {
            B.add(A[i]);
        }

        while (B.contains(min)) {
            min++;
        }
        return min;
    }

    public static void main(String[] args) {

        int[] A = new int[7];

        A[0] = 1;
        A[1] = 3;
        A[2] = 6;
        A[3] = 4;
        A[4] = 1;
        A[5] = -8;
        A[6] = -5;

        System.out.println(DemoTest.solution(A));
    }
}