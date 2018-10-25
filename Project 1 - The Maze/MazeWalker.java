
/**
 * MazeWalker
 * 
 * @author (Noel Salmeron) 
 * @version (830)
 */
public class MazeWalker{
    /**
     * Constructor for objects of class MazeWalker
     */
    public MazeWalker(){
        //
    }

    public void walkMaze(Maze maze, MazeBot mazeBot){
        while(mazeBot.didNotReachGoal()){
            while(mazeBot.canMoveForward()){
                mazeBot.moveForward();
            }
            if(mazeBot.canMoveForward() == false){
                mazeBot.turnRight();
                mazeBot.turnRight();
                mazeBot.turnRight();
            }
            if(mazeBot.canMoveForward() == false){
                mazeBot.turnRight();
                mazeBot.turnRight();
            }
        }
        if(mazeBot.didReachGoal() == true){
            mazeBot.signalSuccess();
        }else{
            mazeBot.signalError();
        }
    }
    
    public static void run(){
        Maze maze = new Maze();
        MazeWalker mazeWalker = new MazeWalker();
        mazeWalker.walkMaze(maze, maze.getMazeBot());
    }
}



