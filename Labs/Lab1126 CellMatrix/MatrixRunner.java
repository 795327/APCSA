
/**
 * MatrixRunner
 * 
 * @author (Noel Salmeron) 
 * @version (1126)
 */
public class MatrixRunner{
    public static void main(){
        CellMatrix cm = new CellMatrix(3, 4);
        Cell[] neighbors = new Cell[4];
        cm.loadMatrix();
        cm.printMatrix();
        cm.loadNeighbors();
        System.out.println("Greatest neighbor value: " + cm.getGreatestNeighbors());
    }
}
