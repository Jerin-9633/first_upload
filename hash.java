import java.util.HashMap;
import java.util.Map;

public class hash {
    public static void main(String[] args) {
         Map<String, Integer> students = new HashMap<>();
         students.put("navin", 56);
         students.put("veni", 53);
         students.put("hello", 21);
         students.put("wow", 18);
         System.out.println(students);
         for(String key : students.keySet()){
            System.out.println(key + ":" + students.get(key));
         }
    }
    
}
