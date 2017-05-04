package Tree;

public class Path_Sum_III_437 {
	
	public int pathSumAll(TreeNode root, int sum){
		if(root == null){
			return 0;
		}
		return root.val == sum ?1:0 + pathSumAll(root.left, sum - root.val) + pathSumAll(root.right, sum - root.val);
	}

	public int pathSum(TreeNode root, int sum) {
		int number = 0;
		if(root == null){
			return number;
		}
		number += pathSumAll(root, sum) + pathSumAll(root.left, sum) + pathSumAll(root.right, sum);
        
        return number;
    }
}
