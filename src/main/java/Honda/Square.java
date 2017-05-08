package Honda;

/**
 * Created by darts on 05.05.17.
 */
public class Square extends GeoFigure{
    private int sideOne;

    Square(int sideOne){
        this.sideOne=sideOne;
    }

    int perimeter(){
        return sideOne*sideOne;
    }

}
