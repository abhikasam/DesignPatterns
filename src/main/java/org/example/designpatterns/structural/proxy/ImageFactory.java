package org.example.designpatterns.structural.proxy;

import java.lang.reflect.Proxy;

public class ImageFactory {
    public static Image getImage(String fileName){
        return (Image) Proxy.newProxyInstance(ImageFactory.class.getClassLoader(),new Class[]{ Point2d.class }
                ,new ImageInvocationHandler(fileName));
    }
}
