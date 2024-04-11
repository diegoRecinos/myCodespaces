import java.util.Scanner;
import java.util.ArrayList;

public class Student extends Person{
    private String studentNumber;
    private int CUM;

    private boolean isSolvent;

    // Default constructor
    public Student() {
        super(); // call constructor in superclass
        this.studentNumber = "";
        this.CUM = 0;
    }

    // Overloaded constructor
    public Student(String name, String telephone, String email, String studentNumber, int CUM) {
        super(name, telephone, email); // call constructor in superclass
        this.studentNumber = studentNumber;
        this.CUM = CUM;
    }

    // Getters and Setters
    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public int getCUM() {
        return CUM;
    }

    public void setCUM(int CUM) {
        this.CUM = CUM;
    }

    public void setSolvent(boolean solvent) {
        isSolvent = solvent;
    }

    // Methods
    public void attendClasses() {
        System.out.println("Writing important stuff");
    }

    public void attendPractices() {
        System.out.println("Listening to instructor and coding");
    }

    public static void addStudent()
    {
        String name = "", telephone = "", email = "" ;
        int  CUM = 0, studentNumber = 0;

        Scanner read = new Scanner(System.in);

        System.out.println("Ingrese nombre");
        name = read.next();
        name += read.nextLine();
                
        System.out.println("Ingrese telefono");
        telephone = read.next();
        telephone += read.nextLine();

        System.out.println("Ingrese email");
        email = read.next();

        System.out.println("Ingrese CUM");
        CUM = read.nextInt();
        

        System.out.println("Ingrese numero estudiante");
        studentNumber = read.nextInt();

    }

}