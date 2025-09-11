public class sumwithloop {
    public static void main(String[] args) {
        int num[]={2,3,4,5};
        int sum =0;

        for(int i=0;i<num.length;i++){
            sum=sum+num[i];
        }
        System.out.println("the sum of number" + sum);
    }
    
}
