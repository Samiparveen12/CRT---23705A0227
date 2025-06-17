public class Main{
    public static void main(String[] args){
        int[] nums = {10,29,2,3,1,8,9};
        int target = 3;
        int index = -1;
        for(int i= 0;i<nums.length;i++){
            if(target == nums[i])
                index = i;
                
            }
        
        System.out.println(index == -1 ?"elements are not found" : "element found at index:" + index);
    }
}
output:
element found at index:3

=== Code Execution Successful ===