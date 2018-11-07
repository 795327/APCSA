
/**
 * GridTester
 *
 * @author (Noel Salmeron)
 * @version (1106)
 */
public class GridTester{
    public static void main(){
        int[][] nums = new int[10][10];
        loadArray(nums);
        System.out.println(sumAll(nums));
        System.out.println(findGreatest(nums));
        System.out.println(numberOfGreatest(nums));
        System.out.println(findAvg(nums));
    }

    public static void loadArray(int[][] nums){
        for (int a = 0; a < nums.length; a++){
            for (int b = 0; b < nums[a].length; b++){
                nums[a][b] = (int)(Math.random()*100) + 1;
            }
        }
    }

    public static int sumAll(int[][] nums){
        int sum = 0;
        for (int a = 0; a < nums.length; a++){
            for (int b = 0; b < nums[a].length; b++){
                sum += nums[a][b];
            }
        }
        return sum;
    }

    public static int findGreatest(int[][] nums){
        int greatest = 0;
        for (int a = 0; a < nums.length; a++){
            for (int b = 0; b < nums[a].length; b++){
                if (nums[a][b] > greatest){
                    greatest = nums[a][b];
                }
            }
        }
        return greatest;
    }
    
    public static int numberOfGreatest(int[][] nums){
        int greatest = 0;
        int greatestOccurs = 0;
        for (int a = 0; a < nums.length; a++){
            for (int b = 0; b < nums[a].length; b++){
                if (nums[a][b] > greatest){
                    greatest = nums[a][b];
                }
            }
        }
        for (int a = 0; a < nums.length; a++){
            for (int b = 0; b < nums[a].length; b++){
                if (nums[a][b] == greatest){
                    greatestOccurs += 1;
                }
            }
        }
        return greatestOccurs;
    }
    
    public static int findAvg(int[][] nums){
        int sum = 0;
        for (int a = 0; a < nums.length; a++){
            for (int b = 0; b < nums[a].length; b++){
                sum += nums[a][b];
            }
        }
        return sum/nums.length;
    }
}








