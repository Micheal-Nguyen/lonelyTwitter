package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by mlnguyen on 1/18/18.
 */

public abstract class Tweet implements Tweetable {

    private String message;
    private Date date;
    private ArrayList<currentMood> moods;

    public Tweet(String message) {
        this.message = message;
        this.date = new Date();
        this.moods = new ArrayList<currentMood>();
    }

    public Tweet (String message, Date date) {
        this.message = message;
        this.date = date;
        this.moods = new ArrayList<currentMood>();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() > 140){
            throw new TweetTooLongException();
        } else{
            this.message = message;
        }
    }



    public abstract Boolean isImportant();

}

