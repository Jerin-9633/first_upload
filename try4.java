 public class try4 {
    public static void main(String[] args) {
        
        try{
            int a =12;
            int b=0;
            int result = a/b;
            System.out.println("result :" + result);
        }
        catch(ArithmeticException e){
            System.out.println("they are not divisible by zero");

        }
        finally{
            System.out.println("This is the finally block — it always runs!");
        }
        System.out.println("Program continues after handling the exception...");
    }
    
}
 
    

