package com.example.myapplication;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SaveInstanceActivity extends AppCompatActivity implements View.OnClickListener {
//    private EditText etFirstNumber;
//    private EditText etSecondNumber;
//    private TextView tvResult;
//    private Button btnTinhTong;
//
//    private int firstNumber;
//    private int secondNumber;
//    private int result;
//
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
//        etFirstNumber = (EditText) findViewById(R.id.et_first_number);
//        etSecondNumber = (EditText) findViewById(R.id.et_second_number);
//        tvResult = (TextView) findViewById(R.id.tv_result);
//
//        if (savedInstanceState != null) {
//            etFirstNumber.setText(String.valueOf(savedInstanceState.getInt("SO_THU_NHAT")));
//            etSecondNumber.setText(String.valueOf(savedInstanceState.getInt("SO_THU_HAI")));
//            tvResult.setText(String.valueOf(savedInstanceState.getInt("KET_QUA")));
//        }
//        btnTinhTong = (Button) findViewById(R.id.btn_tinh_tong);
//
//        btnTinhTong.setOnClickListener((this));
//
////        client = new GoogleApiClient.builder(this).addApi(AppIndex.API).build();
    }
//
    @Override
    public void onClick(View view) {
//        if (view == btnTinhTong) {
//            if (etFirstNumber.getText().toString().isEmpty() || etSecondNumber.getText().toString().isEmpty()) {
//                Toast.makeText(this, "Vui long nhap day du so.", Toast.LENGTH_SHORT).show();
//            } else {
//                firstNumber = Integer.parseInt(etFirstNumber.getText().toString());
//                secondNumber = Integer.parseInt(etSecondNumber.getText().toString());
//
//                int tong, hieu, tich, thuong;
//                String lastResult;
//                tong = firstNumber + secondNumber;
//                hieu = firstNumber - secondNumber;
//                tich = firstNumber * secondNumber;
//                thuong = firstNumber / secondNumber;
//                lastResult = "Tong " + String.valueOf(tong) + " Hieu " + String.valueOf(hieu)+ " Tich " + String.valueOf(tich)+ " Thuong " + String.valueOf(thuong);
//                tvResult.setText(lastResult);
//            }
//        }
    }
//
//    @Override
//    public void onSaveInstanceState (Bundle outState) {
//        super.onSaveInstanceState(outState);
//        if (!tvResult.getText().toString().isEmpty()) {
//            outState.putInt("SO_THU_NHAT", Integer.parseInt(etFirstNumber.getText().toString()));
//            outState.putInt("SO_THU_HAI", Integer.parseInt(etSecondNumber.getText().toString()));
//            outState.putInt("KET_QUA", Integer.parseInt(tvResult.getText().toString()));
//        }
//    }
}
