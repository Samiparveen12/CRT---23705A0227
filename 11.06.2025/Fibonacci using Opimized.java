public class Fibonacci
{
    public static int fibOptimized(int n){
        if(n<=1)return n;
        int prev=0,curr=1;
        for(int i=2;i<=n;i++){
            int temp=curr;
            curr=curr+prev;
            prev=temp;
        }
        return curr;
    }
	public static void main(String[] args) {
		int n=10;
		System.out.println("Fibonacci of"+n+"is:"+fibOptimized(n));
		
	}
}