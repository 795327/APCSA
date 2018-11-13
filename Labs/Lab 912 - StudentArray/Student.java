
/**
 * Write a description of class Student here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Student
{
    // instance variables - replace the example below with your own
    //private int studNumber;
    public static String name;
    public static int stuNum;
    /**
     * Constructor for objects of class Student
     */ 
    public static void Student()
    {
        // initialise instance variables
        //studNumber = 0;
        name = "";
        stuNum = 0;
    }
    
    /**
     * Student Methods
     */
    //public void setStudNumber(int sn) {
    //studNumber = sn;
    //}
    //public int getStudNumber()  {
    //return studNumber;
    //}
    public static void setName(String n){
        name = n;
    }

    public static String getName(){
        return name;
    }

    public static void setStuNum(int sn){
        stuNum = sn;
    }

    public static int getStuNum(){
        return stuNum;
    }
}
