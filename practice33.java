public class practice33 {
    public static void main(String[] args) {
        int num[] = { 1, 2, 3, 4, 5 };
        int largest = 0;
        for (int i = 0; i <= num.length; i++) {
            if (i > largest) {
                largest = i;

            }
        }
        System.out.println("the largest number is " + largest);

    }

}
