
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
                System.out.print(cells[r][c].getInt() + " ");
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
        return Cell.getNeighbors();
    }

    //  Load neighbor cells into the neighbors array
    public void loadNeighbors(){
        int totalNeighbors = 0;
        int north = 0;
        int east = 0;
        int south = 0;
        int west = 0;
        for (int r = 0; r < cells.length; r++){
            for (int c = 0; c < cells[r].length; c++){
                // north
                if (r < cells.length - 1){
                    north = cells[r + 1][c].getInt();
                }

                // east
                if (c < cells[r].length - 1){
                    east = cells[r][c + 1].getInt();
                }

                // south
                if (r > cells.length - 1){
                    south = cells[r - 1][c].getInt();
                }

                // west
                if (c > cells[r].length - 1){
                    west = cells[r][c - 1].getInt();
                }

                // checking if this cell has a greater neighbors
                if ((north + east + south + west) > totalNeighbors){
                    totalNeighbors = north + east + south + west;
                    Cell.setNeighbors(north, east, south, west);
                }
            }
        }
    }
}




