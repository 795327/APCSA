
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
    ArrayList<Student> students = new ArrayList<Student>();

    public static void main(){
        // while loop that runs a main menu for the user to pick an activity
        // and then calls the method corresponding to the activity selected
        while(true){
            int menuNumber = studList.menuNumber(reader);
            if (menuNumber == 1){

            }
            if (menuNumber == 2){

            }
            if (menuNumber == 3){

            }
        }

    }
}
