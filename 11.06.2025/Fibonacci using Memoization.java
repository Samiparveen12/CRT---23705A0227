import java.util.HashMap;
public class Fibonacci
{
    private HashMap<Integer,Integer>memo=new HashMap<>();
    public int fibMemo(int n){
        if(memo.containsKey(n)){
            return memo.get(n);
        }
        if(n<=1){
            return n;
        }
        int result=fibMemo(n-1)+fibMemo(n-2);
       memo.put(n,result);
       return result;
    }
	public static void main(String[] args) {
	    Fibonacci fibonacci=new Fibonacci();
		int n=10;
		System.out.println("Fibonacci of"+n+"is:"+fibonacci.fibMemo(n));
		
	}
}