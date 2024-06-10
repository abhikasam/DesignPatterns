package org.example.designpatterns.structural;

import org.example.designpatterns.structural.bridge.FifoCollection;
import org.example.designpatterns.structural.bridge.LifoCollection;
import org.example.designpatterns.structural.bridge.Queue;
import org.example.designpatterns.structural.bridge.Stack;
import org.junit.jupiter.api.Test;

public class BridgeTest {
    @Test
    public void Test(){
        FifoCollection<Integer> queue=new Queue<>();

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        queue.offer(4);
        System.out.println(queue);
        System.out.println(queue.poll());

        System.out.println("****************************************");

        LifoCollection<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.push(4);
        System.out.println(stack);
        System.out.println(stack.pop());
    }
}
