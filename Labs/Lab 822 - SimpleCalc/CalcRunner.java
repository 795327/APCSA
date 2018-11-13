
/**
 * Simple Calculator
 * 
 * @author (Noel Salmeron) 
 * @version (822)
 */
public class CalcRunner
{
    public static void main(){
       SimpleCalc cr = new SimpleCalc();
       System.out.println(cr.add(20, 4));
       System.out.println(cr.subtract(20, 4));
       System.out.println(cr.multiply(20, 4));
       System.out.println(cr.divide(20, 4));
       System.out.println(cr.moduloDivide(20, 4));
    }
}
