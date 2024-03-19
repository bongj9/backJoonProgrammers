package SoftwareMaestro.Silver1932;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[][] tri = new int[t][t];
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < i+1; j++) {
                tri[i][j] = sc.nextInt();
            }

        }
        for (int [] r : tri
        )
            for (int v : r
            ) {
                System.out.println(v+" ");

            }

        }

    }
