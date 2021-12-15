//in this we have implemented the concept of throw which allow us to create the custom
// exceptions in this we have created the validate method in this if a person's age is less tha 18
//than it will throw arithmatic exception and if it is larger than 18 than print eligible to vote.
public class TestAge {
    public static void Validate(int age){
        if(age<18){
            throw new ArithmeticException("You are not eligible to vote");
        }
        else{
            System.out.println("you are eligible to vote");
        }
    }

    public static void main(String[] args) {
        Validate(20);
        System.out.println("you can check for another age also");
    }
}
