import javax.swing.tree.TreeNode;
import java.util.*;


public class btrees01 {
    // binary tree level order travversal
   class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> result = new ArrayList<>();
            if (root == null) {
                return result;
            }
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);

            while (!queue.isEmpty()) {
                int levelsize = queue.size();
                List<Integer> currentlevel = new ArrayList<>(levelsize);
                for (int i = 0;i<levelsize;i++){
                    TreeNode currentnode = queue.poll();
                    currentlevel.add(currentnode.val);
                    if (currentnode.left != null){
                        queue.offer(currentnode.left);
                    }
                    if (currentnode.right != null){
                        queue.offer(currentnode.right);
                    }
                }
                result.add(currentlevel);
            }
            return result;
        }
    }
}
