import java.util.Scanner;

class link{
    int info;
    link next;
}
public class queuelist {
    static link front = null;
    static link rear = null;
    public static void insert(){
        Scanner sc = new Scanner(System.in);
        link node = new link();
        System.out.println("enter the value");
        node.info=sc.nextInt();
        node.next = null;
        if (front==null&&rear==null){
            front = node;
        }
        else{
            rear.next=node;
        }
        rear=node;
    }
    public static void delete(){
        if (front==null && rear==null){
            System.out.println("underflow");
        }
        else{
            front=front.next;
        }
    }
    public static void display(){
        if (front==null&&rear==null){
            System.out.println("underflow");
        }
        else{
            link temp = front;
            while(temp!=null){
                System.out.print(temp.info+"-->");
                temp=temp.next;
            }
        }
    }

    public static void main(String[] args) {
        insert();
        insert();
        display();
    }
}
