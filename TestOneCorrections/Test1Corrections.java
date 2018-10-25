
/**
 * TestOneCorrections
 *
 * @author (Noel Salmeron)
 * @version (1001)
 */
public class Test1Corrections{
    public static void main(){
        // #3: Which will create a random integer between 10 and 20 inclusive?
        int num = (int)(Math.random()*11) + 10;
        System.out.println(num);
    }

    public static double average(int[] nums){
        int sum = 0;
        for (int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        return sum/nums.length;
    }
}
