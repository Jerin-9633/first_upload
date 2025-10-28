public class try3 {
    public static void main(String[] args) {
        int num[] = {10,20,30,40,50};
        try{
            System.out.println("the 5th element is" + num[5]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("it is not possible to fetch the data from the 5th position");
        }
        System.out.println("Write a program to handle invalid array index.");
    }
    
}
