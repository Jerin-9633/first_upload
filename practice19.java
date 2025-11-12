class adv {
    public int add(int n1, int n2) {
        return n1 + n2;

    }
}
 class demo extends adv {
    public int add(int n1, int n2) {
        return n1 + n2 + 1;
        }
    }

    public class practice19 {

        public static void main(String[] args) {
            demo obj = new demo();
             int r1=obj.add(3, 5);
             System.out.println(r1);
        }
    }

