//use of finally keyword although the exception is not thrown
public class TestFinally {
    public static void main(String[] args) {
        try{
            int res=25/5;
            System.out.println(res);
        }catch(NullPointerException e){
            System.out.println(e);
        }
        finally {
            System.out.println("rest of the code is printed.");
        }
    }
}
