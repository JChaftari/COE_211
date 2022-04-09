import java.io.File;
import java.io.FileWriter; // Import the FileWriter class
import java.io.IOException; // Import the IOException class to handle errors
import java.util.Scanner;

public class ExpensesTracker {

  public static void main(String[] args) throws IOException {
    // FileReader myReader = new FileReader("expenses.txt");
    FileWriter myWriter = new FileWriter("expenses.txt");
    Scanner sc = new Scanner(System.in);

    String name;
    String purchase;
    String cost;
    String decision = "";

    do {
      System.out.print("Enter your name: ");
      name = sc.next();
      System.out.print("What did you purchase? ");
      purchase = sc.next();
      System.out.print("How much did you pay? ");
      cost = sc.next();

      myWriter.write(
        name + " purchased " + purchase + " for " + cost + " US Dollars. \n"
      );

      System.out.println("Would you like to log another purchase? (y/n)");
      decision = sc.next();
    } while (decision.equals("y"));

    System.out.println("Would you like to read a summary of your purchases?");
    String bonusdecision = sc.next();
    myWriter.close();

    if (bonusdecision.equals("y")) {
      try (Scanner myReader = new Scanner(new File("expenses.txt"))) {
        while (myReader.hasNextLine()) {
          String data = myReader.nextLine();
          System.out.println(data);
        }
      }
      System.out.print("Cool choice bas enno mesh zabta");
    }

    sc.close();
    // Create FileWriter & Scanner objects & y/n string

    // Start gathering information inside the loop you will start

    // Close ClassWriter & Scanner objects

    // If you have already have a expenses.txt file, you need to delete it
    // before you compile your code again
  }
}
