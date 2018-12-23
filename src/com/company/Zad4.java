package com.company;

/*
A non-empty zero-indexed array A consisting of N integers is given. A pit in this array is any triplet of integers (P, Q, R) such that:
        0 ? P < Q < R < N;
        sequence [A[P], A[P+1], ..., A[Q]] is strictly decreasing,
        i.e. A[P] > A[P+1] > ... > A[Q];
        sequence A[Q], A[Q+1], ..., A[R] is strictly increasing,
        i.e. A[Q] < A[Q+1] < ... < A[R].

The depth of a pit (P, Q, R) is the number min{A[P] - A[Q], A[R] - A[Q]}.
For example, consider array A consisting of 10 elements such that:
  A[0] =  0
  A[1] =  1
  A[2] =  3
  A[3] = -2
  A[4] =  0
  A[5] =  1
  A[6] =  0
  A[7] = -3
  A[8] =  2
  A[9] =  3

Triplet (2, 3, 4) is one of pits in this array, because sequence [A[2], A[3]] is strictly decreasing (3 > -2) and sequence [A[3], A[4]] is
strictly increasing (-2 < 0). Its depth is min{A[2] - A[3], A[4] - A[3]} = 2. Triplet (2, 3, 5) is another pit with depth 3. Triplet (5, 7, 8) is yet
another pit with depth 4. There is no pit in this array deeper (i.e. having depth greater) than 4.

Write a function:
    class Solution { public int solution(int[] A); }
that, given a non-empty zero-indexed array A consisting of N integers, returns the depth of the deepest pit in array A. The function should return -1 if there are no pits in array A.

For example, consider array A consisting of 10 elements such that:
  A[0] =  0
  A[1] =  1
  A[2] =  3
  A[3] = -2
  A[4] =  0
  A[5] =  1
  A[6] =  0
  A[7] = -3
  A[8] =  2
  A[9] =  3

the function should return 4, as explained above.

Assume that:

        N is an integer within the range [1..1,000,000];
        each element of array A is an integer within the range [-100,000,000..100,000,000].

Complexity:

        expected worst-case time complexity is O(N);
        expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).*/

public class Zad4 {

    // in  Codility without static. Here static for easier tests
    public static int solution(int[] A) {

        int N = A.length;

        int depth = -1;
        int P, Q, R;
        int i = 0, j, k;

        while (i < N - 2) { // N=10 N-2 =8, i<8, i=7
            P = A[i];

            j = i + 1;
            int p = P;

            while (j < N - 1 && A[j] < p) { //j<9 czyli j max =8 i A[8] < A[i]
                p = A[j++];
            }

            if (j == N - 1) {
                break;
            }
            if (j > i + 1) {
                    Q = A[j - 1];
                } else {
                    i++;
                    continue;
                }

            k = j;
            Q=A[j-1];
            int q = Q;

            while (k < N && A[k] > q) {
                q = A[k++];
            }


            if (k > j) {
                R = A[k - 1];
                depth = Math.max(depth, Math.min(P - Q, R - Q));
                i = k - 1;
            } else {
                i = j - 1;
            }
        }

        return Math.max(depth, -1);
    }


    //3 -2  0 (2,3,4)
    // 3 -2 1 (2,3,5)

    public static void main(String[] args) {

        int[] A = new int[10];

        A[0] = 0;
        A[1] = 1;
        A[2] = 3;
        A[3] = -2;
        A[4] = 0;
        A[5] = 1;
        A[6] = 0;
        A[7] = -3;
        A[8] = 2;
        A[9] = 3;


        System.out.println("TEST ---------------------");

        System.out.println(solution(A));

    }

}

