import java.time.LocalDate;

public class Passport {
    long id;
    String firstName;
    String lastName;

    LocalDate yearOfBirth;
    char gender;
    String countryOfBirth;

    void getInfo() {
        System.out.println("ID: " + id +
                "\nFirst name: " + firstName +
                "\nLast name: " + lastName +
                "\nYear of birth: " + yearOfBirth +
                "\nGender: " + gender +
                "\nCountry of birth: " + countryOfBirth);
    }
}
