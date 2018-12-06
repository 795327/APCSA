import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
    ///////////////////// constructors //////////////////////////////////

    /**
     * Constructor that takes no arguments 
     */
    public Picture ()
    {
        /* not needed but use it to show students the implicit call to super()
         * child constructors always call a parent constructor 
         */
        super();  
    }

    /**
     * Constructor that takes a file name and creates the picture 
     * @param fileName the name of the file to create the picture from
     */
    public Picture(String fileName)
    {
        // let the parent class handle this fileName
        super(fileName);
    }

    /**
     * Constructor that takes the width and height
     * @param height the height of the desired picture
     * @param width the width of the desired picture
     */
    public Picture(int height, int width)
    {
        // let the parent class handle this width and height
        super(width,height);
    }

    /**
     * Constructor that takes a picture and creates a 
     * copy of that picture
     * @param copyPicture the picture to copy
     */
    public Picture(Picture copyPicture)
    {
        // let the parent class do the copy
        super(copyPicture);
    }

    /**
     * Constructor that takes a buffered image
     * @param image the buffered image to use
     */
    public Picture(BufferedImage image)
    {
        super(image);
    }

    ////////////////////// methods ///////////////////////////////////////

    /**
     * Method to return a string with information about this picture.
     * @return a string with information about the picture such as fileName,
     * height and width.
     */
    public String toString()
    {
        String output = "Picture, filename " + getFileName() + 
            " height " + getHeight() 
            + " width " + getWidth();
        return output;

    }

    /** Method to set the blue to 0 */
    public void zeroBlue()
    {
        Pixel[][] pixels = this.getPixels2D();
        for (Pixel[] rowArray : pixels)
        {
            for (Pixel pixelObj : rowArray)
            {
                pixelObj.setBlue(0);
            }
        }
    }

    /** Method to set the red to 0 */
    public void zeroRed()
    {
        Pixel[][] pixels = this.getPixels2D();
        for (Pixel[] rowArray : pixels)
        {
            for (Pixel pixelObj : rowArray)
            {
                pixelObj.setRed(0);
            }
        }
    }

    /** Method to set the green to 0 */
    public void zeroGreen()
    {
        Pixel[][] pixels = this.getPixels2D();
        for (Pixel[] rowArray : pixels)
        {
            for (Pixel pixelObj : rowArray)
            {
                pixelObj.setGreen(0);
            }
        }
    }

    /** Method to negate all colors */
    public void negate()
    {
        Pixel[][] pixels = this.getPixels2D();
        for (Pixel[] rowArray : pixels)
        {
            for (Pixel pixelObj : rowArray)
            {
                pixelObj.setRed(255 - pixelObj.getRed());
                pixelObj.setGreen(255 - pixelObj.getGreen());
                pixelObj.setBlue(255 - pixelObj.getBlue());
            }
        }
    }

    /** Method to grayscale image */
    public void grayscale()
    {
        Pixel[][] pixels = this.getPixels2D();
        int avg = 0;
        for (Pixel[] rowArray : pixels)
        {
            for (Pixel pixelObj : rowArray)
            {
                avg = (pixelObj.getRed() + pixelObj.getGreen() + pixelObj.getBlue()) / 3;
                pixelObj.setRed(avg);
                pixelObj.setGreen(avg);
                pixelObj.setBlue(avg);
            }
        }
    }

    /** Method to make fish in water.jpg more visible by adding more red */
    public void fixUnderwater()
    {
        Pixel[][] pixels = this.getPixels2D();
        int avg = 0;
        for (Pixel[] rowArray : pixels)
        {
            for (Pixel pixelObj : rowArray)
            {
                pixelObj.setRed(pixelObj.getRed() + 120);
            }
        }
    }

    /** Method that mirrors the picture around a 
     * vertical mirror in the center of the picture
     * from left to right */
    public void mirrorVertical()
    {
        Pixel[][] pixels = this.getPixels2D();
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        int width = pixels[0].length;
        for (int row = 0; row < pixels.length; row++)
        {
            for (int col = 0; col < width / 2; col++)
            {
                leftPixel = pixels[row][col];
                rightPixel = pixels[row][width - 1 - col];
                rightPixel.setColor(leftPixel.getColor());
            }
        } 
    }

    /** Method that mirrors the picture around a 
     * vertical mirror in the center of the picture
     * from right to left */
    public void mirrorVerticalRightToLeft()
    {
        Pixel[][] pixels = this.getPixels2D();
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        int width = pixels[0].length;
        for (int row = 0; row < pixels.length; row++)
        {
            for (int col = 0; col < width / 2; col++)
            {
                rightPixel = pixels[row][col];
                leftPixel = pixels[row][width - 1 - col];
                rightPixel.setColor(leftPixel.getColor());
            }
        } 
    }

    /** Method that mirrors the picture around a 
     * horizontal mirror in the center of the picture
     * from top to bottom */
    public void mirrorHorizontal()
    {
        Pixel[][] pixels = this.getPixels2D();
        Pixel topPixel = null;
        Pixel bottomPixel = null;
        int height = pixels.length;
        for (int row = 0; row < pixels.length; row++)
        {
            for (int col = 0; col < pixels[0].length; col++)
            {
                topPixel = pixels[row][col];
                bottomPixel = pixels[height - 1 - row][col];
                bottomPixel.setColor(topPixel.getColor());
            }
        } 
    }

    /** Method that mirrors the picture around a 
     * horizontal mirror in the center of the picture
     * from bottom to top */
    public void mirrorHorizontalBotToTop()
    {
        Pixel[][] pixels = this.getPixels2D();
        Pixel topPixel = null;
        Pixel bottomPixel = null;
        int height = pixels.length;
        for (int row = 0; row < pixels.length; row++)
        {
            for (int col = 0; col < pixels[0].length; col++)
            {
                topPixel = pixels[row][col];
                bottomPixel = pixels[height - 1 - row][col];
                topPixel.setColor(bottomPixel.getColor());
            }
        } 
    }

    /** Method that mirrors the picture around a 
     * diagonal mirror in the center of the picture
     * from bottom left to top right */
    public void mirrorDiagonal()
    {
        Pixel[][] pixels = this.getPixels2D();
        Pixel topRightPixel = null;
        Pixel bottomLeftPixel = null;
        int totalLength;
        if (pixels.length < pixels[0].length){
            totalLength = pixels.length;
        } else {
            totalLength = pixels[0].length;
        }
        for (int row = 0; row < totalLength; row++)
        {
            for (int col = row; col < totalLength; col++)
            {
                topRightPixel = pixels[col][row];
                bottomLeftPixel = pixels[row][col];
                bottomLeftPixel.setColor(topRightPixel.getColor());
            }
        } 
    }

    /** Mirror just part of a picture of a temple */
    public void mirrorTemple()
    {
        int mirrorPoint = 276;
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        int count = 0;
        Pixel[][] pixels = this.getPixels2D();

        // loop through the rows
        for (int row = 27; row < 97; row++)
        {
            // loop from 13 to just before the mirror point
            for (int col = 13; col < mirrorPoint; col++)
            {
                count += 1;
                leftPixel = pixels[row][col];      
                rightPixel = pixels[row]                       
                [mirrorPoint - col + mirrorPoint];
                rightPixel.setColor(leftPixel.getColor());
            }
        }
        System.out.println(count);
    }

    /** Method that mirrors the picture around a 
     * horizontal mirror in the center of the picture
     * from bottom to top */
    public void mirrorArms()
    {
        int mirrorPointA = 193;
        Pixel topPixel = null;
        Pixel bottomPixel = null;
        Pixel[][] pixels = this.getPixels2D();

        // left arm
        for (int row = 159; row < mirrorPointA; row++)
        {
            for (int col = 103; col < 170; col++)
            {
                topPixel = pixels[row][col];      
                bottomPixel = pixels[mirrorPointA - row + mirrorPointA][col];
                bottomPixel.setColor(topPixel.getColor());
            }
        }

        int mirrorPointB = 198;
        Pixel topPixelB = null;
        Pixel bottomPixelB = null;

        //right arm
        for (int row = 170; row < mirrorPointB; row++)
        {
            for (int col = 239; col < 294; col++)
            {
                topPixelB = pixels[row][col];      
                bottomPixelB = pixels[mirrorPointB - row + mirrorPointB][col];
                bottomPixelB.setColor(topPixelB.getColor());
            }
        }
    }

    /** Mirror just part of a picture of a temple */
    public void mirrorGull()
    {
        int mirrorPoint = 345;
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        Pixel[][] pixels = this.getPixels2D();

        for (int row = 235; row < 323; row++)
        {
            for (int col = 238; col < mirrorPoint; col++)
            {
                rightPixel = pixels[row][col];      
                leftPixel = pixels[row][mirrorPoint - col + mirrorPoint / 3];
                leftPixel.setColor(rightPixel.getColor());
            }
        }
    }

    /** copy from the passed fromPic to the
     * specified startRow and startCol in the
     * current picture
     * @param fromPic the picture to copy from
     * @param startRow the start row to copy to
     * @param startCol the start col to copy to
     */
    public void copy(Picture fromPic, 
    int startRow, int startCol)
    {
        Pixel fromPixel = null;
        Pixel toPixel = null;
        Pixel[][] toPixels = this.getPixels2D();
        Pixel[][] fromPixels = fromPic.getPixels2D();
        for (int fromRow = 0, toRow = startRow; 
        fromRow < fromPixels.length &&
        toRow < toPixels.length; 
        fromRow++, toRow++)
        {
            for (int fromCol = 0, toCol = startCol; 
            fromCol < fromPixels[0].length &&
            toCol < toPixels[0].length;  
            fromCol++, toCol++)
            {
                fromPixel = fromPixels[fromRow][fromCol];
                toPixel = toPixels[toRow][toCol];
                toPixel.setColor(fromPixel.getColor());
            }
        }   
    }
    
    /** Method to create a collage of several pictures */
    public void createCollage()
    {
        Picture flower1 = new Picture("flower1.jpg");
        Picture flower2 = new Picture("flower2.jpg");
        this.copy(flower1,0,0);
        this.copy(flower2,100,0);
        this.copy(flower1,200,0);
        Picture flowerNoBlue = new Picture(flower2);
        flowerNoBlue.zeroBlue();
        this.copy(flowerNoBlue,300,0);
        this.copy(flower1,400,0);
        this.copy(flower2,500,0);
        this.mirrorVertical();
        this.write("collage.jpg");
    }
    
    public void copyB(Picture fromPic, int startRow, int endRow, int startCol, int endCol)
    {
        Pixel fromPixel = null;
        Pixel toPixel = null;
        Pixel[][] toPixels = this.getPixels2D();
        Pixel[][] fromPixels = fromPic.getPixels2D();
        for (int fromRow = 0, toRow = startRow; 
        fromRow < fromPixels.length &&
        toRow < endRow; 
        fromRow++, toRow++)
        {
            for (int fromCol = 0, toCol = startCol; 
            fromCol < fromPixels[0].length &&
            toCol < endCol;  
            fromCol++, toCol++)
            {
                fromPixel = fromPixels[fromRow][fromCol];
                toPixel = toPixels[toRow][toCol];
                toPixel.setColor(fromPixel.getColor());
            }
        }   
    }

    /** Method to create a collage of several pictures */
    public void createCollageB()
    {
        Picture flower1 = new Picture("flower1.jpg");
        Picture flower2 = new Picture("flower2.jpg");
        this.copyB(flower1, 0, 100, 0, 50);
        this.copyB(flower2, 100, 200, 0, 75);
        Picture flowerNoBlue = new Picture(flower2);
        flowerNoBlue.zeroBlue();
        this.copyB(flowerNoBlue, 200, 300, 0, 75);
        this.mirrorVertical();
        this.write("collage.jpg");
    }
    
    /** Method to create an original collage of (at least 3) pictures 
     *  copied 3 times w/ 3 different manipulations
     *  and (at least 1) mirroring
     */
    public void myCollage()
    {
        Picture robot = new Picture("robot.jpg");
        Picture robotGrayscale = new Picture("robot.jpg");
        robotGrayscale.grayscale();
        Picture robotNoGreen = new Picture("robot.jpg");
        robotNoGreen.zeroGreen();
        Picture robotNoBlue = new Picture("robot.jpg");
        robotNoBlue.zeroBlue();
        this.copyB(robot, 120, 345, 250, 450);
        this.copyB(robotGrayscale, 80, 220, 120, 345);
        this.copyB(robotNoGreen, 220, 340, 120, 345);
        this.copyB(robotNoBlue, 300, 380, 170, 240);
        this.mirrorVertical();
        this.write("collage.jpg");
    }

    /** Method to show large changes in color 
     * @param edgeDist the distance for finding edges
     */
    public void edgeDetection(int edgeDist)
    {
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        Pixel[][] pixels = this.getPixels2D();
        Color rightColor = null;
        for (int row = 0; row < pixels.length; row++)
        {
            for (int col = 0; 
            col < pixels[0].length-1; col++)
            {
                leftPixel = pixels[row][col];
                rightPixel = pixels[row][col+1];
                rightColor = rightPixel.getColor();
                if (leftPixel.colorDistance(rightColor) > 
                edgeDist)
                    leftPixel.setColor(Color.BLACK);
                else
                    leftPixel.setColor(Color.WHITE);
            }
        }
    }

    /* Main method for testing - each class in Java can have a main 
     * method 
     */
    public static void main(String[] args) 
    {
        Picture beach = new Picture("beach.jpg");
        beach.explore();
        beach.zeroBlue();
        beach.explore();
    }

} // this } is the end of class Picture, put all new methods before this
