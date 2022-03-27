package com.example.joytracker;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;

public class JoyTrackerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void openSignInActivity(View view) {
        //TextView text = findViewById(R.id.textView);
        //text.setText("Button clicked");
        startActivity(new Intent(this, SignInActivity.class));
    }
}