public class MaxInArray {
    public static void main(String[] args) {
        int[] nums = {4, 9, 1, 12, 7};
        int max = nums[0];

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] > max) {
                max = nums[i];
            }
        }

        System.out.println("Largest element = " + max);
    }
}
