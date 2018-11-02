
/**
 * Review
 *
 * @author (Noel Salmeron)
 * @version (1031)
 */
import java.util.ArrayList;
import java.util.Collections;
public class Review{
    public static void main(){
        String str = "I bought a new computer!";
        String name = "Salmeron, Noel";
        String name2 = "Salmeron, Noel Giovanni";
        String name3 = "Noel Giovanni Salmeron";
        String statement = "I want fried chicken and glazed donuts.";
        ArrayList<String> strs = new ArrayList<String>();
        // 1 number makes substring START at the number
        System.out.println(str.substring(10));
        System.out.println(str.substring(0, 10));
        System.out.println(str.substring(5, 20));
        System.out.println(str.indexOf("i"));
        System.out.println(str.indexOf("I"));
        System.out.println(str.indexOf("I", 5));
        System.out.println(str.indexOf(" new c"));
        System.out.println(str.toLowerCase());
        System.out.println(str.length());
        System.out.println("\n" + str);
        System.out.println("\t" + str);
        System.out.println("\\" + str);
        System.out.println("/" + str);
        System.out.println(parseName(name));
        System.out.println(parseName(name2));
        System.out.println(parseName(name3));
        System.out.println(transformIWant(statement));
        //prints 10 diff nums starting at 1 (so prints nums between 1 and 10 inclusive)
        System.out.println((int)(Math.random() * 10) + 1); 
        strs.add("Hi");
        strs.add("Hello");
        strs.add("World");
        //strs.add(1, "Noel");
        //set spot can't go higher than length (a.k.a. can't be used as add)
        //strs.set(strs.size()-1, "Replaced");
        //remove works w/ index and item
        //strs.remove(0);
        strs.remove("World");
        //need to import collections class to use
        //Collections.reverse(strs);
        //strs.clear();
        System.out.println(strs.size());
        for (int i = 0; i < strs.size(); i++){
            System.out.println(strs.get(i));
        }
        //System.out.println(strs.isEmpty());
        System.out.println(strs.contains("Hello"));
    }
    
    public static String transformIWant(String statement){
        statement = statement.trim();
        String lastChar = statement.substring(statement.length() - 1);
        if (lastChar.equals(".")){
            //makes statement not include "."
            statement = statement.substring(0, statement.length() - 1);
        }
        int psn = statement.indexOf("I want ");
        String restOfStatement = statement.substring(psn + 7);
        return "Would you really be happy if you had " + restOfStatement + "?";
    }

    public static String parseName(String name){
        int firstSpace = name.indexOf(" ");
        if (name.indexOf(",") >= 0){
            String lastName = name.substring(0, name.indexOf(","));
            if (name.indexOf(" ", firstSpace + 1) >= 0){ 
                int secondSpace = name.indexOf(" ", firstSpace + 1);
                String firstName = name.substring(firstSpace + 1, secondSpace);
                String middleName = name.substring(secondSpace + 1);
                //System.out.println(firstName);
                //System.out.println(middleName);
                //System.out.println(lastName);
            } else {
                String firstName = name.substring(firstSpace + 1);
                //System.out.println(firstName);
                //System.out.println(lastName);
            }
        } else {
            int secondSpace = name.indexOf(" ", firstSpace + 1);
            String firstName = name.substring(0, firstSpace);
            String middleName = name.substring(firstSpace + 1, secondSpace);
            String lastName = name.substring(secondSpace + 1);
            //System.out.println(firstName);
            //System.out.println(middleName);
            //System.out.println(lastName);
        }
        return "";
    }
}


