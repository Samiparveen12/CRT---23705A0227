public class Main {
    public static void main (String[]args){
        int[] nums = {20,30,40,50};
        int count = 0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]%2!=0){
                count = count+1;
            }
        }
    System.out.println("no of odd numbers:" + count);
            
        }
    
   
        
    }

output:

no of odd numbers:0