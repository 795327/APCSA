
/**
 * Cell
 * 
 * @author (Noel Salmeron) 
 * @version (1126)
 */
public class Cell
{
    // instance variables - replace the example below with your own
    private int x;
    private static Cell[] neighbors;

    /**
     * Constructor for objects of class Cell
     */
    public Cell(int a)    {
        x = a;
        neighbors = new Cell[4];// North, East, South, and West only 
    }

    public int getInt(){
        return x;
    }

    public static void setNeighbors(int n, int e, int s, int w){
        neighbors[0] = new Cell(n);
        neighbors[1] = new Cell(e);
        neighbors[2] = new Cell(s);
        neighbors[3] = new Cell(w);
    }

    public static int getNeighbors(){
        return neighbors[0].getInt();
    }
}
