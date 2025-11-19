public class practice223 {
    public static void main(String[] args) {
        int j=0;
        int i=2;
        int num[]=new int[5];
          try{

             j=18/i;
            System.out.println(num[1]);
            System.out.println(num[5]);
          }
          catch(ArithmeticException e){
            System.out.println("not done this multiplying" + e);
          }
          catch(ArrayIndexOutOfBoundsException e){
            System.out.println("not able to find the array");

          }
          catch(Exception e){
            System.out.println("something went wrong" );
          }
          System.out.println(j);
          System.out.println("bye");
    }
    
}
