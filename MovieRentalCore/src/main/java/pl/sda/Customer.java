package pl.sda;

/**
 * Created by RENT on 2017-01-23.
 */
public class Customer {
    private String firsName;
    private String lastName;
    private int birthYear;
    private int idNumber;

    public Customer(String firsName, String lastName, int birthYear, int idNumber) {
        this.firsName = firsName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.idNumber = idNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firsName='" + firsName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                ", idNumber=" + idNumber +
                '}';
    }

    public String getFirsName() {

        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }


}
