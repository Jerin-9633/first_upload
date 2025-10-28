class dog {

    public void sound() {
        System.out.println("barking...");
    }
}

class cat extends dog {
    public void sound() {
        System.out.println("meow...");
    }
}

public class inheritance {

    public static void main(String[] args) {

        cat d = new cat();
        d.sound();
       

    }
}