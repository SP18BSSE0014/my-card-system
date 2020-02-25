public class Travel {

    private boolean visa;
    private Person person;
    private NationalCard nationalCard;

    public Travel(boolean visa, Person person , NationalCard nationalCard) {
        this.visa = visa;
        this.person = person;
        this.nationalCard = nationalCard;
    }

    @Override
    public String toString() {
        return "visaGraunted  =" + visa +
                "\npersonName  = " + person.getName() +
                "\npersonAge  = " + person.getAge() +
                "\npersonPhone Number  = " + person.getPhoneNumber() +
                "\npersonGender  = " + person.getGender() +
                "\npersonCNIC  = " + person.getName();
    }

    public boolean isVisa() {
        return visa;
    }

    public void setVisa(boolean visa) {
        this.visa = visa;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
