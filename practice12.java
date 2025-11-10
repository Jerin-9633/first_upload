public class practice12 {
    public static void main(String[] args) {
        int num[] = { 10, 12, 14, 10, 2 };
        int largest = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i] > largest) {
                largest = num[i];

            }
        }
        System.out.println("the largest number is " + largest);

    }
}
