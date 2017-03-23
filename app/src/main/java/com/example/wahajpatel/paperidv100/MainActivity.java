package com.example.wahajpatel.paperidv100;

// Import Java Programs and Activity
import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Bundle;

// Defining variable name and code for Login Screen
public class MainActivity extends Activity  {

    // Creating symbolic variables
    Button b1;
    EditText ed1,ed2;

    // Defining xml (layout) file associated with the java code file
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Defining Symbolic variables
        b1 = (Button)findViewById(R.id.button1);
        ed1 = (EditText)findViewById(R.id.editText);
        ed2 = (EditText)findViewById(R.id.editText2);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //When b1 (Enter button to try login combination) is pressed
                if(ed1.getText().toString().equals("admin") && //If the user name is admin
                        ed2.getText().toString().equals("admin")) { //Id the password is admin
                    Toast.makeText(getApplicationContext(),
                            "Redirecting...",Toast.LENGTH_SHORT).show(); // Create redirect method
                    Intent myIntent = new Intent(v.getContext(), Screen2.class); // Switch to second screen
                    startActivityForResult(myIntent, 0);
                }else{
                    //If user and password is wrong, create Wrong Credential message
                    Toast.makeText(getApplicationContext(), "Wrong Credentials",Toast.LENGTH_SHORT).show();

                }
            }
        });

    }
}

