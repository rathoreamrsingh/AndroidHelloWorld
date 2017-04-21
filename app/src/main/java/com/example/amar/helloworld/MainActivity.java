package com.example.amar.helloworld;

import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    public static final String Tag = "Main_Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(Tag,"This is in on create");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(Tag, "Inside on start ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(Tag, "Insided on restart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(Tag, "Inside on resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(Tag,"Inside on pause");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(Tag,"Inside on stop ha ha :)");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(Tag,"Inside on destroy...");
    }

    @Override
    public void onPostCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onPostCreate(savedInstanceState, persistentState);
        Log.d(Tag, "Inside on post create...");
    }
}
