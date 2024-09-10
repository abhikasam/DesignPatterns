package org.example.designpatterns.structural;

import org.example.designpatterns.structural.proxy.Image;
import org.example.designpatterns.structural.proxy.ImageFactory;
import org.example.designpatterns.structural.proxy.Point2d;
import org.junit.jupiter.api.Test;

public class ProxyTest {
    @Test
    public void Test(){
        Image image= ImageFactory.getImage("desktop/myimage.jpg");
        Point2d point2d=new Point2d();
        point2d.setXY(4,5);
        image.setLocation(point2d);
        image.render();
    }
}
