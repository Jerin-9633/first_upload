class test {

    private int age;
    private String name;

    public int getage() {
        return age;
    }

    public void setage(int a) {
        age = a;
    }

    public String getname() {
        return name;
    }

    public void setname(String b) {
        name = b;
    }
}

public class practice42 {

    public static void main(String[] args) {
        test obj=new test();
        obj.setage(12);
        obj.setname("navin");
        System.out.println(obj.getage() + " : " + obj.getname());
    }
}