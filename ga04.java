import java.util.*;
public class ga04 {
    public static void main(String[] args) {
        int pairs[][] = {{5,24},{39,60},{5,28},{27,40},{50,90}};

        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        int chainLen = 1;
        int Chainnend = pairs[0][1];

        for (int i = 1;i< pairs.length;i++){
            if (pairs[i][0] > Chainnend){
                chainLen++;
                Chainnend = pairs[i][1];
            }
        }
        System.out.println("length of chain is : "+chainLen);
    }
}
