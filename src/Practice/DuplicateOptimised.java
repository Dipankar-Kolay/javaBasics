package Practice;

public class DuplicateOptimised {
    public static void main(String[] args) {
        int [] arr = {1,2,1,3,};
       int result = findDuplicate(arr);
        System.out.println(result);
    }
    static int findDuplicate(int[] nums){

        int val = 0;

        for(int i = 0; i < nums.length; i++) {
            val = Math.abs(nums[i]);

            if(nums[val] < 0) {
                return  Math.abs(nums[i]);
            } else {
                nums[val] = -nums[val];
            }

        }
        return -1;
    }
}
