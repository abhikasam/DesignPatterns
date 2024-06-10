package org.example.designpatterns;
import org.example.designpatterns.creational.singleton.SingletonDp;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SingletonDpTest {
    @Test
    public void Test(){
        SingletonDp singletonDp1=SingletonDp.getInstance();
        SingletonDp singletonDp2=SingletonDp.getInstance();
        assertEquals(singletonDp1.hashCode(),singletonDp2.hashCode());
    }
}
