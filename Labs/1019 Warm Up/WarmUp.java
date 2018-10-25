
/**
 * Write a description of class WarmUp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WarmUp{
    public static void main(){
        String s1 = "ee";
        String s2 = "This week is homecoming wEEk";
        System.out.print(strOcurs(s1, s2));
        System.out.print(strOcursW(s1, s2));
    }

    public static int strOcurs(String a, String b){
        int occurrences = 0;
        b = b.toLowerCase();
        for(int i = 0; i < b.length(); i++){
            if ((b.substring(i, i + a.length())).equals(a)){
                occurrences += 1;
            }
        }
        return occurrences;
    }
    
    public static int strOcursW(String a, String b){
        int occurrences = 0;
        b = b.toLowerCase();
        int i = 0;
        while (i < b.length()){
            
        }
        return occurrences;
    }
}
