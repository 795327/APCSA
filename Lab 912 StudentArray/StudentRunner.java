
/**
 * StudentRunner
 * 
 * @author (Noel Salmeron) 
 * @version (912)
 */
public class StudentRunner{
    public static void main(){
        //Student s1 = new Student();
        //System.out.println(s1.getStudNumber());
        String[] names = new String[5];
        for (int i = 0; i < names.length; i++){
            names[i] = Student.getName();
        }
        
        int[] stuNums = new int[5];
        for (int i = 0; i < stuNums.length; i++){
            stuNums[i] = Student.getStuNum();
        }
        
        Student[] Students = new Student[5];
        for (int i = 0; i < Students.length; i++){
            Students[i] = new Student();
        }
    }
}







