package Honda;

public class Main {
    public static void main(String[] args) {

        Square blueSquare=new Square(2);
        System.out.println("1 Square perimeter = "+blueSquare.perimeter());


        Circle redCircle = new Circle(20);
        System.out.println("2 Circle lengh = "+redCircle.perimeter());

        Triangle greenTriangle = new Triangle(4,5,6);
        System.out.println("3 Triangle perimeter = "+greenTriangle.perimeter());


        System.out.println(GeoFigure.q);


    }
}
