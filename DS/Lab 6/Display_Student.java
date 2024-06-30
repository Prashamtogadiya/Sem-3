import java.util.*;
class Student_Detail{
    int n;
    String name;
    int semester;
    double cpi;

    public Student_Detail(int enrollment_No, String student_name, int sem, double student_cpi){
        this.n =  enrollment_No;
        this.name =  student_name;
        this.semester =  sem;
        this.cpi =  student_cpi;
    }

    public void display(){
        System.out.println("Enrollment No : "+n);
        System.out.println("Student Name : "+name);
        System.out.println("Sem : "+semester);
        System.out.println("CPI : "+cpi);
    }
}

public class Display_Student{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Student_Detail student[] = new Student_Detail[5];

        for(int i=0;i<student.length;i++){

            System.out.println();
            System.out.println("---Enter the detail of student "+(i+1)+"---");

            System.out.println("Enter the enrollment no  : ");
            int n = sc.nextInt();

            System.out.println("Enter the name : ");
            String name = sc.next();

            System.out.println("Enter the semester : ");
            int semester = sc.nextInt();

            System.out.println("Enter the CPI : ");
            double cpi = sc.nextDouble();

            student[i] = new Student_Detail(n,name, semester, cpi);

        }
        
        System.out.println();
        System.out.println("---Student_Detail---");

        for(int i=0;i<student.length;i++){
            System.out.println();
            System.out.println("Student_"+(i+1)+" : ");
            student[i].display();
        }
    }
}
