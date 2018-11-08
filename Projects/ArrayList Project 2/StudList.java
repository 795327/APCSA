
/**
 * StudList
 *
 * @author (Noel Salmeron)
 * @version (1025)
 */
import java.util.Scanner;
import java.util.ArrayList;
public class StudList{
    //declares a new Student object
    Student student;

    // menuNumber method that displays menu, gets user input, and returns an integer
    public int menuNumber(Scanner userInput){
        System.out.println("\nList of menus:");
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
        Student student = new Student(name, studNum, studGPA);
        studArrayList.add(student);
    }

    public void printStudentList(ArrayList studArrayList){
        for (int i = 0; i < studArrayList.size(); i++){
            //if (studArrayList.get(i) != null){
                System.out.println("Student # " + (i+1) + studArrayList.get(i));
            //}
        }
    }

    public void deleteStudentFromList(String name, int studNum, ArrayList studArrayList){
        boolean studentExists;
        if (studArrayList.contains("name") || studArrayList.contains(studNum)){
            studentExists = true;
            studArrayList.remove(studArrayList.indexOf(name));
        } else {
            studentExists = false;
            System.out.println("This student doesn't exist in the list.");
        }
    }

    public void editStudentList(String oldName, int studNum, double gpa, ArrayList studArrayList){
        boolean studentExists;
        if (studArrayList.contains("name") || studArrayList.contains(studNum)){
            studentExists = true;
        } else {
            studentExists = false;
            System.out.println("This student doesn't exist in the list.");
        }
    }

    public void clearStudentList(ArrayList studArrayList){
        studArrayList.clear();
    }

    public void printStudent(String name, ArrayList studArrayList){
        boolean studentExists;
        if (studArrayList.contains(name)){
            studentExists = true;
            for (int i = 0; i < studArrayList.size(); i++){
                if (studArrayList.get(i) == name){
                    System.out.println(studArrayList.get(i));
                }
            }
        } else {
            studentExists = false;
            System.out.println("This student doesn't exist in the list.");
        }
    }
    
    public void parseUserInput(String name){
        Student student = new Student();
        int firstSpace;
        int secondSpace;
        if (name.indexOf(',') >= 0){
            firstSpace = name.indexOf(" ");
            student.setLastName(name.substring(0, name.indexOf(",")));
            // checks if there is a middle name
            if (name.indexOf(" ", firstSpace + 1) >= 0){
                secondSpace = name.indexOf(" ", firstSpace + 1);
                student.setFirstName(name.substring(firstSpace + 1, secondSpace));
                student.setMiddleName(name.substring(secondSpace + 1));
            } else {
                student.setFirstName(name.substring(firstSpace + 1));
            }
        } else {
            firstSpace = name.indexOf(" ");
            secondSpace = name.indexOf(" ", firstSpace + 1);
            student.setFirstName(name.substring(0, firstSpace));
            student.setMiddleName(name.substring(firstSpace + 1, secondSpace));
            student.setLastName(name.substring(secondSpace + 1));
        }
    }
}
