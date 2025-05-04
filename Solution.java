class Solution {
    
    
    public static void main(String[] args) {
        int[] nums = new int[5];
        for (int i = 0; i < 5; i++) {
            nums[i] = i;
        }

        findMaxAverage(nums,4);
    }
    
    
    
    
    public static double findMaxAverage(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
            right++;

        }
        int total = sum;
        while (right < nums.length) {
            total += nums[right] - nums[left];
            System.out.println(total);
            sum = Math.max(total, sum);
            right++;
            left++;

        }
        return (double) sum / k;
    }

   

}