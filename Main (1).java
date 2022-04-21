
// Java program to add elements
// to a Queue

import java.util.*;

public class Main {

    public static void main(String args[])
    {
        Queue<String> pq = new PriorityQueue<>();

        pq.add("java");
        pq.add("for");
        pq.add("all");

        System.out.println(pq);
    }
}
