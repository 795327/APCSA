
/**
 * StudList
 *
 * @author (Noel Salmeron)
 * @version (1025)
 */
import java.util.Scanner;
import java.util.ArrayList;
public class StudList{
    // menuNumber method that displays menu, gets user input, and returns an integer
    public int menuNumber(Scanner userInput){
        System.out.println("Enter a menu number: ");
        int input = userInput.nextInt();
        return input;
    }

    public void addStudentToList(String name, double studGPA, int studNum, ArrayList studArrayList){
        String lastName = "";
        String firstName = "";
        String middleName = "";
        int firstSpace;
        int secondSpace;
        
        // !!! need to set a student object to the GPA, studNum and name, but how?
        if (name.indexOf(',') >= 0){
            firstSpace = name.indexOf(" ");
            lastName = name.substring(name.indexOf(','));
            // checks if there is a middle name
            if (name.indexOf(" ", firstSpace + 1) >= 0){
                secondSpace = name.indexOf(" ", firstSpace + 1);
                firstName = name.substring(name.indexOf(','), name.length());
                middleName = name.substring(secondSpace + 1, name.length());
                name = firstName + middleName + lastName;
            } else {
                firstName = name.substring(name.indexOf(','), name.length());
                name = firstName + lastName;
            }
        }
        if (name.indexOf(',') == -1){
            firstSpace = name.indexOf(" ");
            secondSpace = name.indexOf(" ", firstSpace + 1);
            firstName = name.substring(firstSpace);
            middleName = name.substring(firstSpace + 1, secondSpace);
            lastName = name.substring(secondSpace + 1, name.length());
            name = firstName + middleName + lastName;
        }
        Student student = new Student(name, studGPA, studNum);
        studArrayList.add(student);
    }

    public void printStudentList(){
        for (int i = 0; i < students.size(); i++){
            System.out.println(students.get(i));
        }
    }
}
