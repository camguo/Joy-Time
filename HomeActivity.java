package com.example.joytracker;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

    }

    public void openLogsActivity(View view) {
        startActivity(new Intent(this, LogsActivity.class));
    }

    public void openLeaderboardActivity(View view) {
        startActivity(new Intent(this, LeaderboardActivity.class));
    }

    public void openAchievementsActivity(View view) {
        startActivity(new Intent(this, AchievementsActivity.class));
    }

    public void openSettingsActivity(View view) {
        startActivity(new Intent(this, SettingsActivity.class));
    }
}