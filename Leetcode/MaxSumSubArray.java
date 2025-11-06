package Leetcode;

public class MaxSumSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int[] nums = { 1, 3, 3, 5, 7, -9, 2, 4, 6, 8, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0,
		 * 0, 0, 0, 0, 0 }; Arrays.stream(nums).filter(x -> x == 0).count();
		 * List<Integer> l1 = new ArrayList<Integer>(); int maxSum = nums[0]; int
		 * currentSum =nums[0]; for (int i = 1 ; i < nums.length; i++) { currentSum =
		 * Math.max(maxSum, nums[i] +maxSum); maxSum = currentSum; }
		 * System.out.println(maxSum);
		 */
		int[] arr = {1, 3, 3, 5, 7, -9, 2, 4, 6, 8, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				  0, 0, 0, 0, 0};

        int maxSum = arr[0];
        int currentSum = arr[0];

        int start = 0, end = 0, tempStart = 0;

        for (int i = 1; i < arr.length; i++) {
            if (currentSum + arr[i] < arr[i]) {
                currentSum = arr[i];
                tempStart = i;   // new subarray starts here
            } else {
                currentSum += arr[i];
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }
        }

        System.out.println("Maximum Subarray Sum = " + maxSum);
        System.out.print("Subarray = ");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
	}

}
