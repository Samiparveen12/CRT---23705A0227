public class Main{
    public static void main(String[]args){
      Tree t= new Tree(new int[]{1,2,-1,-1,3,-1,-1});
    }
}
      class Node {
      int data;
      Node left;
      Node right;
      Node(int data){
          this.data=data;
          this.left=null;
          this.right=null;
      }
}
class Tree{
    Node root;
    int index=-1;
    Tree(int[]nodes){
        this.root= preOrder();
        System.out.println(index);
    }
    public Node preOrder(){
        Node temp=this.root;
        preOrderHelper(temp);
        return null;
    }
    private void preOrderHelper(Node temp){
        if(temp==null)return;
        System.out.println(temp.data+" ");
        preOrderHelper(temp.left);
        preOrderHelper(temp.right);
    }
}


