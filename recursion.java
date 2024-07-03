import java.util.*;
public class recursion {
    public static void printdec(int n){
        if (n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printdec(n-1);
    }
    public static void inc(int n){
        if (n==1) {
            System.out.print(n+" ");
            return;
        }
        inc(n-1);
        System.out.print(n+" ");
    }
    public static int fact(int n){
        if (n==0) {
            return 1;
        }
        int fnm1 = fact(n-1);
        int fn = n*fact(n-1);
        return fn;
    }
    public static int calcsum(int n){
        if (n==1) {
            return 1;

        }
        int snm1 = calcsum(n-1);
        int sn = n+snm1;
        return sn;
    }
    public static int fib(int n){
        if ((n==0)||(n==1)) {
            return n;
        }
        int fnm1 = fib(n-1);
        int fnm2 = fib(n-2);
        int fn = fnm1 + fnm2;
        return fn;
    }
    public static boolean issorted(int ar[],int i){
        if (i==ar.length-1) {
            return true;
        }
        if (ar[i]>ar[i+1]) {
            return false;
        }
        return issorted(ar, i+1);
    }
    public static int firsto(int arr[], int key, int i){
        if (i==arr.length) {
            return -1;
        }
        if (arr[i]==key) {
            return i;
        }
       return firsto(arr, key, i+1);
    }
    public static int lasto(int arr[], int key, int i){

        if (i==arr.length-1) {
            return -1;

        }
        int isfound = lasto(arr, key, i+1);
        if (isfound== -1 && arr[i] == key) {
            return i;

        }
        return isfound;
    }
    public static int power(int x,int n){
        if (n==0) {
            return 1;
        }
        return x*power(x,n-1);
        // same way
    }
    public static int optimizedpower(int a,int n){ // time complexity is O(n)
        if (n==0) {
            return 1;

        }
        int halfpowersq = optimizedpower(a, n/2)*optimizedpower(a, n/2);
        //n is odd
        if (n%2!=0) {
            halfpowersq=a*halfpowersq;
        }
        return halfpowersq;
    }
    public static int optimizedpower1(int a,int n){ // time complexity is O(logn)
        if (n==0) {
            return 1;
        }
        int halfpower = optimizedpower1(a, n/2);
        int halfpowersq =  halfpower*halfpower;
        //n is odd
        if (n%2!=0) {
            halfpowersq=a*halfpowersq;
        }
        return halfpowersq;
    }
    public static int tilprob(int n){
        //base case
        if (n == 0 || n==1) {
            return 1;

        }
        // body
        // vertical choice
        int fnm1 = tilprob(n-1);
        // horizonatal choice
        int fnm2 = tilprob(n-2);
        int totalways = fnm1+fnm2;
        return totalways;

    }
    public static void removed(String str,int idx,StringBuilder newStr,boolean map[]){
        if (idx == str.length()) {
            System.out.println(newStr);
            return;

        }
        // body
        char currchar = str.charAt(idx);
        if (map[currchar-'a'] ==  true) {
            // duplicate
            removed(str, idx+1, newStr, map);
        }
        else{
            map[currchar-'a'] = true;
            removed(str, idx+1, newStr.append(currchar), map);
        }
    }
    public static int fp(int n){
        if (n==1 || n== 2) {
            return n;

        }
        //choice
        //single
        int fnm1 = fp(n-1);
        //pair
        int fnm2 = fp(n-2);
        int pairways = (n-1)*fnm2;
        // totways
        int totways = fnm1 + pairways;
        return totways;
        // return fp(n-1) + (n-1)*fp(n-2);
    }
//    public static void printbstr(int n,int lp,String str){
//        //base case
//        if (n==0) {
//            System.out.println(str);
//            return;
//        }
//
//        //body
//        if (lp==0) {
//            // sit 0 on chair n
//            printbstr(n-1, 0, str.append("0"));
//            printbstr(n-1, 1, str.append("1"));
//        }
//        else{
//            printbstr(n-1, 0, str.append("0"));
//        }
//        printbstr(n-1, 0, str+"0");
//        if (lp==0) {
//            printbstr(n-1, 1, str+"1");
//        }
//    }


    public static void main(String[] args) {
        int n = 10;
        int arr[]={8,3,6,9,5,10,2,5,3};
        String str = "appnnacollege";
        removed(str, 0, new StringBuilder(""),new boolean[26]);



    }
}
