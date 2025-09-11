public class Smartphone {

    int price;
    String brand;
     static String name;

public void show(){

         System.out.println(price + " : " + brand + " : " + name );

}     
    public static void main(String[] args) {
        
        Smartphone obj1 = new Smartphone();
        obj1.price= 18000;
        obj1.brand="iphone";
        obj1.name="xr";

         Smartphone obj2 = new Smartphone();
         obj2.price= 16000;
         obj2.brand="samsing";
         obj2.name="s25";

         Smartphone.name="phone";

         obj1.show();
         obj2.show();



         
    }

    
}
