package LeetCode;

public class Invert_Binary_Tree_226 {

	public TreeNode invertTree(TreeNode root) {
        if(root == null ||(root.left == null && root.right == null)){
            return root;
        }else{
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
            invertTree(root.left);
            invertTree(root.right);
        }
        return root;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
