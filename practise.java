// import java.util.Scanner;
// public class practise {
//     public static void main(String[] args){
//         int arr[] = {2, 7, 11, 15};
//         int target = 13;

//         boolean found = false;

//         for(int i=0; i<arr.length; i++){
//             for(int j=i+1; j<arr.length; j++){
//                 if(arr[i] + arr[j] == target){
//                     System.out.println("pairs exists : " + arr[i] + " + " + arr[j]);
//                     found = true;
//                 }
//             }
//         }
//         if(!found){
//             System.out.println("pairs doesnot exists");
//         }
//     }
// }



// import java.util.Scanner;
// public class practise {
//     public static void main(String[] args){
//         int arr[] = {2, 7, 11, 15};
//         int target = 13;

//         boolean found = false;

//         for(int i=0; i<arr.length; i++){
//             for(int j=i+1; j<arr.length; j++){
//                 if(arr[i] + arr[j] == target){
//                     System.out.println("pairs exist: " + arr[i] + " + " + arr[j]);
//                     found = true;
//                 }
//             }
//         }
//         if (!found){
//             System.out.println("pairs not exist");
//         }
//     }
// }


// product of array except self

// import java.util.Arrays;
// public class practise{
//     public static int [] practise(int[] nums){
//         int n = nums.length;
//         int result[] = new int[n];

//         int prefix = 1;
//         for(int i=0; i<nums.length; i++){
//             result[i] = prefix;
//             prefix = prefix * nums[i];
//         }

//         int suffix = 1;
//         for(int i=n-1; i>=0; i--){
//             result[i] =  result[i] * suffix;
//             suffix = suffix * nums[i];
//         }
//         return result;
//     }
//     public static void main(String[] args){
//         int nums[] = {1, 2, 3, 4};
//         int [] result = practise(nums);
//         System.out.println(Arrays.toString(result));
//     }
// }


// Maximum Subarray

// import java.util.Scanner;
// public class practise{
//     public static int MaximumSubarray(int[] nums){
//         int currentSum = nums[0];
//         int maxSum = nums[0];

//         for(int i=1; i<nums.length; i++){
//             currentSum = Math.max(nums[i], currentSum + nums[i]);
//             maxSum = Math.max(maxSum, currentSum);
//         }
//         return maxSum;
//     }
//     public static void main(String[] args){
//         int nums[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
//         int result = MaximumSubarray(nums);
//         System.out.println(result);
//     }
// }


// Maximum Product Subarray

import java.util.Scanner;
public class practise{
    public static int MaximumProductSubarray(int [] nums){
        int maxproduct = nums[0];
        int minproduct = nums[0];
        int answer = nums[0];

        for(int i=1; i<nums.length; i++){

            int current = nums[i];

            int tempmax = maxproduct;
            int tempmin = minproduct;

            maxproduct = Math.max(current, Math.max(current * tempmax, current * tempmin));
            minproduct = Math.min(current, Math.min(current * tempmax, current * tempmin));
            answer = Math.max(current, maxproduct);
        }
        return answer;
    }
}