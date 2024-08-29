import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class btrees02 {
    // averagee of levels in a binary tree
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
                double averagelevel = 0;
                for (int i = 0;i<levelsize;i++){
                    TreeNode currentnode = queue.poll();
                    averagelevel += currentnode.val;
                    if (currentnode.left != null){
                        queue.offer(currentnode.left);
                    }
                    if (currentnode.right != null){
                        queue.offer(currentnode.right);
                    }
                }
                averagelevel = averagelevel / result.add(averagelevel);
            }
            return result;
        }
    }
}
