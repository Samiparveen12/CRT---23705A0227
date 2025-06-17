public class main{
    public static void main(String[]args){
        printRange(1,5);
    }
    public static void printRange(int start,int end){
        if(start > end){
            return;
        }
        System.out.println(start);
        printRange(start+1, end);
    }
    
}
    
 output:
 
 1
2
3
4
5

=== Code Execution Successful ===