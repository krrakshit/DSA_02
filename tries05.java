public class tries05 {
   static class Node {
       Node[] children = new Node[26];
       boolean ewo = false;
       int freq;

       public Node() {
           for (int i = 0; i < children.length; i++) {
               children[i] = null;
           }
           freq = 1;
       }
   }
   public static Node root = new Node();
   public static void insert(String word){
       Node curr = root;
       for (int i = 0;i<word.length();i++){
           int idx = word.charAt(i) -'a';
           if (curr.children[idx] == null){
               curr.children[idx] = new Node();
           }
           else{
            curr.children[idx].freq++;
           }
           curr = curr.children[idx];
       }
       curr.ewo= true;
   }

    public static void main(String[] args) {
        String arr[] = {"zebra","dog","duck","dove"};
        for (int i = 0;i<arr.length;i++){
            insert(arr[i]);
        }

    }
}
