import java.util.Arrays;

public class ShortingAscendingDescending {
    public static void main(String[] args) {
        
        int[] number = {10, -3, 18, 4, 26};
        Arrays.sort(number);

        System.out.print("Ascending: ");

        for(int i = 0; i < 5; i++){
            System.out.print(" "+number[i]);
        };

        System.out.println();
        System.out.print("Descending: ");

        for(int i = 4; i >= 0; i--){
            System.out.print(" "+number[i]);
        };

        System.out.println("\n");

        String[] names = {"pinky","sujoy","niloy","anis"};
        Arrays.sort(names);

        System.out.print("Ascending: ");

        for(int i = 0; i < 4; i++){
            System.out.print(names[i]+ " ");
        };

        System.out.println();
        System.out.print("Descending: ");

        for(int i = 3; i >= 0; i--){
            System.out.print(names[i]+ " ");
        };
    };
};
