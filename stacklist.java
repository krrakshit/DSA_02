import java.util.Scanner;

class Link{
    int info;
    Link next;

}

public class stacklist {
    static Link top = null;
    public static void push(){
        Scanner sc = new Scanner(System.in);
        Link node = new Link();
        System.out.println("enter the value");
        node.info = sc.nextInt();
        node.next = top;
        top = node;
    }
    public static void display() {
        Link temp = new Link();
        temp = top;
        if (top == null) {
            System.out.println("underflow");
        } else {
            while (temp != null) {
                System.out.print(temp.info + "--->");
                temp = temp.next;
            }
        }
    }
        public static void pop(){
            if(top==null){
                System.out.println("underflow");
            }
            else{
                top = top.next;
            }
        }

    public static void main(String[] args) {
       push();
       push();
       display();
    }


}
