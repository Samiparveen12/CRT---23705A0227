public class Main{
    public static void main(String[]args){
      Tree t= new Tree(new int[]{1,2,4,-1,-1,5,7,-1,8,-1,-1,-1,3,9,11,-1,-1,10,-1,-1,-1});
      Node root =t.getRoot();
      int heightOfRoot=Tree.heightOf(root);
      System.out.println("height of tree is:"+heightOfRoot);
    }
}
public static int heightOf(Node root){
    if(root==null)
    return 0;
    int ln=heightOf(root.left);
    int rh=heightOf (root.right);
    return Math.max(ln,rh)+1;
}

