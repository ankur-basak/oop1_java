import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        
        Random rand = new Random();

        //int randomNumber = rand.nextInt(10); //0 to 9

        // int randomNumber = rand.nextInt(10) +1; //1 to 9
        int randomNumber = (int) (Math.random()*100 + 1);
        System.out.println("Random Number = "+randomNumber);
    }
}
