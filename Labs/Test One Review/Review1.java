
/**
 * Review 1
 * 
 * @author (Noel Salmeron)
 * @version (924)
 */
import java.util.Arrays;
public class Review1{
    public static void main(){
        //1. Data Types and Variables
        System.out.println("45%7 + 8%12 + 12/5 = " + (45%7 + 8%12 + 12/5));
        System.out.println("357%10 = " + (357%10));
        System.out.println("357/10 = " + (357/10));
        System.out.println((int) (Math.random() * 10 + 5));

        //2. If Statements and boolean expressions
        System.out.println("23 <= 23 --> " + (23 <= 23));

        int x = 15; 
        if(x/4 < 4){
            System.out.print("Inside"); 
        }
        System.out.println(", Outside");

        int num = 25; 
        if(num/4 < 2){
            System.out.println("First"); 
        }else if(num%4 < 2){
            System.out.println("Second"); 
        }else{
            System.out.println("Third"); 
        }

        //3. While loops
        int[] evenNums = new int[10];
        int a = 2;
        int b = 0;
        while (b < 10){
            evenNums[b] = a;
            b ++;
            a += 2;
        }
        
        System.out.println("");
        System.out.print("Even #'s Array: ");
        for (int i = 0; i < 10; i++){
            System.out.print((evenNums[i]) + " ");
        }

        //5. Nested for loops
        System.out.println("");
        for(int i = 0; i < 5; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("Y, ");
            }
            System.out.println("X");
        }

        System.out.println("");
        int top = 4;
        for(int m = 0; m < top; m++){
            for(int n = top; n > m; n--){
                System.out.print("H, ");
            }
            System.out.println("P");
        }

        //11. Trace the output values for a while loop
        System.out.println("");
        int control= 0, num2 = 3;
        while(control < num2){
            control++;
            System.out.println("control = " + num2);
        }

    }

    int max = 0;
    public int[] maxEnd3(int[] nums) {
        for (int i = 0; i < 3; i += 2){
            if (max < nums[i]){
                max = nums[i];
            }
        }
        for (int i = 0; i < 3; i++){
            nums[i] = max;
            System.out.print(nums[i] + ", ");
        }
        return nums;
    }
}



