package Silver.Back2012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); //readline은 문자열
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        long count = 0;
        for (int i = 0; i < n; i++){
            pq.add(Integer.parseInt(br.readLine()));
        }

        int[] a = new int[5];

        int num = 1;
        while(!pq.isEmpty()) {
            int sub = Math.abs(pq.poll() - num++);
            if(sub != 0) {
                count += sub;
            }
        }
        System.out.println(count);

    }
}

class Node {
    int a;
    private int b;
    int x, y;
    public Node() {

    }
    public void setB(int b) {
        this.b = b;
    }
    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}