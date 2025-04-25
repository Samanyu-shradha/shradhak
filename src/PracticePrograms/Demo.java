package PracticePrograms;

import java.util.Arrays;

public class Demo{
    public static int[] removeDuplicates(int[] nums) {
        int[] temp = new int[nums.length];
        int j = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                temp[j++] = nums[i];
            }
        }
        temp[j++] = nums[nums.length - 1]; // Handle the last element

        // Copy back to the original array if needed
        for (int i = 0; i < j; i++) {
            nums[i] = temp[i];
        }
        return Arrays.copyOf(nums, j);
    }

    public static void main(String[] args){
        System.out.println(Arrays.toString(Demo.removeDuplicates(new int[] {2,2,3,2,9,6,3})));
    }

}

//input
