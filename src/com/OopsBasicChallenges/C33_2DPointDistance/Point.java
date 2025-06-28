package com.OopsBasicChallenges.C33_2DPointDistance;

public class Point {
    private int x;
    private int y;

    public Point() {}

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)

    public double distance() {
        return Math.sqrt(((x * x) + (y * y)));
    }

    public double distance(Point point) {
        double xDist = (this.x - point.getX()) * (this.x - point.getX());
        double yDist = (this.y - point.getY()) * (this.y - point.getY());
        return Math.sqrt(xDist + yDist);
    }

    public double distance(int x, int y) {
        double xDist = (this.x - x) * (this.x - x);
        double yDist = (this.y - y) * (this.y - y);
        return Math.sqrt(xDist + yDist);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
