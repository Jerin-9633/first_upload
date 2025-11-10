public class practice14 {
   
    public static void main(String[] args) {
        int num[] = { 1, 3, 4, 5, 4 };
        int smallest = num[0];

        for (int i = 0; i < num.length; i++) {
            if (num[i] < smallest) {
                smallest = num[i];
            }

        }
        System.out.println("the smallest number is :" + smallest);
    }

}

    

