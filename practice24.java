public class practice24 {
    public static void main(String[] args) {
        int i=20;
        int j=0;

        try{

            j=18/i;
            if(j==0)
             throw new ArithmeticException("i dont want to multiply withe zero");
        }
        catch(ArithmeticException e){
            j=18/1;
            System.out.println("it does not multiply with zero" + e);
        }
        catch(Exception e){
            System.err.println("it is not possible to multiply" + e);
        }
        System.out.println("bye");
    }
    
}
