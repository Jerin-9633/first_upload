public class pali {

  
    public static void main(String[] args) {
        int num = 121;    // number to check
        int original = num;
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;            // get last digit
            reversed = reversed * 10 + digit; // build reversed number
            num = num / 10;                  // remove last digit
        }

        if (original == reversed) {
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + " is NOT a Palindrome.");
        }
    }
}

