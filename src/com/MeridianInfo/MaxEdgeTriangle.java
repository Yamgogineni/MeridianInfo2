package com.MeridianInfo;

public class MaxEdgeTriangle {
            public static void main(String[] args) {
            // Maximum value of an edge of a triangle given two sides of a triangle
                maxEdge(5, 7);
               }

                 private static void maxEdge(int side1, int side2) {
                    double maxedge = 0.0;
                    maxedge = side1 + side2 - 0.1;
                    System.out.println( "Maximum length of the third edge of a triangle " + "with " + side1 + " and side " + side2 + " is " + maxedge);

                    }
}
