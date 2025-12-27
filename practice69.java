abstract class car {

    public abstract void drive();

    public void fly() {
        System.out.println("the car is flying ");
    }
}

class wagaonr extends car {
    public void drive() {
        System.out.println("the swft is flying");
    }
}

public class practice69 {

    public static void main(String[] args) {
        wagaonr obj = new wagaonr();
        obj.fly();

        obj.drive();

    }
}