/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        if(root == null) {
            return null;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        List<Double> res = new ArrayList<>();

        while(!q.isEmpty()) {
            int size = q.size();
            double sum = 0;

            for(int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                sum += (double)node.val; 

                if(node.left != null) {
                    q.add(node.left);
                }
                if(node.right != null) {
                    q.add(node.right);
                }
            }
            double average = sum / (double)size;
            res.add(average);
        }

        return res;
    }
}