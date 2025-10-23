import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class DateClass {
    public static void main(String[] args) {
        
        Date date = new Date();
        System.out.println(date);

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");
        String currnetDate = dateFormat.format(date);
        System.out.println("Current date: "+currnetDate);
    };
};
