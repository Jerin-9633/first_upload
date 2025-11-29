import java.util.HashMap;
import java.util.Map;

public class practice47 {
    public static void main(String[] args) {
        Map<String, Integer> students=new HashMap<>();
        students.put("stduent1", 3);
        students.put("stduent2", 2);
        students.put("stduent3", 7);
        students.put("stduent2", 4);
        System.out.println(students.keySet());
        for(String key : students.keySet()){
            System.out.println(key  + ":" + students.get(key));
        }
    }

}
