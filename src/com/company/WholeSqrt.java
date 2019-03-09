package com.company;

/*
An integer P is a whle square if it is a square of some integer Q:

IF P=Q^2

Write a function that given two integers A and B, returns number of whole squares
within the interval {A...B] (both ends included).
 */

public class WholeSqrt {

    // a<= i*i <=b
    //na Codility metoda będzie niestatyczna. Tu statyczna, żeby sobie łatwiej przetestować w Main


    static int solution(int a, int b){
        int score =0;
        for ( int i=(int) Math.sqrt(a); i<=b;i++){
            if(i*i >=a && i*i <=b)
                score++;
        }
        return score;
    }

    public static void main(String[] args) {
        // write your code here


        System.out.println(solution(4,17));
    }
}
