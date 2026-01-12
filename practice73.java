public class practice73 {
    public static void main(String[] args) {
        int i=2;
        int j=0;
        int num[]=new int[5];
        String str=null;

        try{
             j=18/i;
             System.out.println(str.length());
            System.out.println(num[1]);
            System.out.println(num[5]);
        }
        catch(ArithmeticException e){
            System.out.println("not divisable ");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("something not working....checking!!");
        }
        catch(Exception e){
            System.out.println("error........?");
        }
        System.out.println(j);
    }
    
}
