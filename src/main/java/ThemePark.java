import attractions.Attraction;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;

    public ThemePark(ArrayList attractions, ArrayList stalls){
        this.attractions = attractions;
        this.stalls = stalls;
    }

    public ArrayList getAttractions() {
        return attractions;
    }

    public ArrayList getStalls() {
        return this.stalls;
    }

//    public ArrayList getReviewed(){
//        return
//    }
}
