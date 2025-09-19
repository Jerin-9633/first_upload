public class largestnumber {
    public static void main(String[] args) {
        int num[] = { 1, 3, 4, 5, 4 };
        int largest = 0;

        for (int i = 0; i < num.length; i++) {
            if (num[i] > largest) {
                largest = num[i];
            }

        }
        System.out.println("the largest number is :" + largest);
    }

}
