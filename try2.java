public class try2 {
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
        System.out.println("Program continues after handling the exception...");
    }
    
}
