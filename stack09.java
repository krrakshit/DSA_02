import java.util.*;
public class stack09 {
    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3};
        Stack<Integer> s = new Stack<>();
        int nxtgreater[] = new int[arr.length];
        for (int i = arr.length-1;i>=0;i--){
            //1 while
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }
            // if else
            if (s.isEmpty()){
                nxtgreater[i] = -1;
            }
            else{
                nxtgreater[i] = arr[s.peek()];
            }
            // push
            s.push(i);
        }
        for (int i = 0;i<nxtgreater.length;i++){
            System.out.print(nxtgreater[i]+" ");
        }
        System.out.println();
    }
}
