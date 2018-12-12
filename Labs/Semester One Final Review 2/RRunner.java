
/**
 * RRunner
 *
 * @author (Noel Salmeron)
 * @version (1212)
 */
import java.util.ArrayList;
public class RRunner{
    public static void main(){
        System.out.println(go(3));
        System.out.println(360/15.2); // double dominates
        for(int i = 2; i > 0 ; i--){
            for(int j = i; j <= 2; j++){
                System.out.print(i + j + ", ");
            }
        }

        int m = 0;
        int n = 7;
        while(m < 3) {
            n--;
            m++;
        }
        System.out.println("\n" + m + n); // ints added to string converted to string!

        System.out.println((int)(Math.random()*7) + 2); // inclusivity makes it 7 digits instead of 6

        int total = 0;
        int k;
        for (k=1; k <= 5; k++) {
            if (k >= 3) {
                total = total + k;
            }
        }
        System.out.println("the total is:" + total);

        String[] randStrings = {	"yes", 
                "no", 
                "maybe", 
                "perhaps", 
                "It remains to be seen" };

        String response = getRandomResponse(randStrings);
        System.out.println(getRandomResponse(randStrings));

    }

    public int adjustMaxMin(ArrayList<Integer> levels, int maxLevel){
        /* Complete this method */
        int n = 0;
        for (int i = 0; i < levels.size(); i++){
            if (levels.get(i) > maxLevel){
                levels.set(i, maxLevel);
                n += 1;
            } else if (levels.get(i) < (0 - maxLevel)){
                levels.set(i, (0 - maxLevel));
                n += 1;
            }
        }
        return n;
    }

    public static String getRandomResponse(String[] str){
        return str[(int)(Math.random()*4)];
    }

    public static String go(int x){
        if (x <= 5)
            return "same";
        else if (x >= 3)
            return "notsame";
        return "done";
    }

}
