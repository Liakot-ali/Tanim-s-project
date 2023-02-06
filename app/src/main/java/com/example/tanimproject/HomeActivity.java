package com.example.tanimproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    TextView dailyRecord, position, rtMonitoring;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        dailyRecord = findViewById(R.id.homeDailyRecord);
        position = findViewById(R.id.homeVehiclePosition);
        rtMonitoring = findViewById(R.id.homeRTMonitoring);

        dailyRecord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(HomeActivity.this, "Under Construction", Toast.LENGTH_SHORT).show();
            }
        });
        position.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(HomeActivity.this, "Under Construction", Toast.LENGTH_SHORT).show();
            }
        });
        rtMonitoring.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(HomeActivity.this, "Under Construction", Toast.LENGTH_SHORT).show();
            }
        });

    }
}