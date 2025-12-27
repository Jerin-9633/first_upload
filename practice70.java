class tech{
    public int add(int a, int b){
        return a+b;
        
    }
}
class intech extends tech{
    public int add(int a, int b){
        return a+b+1;
    }
}
public class practice70 {

    public static void main(String[] args) {
        intech obj=new intech();
        obj.add(2, 3);
        System.out.println(obj.add(1, 2));
    }
}