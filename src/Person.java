public class Person {

    private String name;
    private int age;
    private String gender;
    private String PhoneNumber;
    private long CNIC;


    public Person(String name, int age, String gender, String phoneNumber, long CNIC) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        PhoneNumber = phoneNumber;
        this.CNIC = CNIC;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public long getCNIC() {
        return CNIC;
    }

    public void setCNIC(long CNIC) {
        this.CNIC = CNIC;
    }
}
