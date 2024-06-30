import java.util.*;
class Employee_Detail{
    int employee_id;
    String name;
    String designation;
    double salary;

    public Employee_Detail(int employee_ID, String employee_name, String desig, double empolyee_salary){
        this.employee_id =  employee_ID;
        this.name =  employee_name;
        this.designation =  desig;
        this.salary =  empolyee_salary;
    }

    public void display(){
        System.out.println("Employee ID : "+employee_id);
        System.out.println("Employee Name : "+name);
        System.out.println("Designation : "+designation);
        System.out.println("Salary : "+salary);
    }
}

public class Display_Employee{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the ID no : ");
        int employee_id = sc.nextInt();

        System.out.println("Enter the name : ");
        String name = sc.next();

        System.out.println("Enter the designation : ");
        String designation = sc.next();

        System.out.println("Enter the salary : ");
        double salary = sc.nextDouble();

        Employee_Detail employee = new Employee_Detail( employee_id,name, designation, salary);

        System.out.println();
        System.out.println("---Employee_Detail---");

        employee.display();

    }
}
