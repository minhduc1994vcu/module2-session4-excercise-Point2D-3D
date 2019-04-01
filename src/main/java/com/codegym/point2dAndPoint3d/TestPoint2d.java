package com.codegym.point2dAndPoint3d;

import java.util.Arrays;

public class TestPoint2d {
    public static void main(String[] args) {
        Point2D point2D_1 = new Point2D();
        System.out.println(point2D_1);

        Point2D point2D_2 = new Point2D(5, 3.5f);
        System.out.println(point2D_2);
        System.out.println(Arrays.toString(point2D_2.getXY()));
    }
}
