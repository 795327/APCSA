
/**
 * StringReview
 *
 * @author (Noel Salmeron)
 * @version (1023)
 */
import java.util.Random;
public class StringReview{
    public static void main(){
        // 1.  Know how to use string methods:
        String str = "Intelligent";
        System.out.println(str.substring(5, 7));
        System.out.println(str.substring(3));
        System.out.println(str.substring(9));
        System.out.println(str.indexOf("tell"));
        System.out.println(str.indexOf("tell", 2));
        System.out.println(str.indexOf("tell", 3));
        System.out.println(str.toLowerCase());
        System.out.println(str.length());

        // II. Multiple Choice Examples
        // 1. What is the returned by the call go(-9)?
        System.out.println(go(-9));
        System.out.println(go(9)); // extra test

        // 2. Given String str = "199 Churchill Ave. Woodside CA, 94062", 
        // what is returned by the following:
        str = "199 Churchill Ave. Woodside CA, 94062"; 

        // a. System.out.println(str.substring("Church")); --> invalid parameter
        // b. System.out.println(str.substring(" ")); --> invalid parameter
        // c. 
        System.out.println(str.indexOf("Bananas"));

        // d.
        System.out.println(str.substring(str.indexOf("4")));

        // e.
        System.out.println(str.substring(str.indexOf("CA")));

        // f.
        System.out.println(str.substring(str.indexOf("W"), str.indexOf("W")+9));

        // g.
        System.out.println(str.substring(2, 4)+1);

        // h.
        String str2 = str.substring(str.indexOf("Woodside"));
        System.out.println(str2.substring(str2.indexOf(" ")));

        // 3. For the following, trace i, j, and i*j and show the output:
        // (original form in review guide doesn't work because the missing System.)
        for(int i = 3; i > 0 ; i--){
            for(int j = 3; j>= i; j--){
                System.out.print(", " + i*j);
            }
            System.out.println();
        }

        // III. Free Response
        // 1. Return the number of times that the string "code" appears 
        // anywhere in the given string, except we'll accept any letter 
        // for the 'd', so "cope" and "cooe" count.
            // countCode("aaacodebbb") → 1
            // countCode("codexxcode") → 2
            // countCode("cozexxcope") → 2
        System.out.println(countCode("aaacodebbb"));
        System.out.println(countCode("codexxcode"));
        System.out.println(countCode("cozexxcope"));
        
        System.out.println(transformIHaveA("I have a puppy"));
        System.out.println(transformIHaveA("I have a headache"));
        
        System.out.println(transformIHaveA2("I have a puppy"));
        System.out.println(transformIHaveA2("I have a headache"));
    }
    
    /**
     * Take a statement with "I have a <something>." and transform it into 
     * "What color is your <something>?"
     * @param statement the user statement, assumed to contain "I have a"
     * @return the transformed statement
     */
    private static String transformIHaveA(String statement){
        //  Remove the final period, if there is one
        statement = statement.trim();
        String lastChar = statement.substring(statement.length() - 1);
        if (lastChar.equals(".")){
            statement = statement.substring(0, statement.length() - 1);
        }
        int psn = statement.indexOf("I have a");
        String restOfStatement = statement.substring(psn + 8).trim();
        return "What color is your " + restOfStatement + "?";
    }
    
    /**
     * Take a statement with "I have a <something>." and transform it into 
     * "Random response <something>?"
     * @param statement the user statement, assumed to contain "I have a"
     * @return the transformed statement
     */
    private static String transformIHaveA2(String statement){
        //  Remove the final period, if there is one
        statement = statement.trim();
        String lastChar = statement.substring(statement.length() - 1);
        if (lastChar.equals(".")){
            statement = statement.substring(0, statement.length() - 1);
        }
        int psn = statement.indexOf("I have a");
        String restOfStatement = statement.substring(psn + 8).trim();
        int randResNum = ((int)(Math.random()*4))+1;
        if (randResNum == 1){
            return "How long have you had a " + restOfStatement + "?";
        }
        if (randResNum == 2){
            return "What color is your " + restOfStatement + "?";
        }
        if (randResNum == 3){
            return "When did you get your " + restOfStatement + "?";
        }
        if (randResNum == 4){
            return "Why do you have a " + restOfStatement + "?";
        }
        return "";
    }
    
    public static int countCode(String str){ 
        int appearances = 0;
        if (str.length() < 4){ 
            return 0;
        }
        for (int i = 0; i < str.length() - 3; i++){
            if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'o' && str.charAt(i + 3) == 'e'){
                appearances += 1;
            }
        }
        return appearances;
    }
    
    public static String go(int x){
        if (x==5){
            return "same";
        } 
        else if (x>5){
            return "notsame";
        }
        return "done";
    }
}


