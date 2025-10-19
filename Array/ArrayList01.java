import java.util.ArrayList;
//import java.util.Iterator;

public class ArrayList01{
    public static void main(String[] args) {
        
        ArrayList<Integer> number = new ArrayList<Integer>();
       // System.out.println("size = "+number.size());

        number.add(10);
        number.add(30);
        number.add(50);
        number.add(90);
        number.add(4,100);

       System.out.println(number);

        //for Each Loop Use
        for(int x:number){
            System.out.print(" "+x);
        }
        System.out.println();
        System.out.println("Size = "+number.size());

        //Using of Iterator class

        /*Iterator itr = number.iterator();
        while(itr.hasNext()){
            System.out.print(" "+itr.next());
        };

        System.out.println();
        System.out.println("Size = "+number.size()); */

        //Removing Element

        number.remove(3);
         System.out.print("After Removing The Element: "+number);

    };
};