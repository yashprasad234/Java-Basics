public class ExceptionHandling {
    public static void main(String[] args) {

        //try keyword
        try {
            int[] num = {1,2,3};
            System.out.println(num[10]);
        }

        //catch keyword
        catch (Exception e) {
            System.out.println("Something went wrong");
        }

        //finally keyword
        finally {
            System.out.println("The 'try catch' has finished.");
        }

        checkAge(17);
    }

    //throw keyword
    static void checkAge(int n) {
        if(n < 18)
            throw new ArithmeticException("Access Denied");
        else
            System.out.println("Access Granted");
    }
}
