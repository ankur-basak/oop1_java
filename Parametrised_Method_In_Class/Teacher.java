public class Teacher{

    String name;
    String gender;
    int phone;

    public Teacher() {
    }

    public Teacher(String name, String gender, int phone) {
        this.name = name;
        this.gender = gender;
        this.phone = phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getPhone() {
        return phone;
    }

    void displayInformation() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Phone No: " + phone);
        System.out.println();
    }

}
