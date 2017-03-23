package com.example.wahajpatel.paperidv100;

/**
 * Created by wahajpatel on 2/6/17.
 */

// Import Java Programs and Activity
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

// Defining variable name and code for Screen that lets user choose to create a RedCap Dictionary or Fill Out Assessment
public class Screen2 extends Activity {
    // Creating symbolic variables
    Button s1;
    Button s2;

    /**
     * Called when the activity is first created.
     */
    // Defining xml (layout) file associated with the java code file
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen2);

        Button next = (Button) findViewById(R.id.screenbutton2);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {//When screenbutton2 (RedCap Dictionary button) is pressed
                Intent intent = new Intent();
                setResult(RESULT_OK, intent);
                finish();
            }

        });

        s1 = (Button)findViewById(R.id.screenbutton1);

        s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {//When screenbutton1 (RedCap Dictionary button) is pressed
                    Intent myIntent = new Intent(v.getContext(), Redcapdictionary.class); //Switch to Redcap Dictionary screen
                    startActivityForResult(myIntent, 0);
                }





                });
    }
}
