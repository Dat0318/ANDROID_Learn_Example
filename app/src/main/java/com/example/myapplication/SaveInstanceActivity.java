package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SaveInstanceActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText eFirstNumber;
    private EditText eSecondNumber;
    private TextView tvResult;
    private Button btnTinhTong;

    private int firstNumber;
    private int secondNumber;
    private int result;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        eFirstNumber = (EditText) findViewById(R.id.ed_first_number);
        eSecondNumber = (EditText) findViewById(R.id.ed_second_number);
        tvResult =
    }

    @Override
    public void onClick(View view) {

    }
}
