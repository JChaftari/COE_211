import java.util.Scanner;
public class EntryPoint{
    private static String a = null;

    public static void main(String[] args){
    int n;
    do{
    System.out.println("Which service would you like to use?");
    System.out.println("[1]: Basic week visualizer");
    System.out.println("[2]: Advanced week visualizer");
    System.out.println("[3]: Basic calculator");
    System.out.println("[4]: Employee repertoire");
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    
    
    
    
    
   
    switch(n){
        case 1:
        BasicWeek week = new BasicWeek();
        week.printDays();
        System.out.println("Would you like to perform another operation? (y/n)");
        a= sc.next();
        break;
        case 2:
        AdvancedWeek aweek = new AdvancedWeek();
        aweek.printDays();
        System.out.println("Would you like to perform another operation? (y/n)");
        a= sc.next();
        break;
        case 3:
        ActualCalculator calc = new ActualCalculator();
        calc.toString();
        System.out.println("Would you like to perform another operation? (y/n)");
        a= sc.next();
        break;
        case 4:
        Employee point = new Employee();
        point.toString();
        System.out.println("Would you like to perform another operation? (y/n)");
        a= sc.next();
        default:
        System.out.println("Please make sure you pick a number between 1 and 4");
        a="y";
        break;
        
                }
    }while(a.equals("y"));   

}
}