import java.util.Scanner;
public class MaximumProductSubarray{
    public static int MaximumProductSubarray(int[] nums){

        int maxproduct = nums[0];
        int minproduct = nums[0];
        int answer = nums[0];

        for(int i=1; i<nums.length; i++){

            int current = nums[i];

            int tempmax = maxproduct;
            int tempmin = minproduct;

            maxproduct = Math.max(current, Math.max(current * tempmax, current * tempmin));
            minproduct = Math.min(current, Math.min(current * tempmax, current * tempmin));
            answer = Math.max(answer, maxproduct);
        }
        return answer;
    }
    public static void main(String[] args){
        int nums[] = {2, 3, -2, 4};
        int result = MaximumProductSubarray(nums);
        System.out.println(result);
    }
}