public class practice36 {
    public static void main(String[] args) {
        String str="hello";
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
            }
        }
        System.out.println("the number of vowels is " + count);
    }
    
}
