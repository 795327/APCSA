
/**
 * StudListRunner
 *
 * @author (Noel Salmeron)
 * @version (1025)
 */
import java.util.Scanner;
import java.util.ArrayList;
public class StudListRunner{
    public static void main(){
        // declares and initializes new student list
        StudList studList = new StudList();
        boolean running = true;
        
        // while loop that runs a main menu for the user to pick an activity
        // and then calls the method corresponding to the activity selected
        while (running = true){
            int menuNumber = studList.menuNumber();
            
            // adding a student
            if (menuNumber == 1){
                Scanner input = new Scanner(System.in);
                System.out.println("\nEnter the student's name: ");
                String name = input.nextLine();
                System.out.println("\nEnter the student's number: ");
                int num = input.nextInt();
                System.out.println("\nEnter the student's GPA: ");
                double gpa = input.nextDouble();
                studList.addStudentToList(name, gpa, num);
                System.out.println("Student added.");
            }

            //removing a student
            if (menuNumber == 2){
                Scanner input = new Scanner(System.in);
                System.out.println("\nEnter the student's last name: ");
                String name = input.nextLine();
                System.out.println("Student removed.");
                if (studList.deleteStudentFromList(name) != true) {
                    System.out.println("This student was not found.");
                }
            }

            // editing a student
            if (menuNumber == 3){
                int num;
                Scanner input = new Scanner(System.in);
                System.out.println("\nEnter 'a' to use the student's last name to edit (or enter 'q' to enter ID number instead): ");
                String name = input.nextLine();
                if (name == "q"){ // path of using num to identify student
                    System.out.println("\nEnter the student's number: ");
                    num = input.nextInt();
                    if (digits(num) != 6){ 
                        System.out.println("\nThis is an invalid student number! Try again.");
                    } else {
                        System.out.println("\nEnter the student's revised full name: ");
                        name = input.nextLine();
                        System.out.println("\nEnter the student's revised GPA (or enter the existing GPA): ");
                        double gpa = input.nextDouble();
                        String last = null;
                        if (studList.editStudentList(name, last, num, gpa) == true) {
                            System.out.println("Student edited.");
                        } else {
                            System.out.println("Edit failed.");
                        }
                    } 
                } else {
                    System.out.println("\nEnter the student's last name: ");
                    String last = input.nextLine();
                    System.out.println("\nEnter the student's revised name: ");
                    name = input.nextLine();
                    System.out.println("\nEnter the student's revised GPA: ");
                    double gpa = input.nextDouble();
                    num = 0;
                    if (studList.editStudentList(name, last, num, gpa) == true) {
                        System.out.println("Student edited.");
                    } else {
                        System.out.println("Edit failed.");
                    }
                }
            }

            // clearing student list
            if (menuNumber == 4){
                studList.clearList();
                System.out.println("Student list cleared!");
            }

            // printing student list
            if (menuNumber == 5){
                System.out.println("\nStudent List: ");
                studList.printStudentList();
            }

            // printing a student
            if (menuNumber == 6){
                int num;
                Scanner input = new Scanner(System.in);
                System.out.println("\nEnter 'a' to use the student's last name to edit (or enter 'q' to enter ID number instead): ");
                String name = input.nextLine();
                if (name == "q"){ // path of using num to identify student
                    System.out.println("\nEnter the student's number: ");
                    num = input.nextInt();
                    if (digits(num) != 6){ 
                        System.out.println("\nThis is an invalid student number! Try again.");
                    } else {
                        Student s = studList.printStudent("", num);
                        if (s != null) {
                            System.out.println("Name: " + s.getFullName() + ", Student Number: " + s.getStuNumber() + ", GPA: " + s.getGPA());
                        } else {
                            System.out.println("\nThis student was not found! Try again.");
                        }
                    } 
                } else {
                    System.out.println("\nEnter the student's last name: ");
                    String last = input.nextLine();
                    Student s = studList.printStudent(last, 0);
                    if (s != null) {
                        System.out.println("Name: " + s.getFullName() + ", Student Number: " + s.getStuNumber() + ", GPA: " + s.getGPA());
                    } else {
                        System.out.println("\nThis student was not found! Try again.");
                    }
                }
            }

            // exits program if user chooses to by enter 'q'
            if (menuNumber == 0){
                running = false;
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
