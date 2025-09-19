import java.util.Arrays;

public class desc {
     public static void main(String[] args) {
        int nums[] = {45, 12, 78, 3, 25};

        Arrays.sort(nums);   // sort the array in ascending order

        System.out.print("Sorted Array: ");
        for (int n : nums) {
            System.out.print(n + " ");
        }
    }
}  
    

