import java.util.Scanner;

public class ActualCalculator {
    

    // Constructor to initialize the calculator
    public ActualCalculator() {
        // Get user input
        Scanner sc = new Scanner(System.in);
        /**
         * Continue code here to ask for the first number, the operator, and the second number, IN THAT ORDER
         */
        System.out.println("Enter First Number");
        int x = sc.nextInt();
        System.out.println("Enter Operator");
        char op = sc.next().charAt(0);
        System.out.println("Enter Second Number");
        int y = sc.nextInt();
        

        switch(op){

            case '+':
                add(x, y);
            break;
            case '-':
                subtract(x, y);
            break;
            case '*':
                multiply(x, y);
            break;
            case '/':
                int j;
                int k;
                divide(x, y);
            break;
            default:
            break;
        }
        // Decide on the operation to perform 
        /**
         * Insert code to decide on which function to call, based on the operator the user chose
         * Hint: Switch statement
         */
    }

    

    public String add(int num1,int num2) {
        
        
    int c=num1+num2;
        System.out.println(num1 + "+" + num2 + "=" + c);
        
        return null;
        
    }

    public String subtract(int num3, int num4) {
        
        int d=num3-num4;
        System.out.println(num3 + "-" + num4 + "=" + d);
        
        return null;
    }

    public String multiply(int num5, int num6) {
        
        int e=num5*num6;
        System.out.println(num5 + "*" + num6 + "=" + e);
        
        return null;
    }

    public String divide(int num7, int num8) {
        
        int f=num7/num8;
        
    int m=num7%num8;
        
        if (m==0){
        
        System.out.println(num7 + "/" + num8 + "=" + f);
        } 
        else{
        
        double num9=num7;
        double g=num9/num8;
        System.out.println(num7 + "/" + num8 + "=" + g);
        }
        return null;
    }
}
