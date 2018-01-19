package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by mlnguyen on 1/18/18.
 */


public abstract class currentMood implements Mood {
    protected String currentMood;
    private Date date;


    public currentMood(){
        this.date = new Date();
    }

    public currentMood(Date date){
        this.date = date;
    }



    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMood() {
        return this.currentMood;
    }

    public abstract String setMood();

}

