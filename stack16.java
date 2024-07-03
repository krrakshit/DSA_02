import java.util.Stack;

public class stack16 {
    public static void maxarea(int arr[]){
        int maxArea = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];
        // next samller right

        Stack<Integer> s = new Stack<>();
        for (int i = arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]>= arr[i]){
                s.pop();
            }
            if (s.isEmpty()){
                nsr[i] = arr.length;
            }
            else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        // nest smaller left
         s = new Stack<>();
        for (int i = 0;i<arr.length;i++){
            while(!s.isEmpty() && arr[s.peek()]>= arr[i]){
                s.pop();
            }
            if (s.isEmpty()){
                nsl[i] = -1;
            }
            else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }
        //current area width = lj-i-1
        for (int i = 0;i<arr.length;i++){
            int height = arr[i];
            int width = nsr[i] - nsl[i]-1;
            int currarea= height*width;
            maxArea = Math.max(currarea,maxArea);
        }
        System.out.println("Maximum area of histogram is " + maxArea);

    }
    public static void main(String[] args) {
        int arr[] = {2,1,5,6,2,3};
        maxarea(arr);
    }
}
