
// Java program to iterate elements
// to a Queue

import java.util.*;

public class Main {

    public static void main(String args[])
    {
        Queue<String> pq = new PriorityQueue<>();

        pq.add("all");
        pq.add("For");
        pq.add("all");

        Iterator iterator = pq.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
