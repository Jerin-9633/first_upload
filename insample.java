public class insample {
    public static void main(String[] args) {
        veryadvcalc obj = new veryadvcalc();

        int r1 = obj.add(5, 3);
        int r2 = obj.sub(10, 4);
        int r3 = obj.multi(2, 6);
        int r4 = obj.div(20, 5);
        double r5 =obj.power(23, 1);

        System.out.println("Addition: " + r1);
        System.out.println("Subtraction: " + r2);
        System.out.println("Multiplication: " + r3);
        System.out.println("Division: " + r4);
         System.out.println("power: " + r5);
    }
    
}
