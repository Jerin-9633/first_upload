public class practice5 {

    
    public static void main(String[] args) {
        // Step 1: Create an array
        int[] numbers = {10, 20, 30, 40, 50};

        // Step 2: Print array in reverse order
        System.out.println("Array in reverse order:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}

