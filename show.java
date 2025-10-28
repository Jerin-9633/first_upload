class a
{
    public void show(){
        System.out.println("show the a");
    }
}
class b extends a{

    public void show(){
        System.out.println("to print the show a");
    }

}

public class show{
    public static void main(String[] args) {
        a dd = new a();
       
        dd.show();
    }
}