public class practice9 {
    public static void main(String[] args) {
        int num=5;
        int next=0;
        int first=0;
        int second=1;
        System.out.print("the fibonacci series is " + first + "," + second);
        for(int i=0;i<=num;i++){
            next=first+second;
            System.out.print("," + next);
            first=second;
            second=next;

        }
    }
    
}
