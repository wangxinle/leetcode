package Tree;

public class Sum_of_Left_Leaves_404 {

	public int sumOfLeftLeaves(TreeNode root) {
        int sum = 0;
        if(root == null){
        	return sum;
        }
        if(root.left != null && root.left.left == null && root.left.right == null){
        	sum += root.left.val;
        }else{
        	sum += sumOfLeftLeaves(root.left);
        }
        sum += sumOfLeftLeaves(root.right);
        return sum;
    }
}
