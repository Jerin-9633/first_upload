import java.util.HashMap;
import java.util.Map;

public class practice25 {
    public static void main(String[] args) {
         
        Map<String, Integer> students=new HashMap<>();
        students.put("navin", 22);
        students.put("reddy", 23);
        students.put("pant", 24);
        students.put("jadeja", 26);
        System.out.println(students);

        for(String key : students.keySet()){
            System.out.println(key + ":" + students.get(key));
        }
    }
    
}
