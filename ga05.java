import java.util.*;
public class ga05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer coins[] = {1,2,5,10,20,50,100,500,2000};

        Arrays.sort(coins, Comparator.reverseOrder());
        int countofcoins  = 0;
        System.out.println("enter the value you want to check0");
        int n = sc.nextInt();
        int amount = n;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0;i<coins.length;i++){
            if (coins[i]<=amount){
                while (coins[i]<=amount){
                    countofcoins++;
                    ans.add(coins[i]);
                    amount-= coins[i];
                }
            }
        }
        System.out.println("total minm coins used is "+countofcoins);
        for (int i = 0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
        System.out.println();
    }
}
