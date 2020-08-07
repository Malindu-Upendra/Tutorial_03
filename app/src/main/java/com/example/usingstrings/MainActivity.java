package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtMsg1 = findViewById(R.id.textView);
        txtMsg1.setText(R.string.Msg1);

        TextView txtMsg2 = findViewById(R.id.textView2);
        txtMsg2.setText(R.string.Msg2);

        Log.i("LifeCycle","OnCreate() Invoked..");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("LifeCycle","OnStart() Invoked..");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("LifeCycle","onResume() Invoked..");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("LifeCycle","onPause() Invoked..");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("LifeCycle","onStop() Invoked..");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("LifeCycle","onDestroy() Invoked..");
    }
}
