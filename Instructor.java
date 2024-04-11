public class Instructor extends Student {
    private int salary;
    private String faculty;
    private String subject;

    public Instructor()
    {
        super();
        this.faculty = " ";
        this.subject = " ";
        this.salary = 0;
    }

    public Instructor(String name, String telephone, String email, String studentNumber, int salary, String faculty, int CUM) {
        // call constructor in superclass
        
        this.salary = salary;
        this.faculty = faculty;
        this.subject = subject;
        
        
    }

    
}
