
/**
 * Student
 *
 * @author (Noel Salmeron)
 * @version (1025)
 */
public class Student{
    // instance variables - replace the example below with your own
    private Student student;

    /**
     * Constructor for objects of class Student
     */
    public Student(String name, int GPA, int studNum){
        //how do i make var student contain all of these values?
        student = Student(String name, int GPA, int studNum);
    }

    public void setFirstName(String firstName){
        studFirstName = firstName;
    }

    public String getFirstName(){
        return studFirstName;
    }

    public void setMiddleName(String middleName){
        studMiddleName = middleName;
    }

    public String getMiddleName(){
        return studMiddleName;
    }

    public void setLastName(String lastName){
        studLastName = lastName;
    }

    public String getLastName(){
        return studLastName;
    }
    
    public void setStuNum(int stuNum){
        studNum = stuNum;
    }

    public int getStuNum(){
        return studNum;
    }
    
    public void setStuGPA(double stuGPA){
        studGPA = stuGPA;
    }

    public double getStuGPA(){
        return studGPA;
    }
}
