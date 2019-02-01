package com.company;

import java.util.Arrays;

/*
A non-empty array A consisting of N integers is given. Array A represents numbers on a tape.
Any integer P, such that 0 < P < N, splits this tape into two non-empty parts: A[0], A[1], ..., A[P − 1] and A[P], A[P + 1], ..., A[N − 1].
The difference between the two parts is the value of: |(A[0] + A[1] + ... + A[P − 1]) − (A[P] + A[P + 1] + ... + A[N − 1])|
In other words, it is the absolute difference between the sum of the first part and the sum of the second part.

For example, consider array A such that:
  A[0] = 3
  A[1] = 1
  A[2] = 2
  A[3] = 4
  A[4] = 3

We can split this tape in four places:
        P = 1, difference = |3 − 10| = 7
        P = 2, difference = |4 − 9| = 5
        P = 3, difference = |6 − 7| = 1
        P = 4, difference = |10 − 3| = 7
Write a function:

    class Solution { public int solution(int[] A); }

that, given a non-empty array A of N integers, returns the minimal difference that can be achieved.

For example, given:
  A[0] = 3
  A[1] = 1
  A[2] = 2
  A[3] = 4
  A[4] = 3

the function should return 1, as explained above.
 */
public class TimeTapeEquilibrium {

    public static int solution(int[] A) {
        // write your code in Java SE 8

        int sumOnRight = 0;
        int sumOnLeft = A[0];
        int odds;

        for (int i=1; i< A.length; i++) {
            sumOnRight += A[i];
        }

        System.out.println("***************");
        System.out.println(sumOnLeft);
        System.out.println(sumOnRight);
        System.out.println("***************");

        odds = Math.abs(sumOnLeft-sumOnRight);


        for (int i=1; i<A.length-1; i++) {
            sumOnLeft  += A[i];
            sumOnRight -= A[i];
            System.out.println("***************");
            System.out.println(sumOnLeft);
            System.out.println(sumOnRight);
            System.out.println("***************");

            if (Math.abs(sumOnLeft-sumOnRight)<odds) {
                odds = Math.abs(sumOnLeft-sumOnRight);
            }
        }

        return odds;
}

    public static void main(String[] args) {

        int[] A = new int[5];

        A[0] = 3;
        A[1] = 1;
        A[2] = 2;
        A[3] = 4;
        A[4] = 3;

        System.out.println(solution(A));

    }
}

