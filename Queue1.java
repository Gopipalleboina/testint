import java.util.*;
public class Queue1{
    public static void main(String[] args){
        PriorityQueue<Integer>p=new PriorityQueue<>(Collections.reverseOrder());
        p.add(30);
        p.add(20);
        p.add(10);
        System.out.println(p.peek());
        System.out.println(p.poll());
        
    }
}