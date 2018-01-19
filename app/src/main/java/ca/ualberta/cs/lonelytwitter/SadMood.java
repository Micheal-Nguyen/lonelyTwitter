package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by mlnguyen on 1/18/18.
 */

public class SadMood extends currentMood {
    public SadMood(Date date){
        super(date);
    }

    @Override
    public String setMood() {
        currentMood = "Sad";
        return currentMood;
    }

}
