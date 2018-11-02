
/**
 * StudListRunner
 *
 * @author (Noel Salmeron)
 * @version (1025)
 */
import java.util.Scanner;
import java.util.ArrayList;
public class StudListRunner{
    // declares and initializes new student list
    static StudList studList = new StudList();
    // declares and initializes new Scanner object for user input
    static Scanner reader = new Scanner(System.in);
    // declares and initializes new ArrayList of student objects
    static ArrayList<Student> students = new ArrayList<Student>();

    public static void main(){
        // while loop that runs a main menu for the user to pick an activity
        // and then calls the method corresponding to the activity selected
        int menuNumber = studList.menuNumber(reader);
        while(true){
            if (menuNumber == 1){
                reader = new Scanner(System.in);
                System.out.println("\nEnter the student's name: ");
                String inputName = reader.nextLine();
                System.out.println("\nEnter the student's number: ");
                int inputNum = reader.nextInt();
                //checks if the number entered is 6 digits
                if (digits(inputNum) != 6){
                    System.out.println("\nThis is an invalid student number! Try again.");
                    int inputNum2 = reader.nextInt();
                }
                System.out.println("\nEnter the student's GPA: ");
                double inputGPA = reader.nextDouble();
                studList.addStudentToList(inputName, inputGPA, inputNum, students);
                System.exit(0);
            }
            if (menuNumber == 2){

            }
            if (menuNumber == 3){

            }
            if (menuNumber == 4){

            }
            if (menuNumber == 5){

            }
            if (menuNumber == 6){

            }
            // exits program if user chooses to by enter 'q'
            if (menuNumber == 0){
                System.exit(0);
            }
        }

    }
    
    public static int digits(int n){
        int digits = 0;
        while (n > 0){
            n /= 10;
            digits += 1;
        }
        return digits;
    }
}