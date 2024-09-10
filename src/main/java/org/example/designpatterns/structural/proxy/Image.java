package org.example.designpatterns.structural.proxy;

public interface Image {
    void setLocation(Point2d point2d);
    Point2d getLocation();
    void render();
}
