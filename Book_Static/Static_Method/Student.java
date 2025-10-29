public class Student {
    String name;
    int id;
    static String universityName = "AIUB";

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayInformation(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("University Name: " + universityName);
    }
    
}
