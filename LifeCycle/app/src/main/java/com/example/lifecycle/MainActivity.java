package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG="LifeCycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(), "OnCreate Called", Toast.LENGTH_LONG).show();
        Log.d(TAG, "onCreate called");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Toast.makeText(getApplicationContext(), "OnStart Called", Toast.LENGTH_LONG).show();
        Log.d(TAG, "onStart called");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Toast.makeText(getApplicationContext(), "OnRestart Called", Toast.LENGTH_LONG).show();
        Log.d(TAG, "onRestart called");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Toast.makeText(getApplicationContext(), "OnPause Called", Toast.LENGTH_LONG).show();
        Log.d(TAG, "onPause called");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "OnDestroy Called", Toast.LENGTH_LONG).show();
        Log.d(TAG, "onDestroy called");
    }
}