public class smallestnumber {

    public static void main(String[] args) {
        int num[] = { 2, 3, 4, 5 };
        int smallest = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i] < smallest) {
                smallest = num[i];
            }
        }
        System.out.println("smallest number is:" + smallest);

    }
}