package Honda;

/**
 * Created by darts on 05.05.17.
 */
public class Circle extends GeoFigure {
    private int diameter;

    Circle(int diameter){
        this.diameter=diameter;
    }

    double perimeter(){
        return 2*3.14*diameter/2;
    }
}
