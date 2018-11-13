
/**
 * StudListRunner
 *
 * @author (Noel Salmeron)
 * @version (1025)
 */
import java.util.Scanner;
import java.util.ArrayList;
public class StudListRunner{

    // declares and initializes new Scanner object for user input
    static Scanner reader = new Scanner(System.in);
    // declares and initializes new ArrayList of student objects
    static ArrayList<Student> students = new ArrayList<Student>();
    // declares and initializes new student list
    static StudList studListObj = new StudList();
    static int menuNumber = studListObj.menuNumber(reader);
    
    public static void main(){
        // declares and initializes new Scanner object for user input
        // Scanner reader = new Scanner(System.in);
        // declares and initializes new ArrayList of student objects
        // ArrayList<Student> students = new ArrayList<Student>();

        // while loop that runs a main menu for the user to pick an activity
        // and then calls the method corresponding to the activity selected
        while(true){
            if (menuNumber == 1){
                reader = new Scanner(System.in);
                System.out.println("\nEnter the student's name: ");
                String inputName = reader.nextLine();
                studListObj.parseUserInput(inputName);
                System.out.println("\nEnter the student's number: ");
                int inputNum = reader.nextInt();
                //checks if the number entered is 6 digits
                if (digits(inputNum) != 6){
                    System.out.println("\nThis is an invalid student number! Try again.");
                    int inputNum2 = reader.nextInt();
                }
                System.out.println("\nEnter the student's GPA: ");
                double inputGPA = reader.nextDouble();
                studListObj.addStudentToList(inputName, inputGPA, inputNum, students);
            }
            if (menuNumber == 2){
                int inputNum = 0;
                reader = new Scanner(System.in);
                System.out.println("\nEnter the student's name to edit (or enter 'q' to enter ID number instead): ");
                String inputName = reader.nextLine();
                if (inputName == "q"){
                    System.out.println("\nEnter the student's number: ");
                    inputNum = reader.nextInt();
                    if (digits(inputNum) != 6){
                        System.out.println("\nThis is an invalid student number! Try again.");
                        int inputNum2 = reader.nextInt();
                    }
                } else {
                    studListObj.deleteStudentFromList(inputName, inputNum, students);
                }
            }
            if (menuNumber == 3){
                int inputNum = 0;
                reader = new Scanner(System.in);
                System.out.println("\nEnter the student's name to edit (or enter 'q' to enter ID number instead): ");
                String inputName = reader.nextLine();
                if (inputName == "q"){
                    System.out.println("\nEnter the student's number: ");
                    inputNum = reader.nextInt();
                }
                System.out.println("\nEnter the student's GPA to edit (or enter the current GPA to keep it the same): ");
                double inputGPA = reader.nextDouble();
                studListObj.editStudentList(inputName, inputNum, inputGPA, students);
            }
            if (menuNumber == 4){
                studListObj.clearStudentList(students);
                System.out.println("Student list cleared!");
            }
            if (menuNumber == 5){
                studListObj.printStudentList(students);
            }
            if (menuNumber == 6){
                reader = new Scanner(System.in);
                System.out.println("\nEnter the student's name to print: ");
                String inputName = reader.nextLine();
                studListObj.printStudent(inputName, students);
            }
            // exits program if user chooses to by enter 'q'
            if (menuNumber == 0){
                System.exit(0);
            }
        }
    }

    public static int digits(int n){
        int digits = 0;
        while (n > -1){
            n /= 10;
            digits += 1;
        }
        return digits;
    }
}
