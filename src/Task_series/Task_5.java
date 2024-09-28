package Task_series;

public class Task_5 {
	
	//Input : [1,2,3,4,9,6,8,9,9]
	//		Output : 32
	//		Explanation : Subarray [6,8,9,9] is with maximum sum and inscreasing sub array
  public static void main(String[] args) {
	  int[] arr = {1, 2, 3, 4, 9, 6, 8, 9, 9};
      System.out.println(maxIncreasingSubarraySum(arr));
  }

  public static int maxIncreasingSubarraySum(int[] arr) {
      int maxSum = 0;
      int currentSum = arr[0];
      int start = 0;

      for (int i = 1; i < arr.length; i++) {
          if (arr[i] >= arr[i - 1]) {
              currentSum += arr[i];
          } else {
              maxSum = Math.max(maxSum, currentSum);
              currentSum = arr[i];
          }
      }
      maxSum = Math.max(maxSum, currentSum);

      return maxSum;
  }


}
