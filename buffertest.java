public class buffertest {

    public static void main(String[] args) {
        
        StringBuffer sb = new StringBuffer("navin");
        sb.append(" reddy");
      

        sb.insert(0, "java");
        sb.setLength(30);
          System.out.println(sb);
    }
    
}
