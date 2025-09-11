public class larges {
    public static void main(String[] args) {
        int num[] = { 12, 13, 24, 25, 18 };
        int largest = 0;
        for (int i = 1; i < 5; i++) {
            if (num[i] > largest) {
                largest = num[i];
            }

        }
        System.out.println("the largest number is:" + largest);
    }

}
