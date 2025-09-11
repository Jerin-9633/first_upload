public class practice3 {
    public static void main(String[] args) {
        // Step 1: Store marks in an integer array
        int[] marks = {80, 90, 75, 60, 85};

        // Step 2: Variable for sum
        int sum = 0;

        // Step 3: Loop through array and add marks
        for (int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];
        }

        // Step 4: Calculate average
        double average = (double) sum / marks.length;

        // Step 5: Print result
        System.out.println("The average marks are: " + average);
    }
}

    

