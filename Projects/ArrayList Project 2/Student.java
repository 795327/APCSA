
/**
 * Student
 *
 * @author (Noel Salmeron)
 * @version (1025)
 */
import java.util.ArrayList;
public class Student{
    //instance variables
    String firstName;
    String middleName;
    String lastName;
    String name;
    int stuNumber;
    double gpa;

    /**
     * Constructor for objects of class Student
     */
    public Student(String studName, int studNum, double studGPA){
        name = studName;
        gpa = studGPA;
        stuNumber = studNum;
    }

    public void setFirstName(String studFirstName){
        firstName = studFirstName;
    }

    public void setMiddleName(String studMiddleName){
        middleName = studMiddleName;
    }

    public void setLastName(String studLastName){
        lastName = studLastName;
    }

    public String getFullName(){
        return firstName + middleName + lastName;
    }

    public void setStudNum(int studNum){
        stuNumber = studNum;
    }

    public int getStudNum(){
        return stuNumber;
    }

    public void setGPA(double studGPA){
        gpa = studGPA;
    }

    public double getGPA(){
        return gpa;
    }
}
