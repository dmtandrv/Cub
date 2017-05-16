package Honda;
import java.util.Scanner;
public class GeoMain {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        //square perimeter i/o
        System.out.print("Square side = ");
        int sqrSideLength = scanner.nextInt();
        Square blueSquare = new Square(sqrSideLength);
        System.out.println("Square perimeter = "+blueSquare.perimeter()+"\n");

        //circle length i/o
        System.out.print("Circle diameter = ");
        int circleDiameter =scanner.nextInt();
        Circle redCircle = new Circle(circleDiameter);
        System.out.println("Circle length = "+redCircle.perimeter()+"\n");

        //triangle perimeter i/o
        System.out.print("Triangle sides (ex. 1 2 3) = ");
        int triangleSide1 = scanner.nextInt();
        int triangleSide2 = scanner.nextInt();
        int triangleSide3 = scanner.nextInt();
        Triangle greenTriangle = new Triangle(triangleSide1, triangleSide2, triangleSide3);
        System.out.println("Triangle perimeter = "+greenTriangle.perimeter()+"\n");


        System.out.println("Figures = " + GeoFigure.q);

    }
}
