class a{
    public int test(int n1, int n2, int n3){
        return n1+n2+n3;
    }
    public int test(int n1, int n2){
        return n1+n2;
    }
}
public class practice44 {

    public static void main(String[] args) {
        a obj=new a();
        int r=obj.test(2,3,4);
        System.out.println("the number is " + r);
    }
}