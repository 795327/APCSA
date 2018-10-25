
/**
 * Simple Calculator
 * 
 * @author (Noel Salmeron) 
 * @version (822)
 */
public class SimpleCalc
{
    /**
     * Constructor for objects of class SimpleCalc
     */
    public double add(int x, int y){
        return x + y;
    }
    public double subtract(int x, int y){
        return x - y;
    }
    public double multiply(int x, int y){
        return x * y;
    }
    public double divide(int x, int y){
        if (y != 0){
            return x / y;
        }
        return Double.MAX_VALUE;
    }
    public int moduloDivide(int x, int y){
        return x % y;
    }
}
