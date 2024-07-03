import java.util.ArrayList;
import java.util.Collections;

public class arraylist {
    public static void swap(ArrayList<Integer> list,int idx1,int idx2){
        int temp = list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
    }

    //        ArrayList<Integer> list = new ArrayList<>();
//        ArrayList<String> list2 =new ArrayList<>();
//        ArrayList<Boolean> list3 =new ArrayList<>();
//        list.add(2);
//        list.add(5);
//        list.add(9);
//        list.add(3);
//        list.add(6);
////        list.add(1,9);
//        System.out.println(list);
//        System.out.println(list.size());
//        for (int i = 0;i<list.size();i++){
//            System.out.print(list.get(i)+" ");
//        }
//        System.out.println();
//        for (int i = list.size()-1;i>=0;i--){
//            System.out.print(list.get(i)+" ");
//        }
//        System.out.println();
//
//         get operation
//       int element =  list.get(3);
//          System.out.println(element);
//         remove
//        list.remove(2);
//        System.out.println(list);
//
//        set
//
//        list.set(1,10);
//        System.out.println(list);
//        System.out.println(list.contains(1));
//        System.out.println(list.contains(11));
//        int max = Integer.MIN_VALUE;
////        for (int i = 0;i<list.size();i++){
////            if (max<list.get(i)){
////                max = list.get(i);
////            }
////        }
////        System.out.println("maximum element is " + max);
//        int idx1 = 1,idx2 = 3;
//        System.out.println(list);
//        swap(list,idx1,idx2);
//       System.out.println(list);
//        System.out.println(list);
//     // ascending
//        Collections.sort(list);
//        System.out.println(list);
//        // descending order
//        Collections.sort(list,Collections.reverseOrder());
//        // comparator - fnx logic
//        System.out.println(list);
//        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
//        ArrayList <Integer> list = new ArrayList<>();
//        list.add(1); list.add(2);
//        mainlist.add(list);
//        ArrayList<Integer> list2 = new ArrayList<>();
//        list2.add(3); list2.add(4);
//        mainlist.add(list2);
//        for (int i = 0;i<mainlist.size();i++){
//            ArrayList<Integer> currList = mainlist.get(i);
//            for (int j = 0;j<currList.size();j++){
//                System.out.print(currList.get(j)+" ");
//            }
//            System.out.println();
//        }
//        System.out.println(mainlist);
//        ArrayList<Integer> list1 = new ArrayList<>();
//        ArrayList<Integer> list2 = new ArrayList<>();
//        ArrayList<Integer> list3 = new ArrayList<>();
//        for (int i = 1;i<=5;i++){
//            list1.add(i*1);
//            list2.add(i*2);
//            list3.add(i*3);
//        }
//        mainlist.add(list1);
//        mainlist.add(list2);
//        mainlist.add(list3);
//        list2.remove(3);
//        list2.remove(2);
//        System.out.println(mainlist);
//        // nested list
//        for (int i = 0;i< mainlist.size();i++){
//            ArrayList<Integer> currlist = mainlist.get(i);
//            for (int j = 0;j< currlist.size();j++){
//                System.out.print(currlist.get(j)+" ");
//            }
//            System.out.println();
//        }
//        public static int storewater(ArrayList<Integer> height ){
//            int maxwater = 0;
//            //brute force
//        for (int i = 0;i<height.size();i++){
//            for (int j = i+1;j<height.size();j++){
//                int ht = Math.min(height.get(i),height.get(j));
//                int width = j-1;
//                int currwater = ht*width;
//                maxwater= Math.max(maxwater,currwater);
//            }
//        }
//        return maxwater;
//        }
//        public static int store(ArrayList<Integer> height) {
//            int maxwater = 0;
//            int lp = 0;
//            int rp = height.size() - 1;
//            while (lp < rp) {
//                int ht = Math.min(height.get(lp), height.get(rp));
//                int width = rp - lp;
//                int currwater = ht * width;
//                maxwater = Math.max(maxwater, currwater);
//                if (height.get(lp) < height.get(rp)) {
//                    lp++;
//                } else {
//                    rp--;
//                }
//            }
//            return maxwater;
//        }
    // height.add(1);
    //        height.add(8);
//        height.add(6);
//        height.add(2);
//        height.add(5);
//        height.add(4);
//        height.add(8);
//        height.add(3);
//        height.add(7);
//        System.out.println(store(height));
//    public static boolean pairsum1(ArrayList<Integer> list,int target){
//        for (int i = 0;i<list.size();i++){
//            for (int j = i+1;j<list.size();j++){
//                if (list.get(i)+list.get(j)==target){
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
//    public static boolean pairsum1(ArrayList<Integer> list,int target){
//        int lp = 0;
//        int rp = list.size()-1;
//        while(lp!=rp){
//            if (list.get(lp)+list.get(rp)==target){
//                return true;
//            }
//            if (list.get(lp)+list.get(rp)<target){
//                lp++;
//            }
//            else{
//                rp--;
//            }
//        }
//        return false;
//    }
    public static boolean pairsum1(ArrayList<Integer> list, int target){
        int bp = -1;
        int n = list.size();
        for (int i = 0;i<list.size();i++){
            if (list.get(i)>list.get(i+1)){
                bp = i;
                break;
            }
        }
        int lp = bp+1;
        int rp = bp;
        while(lp!=rp){
            if (list.get(lp)+list.get(rp) == target){
                return true;
            }
            if (list.get(lp)+list.get(rp) <target){
                lp = (lp+1)%n;
            }
            else{
                rp = (n+rp-1)%n;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(16);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 26;
        System.out.println(pairsum1(list,target));

    }
}

