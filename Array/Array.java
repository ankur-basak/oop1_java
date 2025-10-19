import java.util.Scanner;

public class Array {

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        double [] number = new double[10];
        double sum = 0;

        System.out.println("Enter 10 numbers: ");

        for(int i = 0; i < 10; i++)
        {
            number [i] = input.nextDouble();
        }

        for(int i = 0; i < 10; i++)
        {
            sum = sum + number[i];
        }

        System.out.println("The Sum is: "+sum);    

        double avg = sum / number.length;
        System.out.println("The average number is: "+avg);
    };
    
};
