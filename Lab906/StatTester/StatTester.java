
/**
 * StatTester finds loads an Array of int
 * and finds the sum, mean, median, and mode.
 * 
 * @author (Noel Salmeron) 
 * @version (906)
 */

// imports go here
import java.util.Arrays;
public class StatTester{
    //  Instance variables
    public int[] nums;
    public int[] mode;

    // Constructor
    public StatTester(){
        nums = new int[100];
        mode = new int[11];
    }

    //  Methods
    public void loadArray(){
        for (int i = 0; i < nums.length; i++){
            nums[i] = (int)(Math.random()*10);
        }
    }

    public void printArray(){
        for (int i = 0; i < nums.length; i++){
            if (i % 10 == 0){
                System.out.println();
            }
            System.out.print(nums[i] + " ");
        }
    }

    public void getSum(){
        int total = 0;
        for (int i = 0; i < nums.length; i++){
            total += nums[i];
        }
        System.out.println();
        System.out.println("Sum: " + total);
    }

    public void getMean(){
        int total = 0;
        for (int i = 0; i < nums.length; i++){
            total += nums[i];
        }
        System.out.println("Mean: " + (total/100));
    }

    public void getMedian(){
        Arrays.sort(nums);
        double median = (nums[nums.length/2] + nums[(nums.length/2)-1]) / 2;
        System.out.println("Median: " + median);
    } 

    public void getMode(){
        // find number or times each number occurs
        for (int i = 0; i < nums.length; i++){
            int a = nums[i];
            mode[a] += 1;
        }
        
        // find max of occurences
        int max = 0;
        for (int i = 0; i < mode.length; i++){
            if (max < mode[i]){
                max = mode[i];
            }
        }
        
        // find amount of numbers that are equal to max
        int maxes = 0;
        for (int i = 1; i < mode.length; i++){
            if (mode[i] == max){
                maxes += 1;
            }
        }
        
        // print out mode(s)
        System.out.print("Mode(s): ");
        for (int i = 0; i < mode.length; i++){
            if (mode[i] == max){
                System.out.print(i + ", ");
            }
        }
    }
}













