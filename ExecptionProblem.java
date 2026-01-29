import java.lang.*;
import java.util.Scanner;

public class ExecptionProblem {
    public static void main(String[] args) {
    
    while (true){ 
        try{
            Scanner input = new Scanner(System.in);
            System.out.println("Enter num1: ");
            int num1 = input.nextInt();
            System.out.println("Enter num2: ");
            int num2 = input.nextInt();
            int result = num1/num2;
            System.out.println("Result: "+ num1 + "/" + num2 + " = " + result);
        }
        catch(Exception e){
            System.out.println("Execption: " + e);
            System.out.println("you must enter integer number. Please try again");
            }
        }
    }
}
