import java.util.InputMismatchException;
import java.util.*;
class JavaProject1{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        
        try{
            System.out.println("Enter a number. Remember only number. You can try character.");
            int input = s.nextInt();
            System.out.println("Good u ahve enterd a number. And your number is");
            System.out.println(input);
        }
        catch(InputMismatchException ex){
            System.out.println("U have entered char/string instead of numbers. change it to numbers");
        }
        s.close();
    }
}