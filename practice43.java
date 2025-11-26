class a {
    public int test(int n1, int n2) {
        return n1 + n2;
    }
}

class b extends a {
    public int test(int n1, int n2) {
        return n1 + n2 + 1;
    }
}

public class practice43 {

    public static void main(String[] args) {
        b obj = new b();
        int r=obj.test(3, 4);
        System.out.println("the number is " + r);
    }
}