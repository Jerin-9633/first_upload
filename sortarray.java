import java.lang.reflect.Array;
import java.util.Arrays;

public class sortarray {
    public static void main(String[] args) {
        int num[]={12,45,24,50,55};
        Arrays.sort(num);

        System.err.println("the second largest number=" + num[num.length-2]);
    }
    
}
