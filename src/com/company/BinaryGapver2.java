package com.company;

import java.util.Stack;

/*
A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at both ends in the binary representation of N.
For example, number 9 has binary representation 1001 and contains a binary gap of length 2. The number 529 has binary representation 1000010001
and contains two binary gaps: one of length 4 and one of length 3. The number 20 has binary representation 10100 and contains one binary gap of length 1.
The number 15 has binary representation 1111 and has no binary gaps. The number 32 has binary representation 100000 and has no binary gaps.

Write a function:
    class Solution { public int solution(int N); }

that, given a positive integer N, returns the length of its longest binary gap. The function should return 0 if N doesn't contain a binary gap.
For example, given N = 1041 the function should return 5, because N has binary representation 10000010001 and so its longest binary gap is of length 5.
Given N = 32 the function should return 0, because N has binary representation '100000' and thus no binary gaps.
Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..2,147,483,647].
 */
public class BinaryGapver2 {

    public static int solution(int N) {

        String binaryString = toBinary(N);

            int zeroInRow = 0;
            int longest = 0;
            for (int i = 0; i < binaryString.length(); i++) {
                if(binaryString.substring(i, i+1).equals("1")) { //binaryString.substring(i, i+1) -> letter on the position 0 (as String)
                    if (zeroInRow > longest) {
                        longest = zeroInRow;
                    }
                    zeroInRow = 0;
                }
                else { zeroInRow++; }
            }
            return longest;
        }

    /*
            for (i=0; i< numberAsBinary.length();i++) {
            if (numberAsBinary.charAt(i) == '0') {
                    if (numberAsBinary.charAt(i) == '0' && numberAsBinary.charAt(i + 1) == '0') {
                        temp++;
                        max = temp;
                    } else {
                        max = temp;
                    }
            }else{
                    max = temp;
                }
                if(numberAsBinary.charAt(i) != '1') {
                break;
                }
            }
        return max;
     */
    public static void main(String[] args) {

        System.out.println(toBinary(529)); // should be 1000010001
        System.out.println(toBinary(15)); // should be 1111
        System.out.println("--------------------");
        System.out.println(solution(529)); // should be 4
        System.out.println(solution(15)); // should be 0
        System.out.println("--------------------");

        String word = "ALFABET";
        int i =0;
        System.out.println(word.substring(i, i+1));


    }

    public static String toBinary(int n){

        //klasa stos
        Stack<Integer> stack = new Stack<>();

        //wkladamy na stos elementy dzielone modulo (reszta z dzielenia)
        while(n!=0){
            stack.push(n%2);
            n/=2;
        }
        //klasa sluzaca do budowy stringa
        StringBuilder builder = new StringBuilder();

        while(!stack.empty()){
            //do zmiennej builder dodajemy wartosc z gory stosu
            builder.append(stack.peek());
            //usuniecie pierwszego elementu z gory stosu
            stack.pop();
        }
        return builder.toString();
    }
}
