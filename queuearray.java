public class queuearray {
    static int max = 4;
    static int front = -1;
    static int rear = -1;

    public static void insert(int []ar,int x){
        if (rear==max-1){
            System.out.println("overflow");
        }
        else{
            rear++;
            ar[rear] = x;
        }
    }
    public static void delete(){
        if (front>rear){
            System.out.println("underflow");
        }
        else{
            front++;
        }
    }
    public static void display(int[] ar){
        if (front > rear) {
            System.out.println("underflow");
        }
        else{
            for (int i = front;i<=rear;i++){
                System.out.println(ar[i]);
            }
        }

    }

    public static void main(String[] args) {
        int []ar = new int[max];
        insert(ar,10);
        insert(ar,20);
        insert(ar,30);
        delete();
        display(ar);

    }

}
