package PriorityQueue;
import java.util.*;

public class knearst_car {
    static class Point implements Comparable<Point>{
        int x;
        int y;
        int i;
        int distsq;
        Point(int x,int y,int i){
            this.x=x;
            this.y=y;
            this.i=i;
            this.distsq=x*x+y*y;
        }
        @Override
        public int compareTo(Point p2){
            return this.distsq-p2.distsq;
        }
    }
    public static void main(String[] args) {
        int pts[][]={{5,-1},{3,3},{-2,4}};
        int k=2;

        PriorityQueue<Point> d=new PriorityQueue<>();
        for(int i=0;i<pts.length;i++){
             d.add(new Point(pts[i][0],pts[i][1],i));
        }
        System.out.println(d.peek().i);;
    }
}
