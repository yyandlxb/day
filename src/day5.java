import java.util.Arrays;

public class day5 {


    public static void main(String[] args) {
        int[][] points = new int[][]{{10, 16}, {3, 6},{1,3}};
        int shot_num = findMinArrowShots(points);
        System.out.println(shot_num);
    }

    public static int findMinArrowShots(int[][] points) {

        if (points.length == 0) {
            return 0;
        }
        Arrays.sort(points, (o1, o2) -> o1[0] - o2[0]);

        int short_num = 1;
        int shoot_begin = points[0][0];
        int shoot_end = points[0][1];
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] <= shoot_end) {
//                shoot_begin = points[i][0];
//                if (points[i][1] < shoot_end) {
                    shoot_end = points[i][1];
//                }
            } else {
                short_num++;
//                shoot_begin = points[i][0];
                shoot_end = points[i][1];
            }
            shoot_end = points[i][1];
        }
        return short_num;

    }



}
