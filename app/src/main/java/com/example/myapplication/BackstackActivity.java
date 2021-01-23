package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class BackstackActivity extends AppCompatActivity {

    private Button btnFrag;
    private int count = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_backstack);
        btnFrag = (Button) findViewById(R.id.btn_replace_fragment);
        btnFrag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count %2 == 0 ) {
                    replaceFragmentContent(new Fragment2());
                    Log.e("Replace Fragment", "2");
                } else  {
                    replaceFragmentContent(new Fragment1());
                    Log.e("Replace Fragment", "1");
                }
                count ++;
            }
        });

        initFragment();
    }

    private void initFragment() {
        Fragment1 firstFagment = new Fragment1();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction ft= fragmentManager.beginTransaction();
        ft.replace(R.id.container_body, firstFagment);
        ft.commit();
    }

    private void replaceFragmentContent(Fragment1 fragment) {
        if (fragment != null) {
            FragmentManager fmgr = getSupportFragmentManager();
            FragmentTransaction ft = fmgr.beginTransaction();
            final FragmentTransaction replace = ft.replace(R.id.container_body, fragment);
            ft.commit();
        }
    }

    protected void replaceFragmentContent(Fragment2 fragment) {
        if (fragment != null) {
            FragmentManager fmgr = getSupportFragmentManager();
            FragmentTransaction ft = fmgr.beginTransaction();
            final FragmentTransaction replace = ft.replace(R.id.container_body, fragment);
            ft.commit();
        }
    }
}
