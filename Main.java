import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) 
    {      
        int opcion;

        ArrayList <Student> students = new ArrayList <Student> ();
        ArrayList <Instructor> instructors = new ArrayList <Instructor> ();
        ArrayList <Professor> professors = new ArrayList <Professor> ();  
        Scanner read = new Scanner(System.in);

        do {
            System.out.println("Registros: ");

            System.out.println("1. Registrar profesor");
            System.out.println("2. Registrar instructor.");
            System.out.println("3. Registrar estudiante");
            System.out.println("4. Mostrar lista de profesores");
            System.out.println("5. Mostrar lista de instructores");
            System.out.println("6. Mostrar lista de estudiantes");
            System.out.println("7. Salir");

            
            opcion = read.nextInt();

            if(opcion == 6 )
            {
                break;
            }
            
            switch (opcion){
                case 1:
                
                     
                
                String name = " ", telephone = " ", email = " ", faculty = " ", subject = " "; int salary = 0;
        
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

                Professor professor1 = new Professor(name, telephone, email, salary, faculty, subject);
                
                professors.add(professor1);

                System.out.println("Se ha registrado profesor");

                    break;
                
                case 2:
                 

                    String studentNumber = " " ;
                    int CUM = 0;
            
                    //Scanner read = new Scanner(System.in);
                    System.out.println("Ingrese nombre");
                    name = read.next();
                    name += read.nextLine();
                            
                    System.out.println("Ingrese telefono");
                    telephone = read.next();
                    telephone += read.nextLine();
            
                    System.out.println("Ingrese email");
                    email = read.next();
            
                    System.out.println("Ingrese __CUM");
                    CUM = read.nextInt();
                    
                    System.out.println("Ingrese numero estudiante");
                    studentNumber = read.next();

                    System.out.println("Ingrese salario");
                    salary = read.nextInt();

                    System.out.println("Ingrese materia impartida");
                    subject = read.next();

                    System.out.println("Ingrese facultad");
                    faculty = read.next();

                    System.out.println("Se ha registrado instructor");

                    Instructor instructor = new Instructor(name, telephone, email, studentNumber, salary, faculty, CUM);
                
                    instructors.add(instructor);

                    break;

                case 3:
                    

                    //Scanner read = new Scanner(System.in);
            
                    System.out.println("Ingrese nombre");
                    name = read.next();
                    name += read.nextLine();
                            
                    System.out.println("Ingrese telefono");
                    telephone = read.next();
                    telephone += read.nextLine();
            
                    System.out.println("Ingrese email");
                    email = read.next();
            
                    System.out.println("Ingrese __CUM");
                    CUM = read.nextInt();
                    
                    System.out.println("Ingrese numero estudiante");
                    studentNumber = read.next();
                    
                    Student student = new Student( name,  telephone,  email,  studentNumber, CUM);
                
                    students.add(student);

                    System.out.println("Se ha registrado estudiante");

                        break;
                case 4:
                    System.out.println(professors);
                    break;
                case 5:
                    System.out.println(instructors);
                    break;
                case 6:
                    System.out.println(students);
                    break;
                default:
                    break;
            }
            
        } while (true);    
 
            
        //ArrayList <Professor> professors = new ArrayList <Professor> ();
        
        //Professor.addProfessor();
    }

    public static void display(ArrayList<Professor> list)
    {
        System.out.println(list);
    }
    /* glk
    public static void modifyList(ArrayList<Professor> parameterList)
    {
        parameterList.add(20);
        parameterList.add(98);
    }
    */
}



