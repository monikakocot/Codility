package com.company;

public class Zad2 {

    /* A non-empty zero-indexem array A consisting of N integers and sorted in a no-decreasing order is given. The leader of this array is the
    value that occurs in more than half of elements of A.

    Write a function int solution (int A[]){}
    that given a non-empty zero-indexem array A consisting of N integers in a no-decreasing, that returns the leader of A.
    The function should return -1 if array A does not contain a leader.

    * */

    // in  Codility without static. Here static for easier tests
    public static int solution(int[] A) {


        int n= A.length;
        int count=0;
        int pos =(n/2); // because items counted from 0, so the item with index 5 is in fact 6 in the order
        int candiate = A[pos];

        for (int i=0;i<n;i++){
            if(A[i] == candiate)
                count = count +1;
        }

        if(count>= pos){
            return candiate;
        }
        return (-1);
    }

    public static void main(String[] args) {

        int[] A = new int[10];

        A[0] = 2;
        A[1] = 2;
        A[2] = 2;
        A[3] = 2;
        A[4] = 2;
        A[5] = 2;
        A[6] = 4;
        A[7] = 4;
        A[8] = 4;
        A[9] = 6;


        System.out.println(Zad2.solution(A));

    }
}


