public class Main{
    public static void main (String[]args){
        Tree t = new Tree(new int[]{1,2,-1,-1,3,-1,-1});
        
     }

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
        
    }

class Tree{
   
    Node root;
    int index = -1;
    Tree(int[]nodes){
        this.root = buildTreeUsingArray(nodes);
    
    System.out.println(index);
    public Node buildTreeUsingArray(int[]nodes){
        index ++;
        if(index>=nodes.length){
            return null;
        }
        if(node[index]==-1)
        return null;
        Node newNode = newNode(nodes[index]);
        newNode.left = buildTressUsingArray(nodes);
     newNode.right = buildTressUsingArray(nodes);

        return newNode;
    }
    
}
}

}