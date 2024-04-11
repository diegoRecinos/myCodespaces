import java.util.Scanner;
import java.util.ArrayList;

public class Professor extends Person{
    private int salary;
    private String faculty;
    private String subject;

    // Default constructor
    public Professor(){
        super(); // call constructor in superclass
        this.salary = 0;
        this.faculty = "";
        this.subject = "";
    }

    // Overloaded constructor
    public Professor(String name, String telephone, String email, int salary, String faculty, String subject) {
        super(name, telephone, email); // call constructor in superclass
        this.salary = salary;
        this.faculty = faculty;
        this.subject = subject;
    }

    // Getters and setters
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

		// Methods
    public void giveLecture() {
        System.out.println("Giving a lecture about OOP");
    }

    @Override
	public void purchaseParkingPass() {
		System.out.println("I am a professor, I don't have to purchase a parking pass");
}

    public static void addProfessor()
    {
        
        String name = "", telephone = "", email = "", faculty = "", subject = "";
        int salary = 0;

        Scanner read = new Scanner(System.in);

        System.out.println("Ingrese nombre");
        name = read.next();
        name += read.nextLine();
                
        System.out.println("Ingrese telefono");
        telephone = read.next();
        telephone += read.nextLine();

        System.out.println("Ingrese email");
        email = read.next();

        System.out.println("Ingrese materia");
        subject = read.next();
        subject += read.nextLine();

        System.out.println("Ingrese salario");
        salary = read.nextInt();

        System.out.println("Ingrese facultad");
        faculty = read.next();
        faculty += read.nextLine();


        //Professor professor = new Professor(name, telephone, email, salary, faculty, subject);
        
        //ArrayList <Professor> professors = new ArrayList <Professor> ();
        
        //professors.add(professor);
        
        //System.out.println(professors);
    }
    
    /* 
    public void showProfessors()
    {
        System.out.println(professors);
    }
    */

}
