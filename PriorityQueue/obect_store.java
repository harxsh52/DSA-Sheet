package PriorityQueue;
import java.util.*;
public class obect_store {
    static class student implements Comparable<student>{//override
        String name;
        int rank;
        
        public student(String name,int rank){
            this.name=name;
            this.rank=rank;
        }
        @Override
        public int compareTo(student s2){
            return this.rank-s2.rank;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<student> pq=new PriorityQueue<>();
        pq.add(new student("Harsh",5));
        pq.add(new student("arsh",1));
        pq.add(new student("Harshit",15));

        while(!pq.isEmpty()){
            System.out.println(pq.peek().name+"->"+pq.peek().rank);
            pq.remove();
        }
    }

}
