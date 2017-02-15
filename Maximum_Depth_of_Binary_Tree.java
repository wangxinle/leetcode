package LeetCode;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class Maximum_Depth_of_Binary_Tree {

	public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }else{
            int l = maxDepth(root.left);
            int r = maxDepth(root.right);
            if(l>r){
                return 1+l;
            }else{
                return 1+r;
            }
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
