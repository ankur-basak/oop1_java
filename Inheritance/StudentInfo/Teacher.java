public class Teacher extends Student {

    String subject;
    int experience;

    void displayInformation2(){
        displayInformation();
        System.out.println("Subject: " + subject);
        System.out.println("Experience: " + experience + " years");
    }
}
