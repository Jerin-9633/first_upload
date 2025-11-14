abstract class test {

    public abstract void drive();

    public abstract void fly();

    public void music_play() {
        System.out.println("the music is playing");
    }
}

abstract class wag extends test {

    public void drive() {
        System.out.println("the car become driving");
    }
}

class updatedwag extends wag {
    public void fly() {
        System.out.println("flying");
    }
}

public class practice22 {

    public static void main(String[] args) {
        updatedwag obj = new updatedwag();
        obj.music_play();
        obj.drive();
        obj.fly();

    }
}