package com.company;

public class Zad4ver2 {

    // in  Codility without static. Here static for easier tests
    public static int solution(int[] A) {

        int N = A.length;

        int depth = -1;
        int P, Q, R;
        int p, q ,r;

        for (int i = 0; i < N - 2; i++) {

            for (int j = 0; j < N - 1; j++) {

                if (i < j && A[j] < A[i]) {

                    for (int k = 0; k < N; k++) {

                        while (i < j && j < k && A[j] < A[i] && A[k] > A[j]) {
                            p = A[i];
                            q = A[j];
                            r = A[k];

                            P=i;
                            Q=j;
                            R=k;
/*
                            System.out.println("INDEX P--------------------------");
                            System.out.println(P);
                            System.out.println("INDEX  Q--------------------------");
                            System.out.println(Q);
                            System.out.println("INDEX  R--------------------------");
                            System.out.println(R);

                            System.out.println("VALUE OF P --------------------------");
                            System.out.println(p);
                            System.out.println("VALUE OF Q  --------------------------");
                            System.out.println(q);
                            System.out.println("VALUE OF R --------------------------");
                            System.out.println(r);
*/
                            depth = Math.max(depth, Math.min(p - q, r - q));
                            if (i<N-2) break;
                        }
                    }
                }
            }
        }
        return Math.max(depth, -1);
    }


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

        System.out.println("MAIN ---------------------");
        System.out.println(solution(A));

    }

}

