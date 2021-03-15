package com.example.twoactivities;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView mCount;
    private int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCount = findViewById(R.id.count);
        count = Integer.parseInt(mCount.getText().toString());
    }

    public void sayhello(View view) {

    }

    public void countUp(View view) {
        ++count;
        mCount.setText("" + count);
    }
}