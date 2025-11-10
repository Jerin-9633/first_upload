public class program5 {
    public static void main(String[] args) {
        int num = 5;
        int first = 0;
        int second = 1;
        int next = 0;
        System.out.print("the fbonacci series is:" + first + "," + second);

        for (int i = 2; i <= num; i++) {
            next = first + second;
            System.out.print(", " + next);
            first = second;
            second = next;

        }
        System.out.println();
    }

}
