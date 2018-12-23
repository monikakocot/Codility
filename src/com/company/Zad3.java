package com.company;

public class Zad3 {

/*  Write a function: public static int solution (IntList L){}
that given a non-empty linked ist L consisting of N node, returns its length.
E.G

A->B->C->D->

This list consist 4 nodes A, B, C, D. D is the last node and its tail is the terminator. The length of this list is 4.

Assume that following declarations are given:

  static class IntList {

        public int value;
        public IntList next;
    }
*/


// in  Codility without static. Here static for easier tests
    public static int solution (IntList L) {
        int counter =1;
        while(L.next !=null){
            L=L.next;
            counter ++;
        }
        return counter;
    }

    static class IntList {

        public int value;
        public IntList next;
    }

    public static void main(String[] args) {

        IntList mother = new IntList();
        IntList deta1 = new IntList();
        IntList deta2 = new IntList();
        IntList deta3 = new IntList();
        IntList deta4 = new IntList();

        mother.next=deta1;
        deta1.next=deta2;
        deta2.next=deta3;
        deta3.next=deta4;
        deta4.next=null;

        System.out.println(Zad3.solution(mother));
    }
}

