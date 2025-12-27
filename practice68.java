class human{
    private int age;
    private String name;

    public int getage(){
        return age;
    }
    public void setage(int a ){
        age=a;
    }
    public String getname(){
        return name;
    }
    public void setname(String b ){
        name=b;
    }
}
public class practice68 {

    public static void main(String[] args) {
        human obj=new human();
        obj.setage(3);
        obj.setname("yyy");
        System.out.println(obj.getage() + " " + obj.getname());
    }
}