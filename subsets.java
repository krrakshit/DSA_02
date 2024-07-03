public class subsets {
    public static void findsubsets(String str,String ans,int i){

        //base case
        if (i==str.length()){
            System.out.println(ans);
            return;

        }
        //recvursion
        //yes
        findsubsets(str,ans+str.charAt(i),i+1);
        //no
        findsubsets(str,ans,i+1);
    }

    public static void main(String[] args) {
        String str="abc";
        findp(str,"");
    }
    public static void findp(String str,String ans){
        //base case
        if (str.length()==0){
            System.out.println(ans);
            return;
        }


        //recuirsion
        for (int i=0;i<str.length();i++){
            char carr=str.charAt(i);
            //"abcde
            String newstr = str.substring(0,i)+str.substring(i+1);
            findp(newstr,ans+carr);

        }
    }
}
