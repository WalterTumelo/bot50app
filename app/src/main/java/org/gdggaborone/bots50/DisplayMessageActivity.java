package org.gdggaborone.bots50;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        Intent intent = getIntent();
        Bundle message = intent.getBundleExtra("message");
        String name = message.getString("name");
        String town = message.getString("town");

        TextView messageTV = (TextView)findViewById(R.id.messageTV);
        TextView townTV = (TextView)findViewById(R.id.townTV);
        messageTV.setText(name);
        townTV.setText(town);
    }
}
