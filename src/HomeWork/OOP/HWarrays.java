package HomeWork.OOP;

public class HWarrays {
    public static void main(String[] args) {
        int [] nums = new int [900];
        for (int i = 0; i <nums.length ; i++) {
                nums[i]=i+100;
        }
        int[] nums2 = new int [nums.length];
        for (int i = 0, j = nums.length - 1; i < nums.length; i++, j--) {
            nums2[j] = nums[i];
        }
        for (int i : nums2) {
            System.out.println(i);
        }
    }
}
