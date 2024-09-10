package org.example.designpatterns.structural.proxy;

public class BitMapImage implements Image {
    private Point2d point2d;
    private String fileName;

    public BitMapImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void setLocation(Point2d point2d) {
        this.point2d.setXY(point2d.getX(),point2d.getY());
    }

    @Override
    public Point2d getLocation() {
        return point2d;
    }

    @Override
    public void render() {
        System.out.println("Rendering point");
    }
}
