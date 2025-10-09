class test {

    private int age = 11;
    private String name = "nnn";

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

public class human1 {

    public static void main(String[] args) {
        test obj = new test();
        obj.setAge(10);
        obj.setName("hello");
        System.out.println(obj.getName() + ":" + obj.getAge());
    }
}