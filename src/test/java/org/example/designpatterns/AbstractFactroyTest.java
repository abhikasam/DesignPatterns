package org.example.designpatterns;

import org.example.designpatterns.creational.advfactory.AWSResourceFactory;
import org.example.designpatterns.creational.advfactory.Client;
import org.example.designpatterns.creational.advfactory.Instance;
import org.junit.jupiter.api.Test;

public class AbstractFactroyTest {
    @Test
    public void Test(){
        Client client=new Client(new AWSResourceFactory());
        Instance instance=client.createServer(Instance.Capacity.large,20480);
        instance.start();
        instance.stop();
    }
}
