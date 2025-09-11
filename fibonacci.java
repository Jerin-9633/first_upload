public class fibonacci {

    public static void main(String[] args) {
        int num = 10;
        int first = 0;
        int second = 1;
        System.out.print("the fbonacci series is:" + first + "," + second);
        for (int i = 3; i <= num; i++) {
            int next = first + second;
            System.out.print("," + next);
            first=second;
            second=next;
        }

    }
}