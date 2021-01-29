package pre.demo.leecode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 452. 用最少数量的箭引爆气球
 */
public class FindMinArrowShots {

    public static void main(String[] args) {

        int[][] points = {{10,16},{2,8},{1,6},{7,12}};

        System.out.println(solution(points));
    }

    public static int solution(int[][] points) {
        if (points.length == 0) {
            return 0;
        }
        Arrays.sort(points, Comparator.comparingInt(point -> point[1]));
        int pos = points[0][1];
        int ans = 1;
        for (int[] balloon: points) {
            if (balloon[0] > pos) {
                pos = balloon[1];
                ++ans;
            }
        }
        return ans;
    }
}
