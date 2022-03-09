package Practice;

import java.util.Arrays;

public class MinimizeHeights {
    public static void main(String[] args) {
        int[] arr = {1,5,9,1,2,6,7,1,9,10};
        int n = arr.length;
        int k = 4;
        int ans = getMInDiff(arr, n, k);
        System.out.println(ans);
    }

    static int getMInDiff(int[] arr, int n, int k) {
        int min = 0, max = 0, r = 0;
        Arrays.sort(arr);
        r = arr[n - 1] - arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] >= k) {
                max = Math.max(arr[i - 1] + k, arr[n - 1] - k);
                min = Math.min(arr[i] - k, arr[0] + k);
                r = Math.min(r, max - min);
            }

        }
        return r;

    }
}

