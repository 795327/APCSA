
/**
 * StudList
 *
 * @author (Noel Salmeron)
 * @version (1025)
 */
import java.util.Scanner;
import java.util.ArrayList;
public class StudList{
    // creates new student ArrayList
    ArrayList<Student> studList = new ArrayList<Student>();
    //declares a new Student object
    Student student;

    // menuNumber method that displays menu, gets user input, and returns an integer
    public int menuNumber(){
        Scanner action = new Scanner(System.in);
        System.out.println("\nSelect an action:");
        System.out.println("1  Add Student to List");
        System.out.println("2  Delete Student from List");
        System.out.println("3  Edit the Student List");
        System.out.println("4  Clear the Student List");
        System.out.println("5  Print the Student List");
        System.out.println("6  Print a Student"); System.out.println();
        System.out.println("Enter a menu number or enter '0' to quit: ");
        int input = action.nextInt();
        return input;
    }

    // method that takes in student info and adds it to the ArrayList of students
    public void addStudentToList(String name, double studGPA, int studNum){
        Student stud = new Student();
        parseUserInput(stud, name);
        stud.setGPA(studGPA);
        stud.setStuNumber(studNum);
        studList.add(stud);
    }

    public void printStudentList(){
        if(studList.size() > 0) {
            for(int i = 0; i < studList.size(); i++) { // traverses student list
                System.out.println(i+1 + ") Name: " + 
                    studList.get(i).getFullName() + 
                    ", Number: " + studList.get(i).getStuNumber() + 
                    ", GPA: " + studList.get(i).getGPA());
            }
        } else {
            System.out.println("You have an empty student list.");
        }
    }

    public boolean deleteStudentFromList(String last){
        boolean studentRemoved = false;
        for(int i = 0; i < studList.size(); i++) { // traverses list
            if(studList.get(i).getLastName().equals(last)) { // checks for a matching last name
                studList.remove(i); // deletes student
                studentRemoved = true; // indicates deletion
            }
        }
        return studentRemoved;
    }

    public boolean editStudentList(String name, String last, int num, double gpa){
        boolean studentExists = false;
        if (num != 0){
            studentExists = true;
            for(int i = 0; i < studList.size(); i++) { // traverses student list
                if(studList.get(i).getStuNumber() == num) { // checks for a matching student num
                    Student stud = new Student();
                    parseUserInput(stud, name);
                    stud.setStuNumber(num);
                    stud.setGPA(gpa);
                    studList.set(i, stud);
                }
            } 
        } else {
            studentExists = true;
            for(int i = 0; i < studList.size(); i++) { // traverses student list
                if(studList.get(i).getLastName().equals(last)) { // checks for a matching last name
                    Student stud = new Student();
                    parseUserInput(stud, name);
                    stud.setStuNumber(num);
                    stud.setGPA(gpa);
                    studList.set(i, stud);
                }
            }
        }
        return studentExists;
    }

    public void clearList(){
        // clears all students from student list
        studList.clear(); 
    }

    public Student printStudent(String last, int num){
        for(int i = 0; i < studList.size(); i++) { // traverses student list
            if(num != 0) {
                if(studList.get(i).getStuNumber() == num) { // checks for a matching student num
                    return studList.get(i);
                }
            } else {
                if(studList.get(i).getLastName().equals(last)) { // checks for a matching last name
                    return studList.get(i);
                }
            }
        }
        return null;
    }

    public void parseUserInput(Student stud, String name){
        int firstSpace;
        int secondSpace;
        if (name.indexOf(',') >= 0){
            firstSpace = name.indexOf(" ");
            stud.setLastName(name.substring(0, name.indexOf(",")));
            // checks if there is a middle name
            if (name.indexOf(" ", firstSpace + 1) >= 0){ // name format of Last, First Middle
                secondSpace = name.indexOf(" ", firstSpace + 1);
                stud.setFirstName(name.substring(firstSpace + 1, secondSpace));
                stud.setMiddleName(name.substring(secondSpace + 1));
            } else { // name format of Last, First
                stud.setFirstName(name.substring(firstSpace + 1));
            }
        } else { // name format of First Middle Last
            firstSpace = name.indexOf(" ");
            secondSpace = name.indexOf(" ", firstSpace + 1);
            stud.setFirstName(name.substring(0, firstSpace));
            stud.setMiddleName(name.substring(firstSpace + 1, secondSpace));
            stud.setLastName(name.substring(secondSpace + 1));
        }
    }
}
