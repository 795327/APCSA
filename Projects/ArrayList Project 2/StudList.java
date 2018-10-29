
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
        System.out.println("List of menus:"); System.out.println();
        System.out.println("1  Add Student to List");
        System.out.println("2  Delete Student from List");
        System.out.println("3  Edit the Student List");
        System.out.println("4  Clear the Student List");
        System.out.println("5  Print the Student List");
        System.out.println("6  Print a Student"); System.out.println();
        System.out.println("Enter a menu number or enter '0' to quit: ");
        int input = userInput.nextInt();
        return input;
    }
    
    // method that takes in student info and adds it to the ArrayList of students
    public void addStudentToList(String name, double studGPA, int studNum, ArrayList studArrayList){
        parseUserInput(name);
        Student student = new Student(name, studGPA, studNum);
        studArrayList.add(student);
    }

    public void printStudentList(ArrayList students){
        for (int i = 0; i < students.size(); i++){
            System.out.println(students.get(i));
        }
    }

    public static String parseUserInput(String name){
        int firstSpace;
        int secondSpace;
        if (name.indexOf(',') >= 0){
            firstSpace = name.indexOf(" ");
            String lastName = name.substring(name.indexOf(','));
            // checks if there is a middle name
            if (name.indexOf(" ", firstSpace + 1) >= 0){
                secondSpace = name.indexOf(" ", firstSpace + 1);
                String firstName = name.substring(name.indexOf(','), name.length());
                String middleName = name.substring(secondSpace + 1, name.length());
                name = firstName + middleName + lastName;
                return firstName;
                return middleName;
                return lastName;
            } else {
                String firstName = name.substring(name.indexOf(','), name.length());
                name = firstName + lastName;
                return firstName;
                return lastName;
            }
        }
        if (name.indexOf(',') == -1){
            firstSpace = name.indexOf(" ");
            secondSpace = name.indexOf(" ", firstSpace + 1);
            String firstName = name.substring(firstSpace);
            String middleName = name.substring(firstSpace + 1, secondSpace);
            String lastName = name.substring(secondSpace + 1, name.length());
            name = firstName + middleName + lastName;
            return firstName;
            return middleName;
            return lastName;
        }
    }
}
