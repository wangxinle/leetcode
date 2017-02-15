package LeetCode;


public class Path_Sum_112 {
	public boolean hasPathSum(TreeNode root, int sum) {
		if(root == null){
			return false;
		}
		if(root.right == null && root.left == null){
			return sum == root.val;
		}
		return hasPathSum(root.left, sum - root.val)|| hasPathSum(root.right, sum - root.val);
    }
}
