package Honda;

/**
 * Created by darts on 05.05.17.
 */
public class Triangle extends GeoFigure {
    private int sideOne, sideTwo, sideThree;

    Triangle (int sideOne, int sideTwo, int sideThree){
        this.sideOne=sideOne;
        this.sideTwo=sideTwo;
        this.sideThree=sideThree;
    }



    int perimeter(){
        return sideOne+sideTwo+sideThree;
    }

}
