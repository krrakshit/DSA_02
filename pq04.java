import java.util.*;
public class pq04 {

    static class point implements Comparable<point>{
        int x,y,dist,idx;

        public point(int x,int y,int dist,int idx){
            this.x = x;
            this.y = y;
            this.dist = dist;
            this.idx = idx;
        }
        @Override
        public int compareTo(point p2){
            return this.dist-p2.dist;
        }
    }
    public static void main(String[] args) {
        int pts[][] = {{3,3},{5,-1},{-2,4}};
        int k = 2;

        PriorityQueue<point> pq = new PriorityQueue<>();
        for (int i = 0;i<pts.length;i++){
            int distsq = pts[i][0]*pts[i][0] + pts[i][1]*pts[i][1];
            pq.add(new point(pts[i][0],pts[i][1],distsq,i));
        }
        for (int i = 0;i<k;i++){
            System.out.println("C"+pq.remove().idx);
        }
    }
}
