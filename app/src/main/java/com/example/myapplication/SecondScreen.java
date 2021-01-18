package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);

        Bundle extras = getIntent().getExtras();
        String data = extras.getString("Value1");
        Toast.makeText(this, data, Toast.LENGTH_SHORT).show();

        Button testButton = (Button) findViewById(R.id.btnClickMe);
        testButton.setText(data);
        //
        testButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    @Override
    public void finish() {
        Intent data = new Intent();
        data.putExtra("returnKey1", "Gia tri tra ve thu nhat");
        data.putExtra("returnKey2", "Gia tri tra ve thu hai");
        setResult(RESULT_OK, data);
        super.finish();
    }
}
