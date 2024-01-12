package programmers.Lv2.Distance;

public class Solution {
    private static final int dx[] = {0, -1, 1, 0}; //아래 왼 오 위
    private static final int dy[] = {-1, 0, 0, 1};

    private boolean isNextToVolunteer(char[][] room, int x, int y, int exclude) {
        for (int d = 0; d < 4; d++) {
            if (d == exclude) continue;

            int nx = x + dx[d];
            int ny = y + dy[d];
            if (ny < 0 || ny >= room.length || nx < 0 || nx >= room[ny].length) continue;
            if (room[ny][nx] == 'P')
                return true;
            }
            return false;
        }

    }
