public class averageeven {
    public static void main(String[] args) {
        int nums[] = {2, 5, 8, 11, 14};
        int sum = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                sum = sum + nums[i];
                count++;
            }
        }

        System.out.println("Average of even numbers = " + (sum / count));
    }
}
