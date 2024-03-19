package org.example.designpatterns.singleton;

public class SingletonDp {
    private SingletonDp(){}
    private static SingletonDp instance;
    public static SingletonDp getInstance(){
        if(instance==null){
            synchronized (SingletonDp.class){
                if(instance==null)
                    instance=new SingletonDp();
            }
        }
        return instance;
    }
}
