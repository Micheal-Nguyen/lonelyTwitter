package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class EditTweetActivity extends Activity {


    private TextView tweetView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);
        tweetView = (TextView) findViewById(R.id.tweet);
        Intent intent = getIntent();
        String tweetString = intent.getStringExtra("intent");
        tweetView.setText(tweetString);

    }


}
