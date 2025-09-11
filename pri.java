class human {

    private int age; 
    private String name;


    public human(String name){
        this.age = 12;
        this.name = "john";
    }
    public human(int age, String name){   //parameterized constructor and constructor
        this.age = age;
        this.name=name;
    }

    public int getAge() {
        return age;

    }

    public void setAge(int a) {

        age = a;
    }

    public String getname() {

        return name;
    }

    public void setname(String n) {
        name = n;
    }
}

public class pri {

    public static void main(String a[]) {

        human demo = new human(18,"navin" );
        // demo.setAge(30);
        // demo.setname("hello");
        System.out.println(demo.getAge() + ":" + demo.getname());

    }
}