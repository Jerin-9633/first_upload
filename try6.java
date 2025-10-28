import java.io.IOException;

public class try6 {
    static void myMethod() throws IOException{
        throw new IOException("input/output occured");
    }
    public static void main(String[] args) {
        try{
            myMethod();
        }catch(IOException e){
            System.out.println("Exception caught: \" + e.getMessage()");
        }
        System.out.println("program finished");
    }
    
}
