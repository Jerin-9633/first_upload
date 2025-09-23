public class reversearray {
    public static void main(String[] args) {
      int nums[] = {10, 20, 30, 40, 50};

        System.out.println("Original array:");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println("\nReversed array:");
        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.print(nums[i] + " ");
        }
    }
    
}
