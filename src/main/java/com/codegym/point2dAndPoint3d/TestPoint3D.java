package com.codegym.point2dAndPoint3d;

import java.util.Arrays;

public class TestPoint3D {
    public static void main(String[] args) {
        Point3D point3D_1 = new Point3D();
        System.out.println(point3D_1);

        Point3D point3D_2 = new Point3D(5, 6, 7);
        System.out.println(point3D_2);

        System.out.println(Arrays.toString(point3D_2.getXYZ()));
    }
}
