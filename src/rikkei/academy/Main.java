package rikkei.academy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Point_2d point_2d = new Point_2d();
        System.out.println(point_2d);
        point_2d = new Point_2d(6,7);
        System.out.println(point_2d);
        Point_3d point_3d = new Point_3d(5);
        System.out.println(point_3d);
        point_3d = new Point_3d(2,3,5);
        System.out.println(point_3d);
        System.out.println(Arrays.toString(point_3d.getXYZ()));
    }
}
