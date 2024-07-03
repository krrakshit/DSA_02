public class stackarray {
    static int max = 4;
    static int top = -1;

    public static void push(int []ar,int x){
        if (top==max-1){
            System.out.println("overflow");
        }
        else{
            top++;
            ar[top] = x;
        }
    }
    public static void display(int[] ar){
        if (top==-1){
            System.out.println("overflow");
        }
        else{
            for (int i = top;i>=0;i--){
                System.out.println(ar[i]);
            }
        }
    }
    public static void pop(){
        if (top==-1){
            System.out.println("underflow");
        }
        else{
            top=top-1;
        }
    }

    public static void main(String[] args) {
        int[]ar = new int[max];
        push(ar,10);
        push(ar,20);
        push(ar,30);
        pop();
        display(ar);
    }
}
