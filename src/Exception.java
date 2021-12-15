//try-catch block - exception handling
public class Exception {
    public static void main(String args[]){
        //exception  will be thrown
        try{
            int res=50/0;

        }
        //exception is handled using catch block
        catch (ArithmeticException e){
            System.out.println(e);
            System.out.println("rest of the code is printed");

        }
        //finally is used to add code
        finally {
            System.out.println("this will throw error as we cannot divide any value with 0");
        }
    }

}
