class calculator {

    public int add(int n1, int n2) {

        return n1 + n2;
    }

    public int sub(int n1, int n2) {

        return n1 - n2;
    }

    public int multip(int n1, int n2) {

        return n1 * n2;
    }

    public int divi(int n1, int n2) {

        return n1 % n2;
    }
}

public class exapmle {

    public static void main(String[] a) {

        int num1 = 6;
        int num2= 8;

        calculator cal = new calculator();
        int add = cal.add(num1, num2);
        int sub = cal.sub(num1, num2);
        int multip = cal.multip(num1, num2);
        int divi = cal.divi(num1, num2);

        System.out.println("addition"+ add);
        System.out.println("substraction"+ sub);
        System.out.println("multiplication"+ multip);
        System.out.println("division"+ divi);
        

    }

}
