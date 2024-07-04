import java.util.*;
public class pq01 {
    static class Student implements Comparable<Student>{
        String name;
        int rank;

        public Student(String name,int rank){
            this.name = name;
            this.rank = rank;
        }
        @Override
        public int compareTo(Student s2){
            return this.rank- s2.rank;
        }
    }
    public static void main(String[] args) {
        // comparator rverses the order  Comparator.reverseOrder()
       // PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(new Student("a",4));
        pq.add(new Student("b",5));
        pq.add(new Student("c",2));
        pq.add(new Student("d",12));
//        pq.add(1);
//        pq.add(7);
        while(!pq.isEmpty()){
            System.out.println(pq.peek().name + " -> " +pq.peek().rank );
            pq.remove();
        }
    }
}
