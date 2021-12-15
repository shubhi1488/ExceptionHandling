//nested try block-exception handling
public class MultipleTry {
    public static void main(String[] args) {
        try{
            //inner try 1
            try{
                System.out.println("dividing by zero");
                int b=39/9;
            }catch(ArithmeticException e){
                System.out.println(e);
            }
            //inner try 2
            try{
                int arr[]=new int[5];
                arr[5]=4;



            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
            System.out.println("now catch statement of initial try");
            //catch statement of initial try
        }catch(java.lang.Exception e){
            System.out.println(e);
        }
        System.out.println("Exceptions are handled");
    }
}
