class A extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("seteee");
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("annnu");
        }
    }
}

public class thread1 {
    public static void main(String[] args) {
        A a1 = new A();
        B b1 = new B();

        a1.start(); // ✅ starts thread A
        b1.start(); // ✅ starts thread B
    }
}
