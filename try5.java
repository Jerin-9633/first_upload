public class try5 {
    public static void main(String[] args) {
        int age=19;
        try{
            if(age<18){
                throw new ArithmeticException("Access denied – You must be at least 18 years old.");
            }else{
                System.out.println("Access granted – You are old enough!");
            }

        }
        catch(ArithmeticException e){
            System.out.println("it is not working properly");

        }finally{
            System.out.println("Age verification completed.");
        }
    }
    
}
