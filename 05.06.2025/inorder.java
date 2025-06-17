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
        this.root= inOrder();
        System.out.println(index);
    }
    public Node inOrder(){
        Node temp=this.root;
        inOrderHelper(temp);
        return null;
    }
    private void inOrderHelper(Node temp){
        if(temp==null)return;
       inOrderHelper(temp.left);
        System.out.println(temp.data+" ");
        inOrderHelper(temp.right);
    }
}
