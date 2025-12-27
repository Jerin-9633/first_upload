class ech{
    public int add(int a, int b, int c){
        return a+b+c;

    }
    public int add(int a, int b){
        return a+b;
    }
}
public class practice71 {

    public static void main(String[] args) {
        ech obj=new ech();
        int r1=obj.add(2, 2);
        System.out.println(r1);
    }
}