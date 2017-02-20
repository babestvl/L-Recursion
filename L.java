import java.util.Scanner;
/**
 * This class is the class that draw L using stdDraw
 * @author Nutthapol Sinthaveelert 5810546641
 *
 */
public class L {

    /**
     * Constructor for drawing the L shape in Q1
     * @param x x-coordinate
     * @param y y-coordinate
     */
    public static void drawLQ1(double x, double y) {

        double x1, x2, x3, x4, x5, x6, y1, y2, y3, y4, y5, y6;
        x1 = x;
        y1 = y;
        x2 = x;
        y2 = y + 1;
        x3 = x - 1;
        y3 = y + 1;
        x4 = x - 1;
        y4 = y - 1;
        x5 = x + 1;
        y5 = y - 1;
        x6 = x + 1;
        y6 = y;
        double[] xArr = new double[] { x1, x2, x3, x4, x5, x6 };
        double[] yArr = new double[] { y1, y2, y3, y4, y5, y6 };
        StdDraw.polygon(xArr, yArr);
    }

    /**
     * Constructor for drawing the L shape in Q2
     * @param x x-coordinate
     * @param y y-coordinate
     */
    public static void drawLQ2(double x, double y) {

        double x1, x2, x3, x4, x5, x6, y1, y2, y3, y4, y5, y6;
        x1 = x;
        y1 = y;
        x2 = x - 1;
        y2 = y;
        x3 = x - 1;
        y3 = y - 1;
        x4 = x + 1;
        y4 = y - 1;
        x5 = x + 1;
        y5 = y + 1;
        x6 = x;
        y6 = y + 1;
        double[] xArr = new double[] { x1, x2, x3, x4, x5, x6 };
        double[] yArr = new double[] { y1, y2, y3, y4, y5, y6 };
        StdDraw.polygon(xArr, yArr);
    }

    /**
     * Constructor for drawing the L shape in Q3
     * @param x x-coordinate
     * @param y y-coordinate
     */
    public static void drawLQ3(double x, double y) {

        double x1, x2, x3, x4, x5, x6, y1, y2, y3, y4, y5, y6;
        x1 = x;
        y1 = y;
        x2 = x - 1;
        y2 = y;
        x3 = x - 1;
        y3 = y + 1;
        x4 = x + 1;
        y4 = y + 1;
        x5 = x + 1;
        y5 = y - 1;
        x6 = x;
        y6 = y - 1;
        double[] xArr = new double[] { x1, x2, x3, x4, x5, x6 };
        double[] yArr = new double[] { y1, y2, y3, y4, y5, y6 };
        StdDraw.polygon(xArr, yArr);
    }

    /**
     * Constructor for drawing the L shape in Q4
     * @param x x-coordinate
     * @param y y-coordinate
     */
    public static void drawLQ4(double x, double y) {

        double x1, x2, x3, x4, x5, x6, y1, y2, y3, y4, y5, y6;
        x1 = x;
        y1 = y;
        x2 = x + 1;
        y2 = y;
        x3 = x + 1;
        y3 = y + 1;
        x4 = x - 1;
        y4 = y + 1;
        x5 = x - 1;
        y5 = y - 1;
        x6 = x;
        y6 = y - 1;
        double[] xArr = new double[] { x1, x2, x3, x4, x5, x6 };
        double[] yArr = new double[] { y1, y2, y3, y4, y5, y6 };
        StdDraw.polygon(xArr, yArr);
    }

    /**
     * Constructor for plot and throw the value to drawL method
     * @param n number of recur round
     * @param xPoint point of blank space in x-axis
     * @param yPoint point of blank space in y-axis
     * @param xLeft minimum value in x-axis
     * @param yBottom minimum value in y-axis
     * @param xRight maximum value in x-axis
     * @param yTop maximum value in y-axis
     */
    public static void plot(int n, double xPoint, double yPoint, double xLeft, double yBottom, double xRight,
                            double yTop) {

        if (n == 0)
            return;

        //calculate Middle
        double xMiddle = ((xRight - xLeft) / 2) + xLeft;
        double yMiddle = ((yTop - yBottom) / 2) + yBottom;

        // Q1
        if (xPoint > xMiddle && yPoint > yMiddle) {

            drawLQ1(xMiddle, yMiddle);

            plot(n - 1, xPoint, yPoint, xMiddle, yMiddle, xRight, yTop); // Q1
            plot(n - 1, xMiddle - 0.5, yMiddle, xLeft, yMiddle, xMiddle, yTop); // Q2
            plot(n - 1, xMiddle - 0.5, yMiddle, xLeft, yBottom, xMiddle, yMiddle); // Q3
            plot(n - 1, xMiddle, yMiddle, xMiddle, yBottom, xRight, yMiddle); // Q4

        }
        // Q2
        else if (xPoint < xMiddle && yPoint > yMiddle) {

            drawLQ2(xMiddle, yMiddle);

            plot(n - 1, xMiddle, yMiddle + 0.5, xMiddle, yMiddle, xRight, yTop); // Q1
            plot(n - 1, xPoint, yPoint, xLeft, yMiddle, xMiddle, yTop); // Q2
            plot(n - 1, xMiddle - 0.5, yMiddle, xLeft, yBottom, xMiddle, yMiddle); // Q3
            plot(n - 1, xMiddle, yMiddle, xMiddle, yBottom, xRight, yMiddle); // Q4

        }
        // Q3
        else if (xPoint < xMiddle && yPoint < yMiddle) {

            drawLQ3(xMiddle, yMiddle);

            plot(n - 1, xMiddle, yMiddle + 0.5, xMiddle, yMiddle, xRight, yTop); // Q1
            plot(n - 1, xMiddle - 0.5, yMiddle, xLeft, yMiddle, xMiddle, yTop); // Q2
            plot(n - 1, xPoint, yPoint, xLeft, yBottom, xMiddle, yMiddle); // Q3
            plot(n - 1, xMiddle, yMiddle, xMiddle, yBottom, xRight, yMiddle); // Q4

        }
        // Q4
        else if (xPoint > xMiddle && yPoint < yMiddle) {

            drawLQ4(xMiddle, yMiddle);

            plot(n - 1, xMiddle, yMiddle + 0.5, xMiddle, yMiddle, xRight, yTop); // Q1
            plot(n - 1, xMiddle - 0.5, yMiddle, xLeft, yMiddle, xMiddle, yTop); // Q2
            plot(n - 1, xMiddle - 0.5, yMiddle, xLeft, yBottom, xMiddle, yMiddle); // Q3
            plot(n - 1, xPoint, yPoint, xMiddle, yBottom, xRight, yMiddle); // Q4

        }

    }

    /**
     * Main method
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input 2,4,8,16,32 or 64: ");
        int size = scan.nextInt();

        //n round
        int n = (int)((Math.log(size))/(Math.log(2)));

        //set pen/board
        StdDraw.setPenRadius(0.005);
        StdDraw.setXscale(0, size);
        StdDraw.setYscale(0, size);

        //random blank point
        double xPoint = (1+(int)(Math.random()*size)) - 0.5;
        double yPoint = (1+(int)(Math.random()*size)) - 0.5;

        double xLeft, xRight, yTop, yBottom;
        xLeft = 0;
        xRight = size;
        yTop = size;
        yBottom = 0;

        //draw box and blank point
        StdDraw.square(size / 2, size / 2, size / 2);
        StdDraw.filledSquare(xPoint, yPoint, 0.5);

        plot(n, xPoint, yPoint, xLeft, yBottom, xRight, yTop);
    }

}
