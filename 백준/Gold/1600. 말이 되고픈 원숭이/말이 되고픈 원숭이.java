
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int k;
    static int w;
    static int h;
    static int[][] board;
    static int min = Integer.MAX_VALUE;
    static int[] hdx = new int[]{-2, -2, -1, -1, 1, 1, 2, 2};
    static int[] hdy = new int[]{-1, 1, -2, 2, -2, 2, -1, 1};
    static int[] dx = new int[]{0, 1, 0, -1};
    static int[] dy = new int[]{1, 0, -1, 0};
    static boolean[][][] visited;

    public Main() {
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        k = scan.nextInt();
        w = scan.nextInt();
        h = scan.nextInt();
        board = new int[h][w];

        for(int i = 0; i < h; ++i) {
            for(int j = 0; j < w; ++j) {
                board[i][j] = scan.nextInt();
            }
        }

        visited = new boolean[h][w][k + 1];
        min = bfs(0, 0);
        if (min == Integer.MAX_VALUE) {
            System.out.println("-1");
        } else {
            System.out.println(min);
        }

    }

    public static int bfs(int x, int y) {
        Queue<Node> q = new LinkedList();
        q.offer(new Node(x, y, 0, k));
        visited[x][y][k] = true;

        while(true) {
            Node current;
            int i;
            int nx;
            int ny;
            do {
                if (q.isEmpty()) {
                    return min;
                }

                current = (Node)q.poll();
                if (current.x == h - 1 && current.y == w - 1) {
                    return current.count;
                }

                for(i = 0; i < 4; ++i) {
                    nx = current.x + dx[i];
                    ny = current.y + dy[i];
                    if (nx >= 0 && ny >= 0 && nx < h && ny < w && !visited[nx][ny][current.k] && board[nx][ny] == 0) {
                        visited[nx][ny][current.k] = true;
                        q.offer(new Node(nx, ny, current.count + 1, current.k));
                    }
                }
            } while(current.k <= 0);

            for(i = 0; i < 8; ++i) {
                nx = current.x + hdx[i];
                ny = current.y + hdy[i];
                if (nx >= 0 && ny >= 0 && nx < h && ny < w && !visited[nx][ny][current.k - 1] && board[nx][ny] == 0) {
                    visited[nx][ny][current.k - 1] = true;
                    q.offer(new Node(nx, ny, current.count + 1, current.k - 1));
                }
            }
        }
    }

    public static class Node {
        int x;
        int y;
        int count;
        int k;

        public Node(int x, int y, int count, int k) {
            this.x = x;
            this.y = y;
            this.count = count;
            this.k = k;
        }
    }
}
