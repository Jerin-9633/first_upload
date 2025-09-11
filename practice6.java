public class practice6 {

    public static void main(String[] args) {
        int nums[] = { 12, 34, 13, 45, 54 };
        int largest = 0;
        for (int i = 0; i < 5; i++) {
            if (nums[i] > largest) {
              largest=nums[i];

            }
        }
        System.out.println("the largest number is " + largest);
    }
}
