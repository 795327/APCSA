
/**
 * PrimeNumsRunner
 *
 * @author (Noel Salmeron)
 * @version (1130)
 */
import java.util.ArrayList;
public class PrimeNumsRunner
{
    public static void main(){
       PrimeNums n = new PrimeNums();
       n.setListToNumber(123);
       n.printArrayList();
       n.addNumberToList(180);
       
       n.printArrayList();
    }
}
