import java.util.Arrays;

class Solution {

    public long gcdSum(int[] nums) {

        int n = nums.length;
        int[] arr = new int[n];
        int max = 0;

        // Build prefix GCD array
        for (int i = 0; i < n; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            arr[i] = gcd(nums[i], max);
        }

        // Sort the array
        Arrays.sort(arr);

        // Pair first with last
        long sum = 0;
        int left = 0;
        int right = n - 1;

        while (left < right) {
            sum += gcd(arr[left], arr[right]);
            left++;
            right--;
        }

        return sum;
    }

    // GCD Function
    public int gcd(int a, int b) {
        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }
}