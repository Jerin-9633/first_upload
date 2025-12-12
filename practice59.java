public class practice59 {
    public static void main(String[] args) {
        int num[]={1,2,3,4,5};
        int smallest=num[0];
        for(int i=1;i<num.length;i++){
            if(num[i]<smallest){
                smallest=num[i];
            }
           
        }
         System.out.println("the smallest number are " + smallest);
        
    }
    
}
