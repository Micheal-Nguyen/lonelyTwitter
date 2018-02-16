package ca.ualberta.cs.lonelytwitter;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

/**
 * Created by mlnguyen on 2/15/18.
 */

public class TweetList {

    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public void add(Tweet tweet) {
        if(tweets.contains(tweet)){
            throw new IllegalArgumentException();
        }
        else{
            tweets.add(tweet);
        }
    }

    public boolean hasTweet(Tweet tweet){
        return tweets.contains(tweet);
    }

    public ArrayList<Tweet> getTweet(){
        Collections.sort(tweets);
        return tweets;
    }

    public void delete(Tweet tweet){
        tweets.remove(tweet);

    }

    public int getCount(){
        int count = 0;
        for(int i=0; i<tweets.size(); i++){
            count++;
        }
        return count;

    }

}
