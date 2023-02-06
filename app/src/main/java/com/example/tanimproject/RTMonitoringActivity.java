package com.example.tanimproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.VideoView;

public class RTMonitoringActivity extends AppCompatActivity {

    Button front, rear, sentAlert;
    VideoView realtimeVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rtmonitoring);

        InitializeAll();
    }

    private void InitializeAll() {

        front = findViewById(R.id.rtFront);
        rear = findViewById(R.id.rtRear);
        sentAlert = findViewById(R.id.rtSentAlert);

        realtimeVideo = findViewById(R.id.rtVideo);

        front.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(RTMonitoringActivity.this, "Under Construction", Toast.LENGTH_SHORT).show();
            }
        });
        rear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(RTMonitoringActivity.this, "Under Construction", Toast.LENGTH_SHORT).show();
            }
        });
        sentAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(RTMonitoringActivity.this, "Under Construction", Toast.LENGTH_SHORT).show();
            }
        });
    }
}