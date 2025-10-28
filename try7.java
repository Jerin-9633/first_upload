class try7 {

    public static void main(String[] args) {
        try {
            int[] numbers = {10, 20, 30};

            // This will cause ArithmeticException
            int result = numbers[1] / 0;

            // This will cause ArrayIndexOutOfBoundsException
            System.out.println(numbers[5]);
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: You can’t divide by zero!");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Exception: You tried to access an invalid index!");
        }
        catch (Exception e) {
            System.out.println("Some other error occurred.");
        }

        System.out.println("Program continues normally...");
    }
}
