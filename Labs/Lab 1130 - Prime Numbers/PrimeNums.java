
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
        System.out.println("Number to be added to ArrayList: " + n);
        for (int i = 0; i < nums.size(); i++){
            number = 10 * number + nums.get(i);
        }
        
        int newNum = number + n;
        int a = 0;
        nums.clear();
        while (newNum > 0){
            nums.add(0, newNum % 10);
            newNum /= 10;
            a += 1;
        }
    }
    
    // ORIGINAL METHOD (ArrayList couldn't go over 999)
    // tempNums.clear();
    // // adds n its own ArrayList
    // while (n > 0){
    // tempNums.add(0, n % 10);
    // n /= 10;
    // }    

    // for (int i = 0; i < tempNums.size(); i++){
    // nums.set(i, tempNums.get(i) + nums.get(i));
    // }

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
        System.out.println();
    }

    public int getNumber(){
        return number;
    }
}
