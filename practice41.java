abstract class car {
 public abstract void driving();
 public abstract void playmusic();

  public void flying(){
    System.out.println("the machine is flying");
  }
}
abstract class wagor extends car{
     public void driving(){
        System.out.println("the car is driving");
     }
}
class play extends wagor{
    public void playmusic(){
        System.out.println("the music is playing");
    }
}
public class practice41 {
    public static void main(String[] args) {
        play obj=new play() ;
        obj.driving();
        obj.flying();
        obj.playmusic();

    }
}