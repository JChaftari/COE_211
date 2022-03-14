import java.util.Scanner;

public class Employee {
    // Initializing variables
    

    
        Scanner sc= new Scanner(System.in); 
        int i = 0;
        int rand = (int)(Math.random() * 10);
        
    

    public String toString() {
        
        while (i<rand){
            System.out.print("Please input the employee's first name: ");  
            String FirstName= sc.next();  
            
            
            System.out.print("Please input the employee's last name: ");  
            String LastName= sc.next();
            
            System.out.print("Please input the employee's age: ");  
            int Age= sc.nextInt();
            
            System.out.print("Please input the employee's Monthly Salary: ");  
            double MonthlySalary= sc.nextDouble();
            
            System.out.println("Employee information:" + FirstName + " " + LastName + ", " + Age + ", " + MonthlySalary);
                    
                    i++;
                    int Executions = rand-i;
                    System.out.println("You have " + Executions + " insertions left");
                        
            }
        // insert logic for toString method
        return null;
    }
}
