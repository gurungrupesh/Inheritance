
public class Person {
    private String firstName;
    private String lastName;
    private String ID;


    public Person(String firstName, String lastName, String ID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getID() {
        return ID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setID(String ID) {
        this.ID = ID;
    }


    @Override
    public String toString() {
        return firstName + " (" + ID + ")";
    }


    public String toCSV() {
        return firstName + "," + lastName + "," + ID ;
    }

}