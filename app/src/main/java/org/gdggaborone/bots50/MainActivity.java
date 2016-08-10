package org.gdggaborone.bots50;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button = (Button)findViewById(R.id.send_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText editText = (EditText)findViewById(R.id.edTV);
                TextView textView = (TextView)findViewById(R.id.messageTV);
                Spinner spinner = (Spinner) findViewById(R.id.spinner_towns);

                String name = editText.getText().toString();
                String town = spinner.getSelectedItem().toString();

                Intent intent = new Intent(MainActivity.this, DisplayMessageActivity.class);
                Bundle bundle = new Bundle(5);
                bundle.putString("name",name);
                bundle.putString("town", town);

               intent.putExtra("message",bundle);
                startActivity(intent);


            }
        });
    }





  /*  public void sendMessage(View view) {

        EditText editText = (EditText)findViewById(R.id.edTV);
        TextView textView = (TextView)findViewById(R.id.messageTV);

        String message = editText.getText().toString();

        textView.setText(message);


    }*/
}
