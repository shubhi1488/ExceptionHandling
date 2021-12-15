//multiple catch block-exception handling
public class MultipleCatch {
    public static void main(String[] args) {
        try{
            int arr[]=new int[5];
            arr[5]=30/0;//exception occured
        }catch (ArithmeticException e){
            System.out.println("Arithmatic exception occured");//first this will execute
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("array out of bound index exception occured");//second this will execute
        }
        catch (java.lang.Exception e){
            System.out.println("parent exception occured");//third this will execute
        }
        System.out.println("rest of the code is printed");
    }
}
