public class Main {
    public static void main (String[]args){
        int[] nums = {20,30,40,50};
        int min = nums[0];
        for (int i=1;i<nums.length;i++){
            int value = nums[i];
            if (value<min){
                min = value;
            }
        }
    System.out.println("Min:" + min);
            
        }
    
   
        
    }
    
output:
Min:20