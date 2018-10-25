
/**
 * BallRunner
 *
 * @author (Noel Salmeron)
 * @version (919)
 */
public class BallRunner{
    public static void activity1(){
        //declares and initializes parameters for BallBot, which makes a ball, and creates a new ball
        BallWorld ballWorld = new BallWorld(200, 200);
        TGPoint startPoint = new TGPoint(0, 0);
        BallBot ballBot = new BallBot(ballWorld, startPoint, 0.0, 25);

        //infinite while loop to keep ball moving until program is ended
        while (true){
            if (ballBot.canMoveForward(ballWorld)){
                ballBot.moveForward();
            } else {
                //turns the ball 90 degrees when it hits a wall
                ballBot.setHeading(ballBot.getHeading() + 90);
            }
        }

    }

    //limits the amount of balls/BallBot's on the screen to the length of ballBotArray
    public static int findFreeBallBotIndex(BallBot[] ballBotArray){
        for (int i = 0; i < ballBotArray.length; i++){
            //checks for an empty container in ballBotArray and returns i to indicate that empty space
            if (ballBotArray[i] == null){
                return i;
            }
        }
        return ballBotArray.length;
    }

    //finds the distance between two different points passed in through the parameters
    public double distanceBetweenPoints (TGPoint point1, TGPoint point2){
        //finds the differences between the x and y values of the two points before using distance formula to make the formula look less messy
        double xDifference = point1.x - point2.x;
        double yDifference = point1.y - point2.y;

        //distance formula to find the distance between two different points
        return Math.sqrt(Math.pow(xDifference, 2) + Math.pow(yDifference, 2));
    }

    //checks if there is enough space around a point for a new ball to be created
    public boolean entranceClear (BallBot[] ballBotArray, TGPoint entrancePoint){
        for (int i = 0; i < ballBotArray.length; i++){

            //checks if the container in the array has a ball/BallBot
            if (ballBotArray[i] != null){

                //a formula to check if there is enough space for a new ball to be created at entrancePoint by checking if the distance from the entrance to the ball is less than 2 times the ball’s radius
                if (distanceBetweenPoints(ballBotArray[i].getPoint(), entrancePoint) < ballBotArray[i].getRadius() * 2){
                    return false;
                }
            }
        }
        //indicates that there is enough space for a new ball to be created at the entrancePoint after checking the location of every ball already on-screen
        return true;
    }

    //makes balls/BallBot's bounce off each other if they're touching
    public BallBot ballBotToBounceOff (BallBot ballBot, BallBot[] ballBotArray){
        //assigns the ball's current location and its future location as it moves forward to 2 local variables
        TGPoint firstPoint = ballBot.getPoint();
        TGPoint nextPoint = ballBot.forwardPoint();
        BallBot returningBall = null;

        for (int i = 0; i < ballBotArray.length; i++){
            //checks if the container of ballBotArray called actually has a ball/Ballbot in it and that the two balls taken in aren't the same
            BallBot otherBallBot = ballBotArray[i];
            if (otherBallBot != null && otherBallBot != ballBot){
                //finds the distance between the two balls
                double currentDistance = distanceBetweenPoints(ballBot.getPoint(), otherBallBot.getPoint());

                //makes sure a condition needed for bouncing 2 balls is met
                if (currentDistance <= (ballBotArray[i].getRadius() + otherBallBot.getRadius())){
                    //finds the distance between the two balls after moving forward
                    double nextDistance = distanceBetweenPoints(nextPoint, otherBallBot.getPoint());

                    //another condition that indicates that the two balls must bounce off each other
                    if (nextDistance <= currentDistance){
                        returningBall = otherBallBot;
                    }
                }
            }
        }
        return returningBall;
    }

    public static void run(){
        //creates a window with a given size
        BallWorld ballWorld = new BallWorld(200, 200);

        //picks where new balls/BallBot's will be created in the window
        TGPoint entrancePoint = new TGPoint(0, 0);

        //creates an array of balls/BallBot's
        BallBot[] ballBotArray = new BallBot[10];

        //creates an object specifically used to call the method findFreeBallBotIndex
        BallRunner ballRunner = new BallRunner();

        while (true){
            int freeBallBotIndex = BallRunner.findFreeBallBotIndex(ballBotArray);

            //checks if the entrancePoint is clear for a new ball to created
            if (ballRunner.entranceClear(ballBotArray, entrancePoint) == true){
                //checks if another ball can be created according to the length of ballBotArray
                if (freeBallBotIndex < ballBotArray.length){
                    //creates a new BallBot in the free index in ballBotArray
                    ballBotArray[freeBallBotIndex] = new BallBot(ballWorld, entrancePoint, Math.random()*360, 25);
                } 
            }

            //traverses ballBotArray to check if the ball/BallBot can move forward or if it needs to bounce off a wall or another ball and change direction to a random value between 0 and 360
            for (int index = 0; index < ballBotArray.length; index++){
                if (ballBotArray[index] != null){
                    if (ballBotArray[index].canMoveForward(ballWorld) == true && ballRunner.ballBotToBounceOff(ballBotArray[index], ballBotArray) == null){
                        ballBotArray[index].moveForward();
                    } else {
                        ballBotArray[index].setHeading(Math.random()*360);
                    }
                }
            }
        }
    }
}

