package org.example.designpatterns.structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ImageInvocationHandler implements InvocationHandler {

    private Point2d point2d;
    private Image image;
    private String fileName;
    private static final Method setLocationMethod;
    private static final Method getSetLocationMethod;
    private static final Method renderMethod;
    static {
        try{
            setLocationMethod=Image.class.getMethod("setLocation", new Class[]{Point2d.class});
            getSetLocationMethod=Image.class.getMethod("getLocation");
            renderMethod=Image.class.getMethod("render");
        }
        catch (NoSuchMethodException ex){
            throw new NoSuchMethodError(ex.getMessage());
        }
    }
    public ImageInvocationHandler(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        String methodName=method.getName();
        if(method.equals(setLocationMethod)){
            handleSetLocation(objects);
        }
        else if(method.equals(getSetLocationMethod)){
            return handleGetLocation();
        }
        else if(method.equals(renderMethod)){
            handleRender();
        }
        return null;
    }

    private void handleRender(){
        if(image!=null){
            image.render();
        }
        else{
            image=new BitMapImage(fileName);
            if(point2d!=null)
                image.setLocation(point2d);
        }
    }
    private Point2d handleGetLocation(){
        if(image!=null)
            return image.getLocation();
        return point2d;
    }
    private void handleSetLocation(Object[] args){
        if(image!=null){
            image.setLocation((Point2d) args[0]);
        }
        else
            point2d=(Point2d) args[0];
    }
}
