public class Main{
    public static void main (String []args){
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        int val = q.dequeue();
        System.out.println("Removed value : "+val);
        q.print();
        System.out.println("length of queue: "+q.length());
    }
    } 
    class Node {
        int data;
        Node next;
        Node(int data){
    this.data = data;
    this.next = null;
}  
}
class Queue{
    Node head;
    Node rear;
    Queue(){
        this.head = null;
        this.rear = null;
    }
    boolean isEmpty(){
        if(head == null){
            return true;
        }
        else{
            return false;
        }
    }
    void enqueue(int val){
        Node newNode = new Node(val);
        if(isEmpty()){
            this.head = newNode;
            this.rear =  newNode;
        }
        rear.next = newNode;
        rear = rear. next;
    }
    int dequeue(){
        if (isEmpty()){
            System.out.println("Queue is Empty");
            return-1;
        
        }else{
            int val = head.data;
            head = head.next;
            return val;
            
        }
        }
        void print(){
            var temp = head;
            System.out.println("----------------");
            while(temp !=null){
                System.out.println(temp .data +" ");
                temp= temp.next;
            }
                  System.out.println("---------------");
                  
                
            
        }
            int length(){
                int length_=0;
                   var temp = head;
                  while(temp != null){
                      length_++;
                      temp=temp.next;
                  }
                  return length_;
            }
            
        }
		
output:
Removed value : 10
----------------
20 
30 
40 
---------------
length of queue: 3