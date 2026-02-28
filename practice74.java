import java.util.HashMap;
import java.util.Map;

public class practice74 {
    public static void main(String[] args) {
        Map <String, Integer> students= new HashMap<>();
        students.put("a", 11);
        students.put("b", 12);
        students.put("c", 13);
        System.out.println(students.keySet());

        for(String key : students.keySet())
            {
            System.out.println(key + ":" + students.get(key));
        }

    }
    
}
