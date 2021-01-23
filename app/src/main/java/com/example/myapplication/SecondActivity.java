package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    EditText editText1;
    Button button1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_main);
        editText1 = findViewById(R.id.editText1);
        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message = editText1.getText().toString();
                Intent intent = new Intent();
                intent.putExtra("MESSAGE", message);
                setResult(2,intent);
                finish();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.second, menu);
        return true;
    }

    //        Bundle extras = getIntent().getExtras();
//        String value1 = extras.getString("Value1");
//        String value2 = extras.getString("Value2");
//        Toast.makeText(getApplicationContext(), "Value are:\nFirst Value: " + value1 + "\nSecond value: " + value2, Toast.LENGTH_LONG).show();
//    }
//
//    public void callFirstActivity(View view){
//        Intent i = new Intent(getApplicationContext(), MainActivity.class);
//        startActivity(i);
//    }
}
