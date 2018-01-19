package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by mlnguyen on 1/18/18.
 */

public class HappyMood extends currentMood {
    public HappyMood(Date date){
        super(date);

    }
    @Override
    public String setMood() {
        currentMood = "Happy";
        return currentMood;
    }

}
