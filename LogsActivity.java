package com.example.joytracker;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import java.util.Scanner;

public class LogsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logs);

    }

    public void openHomeActivity(View view) {
        startActivity(new Intent(this, HomeActivity.class));
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int total;
        int userPoints = 0;
        boolean gold = false;
        boolean silver = false;
        boolean bronze = false;
        int insta = scnr.nextInt();
        int tiktok = scnr.nextInt();
        int snap = scnr.nextInt();
        int facebook = scnr.nextInt();
        int twitter = scnr.nextInt();
        int reddit = scnr.nextInt();
        total = insta + tiktok + snap + facebook + twitter  + reddit;

        if(total <= 6){
            gold = true;
            userPoints = 100;
        }
        else if((total > 6) && (total <= 10)) {
            silver = true;
            userPoints = 50;
        }
        else if(total >= 11){
            bronze = true;
            userPoints = 25;
        }
    }
}