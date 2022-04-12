import java.util.Scanner;

public class GradesAggregator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double arr[]=new double[5];

        for(int i=1;i<=5;i++){
        System.out.println("Input the grade of assignment " + i);
        arr[i-1]=sc.nextDouble();
        }

        System.out.println("Input number of attended labs");
        double att = sc.nextDouble();

        System.out.println("Input the midterm grade");
        double mid = sc.nextDouble();

        double sum = 0;
        for(int i=0;i<=4;i++){
            sum += arr[i];
        }

        System.out.println("Assinments (30%):" + sum/5*0.3);
        System.out.println("Attendance (5%):" + att/7*100*0.05);
        System.out.println("Midterm (30%):" + mid*0.3);

        sc.close();
        
    }
}