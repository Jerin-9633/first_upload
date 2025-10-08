abstract class lori {
    public abstract void set();

    public void setup() {
        System.out.println("benzz");
    }
}

class bike extends lori {   // removed abstract
    public void set() {
        System.out.println("hello ...");
    }
}

public class car {
    public static void main(String[] args) {
        lori obj = new bike(); // instantiate bike
        obj.setup();           // call setup()
        obj.set();             // call set()
    }
}
