package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by mlnguyen on 2/15/18.
 */

public class TweetListTest extends ActivityInstrumentationTestCase2 {
    public TweetListTest()
    {
        super(LonelyTwitterActivity.class);
    }

    public void testAddTweet()
    {
        TweetList tweets = new TweetList();

        Tweet tweet = new NormalTweet("adding a normal Tweet");

        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));

    }

    public void testHasTweet(){

        TweetList tweets = new TweetList();

        Tweet tweet = new NormalTweet("adding a normal Tweet");
        Tweet tweet1 = new NormalTweet("adding a normal Tweet");
        tweets.add(tweet);
        tweets.add(tweet1);
        assertTrue(tweets.hasTweet(tweet1));

    }

    public void testGetTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("adding a normal Tweet");
        Tweet tweet1 = new NormalTweet("adding another one");
        tweets.add(tweet1);
        tweets.add(tweet);
        ArrayList<Tweet> test = tweets.getTweet();

        assertEquals(test.get(0),tweet1);




    }

    public void testDeleteTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("adding a normal Tweet");
        tweets.add(tweet);

        tweets.delete(tweet);
        assertFalse(tweets.hasTweet(tweet));

    }

    public void testGetCount(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("adding a normal Tweet");
        tweets.add(tweet);
        Tweet tweet1 = new NormalTweet("test");
        tweets.add(tweet1);
        int count = tweets.getCount();
        assertTrue(count==2);
    }
}
