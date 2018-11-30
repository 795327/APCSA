
/**
 * PrimeNums
 *
 * @author (Noel Salmeron)
 * @version (1130)
 */
import java.util.ArrayList;
public class PrimeNums
{
    // instance variables - replace the example below with your own
    private ArrayList<Integer> nums;
    private int number;

    /**
     * Constructor for objects of class PrimeNums
     */
    public PrimeNums()
    {
        nums = new ArrayList<Integer>();
        number = 0;
    }

    /**
     * Main Methods (required; from slides)
     */
    public void setListToNumber(int n){ // adds each digit of n to ArrayList
        while (n > 0){
            nums.add(0, n % 10);
            n /= 10;
        }
    }
    
    public void addNumberToList(int n){ // adds n to ArrayList
        number += n;
        //reverse(nums); look for reverse method somewhere on slides
        for (int i = nums.size() - 1; i >= nums.size(); i--){
            number += nums.get(i) * (10 * i);
        }
        
        nums.clear();
        
        while (number > 0){
            nums.add(0, number % 10);
            number /= 10;
        }
    }
    
    public void addNumbers(ArrayList<Integer> n1, ArrayList<Integer> n2){ // adds each digit of n
        
    }
    
    /**
     * Additonal Methods
     */
    public void printArrayList(){
        System.out.print("ArrayList:");
        for (int i = 0; i < nums.size(); i++){
            System.out.print(" " + nums.get(i));
        }
    }
    
    public int getNumber(){
        return number;
    }
}
