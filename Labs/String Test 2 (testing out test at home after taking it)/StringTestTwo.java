
/**
 * StringTestTwo
 *
 * @author (Noel Salmeron)
 * @version (1102)
 */
import java.util.ArrayList;
public class StringTestTwo{
    public static void main(){
        // 1.
        String str1 = "Obama, Barack";
        String str2 = "Barack Hussein Obama";
        // a. 
        System.out.println(str1.substring(0, 7));

        // b.
        System.out.println(str2.substring(str2.indexOf("H"), str2.indexOf("n")));

        // c.
        System.out.println(str1.substring(str1.indexOf(" ") + 1));

        // d.
        System.out.println(str2.substring(str2.indexOf("n") + 2));

        // 2. (correct answer: a)
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(2);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(8);
        int sum = 0;
        for (int i = 0; i < nums.size(); i++){
            sum += nums.get(i);
        }
        System.out.println(sum);

        // 3.
        System.out.println(someFun(7));

        // 4. (correct answer: b)
        String str = "199 Churchill Ave. Woodside CA, 94062";
        System.out.println(str.substring(str.indexOf("Woodside"), str.indexOf("W") + 8));

        // 5.
        for (int i = 6; i > 3; i--){
            for (int j = 3; j < i; j++){
                System.out.print(" i = " + i + ", j = " + j);
            }
            System.out.print("\n");
        }
        
        // II. Free Response
        // 2. 
        System.out.println(transformILike("I like puppies"));
    }
    
    public static String transformILike(String statement){
        ArrayList<String> randResponses = new ArrayList<String>();
        randResponses.add("Why do you like"); 
        randResponses.add("Do you eat");
        randResponses.add("What are"); 
        randResponses.add("What color are");
        String response = randResponses.get((int)(Math.random() * 4));
        return response + " " + statement.substring(7) + "?";
    }
    
    private boolean isActive;
    public void setIsActive(boolean x){
        isActive = x;
    }
    public boolean getIsActive(){
        return isActive;
    }

    public static String someFun(int x){
        if (x <= 12){
            return "SeeYa";
        }
        else if (x > 5){
            return "Bye";
        }
        return "SoLong";
    }
}



