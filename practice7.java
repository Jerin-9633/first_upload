public class practice7 {
    public static void main(String[] args) {
        int nums[] = { 12, 23, 14, 15, 16 };
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
             sum=sum+nums[i];
            }
        }
        System.out.println("sum of number" + sum);
    }

}
