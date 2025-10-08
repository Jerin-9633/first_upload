class a
{
    public void show(){
        System.out.println("show the a");
    }
}
class b extends a{

    public void show1(){
        System.out.println("to print the show a");
    }

}

public class show{
    public static void main(String[] args) {
        b dd = new b();
        dd.show();
    }
}