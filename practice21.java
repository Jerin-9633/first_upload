class und {

    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}

public class practice21 {

    public static void main(String[] args) {

        und obj = new und();
        obj.setAge(19);
        obj.setName("varun");
        System.out.println("the number are " + obj.getAge() + ":" + obj.getName());
    }
}