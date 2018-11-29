
/**
 * CellMatrix
 * 
 * @author (Noel Salmeron) 
 * @version (1126)
 */
public class CellMatrix{
    /**
     * +++++++++++++++++++++Instance variables
     */

    private Cell[][] cells;

    /**
     * +++++++++++++++++++++Constructor for objects of class NumberMatrix
     */
    public CellMatrix(int a, int b){
        cells = new Cell[a][b];

    }

    /**
     * +++++++++++++++++++++++++++++++++++++++++++++++++++++++methods
     */
    // Print each row and column of nums to the console
    public void printMatrix(){
        for (int r = 0; r < cells.length; r++){
            for (int c = 0; c < cells[r].length; c++){
                System.out.print(" " + cells[r][c].getInt());
            }
            System.out.println();
        }
    }

    // load nums with random with numbers between 1 and 10 inclusive
    public void loadMatrix(){
        for (int r = 0; r < cells.length; r++){
            for (int c = 0; c < cells[r].length; c++){
                Cell cell = new Cell((int)((Math.random() * 10) + 1));
                cells[r][c] = cell;
            }
        }
    }

    // Finds the sum of each of the neighbors and returns the greatest 
    // neighbor value
    public int getGreatestNeighbors(){
        int greatest = 0;
        for (int r = 0; r < cells.length; r++){
            for (int c = 0; c < cells[r].length; c++){
                if (greatest < cells[r][c].getNeighborSum()){
                    greatest = cells[r][c].getNeighborSum();
                }
                // System.out.println(greatest + ", ");
            }
        }
        
        return greatest;
    }

    //  Load neighbor cells into the neighbors array
    public void loadNeighbors(){
        for (int r = 0; r < cells.length; r++){
            for (int c = 0; c < cells[r].length; c++){
                // north
                if (r > 0){
                    cells[r][c].getNeighbors()[0] = cells[r - 1][c];
                }

                // east
                if (c > 0){
                    cells[r][c].getNeighbors()[1] = cells[r][c - 1];
                }

                // south
                if (r < cells.length - 1){
                    cells[r][c].getNeighbors()[2] = cells[r + 1][c];
                }

                // west
                if (c < cells[0].length - 1){
                    cells[r][c].getNeighbors()[3] = cells[r][c + 1];
                }
            }
        }
    }
}


