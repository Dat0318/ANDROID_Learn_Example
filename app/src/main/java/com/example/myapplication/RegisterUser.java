package com.example.myapplication;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import androidx.annotation.Nullable;

import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class RegisterUser extends Activity {
    EditText userName, passWord;
    Button register, login;
    ProgressBar progressBar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_user);

        userName = (EditText) findViewById(R.id.editText1);

        passWord = (EditText) findViewById(R.id.editText2);
        register = (Button) findViewById(R.id.button1);

        progressBar = (ProgressBar) findViewById(R.id.progressBar1);
        progressBar.setVisibility(View.GONE);

        register.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                progressBar.setVisibility(View.VISIBLE);
                String s1 = userName.getText().toString();
                String s2 = passWord.getText().toString();
                new ExecuteTask().execute(s1, s2);
            }
        });
    }

    private class ExecuteTask extends AsyncTask<String, Integer, String> {
        @Override
        protected String doInBackground(String... strings) {
            postData(strings);
            return null;
        }

        @Override
        protected void onPostExecute(String s) {
            progressBar.setVisibility(View.GONE);
        }
    }

    private void postData(String[] strings) {
        try {
            HttpClient httpClient = new DefaultHttpClient();
            HttpPost httpPost = new HttpPost("http://dev.apeckids.com/api/v2/auth/login");
            List<NameValuePair> list = new ArrayList<NameValuePair>();
            list.add(new BasicNameValuePair("username",strings[0]));
            list.add(new BasicNameValuePair("password",strings[1]));
            httpPost.setEntity(new UrlEncodedFormEntity(list));
//            HttpResponse httpResponse = HttpClient.execute(httpPost);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
