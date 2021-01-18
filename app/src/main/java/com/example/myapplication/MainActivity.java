package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();
    Button button;
    //    TextView textView;
    private static final String STATE = "Trang Thai";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(STATE, "onCreate");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e(STATE, "onPause");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e(STATE, "onResume");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e(STATE, "onStop");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e(STATE, "onDestroy");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);

        Log.e(STATE, "onRestoreInstanceState");
    }

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState){
        super.onSaveInstanceState(savedInstanceState);

        Log.e(STATE, "onSaveInstanceState");
    }
}
//        if (savedInstanceState == null ){
//            Log.e(TAG,"Bug Howkteam.com");
//        } else {
//            Log.e(TAG,"Welcome to Howkteam.com");
//        }
//        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.frames_layout);
//        TextView product = new TextView(this);
//        button = new Button(this);
//        button.setText("free Education");
//        product.setText("HowKteam - free education");
//        frameLayout.addView(product);
//        frameLayout.addView(button);

//        Button testButton = (Button) findViewById(R.id.btnClickMe);
//        testButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(MainActivity.this, SecondScreen.class);
//                startActivity(intent);
//            }
//        });

//        Intent serviceIntent = new Intent(this, ServiceExample.class);
//        serviceIntent.putExtra("Key", "value");
//        startService(serviceIntent);

//        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://howkteam.com"));
//        startActivity(intent);

//        Bundle extras = getIntent().getExtras();
//        String data = extras.getString(Intent.EXTRA_TEXT);

//        Button testButton = (Button) findViewById(R.id.btnClickMe);
//        testButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(MainActivity.this, SecondScreen.class);
//                i.putExtra("Value1","this value one for activity");
//                i.putExtra("Value2","this value two for activity");
//                int REQUEST_CODE = 9;
//                startActivityForResult(i, REQUEST_CODE);
//            }
//        });
//    }
//
//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        if (resultCode == RESULT_OK && requestCode == 9) {
//            Log.e("TAG", "Click here return!");
//            if (data.hasExtra("returnKey1")) {
//                Toast.makeText(this, data.getExtras().getString("returnKey1"), Toast.LENGTH_SHORT).show();
//            }
//        }
//    }

//    TextView mShowCount = (TextView) findViewById(R.id.show_count);
//    public void showToast(View view) {
//        // Do something in response to the button click.
//    }
//    int mCount = 0;
//    public void countUp(View view) {
//        mCount++;
//        if (mShowCount != null)
//            mShowCount.setText(Integer.toString(mCount));
//    }
//}
