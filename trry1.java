public class trry1 {
    public static void main(String[] args) {
        int i=2;
        int j=0;
        int nums[]= new int[5];

        try{
            j=12/i;
            System.out.println("is done");  
            System.out.println(nums[1]);
            System.out.println("num 1 is done");
            System.out.println(nums[5]);
            System.out.println("num 2 is done");
        }
        catch(ArithmeticException e){
            System.out.println("is not divisble by zero"+ e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("is not done yet");
        }
        System.out.println(j);
        System.out.println(".....");
    }
    
}
