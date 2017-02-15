package LeetCode;

public class Same_Tree_100 {
	public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }
        if((p==null && q!=null) || (p!=null && q == null)){
            return false;
        }
        if(p.val != q.val){
            return false;
        }else{
            if(isSameTree(p.left,q.left) && isSameTree(p.right,q.right)){
                return true;
            }else{
                return false;
            }
        }
    }
}
