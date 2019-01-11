package com.company;

/*

A non-empty array A consisting of N integers is given. The array contains an odd number of elements,
and each element of the array can be paired with another element that has the same value, except for one element that is left unpaired.

For example, in array A such that:
  A[0] = 9  A[1] = 3  A[2] = 9
  A[3] = 3  A[4] = 9  A[5] = 7
  A[6] = 9
        the elements at indexes 0 and 2 have value 9,
        the elements at indexes 1 and 3 have value 3,
        the elements at indexes 4 and 6 have value 9,
        the element at index 5 has value 7 and is unpaired.
Write a function:
    class Solution { public int solution(int[] A); }
that, given an array A consisting of N integers fulfilling the above conditions, returns the value of the unpaired element.
For example, given array A such that:
  A[0] = 9  A[1] = 3  A[2] = 9
  A[3] = 3  A[4] = 9  A[5] = 7
  A[6] = 9

the function should return 7, as explained in the example above.
Write an efficient algorithm for the following assumptions:

        N is an odd integer within the range [1..1,000,000];
        each element of array A is an integer within the range [1..1,000,000,000];
        all but one of the values in A occur an even number of times.
 */

import java.util.*;

public class ArrayOccur {

    public static int solution(int[] A) {

        HashMap<Integer, Integer> alone = new HashMap<>();

        for (int i = 0; i < A.length; i++) {
            if (alone.containsKey(A[i]) && alone.get(A[i]) == 1) {
                alone.remove(A[i]);
            } else {
                alone.put(A[i], 1);
            }
        }

        for (int key : alone.keySet()) {
            return key;

        }

        return 1;
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
