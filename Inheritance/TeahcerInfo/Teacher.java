public class Teacher extends Person{

    private String qualification;
    
    public Teacher() {
        super();
        this.qualification = "";
    }

    public Teacher(String name, int age, String qualification) {
        super(name, age);
        this.qualification = qualification;
    }

    public void setQualification(){

        this.qualification = qualification;
    }

    public String getQualification(){
        return qualification;
    }

    void displayInformation2(){
        super.displayInformation();
        System.out.println("Qualification: " +qualification);
        System.out.println("\n");
    }
}
