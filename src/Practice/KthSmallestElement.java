package Practice;
import java.util.*;

public class KthSmallestElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        System.out.println("enter kth term");
        int k = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(kthElement(arr,k));
    }
    static int kthElement(int [] arr, int k){
        Arrays.sort(arr);
        return arr[k-1];
    }
}
