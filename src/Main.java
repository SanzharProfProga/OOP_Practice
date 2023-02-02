import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /**Passport*/
        LocalDate date = LocalDate.of(2003, 10, 07);
        Passport passport = new Passport();
        passport.id = 8967484L;
        passport.firstName = "Sanzhar";
        passport.lastName = "Abdymomunov";
        passport.yearOfBirth = date;
        passport.gender = 'M';
        passport.countryOfBirth = "Kyrgyzstan";
        passport.getInfo();

        /**Seasons*/
        int time = new Scanner(System.in).nextInt();
        Seasons seasons = new Seasons();
        seasons.my(time);

        /**Student*/

        Student student = new Student();
        student.name = "Sanzhar";
        student.age = 19;
        student.group = "Java";
        student.getInfo();


        Student student1 = new Student();
        student1.name = "Ilim";
        student1.age = 19;
        student1.group = "Java";
        student1.getInfo();

        Student student2 = new Student();
        student2.name = "Nuradil";
        student2.age = 19;
        student2.group = "Java";
        student2.getInfo();

        Student student3 = new Student();
        student3.name = "Aidana";
        student3.age = 17;
        student3.group = "JavaScript";
        student3.getInfo();

        Student student4 = new Student();
        student4.name = "Jumagul";
        student4.age = 18;
        student4.group = "JavaScript";
        student4.getInfo();

        Student student5 = new Student();
        student5.name = "Mairamgul";
        student5.age = 18;
        student5.group = "JavaScript";
        student5.getInfo();


        Student[] students = new Student[6];
        students[0] = student;
        students[1] = student1;
        students[2] = student2;
        students[3] = student3;
        students[4] = student4;
        students[5] = student5;

        int javaCount = 0;
        int jSCount = 0;
        int a = 0;

        for (int i = 0; i < students.length; i++) {
            if (students[i].group.equalsIgnoreCase("Java")) {
                javaCount++;
                System.out.println("Java group");
                System.out.println(students[i].getInfo());
            } else {
                jSCount++;
                System.out.println("JavaScrip group");
                System.out.println(students[i].getInfo());
            }
            a += students[i].age;

        }
        System.out.println("Java group students: " + javaCount);
        System.out.println("JavaScrip group students: " + jSCount);
        System.out.println(a + " / 6 " + (a / 6d));


    }
}