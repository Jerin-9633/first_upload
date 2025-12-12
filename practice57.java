    public class practice57 {
        public static void main(String[] args) {
            int num[] = { 1, 2, 3, 4, 5 };
            int largest = 0;
            for (int i = 1; i<num.length; i++) {
                if (num[i] > largest) {
                    largest = num[i];
                }
            }
            System.out.println("the largest number is " + largest);
        }

    }
