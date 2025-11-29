public class practice46 {
    public static void main(String[] args) {
        int n = 2;
        int j = 0;
        int nums[] = new int[5];
        String str = null;
        try {
            j = 18 / n;
            System.err.println(str.length());
            System.out.println(nums[1]);
            System.out.println(nums[5]);
        } catch (NullPointerException e) {
            System.out.println("not working");
        } catch (ArithmeticException e) {
            System.out.println("something went wrong" + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("if not applicable");
        } catch (Exception e) {
            System.out.println("all of them are not working");
        }

        System.out.println(j);
    }

}
