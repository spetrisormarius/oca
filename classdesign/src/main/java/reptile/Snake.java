package reptile;

import java.io.IOException;
import reptile.Reptile;

public class Snake extends Reptile {

    protected boolean hasLegs() {
        return false;
    }

//    protected boolean hasLegs() throws IOException{ //  D N C
//        return false;
//    }

    protected double getWeight() throws InsufficientDataException, IOException{
        return 2;
    }

//    protected double getWeight() throws Throwable{  //DNC
//        return 2;
//    }
}
