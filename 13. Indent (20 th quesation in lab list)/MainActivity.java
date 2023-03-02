package com.sreesanjay.activitymover;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
	
	Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.nxtBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
            	 // Create the Intent object of MainActivity class  to Second_activity class
            	Intent intent = new Intent(MainActivity.this, NewActivity.class);
            	// start the Intent
                startActivity(intent);
            }
        });
    }


    
}
