import java.util.Scanner;
public class productexceptself{
    public int[] productexceptself(int[] nums){
        int n = nums.length;
        int result[] = new int[n];

        int prefix = 1;
        for(int i=0; i<n; i++){
            result[i] = prefix;
            prefix = prefix * nums[i];
        }

        int suffix = 1;

        for(int i=i-1; i>=0; i--){
            result[i] = result[i] * suffix;
            suffix = suffix * nums[i];
        }
        return result;
    }
    public static void main(String[] args){
        int nums[] = {1, 2, 3, 4};
        int result[] = productexceptself(nums);
        System.out.println(Arrays.toString(result));
    }
}
