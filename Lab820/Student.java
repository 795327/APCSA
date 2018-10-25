
/**
 * Lab820
 * 
 * Noel Salmeron 
 * 820
 */
public class Student
{
    private int studNumber;
    private int stuNumber;
    private boolean stuActive;
    private double stuGPA;
    private String stuName;

    /**
     * Constructor for objects of class Student
     */
    public Student()
    {
        studNumber = 0;
        stuNumber = 795327;
        stuActive = true;
        stuGPA = 4.0;
        stuName = "Noel Salmeron";
    }
    /**
     * Student Methods
     */
    public void setStudNumber(int sn) {
        studNumber = sn;
    }
    public int getStudNumber()  {
        return studNumber;
    }
    public void setStuNumber(int snb) {
        stuNumber = snb;
    }
    public int getStuNumber()  {
        return stuNumber;
    }
    public void setStuActive(boolean sa) {
        stuActive = sa;
    }
    public boolean getStuActive()  {
        return stuActive;
    }
    public void setStuGPA(double sg) {
        stuGPA = sg;
    }
    public double getStuGPA()  {
        return stuGPA;
    }
    public void setStuName(String sna) {
        stuName = sna;
    }
    public String getStuName()  {
        return stuName;
    }
}
