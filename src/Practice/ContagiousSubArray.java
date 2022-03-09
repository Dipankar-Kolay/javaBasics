package Practice;

public class ContagiousSubArray {
    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        int n = arr.length;
        int result = LargestSubArray(arr,n);
        System.out.println(result);
    }
    static int LargestSubArray(int[] arr, int n){
        int curr = 0;
        int max = 0;
        for(int i=0; i<n;i++){
            curr = curr+ arr[i];
            if(curr>max){
                max = curr;
            }
            else if(curr<0){
                curr=0;
            }

        }
        return max;
    }
}
