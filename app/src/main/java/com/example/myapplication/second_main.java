package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

public class second_main extends Activity {
    Button bu = null;
    Button bu2 = null;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_main);

        bu = (Button)findViewById(R.id.button2);
        bu2 = (Button)findViewById(R.id.button3);
    }

    public void logout(View view) {
//        SharedPreferences sharedPreferences = getSharedPreferences(MainActivity.MyPREFERENCES, Context.MODE_PRIVATE);
//        SharedPreferences.Editor editor = sharedPreferences.edit();
//        editor.clear();
//        editor.commit();
    }

    public void close(View view) {
        finish();
    }
}
