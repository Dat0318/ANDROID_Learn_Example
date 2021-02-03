package com.example.myapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.SeekBar;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private ProgressBar progressBar;
    private SeekBar seekBar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

//        btn = (Button) findViewById(R.id.button);
//
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(MainActivity.this, MainActivity5.class);
//                startActivity(intent);
//            }
//        });

//        seekBar = (SeekBar) findViewById(R.id.seekBar);
//
//        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
//            @Override
//            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
//
//            }
//
//            @Override
//            public void onStartTrackingTouch(SeekBar seekBar) {
//
//            }
//
//            @Override
//            public void onStopTrackingTouch(SeekBar seekBar) {
//
//            }
//        });

//        btn = (Button)findViewById(R.id.button);
//        progressBar = (ProgressBar) findViewById(R.id.progressBar3);
//
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                CountDownTimer countDownTimer = new CountDownTimer(10000, 500) {
//                    @Override
//                    public void onTick(long l) {
//                        int current = progressBar.getProgress();
//                        if (current >= progressBar.getMax()) {
//                            current = 0;
//                        }
//                        progressBar.setProgress(current + 10);
//                    }
//
//                    @Override
//                    public void onFinish() {
//                        this.start();
//                        Toast.makeText(MainActivity.this, "Hết giờ", Toast.LENGTH_SHORT).show();
//                    }
//                };
//                countDownTimer.start();
//            }
//        });
//    }
//}

//import android.app.PendingIntent;
//import android.appwidget.AppWidgetManager;
//import android.appwidget.AppWidgetProvider;
//import android.content.Context;
//import android.content.Intent;
//import android.net.Uri;
//import android.widget.RemoteViews;
//import android.widget.Toast;
//
//public class MainActivity extends AppWidgetProvider {
//    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
//        for(int i=0; i<appWidgetIds.length; i++){
//            int currentWidgetId = appWidgetIds[i];
//            String url = "http://www.tutorialspoint.com";
//
//            Intent intent = new Intent(Intent.ACTION_VIEW);
//            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//            intent.setData(Uri.parse(url));
//
//            PendingIntent pending = PendingIntent.getActivity(context, 0,intent, 0);
//            RemoteViews views = new RemoteViews(context.getPackageName(),R.layout.activity_main);
//
//            views.setOnClickPendingIntent(R.id.button, pending);
//            appWidgetManager.updateAppWidget(currentWidgetId,views);
//            Toast.makeText(context, "widget added", Toast.LENGTH_SHORT).show();
//        }
//    }
//}

//import android.app.Activity;
//import android.os.Bundle;
//import android.view.View;
//import android.webkit.WebView;
//import android.webkit.WebViewClient;
//import android.widget.Button;
//import android.widget.EditText;
//
////public class MainActivity extends Activity implements TextureView.SurfaceTextureListener {
//public class MainActivity extends Activity {
//
//    Button b1;
//    EditText ed1;
//
//    private WebView wv1;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        b1 = (Button) findViewById(R.id.button);
//        ed1 = (EditText) findViewById(R.id.editText);
//
//        wv1 = (WebView) findViewById(R.id.webView);
//        wv1.setWebViewClient(new MyBrowser());
//
//        b1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String url = ed1.getText().toString();
//
//                wv1.getSettings().setLoadsImagesAutomatically(true);
//                wv1.getSettings().setJavaScriptEnabled(true);
//                wv1.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
//                wv1.loadUrl(url);
//            }
//        });
//    }
//
//    private class MyBrowser extends WebViewClient {
//        @Override
//        public boolean shouldOverrideUrlLoading(WebView view, String url) {
//            view.loadUrl(url);
//            return true;
//        }
//    }
//}

//    private TextureView myTexture;
//    private Camera mCamera;
//
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        myTexture = new TextureView(this);
//        myTexture.setSurfaceTextureListener(this);
//        setContentView(myTexture);
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.main, menu);
//        return true;
//    }
//
//    public MainActivity() {
//    }
//
//    @Override
//    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i1) {
//
//        mCamera = Camera.open();
//        Camera.Size previewSize = mCamera.getParameters().getPreviewSize();
//
//        myTexture.setLayoutParams(new FrameLayout.LayoutParams(
//                previewSize.width, previewSize.height, Gravity.CENTER
//        ));
//
//        try {
//            mCamera.setPreviewTexture(surfaceTexture);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        mCamera.startPreview();
//        myTexture.setAlpha(1.0f);
//        myTexture.setRotation(90.0f);
//    }
//
//    @Override
//    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i1) {
//
//    }
//
//    @Override
//    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
//        mCamera.stopPreview();
//        mCamera.release();
//        return true;
//    }
//
//    @Override
//    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
//
//    }
//}

//import android.content.Intent;
//import android.os.Bundle;
//import android.view.KeyEvent;
//import android.view.Menu;
//import android.view.MenuItem;
//import android.view.View;
//import android.widget.AdapterView;
//import android.widget.ArrayAdapter;
//import android.widget.ListView;
//
//import androidx.annotation.NonNull;
//import androidx.annotation.Nullable;
//import androidx.appcompat.app.AppCompatActivity;
//
//import java.util.ArrayList;
//
//public class MainActivity extends AppCompatActivity {
//    public final static String EXTRA_MESSAGE = "MESSAGE";
//    private ListView obj;
//    DBHelper mydb;
//
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        mydb = new DBHelper(this);
//        ArrayList array_list = mydb.getAllContacts();
//        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, array_list);
//
//        obj = (ListView) findViewById(R.id.listView1);
//        obj.setAdapter(arrayAdapter);
//        obj.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                int id_to_search = i + 1;
//                Bundle dataBundle = new Bundle();
//                dataBundle.putInt("id", id_to_search);
//                Intent intent = new Intent(getApplicationContext(), DisplayContact.class);
//
//                intent.putExtras(dataBundle);
//                startActivity(intent);
//            }
//        });
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        super.onOptionsItemSelected(item);
//        switch (item.getItemId()) {
//            case R.id.item1:
//                Bundle dataBundle = new Bundle();
//                dataBundle.putInt("id", 0);
//
//                Intent intent = new Intent(getApplicationContext(), DisplayContact.class);
//                intent.putExtras(dataBundle);
//
//                startActivity(intent);
//                return true;
//            default:
//                return super.onOptionsItemSelected(item);
//        }
//
//    }
//
//    public boolean onKeyDown(int keyCode, KeyEvent event) {
//        if (keyCode == KeyEvent.KEYCODE_BACK) {
//            moveTaskToBack(true);
//        }
//        return super.onKeyDown(keyCode, event);
//    }
//}

//import android.content.Context;
//import android.os.Bundle;
//import android.view.View;
//import android.view.textservice.SentenceSuggestionsInfo;
//import android.view.textservice.SpellCheckerSession;
//import android.view.textservice.SuggestionsInfo;
//import android.view.textservice.TextInfo;
//import android.view.textservice.TextServicesManager;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import androidx.annotation.Nullable;
//import androidx.appcompat.app.AppCompatActivity;
//
//public class MainActivity extends AppCompatActivity implements SpellCheckerSession.SpellCheckerSessionListener {
//
//    Button b1;
//    TextView tv1;
//    EditText ed1;
//    private SpellCheckerSession mScs;
//
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        b1 = (Button) findViewById(R.id.button);
//        tv1 = (TextView) findViewById(R.id.textView3);
//
//        ed1 = (EditText)findViewById(R.id.editText);
//        b1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, ed1.getText().toString(), Toast.LENGTH_SHORT).show();
//                mScs.getSuggestions(new TextInfo(ed1.getText().toString()),3);
//            }
//        });
//    }
//
//    public void onResume() {
//        super.onResume();
//        final TextServicesManager tsm = (TextServicesManager)getSystemService(Context.TEXT_SERVICES_MANAGER_SERVICE);
//        mScs = tsm.newSpellCheckerSession(null, null, this, true);
//    }
//
//    public void onPause() {
//        super.onPause();
//        if (mScs != null) {
//            mScs.close();
//        }
//    }
//
//    @Override
//    public void onGetSuggestions(SuggestionsInfo[] suggestionsInfos) {
//        final StringBuilder sb = new StringBuilder();
//        for (int i = 0; i< suggestionsInfos.length; i ++ ) {
//            final int len = suggestionsInfos[i].getSuggestionsCount();
//            sb.append('\n');
//            for (int j = 0; j < len; ++j) {
//                sb.append(","+suggestionsInfos[i].getSuggestionAt(j));
//            }
//            sb.append(" (" + len + ")");
//        }
//
//        runOnUiThread(new Runnable() {
//            @Override
//            public void run() {
//                tv1.append(sb.toString());
//            }
//        });
//    }
//
//    @Override
//    public void onGetSentenceSuggestions(SentenceSuggestionsInfo[] sentenceSuggestionsInfos) {
//        // TODO
//    }
//}

//    EditText ed1, ed2, ed3;
//    Button b1;
//    Intent in;
//
//    public static final String MyPREFERENCES = "MyPrefs";
//    public static final String Name = "nameKey";
//    public static final String Phone = "phonekey";
//    public static final String Email = "emailKey";
//    SharedPreferences sharedPreferences;
//
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        ed1 = (EditText) findViewById(R.id.editText);
//        ed2 = (EditText) findViewById(R.id.editText2);
//        ed3 = (EditText) findViewById(R.id.editText3);
//
//        b1 = (Button) findViewById(R.id.button);
//        sharedPreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
//
//        b1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String n = ed1.getText().toString();
//                String ph = ed2.getText().toString();
//                String e = ed3.getText().toString();
//
//                SharedPreferences.Editor editor = sharedPreferences.edit();
//
//                editor.putString(Name, n);
//                editor.putString(Phone, ph);
//                editor.putString(Email, e);
//                editor.commit();
//
//                in = new Intent(MainActivity.this, second_main.class);
//                startActivity(in);
//            }
//        });
//    }
//}

//    private TextView tv1 = null;
//    private SensorManager mSensorManager;
//
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        tv1 = (TextView) findViewById(R.id.textView2);
//        tv1.setVisibility(View.GONE);
//
//        mSensorManager = (SensorManager)getSystemService(SENSOR_SERVICE);
//        List<Sensor> mList = mSensorManager.getSensorList(Sensor.TYPE_ALL);
//
//        for (int i = 1; i< mList.size(); i++) {
//            tv1.setVisibility(View.VISIBLE);
//            tv1.append("\n" + mList.get(i).getName() + "\n" + mList.get(i).getVendor() + "\n" + mList.get(i).getVersion());
//        }
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        int id = item.getItemId();
//        if (id == R.id.action_settings) {
//            return true;
//        }
//        return super.onOptionsItemSelected(item);
//    }
//}

//    EditText ed1, ed2, ed3;
//
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        ed1 = (EditText) findViewById(R.id.editText);
//        ed2 = (EditText) findViewById(R.id.editText2);
//        ed3 = (EditText) findViewById(R.id.editText3);
//
//        Button b1 = (Button) findViewById(R.id.button);
//
//        b1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String title = ed1.getText().toString().trim();
//                String subject = ed2.getText().toString().trim();
//                String body = ed3.getText().toString().trim();
//
//                NotificationManager notif = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
//                Notification notify = new Notification.Builder(getApplicationContext())
//                        .setContentTitle(title)
//                        .setContentText(body)
//                        .setContentTitle(subject)
//                        .setSmallIcon(R.drawable.ic_action)
//                        .build();
//
//                notify.flags |= Notification.FLAG_AUTO_CANCEL;
//                notif.notify(0, notify);
//            }
//        });
//    }
//}


//    private static final String TAG = "MainActivity";
//    Button b1;
//    private ProgressDialog progress;
//    private int jumpTime = 0;
//
//
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        b1 = (Button) findViewById(R.id.button2);
//    }
//
//    public void download(View view) {
//        progress = new ProgressDialog(this);
//        progress.setMessage("Downloading Music");
//        progress.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
//        progress.setIndeterminate(true);
////        progress.setProgress(0);
//        progress.setProgress(50);
//        progress.show();
//        progress.onStart();
//
//        final int totalProgressTime = 100;
//        final Thread t = new Thread() {
//            @Override
//            public void run() {
//
//                while (jumpTime < totalProgressTime) {
//                    try {
//                        sleep(200);
//                        jumpTime = jumpTime + 10;
//                        progress.setProgress(jumpTime);
//                    } catch (InterruptedException e) {
//                        // TODO Auto-generated catch block
//                        e.printStackTrace();
//                    }
//                }
//            }
//        };
//        t.start();
//    }

//    Button b1;
//    private ProgressBar spinner;

//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

//        b1=(Button)findViewById(R.id.button);
//        spinner=(ProgressBar)findViewById(R.id.progressBar);
//        spinner.setVisibility(View.GONE);
//
//        b1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                spinner.setVisibility(View.VISIBLE);
//            }
//        });
//    }

//    private String TAG = MainActivity.class.getSimpleName();
//    private ListView lv;
//
//    ArrayList<HashMap<String, String>> contactList;
//
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        contactList = new ArrayList<>();
//        lv = (ListView) findViewById(R.id.list);
//
//        new GetContacts().execute();
//    }
//
//    private class GetContacts extends AsyncTask<Void, Void, Void> {
//
//        @Override
//        protected void onPreExecute() {
//            super.onPreExecute();
//            Toast.makeText(MainActivity.this, "Json Data is loading", Toast.LENGTH_SHORT).show();
//        }
//
//        @Override
//        protected Void doInBackground(Void... voids) {
//            HttpHandler sh = new HttpHandler();
//            String url = "https://api.androidhive.info/contacts/";
//            String jsonStr = sh.makeServiceCall(url);
//
//            Log.e(TAG, "Response from url " + jsonStr);
//            if (jsonStr != null) {
//                try {
//                    JSONObject jsonObj= new JSONObject(jsonStr);
//
//                    JSONArray contacts = jsonObj.getJSONArray("contacts");
//
//                    for (int i = 0; i< contacts.length(); i ++) {
//                        JSONObject c = contacts.getJSONObject(i);
//                        String id = c.getString("id");
//                        String name = c.getString("name");
//                        String email = c.getString("email");
//                        String address = c.getString("address");
//                        String gender = c.getString("gender");
//
//                        JSONObject phone = c.getJSONObject("phone");
//                        String mobile = phone.getString("mobile");
//                        String home = phone.getString("home");
//                        String office = phone.getString("office");
//
//                        HashMap<String, String> contact = new HashMap<>();
//
//                        contact.put("id", id);
//                        contact.put("name", name);
//                        contact.put("email", email);
//                        contact.put("mobile", mobile);
//
//                        contactList.add(contact);
//                    }
//                } catch (JSONException e) {
//                    Log.e(TAG, "Json parsing error: " + e.getMessage());
//
//                    runOnUiThread(new Runnable() {
//                        @Override
//                        public void run() {
//                            Toast.makeText(MainActivity.this, "Json parsing error: ", Toast.LENGTH_SHORT).show();
//                        }
//                    });
//                    e.printStackTrace();
//                }
//            } else {
//                Log.e(TAG, "Couldn't get json from server.");
//                runOnUiThread(new Runnable() {
//                    @Override
//                    public void run() {
//                        Toast.makeText(MainActivity.this, "Couldn't get json from server. Check LogCat for possible error!", Toast.LENGTH_SHORT).show();
//                    }
//                });
//            }
//            return null;
//        }
//
//        @Override
//        protected void onPostExecute(Void aVoid) {
//            super.onPostExecute(aVoid);
//
//            ListAdapter adapter = new SimpleAdapter(MainActivity.this, contactList, R.layout.list_item, new String[]{"email", "mobile"}, new int[]{R.id.email, R.id.mobile});
//            lv.setAdapter(adapter);
//        }
//    }

//    EditText ed1, ed2;
//    Button b1, b2;
//
//    private ClipboardManager myClipboard;
//    private ClipData myClip;
//
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        ed1 = (EditText) findViewById(R.id.editText);
//        ed2 = (EditText) findViewById(R.id.editText2);
//
//        b1 = (Button) findViewById(R.id.button);
//        b2 = (Button) findViewById(R.id.button2);
//
//        myClipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
//
//        b1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String text;
//                text = ed1.getText().toString();
//
//                myClip = ClipData.newPlainText("text", text);
//                myClipboard.setPrimaryClip(myClip);
//
//                Toast.makeText(MainActivity.this, "Text Copied", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        b2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                ClipData abc = myClipboard.getPrimaryClip();
//                ClipData.Item item = abc.getItemAt(0);
//
//                String text = item.getText().toString();
//                ed2.setText(text);
//
//                Toast.makeText(MainActivity.this, "Text Pasted", Toast.LENGTH_SHORT).show();
//            }
//        });
//    }
//}

//import android.Manifest;
//import android.content.Context;
//import android.content.DialogInterface;
//import android.content.Intent;
//import android.content.SharedPreferences;
//import android.content.pm.PackageManager;
//import android.net.Uri;
//import android.os.Bundle;
//import android.provider.Settings;
//
//import androidx.annotation.NonNull;
//import androidx.annotation.Nullable;
//import androidx.appcompat.app.AlertDialog;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.core.app.ActivityCompat;
//import androidx.core.content.ContextCompat;
//
//public class MainActivity extends AppCompatActivity {
//    public static final int MY_PERMISSIONS_REQUEST_CAMERA = 100;
//    public static final String ALLOW_KEY = "ALLOWED";
//    public static final String CAMERA_PREF = "camera_pref";
//
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
//            if (getFromPref(this, ALLOW_KEY)) {
//                showSettingAlert();
//            } else if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
//                if (ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission.CAMERA)) {
//                    showAlert();
//                } else {
//                    ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CAMERA}, MY_PERMISSIONS_REQUEST_CAMERA);
//                }
//            }
//        } else {
//            openCamera();
//        }
//    }
//
//    private void openCamera() {
//        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
//        startActivity(intent);
//    }
//
//    private void showAlert() {
//        AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
//        alertDialog.setTitle("Alert");
//        alertDialog.setMessage("App needs to access the camera");
//
//        alertDialog.setButton(AlertDialog.BUTTON_NEGATIVE, "DONT ALLOW",
//                new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i) {
//                        dialogInterface.dismiss();
//                        finish();
//                    }
//                });
//
//        alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "ALLOW",
//                new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i) {
//                        dialogInterface.dismiss();
//                        ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.CAMERA}, MY_PERMISSIONS_REQUEST_CAMERA);
//                    }
//                });
//        alertDialog.show();
//    }
//
//    private void showSettingAlert() {
//        AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
//        alertDialog.setTitle("Alert");
//        alertDialog.setMessage("App needs to access the camera");
//
//        alertDialog.setButton(AlertDialog.BUTTON_NEGATIVE, "DONT ALLOW",
//                new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i) {
//                        dialogInterface.dismiss();
//                    }
//                });
//
//        alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "SETTINGS",
//                new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i) {
//                        dialogInterface.dismiss();
//                        ;
//                        startInstalledAppDetailsActivity(MainActivity.this);
//                    }
//                });
//
//        alertDialog.show();
//    }
//
//    @Override
//    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
//        switch (requestCode) {
//            case MY_PERMISSIONS_REQUEST_CAMERA: {
//                for (int i = 0, len = permissions.length; i < len; i++) {
//                    String permission = permissions[i];
//                    if (grantResults[i] == PackageManager.PERMISSION_DENIED) {
//                        boolean showRationale = ActivityCompat.shouldShowRequestPermissionRationale(this, permission);
//                        if (showRationale) {
//                            showAlert();
//                        } else if (!showRationale) {
//                            saveToPreferences(MainActivity.this, ALLOW_KEY, true);
//                        }
//                    }
//                }
//            }
//        }
//    }
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//    }
//
//    private void saveToPreferences(Context context, String allowKey, boolean b) {
//        SharedPreferences myPrefs = context.getSharedPreferences(CAMERA_PREF, Context.MODE_PRIVATE);
//
//        SharedPreferences.Editor prefsEditor = myPrefs.edit();
//        prefsEditor.putBoolean(allowKey, b);
//        prefsEditor.commit();
//    }
//
//    private void startInstalledAppDetailsActivity(final Context context) {
//        if (context == null) {
//            return;
//        }
//
//        final Intent i = new Intent();
//        i.setAction(Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
//        i.addCategory(Intent.CATEGORY_DEFAULT);
//        i.setData(Uri.parse("package: " + context.getPackageName()));
//        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//        i.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
//        i.addFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);
//        context.startActivity(i);
//    }
//
//    private boolean getFromPref(Context context, String allowKey) {
//        SharedPreferences myPrefs = context.getSharedPreferences(CAMERA_PREF, Context.MODE_PRIVATE);
//        return (myPrefs.getBoolean(allowKey, false));
//    }
//}

//public class MainActivity extends Activity {
//    Button mode, ring, vibrate, slient;
//    private AudioManager myAudioManager;
//
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        vibrate = (Button) findViewById(R.id.button3);
//        ring = (Button) findViewById(R.id.button2);
//
//        mode = (Button) findViewById(R.id.button);
//        slient = (Button) findViewById(R.id.button4);
//        myAudioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
//
//        vibrate.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                myAudioManager.setRingerMode(AudioManager.RINGER_MODE_VIBRATE);
//                Toast.makeText(MainActivity.this, "Now in Vibrate Mode", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        ring.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                myAudioManager.setRingerMode(AudioManager.RINGER_MODE_NORMAL);
//                Toast.makeText(MainActivity.this, "Now is Ringing Mode", Toast.LENGTH_LONG).show();
//            }
//        });
//
//        slient.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                myAudioManager.setRingerMode(AudioManager.RINGER_MODE_SILENT);
//                Toast.makeText(MainActivity.this, "Now in silent Mode",
//                        Toast.LENGTH_LONG).show();
//            }
//        });
//
//        mode.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                int mod = myAudioManager.getRingerMode();
//                if (mod == AudioManager.RINGER_MODE_VIBRATE) {
//                    Toast.makeText(MainActivity.this, "Now in Vibrate Mode",
//                            Toast.LENGTH_LONG).show();
//                } else if (mod == AudioManager.RINGER_MODE_NORMAL) {
//                    Toast.makeText(MainActivity.this, "Now in Ringing Mode",
//                            Toast.LENGTH_LONG).show();
//                } else {
//                    Toast.makeText(MainActivity.this, "Now in Vibrate Mode",
//                            Toast.LENGTH_LONG).show();
//                }
//            }
//        });
//    }
//}

//    Button buttonStart, buttonStop, buttonPlayLastRecordAudio, buttonStopPlayingRecording;
//    String AudioSavePathInDevice = null;
//    MediaRecorder mediaRecorder;
//    Random random;
//    String RandomAudioFilename = "ABCDEFGHIJKLMNOP";
//    public static final int RequestPermissioCode = 1;
//    MediaPlayer mediaPlayer;
//    private static final String TAG = "MainActivity";
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        buttonStart = (Button) findViewById(R.id.button);
//        buttonStop = (Button) findViewById(R.id.button2);
//        buttonPlayLastRecordAudio = (Button) findViewById(R.id.button3);
//        buttonStopPlayingRecording = (Button) findViewById(R.id.button4);
//
//        buttonStop.setEnabled(false);
//        buttonStopPlayingRecording.setEnabled(false);
//        buttonPlayLastRecordAudio.setEnabled(false);
//
//        random = new Random();
//
//        buttonStart.setOnClickListener(new View.OnClickListener() {
//            @RequiresApi(api = Build.VERSION_CODES.M)
//            @Override
//            public void onClick(View view) {
//                if (checkPermission()) {
//                    AudioSavePathInDevice = Environment.getExternalStorageDirectory().getAbsolutePath() + "/" +
//                            CreateRandomAudioFileName(5) + "AudioRecording.3gp";
//                    MediaRecorderReady();

//                    try {
//                        mediaRecorder.prepare();
//                        mediaRecorder.start();
//                        Toast.makeText(MainActivity.this, "Start", Toast.LENGTH_SHORT).show();
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }

//                    try {
//                        mediaRecorder.prepare();
//                        mediaRecorder.start();
//                        Toast.makeText(MainActivity.this, "prepare Start", Toast.LENGTH_SHORT).show();
//                        buttonStart.setEnabled(false);
//                        buttonStop.setEnabled(true);
//                    } catch (IOException e) {
//                        Log.e(TAG, "onClick: " + e);
//                        e.printStackTrace();
//                    }
//
////                    Toast.makeText(MainActivity.this, "Recording started", Toast.LENGTH_SHORT).show();
//                } else {
//                    requestPermissions();
//                }
//            }
//        });
//
//        buttonStop.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                mediaRecorder.stop();
//                buttonStop.setEnabled(false);
//                buttonPlayLastRecordAudio.setEnabled(true);
//                buttonStart.setEnabled(true);
//                buttonStopPlayingRecording.setEnabled(false);
//
//                Toast.makeText(MainActivity.this, "Recording Completed", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        buttonPlayLastRecordAudio.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                buttonStop.setEnabled(false);
//                buttonStart.setEnabled(false);
//                buttonStopPlayingRecording.setEnabled(true);
//
//                mediaPlayer = new MediaPlayer();
//                try {
//                    mediaPlayer.setDataSource(AudioSavePathInDevice);
//                    mediaPlayer.prepare();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//
//                mediaPlayer.start();
//                Toast.makeText(MainActivity.this, "Recording Playing", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        buttonStopPlayingRecording.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                buttonStop.setEnabled(false);
//                buttonStart.setEnabled(true);
//                buttonStopPlayingRecording.setEnabled(false);
//                buttonPlayLastRecordAudio.setEnabled(true);
//
//                if (mediaPlayer != null) {
//                    mediaPlayer.stop();
//                    mediaPlayer.release();
//                    MediaRecorderReady();
//                }
//            }
//        });
//    }
//
//    private void requestPermissions() {
//        ActivityCompat.requestPermissions(MainActivity.this, new String[]{WRITE_EXTERNAL_STORAGE, RECORD_AUDIO}, RequestPermissioCode);
//    }
//
//    @Override
//    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
//        switch (requestCode) {
//            case RequestPermissioCode:
//                if (grantResults.length > 0) {
//                    boolean StoragePermission = grantResults[0] == PackageManager.PERMISSION_GRANTED;
//                    boolean RecordPermission = grantResults[1] == PackageManager.PERMISSION_GRANTED;
//
//                    if (StoragePermission && RecordPermission) {
//                        Toast.makeText(this, "Permission Granted", Toast.LENGTH_SHORT).show();
//                    } else {
//                        Toast.makeText(this, "Permission Denied", Toast.LENGTH_SHORT).show();
//                    }
//                }
//                break;
//        }
//    }
//
//    private boolean checkPermission() {
//        int result = ContextCompat.checkSelfPermission(getApplicationContext(), WRITE_EXTERNAL_STORAGE);
//        int result1 = ContextCompat.checkSelfPermission(getApplicationContext(), RECORD_AUDIO);
//        return result == PackageManager.PERMISSION_GRANTED && result1 == PackageManager.PERMISSION_GRANTED;
//
//    }
//
//    private String CreateRandomAudioFileName(int number) {
//        StringBuilder stringBuilder = new StringBuilder(number);
//        int i = 0;
//        while (i < number) {
//            stringBuilder.append(RandomAudioFilename.charAt(random.nextInt(RandomAudioFilename.length())));
//
//            i++;
//        }
//        return stringBuilder.toString();
//    }
//
//    private void MediaRecorderReady() {
//        mediaRecorder = new MediaRecorder();
//        mediaRecorder.setAudioSource(MediaRecorder.AudioSource.MIC);
//        mediaRecorder.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
//        mediaRecorder.setAudioEncoder(MediaRecorder.OutputFormat.AMR_NB);
//        mediaRecorder.setOutputFile(AudioSavePathInDevice);
//    }
//}


//    public void clockwise(View view){
//        ImageView image = (ImageView)findViewById(R.id.imageView);
//        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),
//                R.anim.myanimation);
//        image.startAnimation(animation);
//    }
//
//    public void zoom(View view){
//        ImageView image = (ImageView)findViewById(R.id.imageView);
//        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(),
//                R.anim.clockwise);
//        image.startAnimation(animation1);
//    }
//
//    public void fade(View view){
//        ImageView image = (ImageView)findViewById(R.id.imageView);
//        Animation animation1 =
//                AnimationUtils.loadAnimation(getApplicationContext(),
//                        R.anim.fade);
//        image.startAnimation(animation1);
//    }
//
//    public void blink(View view){
//        ImageView image = (ImageView)findViewById(R.id.imageView);
//        Animation animation1 =
//                AnimationUtils.loadAnimation(getApplicationContext(),
//                        R.anim.blink);
//        image.startAnimation(animation1);
//    }
//
//    public void move(View view){
//        ImageView image = (ImageView)findViewById(R.id.imageView);
//        Animation animation1 =
//                AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
//        image.startAnimation(animation1);
//    }
//
//    public void slide(View view){
//        ImageView image = (ImageView)findViewById(R.id.imageView);
//        Animation animation1 =
//                AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide);
//        image.startAnimation(animation1);
//    }
//}

//    private static final int MY_PERMISSIONS_REQUEST_SEND_SMS = 0;
//    Button btnShowLocation;
//    private static final int REQUEST_CODE_PERMISSION = 2;
//    String mPermission = Manifest.permission.ACCESS_FINE_LOCATION;
//
//    GPSTracker gps;
//    private String phoneNo, message;
//
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        try {
//            if (ActivityCompat.checkSelfPermission(this, mPermission) != PackageManager.PERMISSION_GRANTED) {
//                ActivityCompat.requestPermissions(this, new String[]{mPermission}, REQUEST_CODE_PERMISSION);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        btnShowLocation = (Button) findViewById(R.id.button);
//
//        btnShowLocation.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                gps = new GPSTracker(MainActivity.this);

//                if (gps.canGetLocation()) {
//                    double latitude = gps.getLatitude();
//                    double longtitude = gps.getLongitude();
//                    Toast.makeText(MainActivity.this, "Your Location is - \nLat: " + latitude + "\nLong: " + longtitude, Toast.LENGTH_SHORT).show();
//                } else {
//                    gps.showSettingsAlert();
//                }
//                sendEmail();
//                sendSMSMessage();

//                Intent callIntent = new Intent(Intent.ACTION_CALL);
//                callIntent.setData(Uri.parse("tel:0986419381"));
//
//                if (ActivityCompat.checkSelfPermission(MainActivity.this,
//                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
//                    return;
//                }
//                startActivity(callIntent);
//            }
//        });
//    }
//
//    @Override
//    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
//        switch (requestCode) {
//            case MY_PERMISSIONS_REQUEST_SEND_SMS: {
//                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
//                    SmsManager smsManager = SmsManager.getDefault();
//                    smsManager.sendTextMessage(phoneNo, null, message, null, null);
//                    Toast.makeText(getApplicationContext(), "SMS sent.",
//                            Toast.LENGTH_LONG).show();
//                } else {
//                    Toast.makeText(getApplicationContext(),
//                            "SMS faild, please try again.", Toast.LENGTH_LONG).show();
//                    return;
//                }
//            }
//            break;
//            case REQUEST_CODE_PERMISSION:
//                Toast.makeText(getBaseContext(), "run now", Toast.LENGTH_SHORT).show();
//                break;
//        }
//    }
//
//    private void sendSMSMessage() {
////        phoneNo = txtphoneNo.getText().toString();
////        message = txtMessage.getText().toString();
//        phoneNo = "0986419381";
//        message = "test message to send";
//
//        if (ContextCompat.checkSelfPermission(this,
//                Manifest.permission.SEND_SMS)
//                != PackageManager.PERMISSION_GRANTED) {
//            if (ActivityCompat.shouldShowRequestPermissionRationale(this,
//                    Manifest.permission.SEND_SMS)) {
//            } else {
//                ActivityCompat.requestPermissions(this,
//                        new String[]{Manifest.permission.SEND_SMS},
//                        MY_PERMISSIONS_REQUEST_SEND_SMS);
//            }
//        }
//    }
//
//    private void sendEmail() {
//        Log.i("Send email", "");
//        String[] TO = {""};
//        String[] CC = {""};
//        Intent emailIntent = new Intent(Intent.ACTION_SEND);
//
//        emailIntent.setData(Uri.parse("mailto:"));
//        emailIntent.setType("text/plain");
//        emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
//        emailIntent.putExtra(Intent.EXTRA_CC, CC);
//        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Your subject");
//        emailIntent.putExtra(Intent.EXTRA_TEXT, "Email message goes here");
//
//        try {
//            startActivity(Intent.createChooser(emailIntent, "Send mail..."));
//            finish();
//            Log.i("INFOR", "Finished sending email...");
//        } catch (android.content.ActivityNotFoundException ex) {
//            Toast.makeText(MainActivity.this, "There is no email client installed.", Toast.LENGTH_SHORT).show();
//        }
//    }
//}
//    Button b1;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        NotificationCompat.Builder builder = new NotificationCompat.Builder(this)
//                .setSmallIcon(R.drawable.ic_action)
//                .setContentTitle("textTitle")
//                .setContentText("textContent")
//                .setPriority(NotificationCompat.PRIORITY_DEFAULT);
//        Intent notificationIntent = new Intent(this, MainActivity.class);
//        PendingIntent contentIntent = PendingIntent.getActivity(this, 0, notificationIntent,
//                PendingIntent.FLAG_UPDATE_CURRENT);
//        builder.setContentIntent(contentIntent);
//
//        // Add as notification
//        NotificationManager manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
//        manager.notify(0, builder.build());
//
//        b1 = (Button)findViewById(R.id.button);
//        b1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                addNotification();
//            }
//        });
//    }
//
//    private void addNotification() {
//        Toast.makeText(this, "Click here", Toast.LENGTH_SHORT).show();
//        NotificationCompat.Builder builder =
//                new NotificationCompat.Builder(this)
//                        .setSmallIcon(R.drawable.ic_action)
//                        .setContentTitle("Notifications Example")
//                        .setContentText("This is a test notification");
//
//        Intent notificationIntent = new Intent(this, MainActivity.class);
//        PendingIntent contentIntent = PendingIntent.getActivity(this, 0, notificationIntent,
//                PendingIntent.FLAG_UPDATE_CURRENT);
//        builder.setContentIntent(contentIntent);
//
//        // Add as notification
//        NotificationManager manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
//        manager.notify(0, builder.build());
//    }

//    protected void displayNotification() {
//        Log.i("Start", "notification");
//
//        /* Invoking the default notification service */
//        NotificationCompat.Builder  mBuilder = new NotificationCompat.Builder(this);
//
//        mBuilder.setContentTitle("New Message");
//        mBuilder.setContentText("You've received new message.");
//        mBuilder.setTicker("New Message Alert!");
//        mBuilder.setSmallIcon(R.drawable.ic_avatar1 void displayNotification() {
//            Log.i("Start", "notification");
//
//            NotificationCompat.Builder  mBuilder = new NotificationCompat.Builder(this);
//
//            mBuilder.setContentTitle("New Message");
//            mBuilder.setContentText("You've received new message.");
//            mBuilder.setTicker("New Message Alert!");
//            mBuilder.setSmallIcon(R.drawable.ic_avatar1);
//
//            mBuilder.setNumber(++numMessages);
//
//            NotificationCompat.InboxStyle inboxStyle = new NotificationCompat.InboxStyle();
//
//            String[] events = new String[6];
//            events[0] = new String("This is first line....");
//            events[1] = new String("This is second line...");
//            events[2] = new String("This is third line...");
//            events[3] = new String("This is 4th line...");
//            events[4] = new String("This is 5th line...");
//            events[5] = new String("This is 6th line...");
//
//            inboxStyle.setBigContentTitle("Big Title Details:");
//
//            for (int i=0; i < events.length; i++) {
//                inboxStyle.addLine(events[i]);
//            }
//            mBuilder.setStyle(inboxStyle);
//            Intent resultIntent = new Intent(this, NotificationView.class);
//
//            TaskStackBuilder stackBuilder = TaskStackBuilder.create(this);
//            stackBuilder.addParentStack(NotificationView.class);
//            stackBuilder.addNextIntent(resultIntent);
//            PendingIntent resultPendingIntent =stackBuilder.getPendingIntent(0,PendingIntent.FLAG_UPDATE_CURRENT);
//
//            mBuilder.setContentIntent(resultPendingIntent);
//            mNotificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
//            mNotificationManager.notify(notificationID, mBuilder.build());
//        });
//
//        /* Increase notification number every time a new notification arrives */
//        mBuilder.setNumber(++numMessages);
//
//        /* Add Big View Specific Configuration */
//        NotificationCompat.InboxStyle inboxStyle = new NotificationCompat.InboxStyle();
//
//        String[] events = new String[6];
//        events[0] = new String("This is first line....");
//        events[1] = new String("This is second line...");
//        events[2] = new String("This is third line...");
//        events[3] = new String("This is 4th line...");
//        events[4] = new String("This is 5th line...");
//        events[5] = new String("This is 6th line...");
//
//        // Sets a title for the Inbox style big view
//        inboxStyle.setBigContentTitle("Big Title Details:");
//
//        // Moves events into the big view
//        for (int i=0; i < events.length; i++) {
//            inboxStyle.addLine(events[i]);
//        }
//
//        mBuilder.setStyle(inboxStyle);
//
//        /* Creates an explicit intent for an Activity in your app */
//        Intent resultIntent = new Intent(this, NotificationView.class);
//
//        TaskStackBuilder stackBuilder = TaskStackBuilder.create(this);
//        stackBuilder.addParentStack(NotificationView.class);
//
//        /* Adds the Intent that starts the Activity to the top of the stack */
//        stackBuilder.addNextIntent(resultIntent);
//        PendingIntent resultPendingIntent =stackBuilder.getPendingIntent(0,PendingIntent.FLAG_UPDATE_CURRENT);
//
//        mBuilder.setContentIntent(resultPendingIntent);
//        mNotificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
//
//        /* notificationID allows you to update the notification later on. */
//        mNotificationManager.notify(notificationID, mBuilder.build());
//    }
//}

//public class MainActivity extends Activity {
//    ImageView img;
//    String msg;
//    private android.widget.RelativeLayout.LayoutParams layoutParams;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        img=(ImageView)findViewById(R.id.imageView);
//
//        img.setOnLongClickListener(new View.OnLongClickListener() {
//            @Override
//            public boolean onLongClick(View v) {
//                ClipData.Item item = new ClipData.Item((CharSequence)v.getTag());
//                String[] mimeTypes = {ClipDescription.MIMETYPE_TEXT_PLAIN};
//
//                ClipData dragData = new ClipData(v.getTag().toString(),mimeTypes, item);
//                View.DragShadowBuilder myShadow = new View.DragShadowBuilder(img);
//
//                v.startDrag(dragData,myShadow,null,0);
//                return true;
//            }
//        });
//
//        img.setOnDragListener(new View.OnDragListener() {
//            @Override
//            public boolean onDrag(View v, DragEvent event) {
//                switch(event.getAction()) {
//                    case DragEvent.ACTION_DRAG_STARTED:
//                        layoutParams = (RelativeLayout.LayoutParams)v.getLayoutParams();
//                        Log.d(msg, "Action is DragEvent.ACTION_DRAG_STARTED");
//
//                        // Do nothing
//                        break;
//
//                    case DragEvent.ACTION_DRAG_ENTERED:
//                        Log.d(msg, "Action is DragEvent.ACTION_DRAG_ENTERED");
//                        int x_cord = (int) event.getX();
//                        int y_cord = (int) event.getY();
//                        break;
//
//                    case DragEvent.ACTION_DRAG_EXITED :
//                        Log.d(msg, "Action is DragEvent.ACTION_DRAG_EXITED");
//                        x_cord = (int) event.getX();
//                        y_cord = (int) event.getY();
//                        layoutParams.leftMargin = x_cord;
//                        layoutParams.topMargin = y_cord;
//                        v.setLayoutParams(layoutParams);
//                        break;
//
//                    case DragEvent.ACTION_DRAG_LOCATION  :
//                        Log.d(msg, "Action is DragEvent.ACTION_DRAG_LOCATION");
//                        x_cord = (int) event.getX();
//                        y_cord = (int) event.getY();
//                        break;
//
//                    case DragEvent.ACTION_DRAG_ENDED   :
//                        Log.d(msg, "Action is DragEvent.ACTION_DRAG_ENDED");
//
//                        // Do nothing
//                        break;
//
//                    case DragEvent.ACTION_DROP:
//                        Log.d(msg, "ACTION_DROP event");
//
//                        // Do nothing
//                        break;
//                    default: break;
//                }
//                return true;
//            }
//        });
//
//        img.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//                if (event.getAction() == MotionEvent.ACTION_DOWN) {
//                    ClipData data = ClipData.newPlainText("", "");
//                    View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(img);
//
//                    img.startDrag(data, shadowBuilder, img, 0);
//                    img.setVisibility(View.INVISIBLE);
//                    return true;
//                } else {
//                    return false;
//                }
//            }
//        });
//    }
//}

//public class MainActivity extends Activity {
//    ImageView img;
//    String msg;
//    private RelativeLayout.LayoutParams layoutParams;
//
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        img = (ImageView) findViewById(R.id.imageView);
//
//        img.setOnLongClickListener(new View.OnLongClickListener() {
//            @Override
//            public boolean onLongClick(View view) {
//                ClipData.Item item = new ClipData.Item((CharSequence) view.getTag());
//                String[] mimeTypes = {ClipDescription.MIMETYPE_TEXT_PLAIN};
//
//                ClipData dragData = new ClipData(view.getTag().toString(), mimeTypes, item);
//                View.DragShadowBuilder myShadow = new View.DragShadowBuilder(img);
//
//                view.startDrag(dragData, myShadow, null, 0);
//                return true;
//            }
//        });
//
//        img.setOnDragListener(new View.OnDragListener() {
//            @Override
//            public boolean onDrag(View view, DragEvent dragEvent) {
//                switch (dragEvent.getAction()) {
//                    case DragEvent.ACTION_DRAG_STARTED:
//                        layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
//                        Log.d(msg, "Action is DragEvent.ACTION_DRAG_STARTED");
//                        break;
//                    case DragEvent.ACTION_DRAG_ENTERED:
//                        Log.d(msg, "Action is DragEvent.ACTION_DRAG_ENTERED");
//                        int x_cord = (int) dragEvent.getX();
//                        int y_cord = (int) dragEvent.getY();
//                        break;
//                    case DragEvent.ACTION_DRAG_EXITED:
//                        Log.d(msg, "Action is DragEvent.ACTION_DRAG_EXITED");
//                        x_cord = (int) dragEvent.getX();
//                        y_cord = (int) dragEvent.getY();
//                        layoutParams.leftMargin = x_cord;
//                        layoutParams.topMargin = y_cord;
//                        view.setLayoutParams(layoutParams);
//                        break;
//
//                    case DragEvent.ACTION_DRAG_LOCATION:
//                        Log.d(msg, "Action is DragEvent.ACTION_DRAG_LOCATION");
//                        x_cord = (int) dragEvent.getX();
//                        y_cord = (int) dragEvent.getY();
//                        break;
//
//                    case DragEvent.ACTION_DRAG_ENDED:
//                        Log.d(msg, "Action is DragEvent.ACTION_DRAG_ENDED");
//
//                        // Do nothing
//                        break;
//
//                    case DragEvent.ACTION_DROP:
//                        Log.d(msg, "ACTION_DROP event");
//
//                        // Do nothing
//                        break;
//                    default:
//                        break;
//                }
//                return true;
//            }
//        });

//        img.setOnDragListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View view, MotionEvent motionEvent) {
//                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
//                    ClipData data = ClipData.newPlainText("", "");
//                    View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(img);
//                    img.startDrag(data, shadowBuilder, img, 0);
//                    img.setVisibility(View.INVISIBLE);
//                    return true;
//                } else {
//                    return false;
//                }
//            }
//        });

//        img.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//                if (event.getAction() == MotionEvent.ACTION_DOWN) {
//                    ClipData data = ClipData.newPlainText("", "");
//                    View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(img);
//
//                    img.startDrag(data, shadowBuilder, img, 0);
//                    img.setVisibility(View.INVISIBLE);
//                    return true;
//                } else {
//                    return false;
//                }
//            }
//        });
//
//    }
//}

//public class MainActivity extends AppCompatActivity {
//    Button b1,b2,b3;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        b1=(Button)findViewById(R.id.button);
//        b1.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(android.content.Intent.ACTION_VIEW,
//                        Uri.parse("http://www.example.com"));
//                startActivity(i);
//            }
//        });
//
//        b2 = (Button)findViewById(R.id.button2);
//        b2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent("com.example.myapplication.LAUNCH",Uri.parse("https://www.tutorialspoint.com/android/android_intents_filters.htm"));
//                startActivity(i);
//            }
//        });
//
//        b3 = (Button)findViewById(R.id.button3);
//        b3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent("com.example.myapplication.LAUNCH",
//                        Uri.parse("https://www.tutorialspoint.com/android/android_intents_filters.htm"));
//                startActivity(i);
//            }
//        });
//    }
//}

//    private CheckBox checkBoxHarry, checkBoxMattrix, chekCheckBoxJoker;
//    private Button b1, b2;
//
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        b1 = (Button) findViewById(R.id.button);
//        b1.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(android.content.Intent.ACTION_VIEW,
//                        Uri.parse("http://www.example.com"));
//                startActivity(i);
//            }
//        });
//
//        b2 = (Button) findViewById(R.id.button2);
//        b2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(android.content.Intent.ACTION_VIEW,
//                        Uri.parse("tel:9510300000"));
//                startActivity(i);
//            }
//        });
//    }

//    public void startService(View view) {
//        startService(new Intent(getBaseContext(), MyServices.class));
//    }
//
//    public void stopService(View view) {
//        stopService(new Intent(getBaseContext(), MyServices.class));
//    }

//    public void broadcastIntent(View view) {
//        Intent intent = new Intent();
//        intent.setAction("com.myapplication.CUSTOM_INTENT");
//        sendBroadcast(intent);
//        Intent email = new Intent(Intent.ACTION_SEND, Uri.parse("mailto:"));
//        email.putExtra(Intent.EXTRA_EMAIL, "recipients");
//        email.putExtra(Intent.EXTRA_SUBJECT, "subject.getText().toString()");
//        email.putExtra(Intent.EXTRA_TEXT, "body.getText().toString()");
//        startActivity(Intent.createChooser(email, "Choose an email client from..."));
//        Intent read1 = new Intent();
//        read1.setAction(android.content.Intent.ACTION_VIEW);
//        read1.setData(ContactsContract.Contacts.CONTENT_URI);
//        startActivity(read1);
//    }
//}

//        checkBoxHarry = findViewById(R.id.checkboxHarry);
//        checkBoxMattrix = findViewById(R.id.checkboxMattrix);
//        chekCheckBoxJoker = findViewById(R.id.checkboxJoker);
//
//        if (checkBoxHarry.isChecked()) {
//            Toast.makeText(MainActivity.this, "You have watched Harry check box, yet", Toast.LENGTH_SHORT).show();
//        } else {
//            Toast.makeText(MainActivity.this, "You need to watch Harry Potter", Toast.LENGTH_SHORT).show();
//        }
//
//        checkBoxHarry.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
//                if (b) {
//                    Toast.makeText(MainActivity.this, "You have watched Harry check box, yet", Toast.LENGTH_SHORT).show();
//                } else {
//                    Toast.makeText(MainActivity.this, "You need to watch Harry Potter", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
//    }
//}

//import android.content.Intent;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//
//import androidx.annotation.Nullable;
//import androidx.appcompat.app.AppCompatActivity;
//
//import java.util.ArrayList;
//
//public class MainActivity extends AppCompatActivity implements View.OnClickListener {
//    Button btnScanBarCode;
//    ArrayList<String> rssLinks = new ArrayList<>();
//
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        Button btnRediff = findViewById(R.id.btnRediff);
//        Button btnCinemaBlend = findViewById(R.id.btnCinemaBlend);
//        btnRediff.setOnClickListener(this);
//        btnCinemaBlend.setOnClickListener(this);
//        rssLinks.add("http://www.rediff.com/rss/moviesreviewsrss.xml");
//        rssLinks.add("http://www.cinemablend.com/rss_review.php");
//
//
//
////        btnScanBarCode = findViewById(R.id.btnScanBarcode);
////
////        btnScanBarCode.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View view) {
////                startActivity(new Intent(MainActivity.this, ScannedBarcodeActivity.class));
////            }
////        });
//    }
//
//    @Override
//    public void onClick(View view) {
//        Intent intent = new Intent(getApplicationContext(), RSSFeedActivity.class);
//        switch (view.getId()){
//            case R.id.btnRediff:
//                intent.putExtra("rssLink",rssLinks.get(0));
//                startActivity(intent);
//                break;
//            case R.id.btnCinemaBlend:
//                intent.putExtra("rssLink",rssLinks.get(1));
//                startActivity(intent);
//                break;
//        }
//    }
//}

//import android.os.Bundle;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import com.google.android.gms.ads.AdRequest;
//import com.google.android.gms.ads.AdView;
//import com.google.android.gms.ads.MobileAds;
//import com.google.android.gms.ads.initialization.InitializationStatus;
//import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
//
//public class MainActivity extends AppCompatActivity {
//
//    private AdView adView;
//    AdRequest adRequest;
//
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        MobileAds.initialize(this, new OnInitializationCompleteListener() {
//            @Override
//            public void onInitializationComplete(InitializationStatus initializationStatus) {
//            }
//        });
//
//        adView = (AdView) findViewById(R.id.ad_view);
//        adRequest = new AdRequest().Builder().build();
//        adView.loadAd(adRequest);
//    }
//
//    @Override
//    protected void onPause() {
//        if (adView != null){
//            adView.pause();
//        }
//        super.onPause();
//    }
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//        if (adView != null) {
//            adView.resume();
//        }
//    }
//
//    @Override
//    protected void onDestroy() {
//        if (adView != null){
//            adView.destroy();
//        }
//        super.onDestroy();
//    }
//}

//import android.Manifest;
//import android.app.Fragment;
//import android.app.FragmentManager;
//import android.content.pm.PackageManager;
//import android.location.Location;
//import android.os.Build;
//import android.os.Bundle;
//
//import androidx.annotation.RequiresApi;
//import androidx.core.content.ContextCompat;
//
//import com.google.android.gms.common.ConnectionResult;
//import com.google.android.gms.common.api.GoogleApiClient;
//import com.google.android.gms.location.LocationListener;
//import com.google.android.gms.location.LocationRequest;
//import com.google.android.gms.location.LocationServices;
//import com.google.android.gms.maps.CameraUpdateFactory;
//import com.google.android.gms.maps.GoogleMap;
//import com.google.android.gms.maps.OnMapReadyCallback;
//import com.google.android.gms.maps.SupportMapFragment;
//import com.google.android.gms.maps.model.BitmapDescriptorFactory;
//import com.google.android.gms.maps.model.LatLng;
//import com.google.android.gms.maps.model.Marker;
//import com.google.android.gms.maps.model.MarkerOptions;
//
//
//@RequiresApi(api = Build.VERSION_CODES.HONEYCOMB)
//public class MainActivity extends Fragment implements OnMapReadyCallback, LocationListener, GoogleApiClient.ConnectionCallbacks,
//        GoogleApiClient.OnConnectionFailedListener {
//
//    private GoogleMap mMap;
//    Location mLastLocation;
//    Marker mCurrLocationMarker;
//    GoogleApiClient mGoogleApiClient;
//    LocationRequest mLocationRequest;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_maps);
//        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
//        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
//                .findFragmentById(R.id.map);
//        mapFragment.getMapAsync(this);
//
//    }
//
//    private void setContentView(int activity_maps) {
//    }
//
//    @Override
//    public void onMapReady(GoogleMap googleMap) {
//        mMap = googleMap;
//
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
//            if (ContextCompat.checkSelfPermission(this,
//                    Manifest.permission.ACCESS_FINE_LOCATION)
//                    == PackageManager.PERMISSION_GRANTED) {
//                buildGoogleApiClient();
//                mMap.setMyLocationEnabled(true);
//            }
//        }
//        else {
//            buildGoogleApiClient();
//            mMap.setMyLocationEnabled(true);
//        }
//
//    }
//    protected synchronized void buildGoogleApiClient() {
//        GoogleApiClient.Builder builder = new GoogleApiClient.Builder(this);
//        builder.addConnectionCallbacks(this);
//        builder.addOnConnectionFailedListener(this);
//        builder.addApi(LocationServices.API);
//        mGoogleApiClient = builder.build();
//        mGoogleApiClient.connect();
//    }
//
//    @Override
//    public void onConnected(Bundle bundle) {
//
//        mLocationRequest = new LocationRequest();
//        mLocationRequest.setInterval(1000);
//        mLocationRequest.setFastestInterval(1000);
//        mLocationRequest.setPriority(LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY);
//        if (ContextCompat.checkSelfPermission(this,
//                Manifest.permission.ACCESS_FINE_LOCATION)
//                == PackageManager.PERMISSION_GRANTED) {
//            LocationServices.FusedLocationApi.requestLocationUpdates(mGoogleApiClient, mLocationRequest, this);
//        }
//
//    }
//
//    @Override
//    public void onConnectionSuspended(int i) {
//
//    }
//
//    @Override
//    public void onLocationChanged(Location location) {
//
//        mLastLocation = location;
//        if (mCurrLocationMarker != null) {
//            mCurrLocationMarker.remove();
//        }
//        //Place current location marker
//        LatLng latLng = new LatLng(location.getLatitude(), location.getLongitude());
//        MarkerOptions markerOptions = new MarkerOptions();
//        markerOptions.position(latLng);
//        markerOptions.title("Current Position");
//        markerOptions.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
//        mCurrLocationMarker = mMap.addMarker(markerOptions);
//
//        //move map camera
//        mMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));
//        mMap.animateCamera(CameraUpdateFactory.zoomTo(11));
//
//        //stop location updates
//        if (mGoogleApiClient != null) {
//            LocationServices.FusedLocationApi.removeLocationUpdates(mGoogleApiClient, this);
//        }
//
//    }
//
//    @Override
//    public void onConnectionFailed(ConnectionResult connectionResult) {
//
//    }
//}


//import android.os.Bundle;
//
//import androidx.fragment.app.FragmentActivity;
//
//import com.google.android.gms.maps.CameraUpdateFactory;
//import com.google.android.gms.maps.GoogleMap;
//import com.google.android.gms.maps.OnMapReadyCallback;
//import com.google.android.gms.maps.SupportMapFragment;
//import com.google.android.gms.maps.model.LatLng;
//import com.google.android.gms.maps.model.MarkerOptions;
//
//public class MainActivity extends FragmentActivity implements OnMapReadyCallback {
//
//    private GoogleMap mMap;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_maps);
//        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
//        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
//                .findFragmentById(R.id.map);
//        mapFragment.getMapAsync(this);
//    }
//
//    @Override
//    public void onMapReady(GoogleMap googleMap) {
//        mMap = googleMap;
//
//        // Add a marker in Sydney and move the camera
//        LatLng sydney = new LatLng(-34, 151);
//        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
//        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
//    }
//}

//    EditText password, userName;
//    Button login, register;
//    ProgressBar progressBar;
//
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        password = (EditText)findViewById(R.id.editText2);
//        userName = (EditText)findViewById(R.id.editText1);
//        login = (Button)findViewById(R.id.button1);
//        register = (Button)findViewById(R.id.button2);
//
//        progressBar = (ProgressBar)findViewById(R.id.progressBar1);
//        progressBar.setVisibility(View.GONE);
//
//        register.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(MainActivity.this, RegisterUser.class);
//                startActivity(intent);
//            }
//        });
//
//        login.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                progressBar.setVisibility(View.VISIBLE);
//
//                String s1 = userName.getText().toString();
//                String s2 = password.getText().toString();
//                new ExecuteTask().execute(s1,s2);
//            }
//        });
//
//    }
//
//    private class ExecuteTask extends AsyncTask<String,Integer,String> {
//
//        @Override
//        protected String doInBackground(String... strings) {
//            String res = PostData(strings);
//            return res;
//        }
//
//        @SuppressLint("WrongConstant")
//        @Override
//        protected void onPostExecute(String s) {
//            progressBar.setVisibility(View.GONE);
//            Toast.makeText(getApplicationContext(), s, 3000).show();
//        }
//    }
//
//    private String PostData(String[] strings) {
//        String s = "";
//        try {
//            HttpClient httpClient = new DefaultHttpClient();
//            HttpPost httpPost = new HttpPost("http://dev.apeckids.com/api/v2/auth/login");
//
//            List<NameValuePair> list = new ArrayList<NameValuePair>();
//
//            list.add(new BasicNameValuePair("username", strings[0]));
//            list.add(new BasicNameValuePair("password",strings[1]));
//            httpPost.setEntity(new UrlEncodedFormEntity(list));
//            HttpResponse httpResponse=  httpClient.execute(httpPost);
//
//            HttpEntity httpEntity = httpResponse.getEntity();
//            s = readResponse(httpResponse);
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
//        return s;
//    }
//
//    private String readResponse(HttpResponse httpResponse) {
//        InputStream is = null;
//        String return_text = "";
//        try {
//            is = httpResponse.getEntity().getContent();
//            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is));
//            String line = "";
//            StringBuffer sb = new StringBuffer();
//            while ((line = bufferedReader.readLine())!= null){
//                sb.append(line);
//            }
//            return_text = sb.toString();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return return_text;
//    }
//}

//    ImageView anm;
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.logo);
//        anm = (ImageView)findViewById(R.id.anm);
//
//        anm.setBackgroundResource(R.drawable.animation);
//    }
//
//    public void onWindowFocusChanged(boolean hasFocus) {
//        super.onWindowFocusChanged(hasFocus);
//        AnimationDrawable frameAnimation = (AnimationDrawable) anm.getBackground();
//        if (hasFocus){
//            frameAnimation.start();
//        }else{
//            frameAnimation.stop();
//        }
//    }
//}


//    DemoView demoView;
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        demoView = new DemoView(this);
//        setContentView(demoView);
//    }
//
//    private class DemoView extends View {
//
//        public DemoView(Context context) {
//            super(context);
//        }
//
//        @Override
//        protected void onDraw(Canvas canvas) {
//            super.onDraw(canvas);
//            Paint paint = new Paint();
//            paint.setStyle(Paint.Style.FILL);
//            paint.setColor(Color.WHITE);
//            canvas.drawPaint(paint);
//
//            paint.setAntiAlias(false);
//            paint.setColor(Color.BLUE);
//            canvas.drawCircle(20,20,15,paint);
//
//            paint.setAntiAlias(true);
//            paint.setColor(Color.GREEN);
//            canvas.drawCircle(60,20,15, paint);
//
//            paint.setAntiAlias(false);
//            paint.setColor(Color.RED);
//            canvas.drawRect(100, 5, 200, 30, paint);
//
//            canvas.rotate(-45);
//            paint.setStyle(Paint.Style.FILL);
//            canvas.drawText("Graphics Rotation", 40,180, paint);
//
////            canvas.restore();
//        }
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.main, menu);
//        return true;
//    }
//}

//    SensorManager sm = null;
//    TextView textView1 = null;
//    List list;
//
//    SensorEventListener sel = new SensorEventListener() {
//        @Override
//        public void onSensorChanged(SensorEvent sensorEvent) {
//            float[] values = sensorEvent.values;
//            textView1.setText("x: " + values[0] + "\ny: " + values[1] + "\nz: " + values[2]);
//        }
//
//        @Override
//        public void onAccuracyChanged(Sensor sensor, int i) {
//
//        }
//    };
//
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        sm = (SensorManager) getSystemService(SENSOR_SERVICE);
//
//        textView1 = (TextView)findViewById(R.id.textView1);
//
//        list = sm.getSensorList(Sensor.TYPE_ACCELEROMETER);
//        if (list.size() > 0) {
//            sm.registerListener(sel,(Sensor)list.get(0), SensorManager.SENSOR_DELAY_NORMAL);
//        } else {
//            Toast.makeText(getBaseContext(),"Error: No Acceleromenter.",Toast.LENGTH_LONG).show();
//        }
//    }
//
//    @Override
//    protected void onStop() {
//        if (list.size() > 0) {
//            sm.unregisterListener(sel);
//        }
//        super.onStop();
//    }
//}

//    private static final int CAMERA_REQUEST = 1888;
//    ImageView imageView;
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        imageView = (ImageView)findViewById(R.id.imageView1);
//        Button photoButton = (Button)findViewById(R.id.button1);
//
//        photoButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
//                startActivityForResult(cameraIntent, CAMERA_REQUEST);
//            }
//        });
//    }
//
//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        if (requestCode == CAMERA_REQUEST) {
//            Bitmap photo = (Bitmap) data.getExtras().get("data");
//            imageView.setImageBitmap(photo);
//        }
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.activity_main, menu);
//        return true;
//    }
//}

//public class MainActivity extends Activity implements TextToSpeech.OnInitListener {
//public class MainActivity extends Activity {
//    TextView textView1;
//    private static final int REQUEST_ENABLE_BT = 1;
//    BluetoothAdapter btAdapter;
//    Button enableButton, disableButton;
//
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        enableButton = (Button)findViewById(R.id.button1);
//        disableButton = (Button)findViewById(R.id.button2);
//
//        enableButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                WifiManager wifi = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
//                wifi.setWifiEnabled(true);
//            }
//        });
//
//        disableButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                WifiManager wifi = (WifiManager)getApplicationContext().getSystemService(Context.WIFI_SERVICE);
//                wifi.setWifiEnabled(false);
//            }
//        });
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.activity_main, menu);
//        return true;
//    }
//}

//        textView1 = (TextView)findViewById(R.id.textView1);
//        btAdapter = BluetoothAdapter.getDefaultAdapter();
//        textView1.append("\nAdapter: " + btAdapter);
//
//        checkBluetoothState();
//    }
//
//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//        if (requestCode == REQUEST_ENABLE_BT) {
//            checkBluetoothState();
//        }
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//    }
//
//    private void checkBluetoothState() {
//        if (btAdapter==null) {
//            textView1.append("\nBluetooth NOT supported.Aborting.");
//            return;
//        } else {
//            if (btAdapter.isEnabled()) {
//                textView1.append("\nBluetooth is enabled ...");
//
//                textView1.append("\nPared Devices are: ");
//                Set<BluetoothDevice> devices = btAdapter.getBondedDevices();
//                for (BluetoothDevice device: devices) {
//                    textView1.append("\n Device: "+device.getName() + ", "+device);
//                }
//            } else {
//                Intent enableBtIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
//                startActivityForResult(enableBtIntent, REQUEST_ENABLE_BT);
//            }
//        }
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.activity_main, menu);
//        return true;
//    }
//}

//    EditText mobileno, message, editTextTo, editTextSubject, editTextMessage;
//    Button sendsms, send;
//
//    private static final int REQUEST_ENABLE_BT = 0;
//    private static final int REQUEST_DISCOVERABLE_BT = 0;
//
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        final TextView out = (TextView)findViewById(R.id.out);
//        final Button button1 = (Button)findViewById(R.id.button1);
//        final Button button2 = (Button)findViewById(R.id.button2);
//        final Button button3 = (Button)findViewById(R.id.button3);
//        final BluetoothAdapter mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
//        if (mBluetoothAdapter == null) {
//            out.append("device not supported");
//        }
//        button1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (!mBluetoothAdapter.isEnabled()) {
//                    Intent enableBtIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
//                    startActivityForResult(enableBtIntent, REQUEST_ENABLE_BT);
//                }
//            }
//        });
//
//        button2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (!mBluetoothAdapter.isDiscovering()) {
//                    Toast.makeText(getApplicationContext(),"MAKING YOUR DEVICE DISCOVERABLE",Toast.LENGTH_LONG).show();
//
//                    Intent enableBtIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_DISCOVERABLE);
//                    startActivityForResult(enableBtIntent, REQUEST_DISCOVERABLE_BT);
//                }
//            }
//        });
//
//        button3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                mBluetoothAdapter.disable();
//                Toast.makeText(getApplicationContext(),"TURNING_OFF BLUETOOTH", Toast.LENGTH_LONG).show();
//            }
//        });
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.activity_main,menu);
//        return true;
//    }
//}

//        editTextTo = (EditText) findViewById(R.id.editText1);
//        editTextSubject = (EditText) findViewById(R.id.editText2);
//        editTextMessage = (EditText) findViewById(R.id.editText3);
//
//        send = (Button)findViewById(R.id.button1);
//
//        send.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String to = editTextTo.getText().toString();
//                String subject = editTextSubject.getText().toString();
//                String message = editTextMessage.getText().toString();
//
//                Intent email = new Intent(Intent.ACTION_SEND);
//                email.putExtra(Intent.EXTRA_EMAIL, new String[]{to});
//                email.putExtra(Intent.EXTRA_SUBJECT, subject);
//                email.putExtra(Intent.EXTRA_TEXT, message);
//
//                email.setType("message/rfc822");
//                startActivity(Intent.createChooser(email, "Choose an Email client:"));
//            }
//        });
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//
//        getMenuInflater().inflate(R.menu.activity_main, menu);
//        return true;
//    }
//}

//        mobileno = (EditText)findViewById(R.id.editText1);
//        message = (EditText)findViewById(R.id.editText2);
//        sendsms = (Button)findViewById(R.id.button1);
//
//        sendsms.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String no = mobileno.getText().toString();
//                String msg = message.getText().toString();
//
//                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
//                PendingIntent pi = PendingIntent.getActivity(getApplicationContext(),0,intent,0);
//
//                SmsManager sms = SmsManager.getDefault();
//                sms.sendTextMessage(no, null, msg, pi, null);
//                Toast.makeText(getApplicationContext(),"Message Sent successfully!", Toast.LENGTH_LONG).show();
//            }
//        });
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.activity_main,menu);
//        return true;
//    }
//}

//    TextView textView1;
//    private TextToSpeech tts;
//    EditText editText1;
//    Button button1;

//        editText1 = (EditText)findViewById(R.id.editText1);
//        button1 = (Button)findViewById(R.id.button1);
//
//        button1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String number = editText1.getText().toString();
//                Intent callIntent = new Intent(Intent.ACTION_CALL);
//                Log.e("TAG",number);
//                callIntent.setData(Uri.parse("tel:"+number));
//                startActivity(callIntent);
//            }
//        });
//
//
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.activity_main, menu);
//        return true;
//    }
//}

//        tts = new TextToSpeech(this, this);
//        TelephonyManager telephonyManager = (TelephonyManager)getSystemService(Context.TELEPHONY_SERVICE);
//
//        PhoneStateListener callStateListener = new PhoneStateListener(){
//            @Override
//            public void onCallStateChanged(int state, String phoneNumber) {
//                if (state == TelephonyManager.CALL_STATE_RINGING) {
//                    tts.speak(phoneNumber + " calling", TextToSpeech.QUEUE_FLUSH,null);
//                    Toast.makeText(getApplicationContext(),"Phone is Ringin: " + phoneNumber, Toast.LENGTH_LONG).show();
//                }
//                if (state == TelephonyManager.CALL_STATE_OFFHOOK) {
//                    Toast.makeText(getApplicationContext(),"Phone in a call or call picked",Toast.LENGTH_LONG).show();
//                }
//                if (state == TelephonyManager.CALL_STATE_IDLE) {
//                    // phone is neither ringing in a call
//                }
//            }
//        };
//        telephonyManager.listen(callStateListener,PhoneStateListener.LISTEN_CALL_STATE);
//    }
//
//
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.main, menu);
//        return true;
//    }
//
//    @Override
//    public void onInit(int i) {
//        if (i == TextToSpeech.SUCCESS) {
//            int result = tts.setLanguage(Locale.US);
//            if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED) {
//                Log.e("TTS","This Language is not supported");
//            } else {
//
//            }
//        } else {
//            Log.e("TTS","Initillization Failed!");
//        }
//    }
//
//    @Override
//    protected void onDestroy() {
//        if (tts != null) {
//            tts.stop();
//            tts.shutdown();
//        }
//        super.onDestroy();
//    }
//}
//
//        TelephonyManager telephonyManager = (TelephonyManager)getSystemService(Context.TELEPHONY_SERVICE);
//        PhoneStateListener callStateListener = new PhoneStateListener() {
//            public void onCallStateChange(int state, String incomingNumber) {
//                if (state == TelephonyManager.CALL_STATE_RINGING) {
//                    Toast.makeText(getApplicationContext(),"Phone Is Ringing",Toast.LENGTH_LONG).show();
//                }
//                if (state == TelephonyManager.CALL_STATE_OFFHOOK) {
//                    Toast.makeText(getApplicationContext(),"Phone is currently in a call",Toast.LENGTH_LONG).show();
//                }
//                if (state == TelephonyManager.CALL_STATE_IDLE) {
//                    Toast.makeText(getApplicationContext(),"Phone is neither ringing nor in a call",Toast.LENGTH_LONG).show();
//                }
//            }
//        };
//        telephonyManager.listen(callStateListener, PhoneStateListener.LISTEN_CALL_STATE);
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.main, menu);
//        return true;
//    }
//}


//        textView1 = (TextView) findViewById(R.id.textView1);
//
//        //Get the instance of TelephonyManager
//        TelephonyManager tm = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
//
//        //Calling the methods of TelephonyManager the returns the information
//        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.READ_PHONE_STATE) != PackageManager.PERMISSION_GRANTED) {
//            return;
//        }
//        String IMEINumber = tm.getDeviceId();
//        String subscriberID = tm.getDeviceId();
//        String SIMSerialNumber = tm.getSimSerialNumber();
//        String networkCountryISO = tm.getNetworkCountryIso();
//        String SIMCountryISO = tm.getSimCountryIso();
//        String softwareVersion = tm.getDeviceSoftwareVersion();
//        String voiceMailNumber = tm.getVoiceMailNumber();
//
//        //Get the phone type
//        String strphoneType = "";
//
//        int phoneType = tm.getPhoneType();
//
//        switch (phoneType) {
//            case (TelephonyManager.PHONE_TYPE_CDMA):
//                strphoneType = "CDMA";
//                break;
//            case (TelephonyManager.PHONE_TYPE_GSM):
//                strphoneType = "GSM";
//                break;
//            case (TelephonyManager.PHONE_TYPE_NONE):
//                strphoneType = "NONE";
//                break;
//        }
//
//        //getting information if phone is in roaming
//        boolean isRoaming = tm.isNetworkRoaming();
//
//        String info = "Phone Details:\n";
//        info += "\n IMEI Number:" + IMEINumber;
//        info += "\n SubscriberID:" + subscriberID;
//        info += "\n Sim Serial Number:" + SIMSerialNumber;
//        info += "\n Network Country ISO:" + networkCountryISO;
//        info += "\n SIM Country ISO:" + SIMCountryISO;
//        info += "\n Software Version:" + softwareVersion;
//        info += "\n Voice Mail Number:" + voiceMailNumber;
//        info += "\n Phone Network Type:" + strphoneType;
//        info += "\n In Roaming? :" + isRoaming;
//
//        textView1.setText(info);
//    }
//}
//        textView1 = (TextView) findViewById(R.id.textView1);
//
//        TelephonyManager tm = (TelephonyManager)getSystemService(Context.TELEPHONY_SERVICE);
//
//        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.READ_PHONE_STATE) != PackageManager.PERMISSION_GRANTED) {
//            return;
//        }
//        Log.e("INFO","Run Here");
//
//        String IMEINumber = tm.getDeviceId();
//        String subscriberID = tm.getSubscriberId();
//        String SIMSerialNumber = tm.getSimSerialNumber();
//        String networkCountryISO = tm.getNetworkCountryIso();
//        String SIMCountryISO = tm.getSimCountryIso();
//        String softwareVersion = tm.getDeviceSoftwareVersion();
//        String voiceMailNumber = tm.getVoiceMailNumber();
//
//        String strphoneType = "";
//        int phoneType = tm.getPhoneType();
//
//        switch (phoneType) {
//            case (TelephonyManager.PHONE_TYPE_CDMA):
//                strphoneType = "CDMA";
//                break;
//            case (TelephonyManager.PHONE_TYPE_GSM):
//                strphoneType = "GSM";
//                break;
//            case (TelephonyManager.PHONE_TYPE_NONE):
//                strphoneType = "NONE";
//                break;
//        }
//
//        boolean isRoaming = tm.isNetworkRoaming();
//        String info = "Phone DetailsL: \n";
//        info += "\n IMEI Number: " + IMEINumber;
//        info += "\n SubscriberID: " + subscriberID;
//        info += "\n Sim Serial Number: " + SIMSerialNumber;
//        info += "\n Network Country ISO: " + SIMCountryISO;
//        info += "\n Software Version: " + softwareVersion;
//        info += "\n Voice Mail Number: " + voiceMailNumber;
//        info += "\n Phone Network type " + strphoneType;
//        info += "\n Is Roaming?: " + isRoaming;
//
//        textView1.setText(info);
//    }
//}

//
//public class MainActivity extends Activity implements TextToSpeech.OnInitListener, AdapterView.OnItemSelectedListener {
//
//    private TextToSpeech tts;
//    private Button buttonSpeak;
//    private EditText editText;
//    private Spinner speedSpinner, pitchSpinner;
//    private static String speed = "Normal";
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        tts = new TextToSpeech(this, this);
//        buttonSpeak = (Button) findViewById(R.id.button1);
//        editText = (EditText) findViewById(R.id.editText1);
//        speedSpinner = (Spinner) findViewById(R.id.spinner1);
//
//        loadSpinnerData();
//        speedSpinner.setOnItemSelectedListener(this);
//
//        buttonSpeak.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                setSpeed();
//                speakOut();
//            }
//        });
//    }
//
//    private void speakOut() {
//        String text = editText.getText().toString();
//        tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
//    }
//
//    private void setSpeed() {
//        if (speed.equals("Very Slow")){
//            tts.setSpeechRate(0.1f);
//        } else if (speed.equals("Slow")){
//            tts.setSpeechRate(0.5f);
//        } else if (speed.equals("Normal")){
//            tts.setSpeechRate(1.0f);
//        } else if (speed.equals("Fast")){
//            tts.setSpeechRate(1.5f);
//        } else if (speed.equals("Very Fast")){
//            tts.setSpeechRate(2.0f);
//        }
//    }
//
//    private void loadSpinnerData() {
//
//        List<String> labels = new ArrayList<String>();
//        labels.add("Very Slow");
//        labels.add("Slow");
//        labels.add("Normal");
//        labels.add("Fast");
//        labels.add("Very Fast");
//
//        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, labels);
//
//        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        speedSpinner.setAdapter(dataAdapter);
//    }
//
//    @Override
//    public void onInit(int i) {
//        if (i == TextToSpeech.SUCCESS) {
//            int result = tts.setLanguage(Locale.US);
//            if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED) {
//                Log.e("TTS", "This Language is not Support");
//            } else {
//                buttonSpeak.setEnabled(true);
//                speakOut();
//            }
//        } else {
//            Log.e("TTS","Initillzation Failed!");
//        }
//    }
//
//    @Override
//    protected void onDestroy() {
//        if (tts != null) {
//            tts.stop();
//            tts.shutdown();
//        }
//        super.onDestroy();
//    }
//
//    @Override
//    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
//        speed = adapterView.getItemAtPosition(i).toString();
//
//        Toast.makeText(adapterView.getContext(), "You selected: " + i, Toast.LENGTH_LONG).show();
//    }
//
//    @Override
//    public void onNothingSelected(AdapterView<?> adapterView) {
//
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.activity_main, menu);
//        return true;
//    }
//}

//    private TextToSpeech tts;
//    private Button buttonSpeak;
//    private EditText editText;
//
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        tts = new TextToSpeech(this, this);
//        buttonSpeak= (Button)findViewById(R.id.button1);
//        editText = (EditText)findViewById(R.id.editText1);
//
//        buttonSpeak.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                speakOut();
//            }
//        });
//    }
//
//    @Override
//    protected void onDestroy() {
//        if (tts != null) {
//            tts.stop();
//            tts.shutdown();
//        }
//        super.onDestroy();
//    }
//
//    @Override
//    public void onInit(int status) {
//        if (status == TextToSpeech.SUCCESS){
//            int result = tts.setLanguage(Locale.US);
//
//            if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED) {
//                Log.e("TTS","This language is not support");
//            } else {
//                buttonSpeak.setEnabled(true);
//                speakOut();
//            }
//        } else {
//            Log.e("TTS", "Initilization Failed!");
//        }
//    }
//
//    private void speakOut() {
//        String text = editText.getText().toString();
//        tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.activity_main, menu);
//        return true;
//    }
//}

//    MediaRecorder recorder;
//    File audiofile = null;
//    static final String TAG = "MediaRecording";
//    Button startButton,stopButton;
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        startButton = (Button) findViewById(R.id.button1);
//        stopButton = (Button) findViewById(R.id.button2);
//    }
//
//    public void startRecording(View view) throws IOException {
//        startButton.setEnabled(false);
//        stopButton.setEnabled(true);
//        //Creating file
//        File dir = Environment.getExternalStorageDirectory();
//        try {
//            audiofile = File.createTempFile("sound", ".3gp", dir);
//        } catch (IOException e) {
//            Log.e(TAG, "external storage access error");
//            return;
//        }
//        //Creating MediaRecorder and specifying audio source, output format, encoder & output format
//        recorder = new MediaRecorder();
//        recorder.setAudioSource(MediaRecorder.AudioSource.MIC);
//        recorder.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
//        recorder.setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB);
//        recorder.setOutputFile(audiofile.getAbsolutePath());
//        recorder.prepare();
//        recorder.start();
//    }
//
//    public void stopRecording(View view) {
//        startButton.setEnabled(true);
//        stopButton.setEnabled(false);
//        //stopping recorder
//        recorder.stop();
//        recorder.release();
//        //after stopping the recorder, create the sound file and add it to media library.
//        addRecordingToMediaLibrary();
//    }
//
//    protected void addRecordingToMediaLibrary() {
//        //creating content values of size 4
//        ContentValues values = new ContentValues(4);
//        long current = System.currentTimeMillis();
//        values.put(MediaStore.Audio.Media.TITLE, "audio" + audiofile.getName());
//        values.put(MediaStore.Audio.Media.DATE_ADDED, (int) (current / 1000));
//        values.put(MediaStore.Audio.Media.MIME_TYPE, "audio/3gpp");
//        values.put(MediaStore.Audio.Media.DATA, audiofile.getAbsolutePath());
//
//        //creating content resolver and storing it in the external content uri
//        ContentResolver contentResolver = getContentResolver();
//        Uri base = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
//        Uri newUri = contentResolver.insert(base, values);
//
//        //sending broadcast message to scan the media file so that it can be available
//        sendBroadcast(new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE, newUri));
//        Toast.makeText(this, "Added File " + newUri, Toast.LENGTH_LONG).show();
//    }
//}

//import android.app.Activity;
//import android.content.ContentResolver;
//import android.content.ContentValues;
//import android.content.Intent;
//import android.media.MediaRecorder;
//import android.net.Uri;
//import android.os.Bundle;
//import android.os.Environment;
//import android.provider.MediaStore;
//import android.util.Log;
//import android.view.View;
//import android.widget.Button;
//import android.widget.Toast;
//
//import androidx.annotation.Nullable;
//
//import java.io.File;
//import java.io.IOException;
//
//public class MainActivity extends Activity {
//    MediaRecorder recorder;
//    File audiofile = null;
//    static final String TAG = "MediaRecording";
//    Button startButton, stopButton;
//
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        startButton = (Button)findViewById(R.id.button1);
//        stopButton = (Button)findViewById(R.id.button2);
//    }
//
////    public void startRecording(View view) throws IOException {
////        startButton.setEnabled(false);
////        stopButton.setEnabled(true);
////
////        File dir = Environment.getExternalStorageDirectory();
////        try {
////            audiofile = File.createTempFile("sound","3gp",dir);
////        } catch (IOException e){
////            Log.e(TAG,"external storage access error");
////            return;
////        }
////
////        recorder = new MediaRecorder();
////        recorder.setAudioSource(MediaRecorder.AudioSource.MIC);
////        recorder.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
////        recorder.setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB);
////        recorder.setOutputFile(audiofile.getAbsolutePath());
////        recorder.prepare();
////        recorder.start();
////    }
//
//    public void startRecording(View view) throws IOException {
//        startButton.setEnabled(false);
//        stopButton.setEnabled(true);
//        //Creating file
//        File dir = Environment.getExternalStorageDirectory();
//        try {
//            audiofile = File.createTempFile("sound", ".3gp", dir);
//        } catch (IOException e) {
//            Log.e(TAG, "external storage access error");
//            return;
//        }
//        //Creating MediaRecorder and specifying audio source, output format, encoder & output format
//        recorder = new MediaRecorder();
//        recorder.setAudioSource(MediaRecorder.AudioSource.MIC);
//        recorder.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
//        recorder.setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB);
//        recorder.setOutputFile(audiofile.getAbsolutePath());
//        recorder.prepare();
//        recorder.start();
//    }
//
//    public void stopRecording(View view) {
//        startButton.setEnabled(true);
//        stopButton.setEnabled(false);
//        //stopping recorder
//        recorder.stop();
//        recorder.release();
//        //after stopping the recorder, create the sound file and add it to media library.
//        addRecordingToMediaLibrary();
//    }
//
//    protected void addRecordingToMediaLibrary() {
//        //creating content values of size 4
//        ContentValues values = new ContentValues(4);
//        long current = System.currentTimeMillis();
//        values.put(MediaStore.Audio.Media.TITLE, "audio" + audiofile.getName());
//        values.put(MediaStore.Audio.Media.DATE_ADDED, (int) (current / 1000));
//        values.put(MediaStore.Audio.Media.MIME_TYPE, "audio/3gpp");
//        values.put(MediaStore.Audio.Media.DATA, audiofile.getAbsolutePath());
//
//        //creating content resolver and storing it in the external content uri
//        ContentResolver contentResolver = getContentResolver();
//        Uri base = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
//        Uri newUri = contentResolver.insert(base, values);
//
//        //sending broadcast message to scan the media file so that it can be available
//        sendBroadcast(new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE, newUri));
//        Toast.makeText(this, "Added File " + newUri, Toast.LENGTH_LONG).show();
//    }
//}

//    public void stopRecording(View view) {
//        startButton.setEnabled(true);
//        stopButton.setEnabled(false);
//
//        recorder.stop();
//        recorder.release();
//        addRecordingToMediaLibrary();
//    }
//
//    private void addRecordingToMediaLibrary() {
//        ContentValues values = new ContentValues(4);
//        long current = System.currentTimeMillis();
//        values.put(MediaStore.Audio.Media.TITLE,"audio"+audiofile.getName());
//        values.put(MediaStore.Audio.Media.DATE_ADDED,(int)(current/1000));
//        values.put(MediaStore.Audio.Media.MIME_TYPE,"audio/3gp");
//        values.put(MediaStore.Audio.Media.DATA, audiofile.getAbsolutePath());
//
//        ContentResolver contentResolver = getContentResolver();
//        Uri base = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
//        Uri newUri = contentResolver.insert(base, values);
//
//        sendBroadcast(new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE, newUri));
//        Toast.makeText(this,"Added File"+newUri,Toast.LENGTH_LONG).show();
//    }
//}

//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        VideoView videoView = (VideoView) findViewById(R.id.videoView1);
//        MediaController mediaController = new MediaController(this);
//        mediaController.setAnchorView(videoView);
//
//        Uri uri = Uri.parse(Environment.getExternalStorageDirectory().getPath()+"SDCARD/Movies/sample-mp4-file.mp4");
//
//        videoView.setMediaController(mediaController);
//        videoView.setVideoURI(uri);
//        videoView.requestFocus();
//        videoView.start();
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.activity_main, menu);
//        return true;
//    }
//}

//    public static final String JSON_STRING = "{\"employee\":{\"name\":\"Sachin\",\"salary\":56000}}";
//    Button start, pause, stop;
//
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        start = (Button) findViewById(R.id.button1);
//        pause = (Button) findViewById(R.id.button2);
//        stop = (Button) findViewById(R.id.button3);
//
//        final MediaPlayer mp = new MediaPlayer();
//        try {
//            mp.setDataSource(Environment.getExternalStorageDirectory().getPath()+"SDCARD/Download/Exmaple.mp3");
//            mp.prepare();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        start.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                mp.start();
//            }
//        });
//
//        pause.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                mp.pause();
//            }
//        });
//
//        stop.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                mp.stop();
//            }
//        });
//    }
//}

//        MediaPlayer mp = new MediaPlayer();
//        try {
//            mp.setDataSource("/sdcard/Music/maine.mp3");
//            mp.prepare();
//            mp.start();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.activity_main, menu);
//        return true;
//    }
//}

//        TextView textView1 = (TextView) findViewById(R.id.textView1);
//
//        try {
//            JSONObject emp = (new JSONObject(JSON_STRING)).getJSONObject("employee");
//            String empname = emp.getString("name");
//            int empsalary = emp.getInt("salary");
//
//            String str = "Employ Name: " + empname + " Employee Salary: " + empsalary;
//            textView1.setText(str);
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }

//        TextView output = (TextView) findViewById(R.id.textView1);
//        String strJson = "{\"Employee\": [{\"id\":\"101\",\"Name\": \"Snoo chiin\",\"salary\": \"50000\"},{\"id\":\"102\",\"Name\": \"Vimal content\",\"salary\": \"60000\"}]}";
//        String data = "";
//        try {
//            JSONObject jsonRootObject = new JSONObject((strJson));
//            JSONArray jsonArray = jsonRootObject.optJSONArray("Employee");
//
//            for (int i = 0; i < jsonArray.length(); i ++) {
//                JSONObject jsonObject = jsonArray.getJSONObject(i);
//
//                int id = Integer.parseInt(jsonObject.optString("id").toString());
//                String name = jsonObject.optString("name").toString();
//                float salary = Float.parseFloat(jsonObject.optString("salary").toString());
//
//                data += "Node"+i+"\n id ="+id+"\n Name= "+name+"\n Salary= " + salary+"\n";
//            }
//            output.setText(data);
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
//    }
//}

//public class MainActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        ListView listView = (ListView) findViewById(R.id.listView1);
//
//        List<Employee> employees = null;
//        try {
//            XMLPullParserHandler parser = new XMLPullParserHandler();
//            InputStream is = getAssets().open("employees.xml");
//            employees = parser.parse(is);
//
//            ArrayAdapter<Employee> adapter = new ArrayAdapter<Employee>(this, android.R.layout.simple_list_item_1, employees);
//            listView.setAdapter(adapter);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.menu_main_custome, menu);
//        return true;
//    }
//}

//    TextView tv1;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        tv1 = (TextView) findViewById(R.id.textView1);
//        try {
//            InputStream is = getAssets().open("file.xml");
//
//            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
//            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
//            Document doc = dBuilder.parse(is);
//
//            Element element = doc.getDocumentElement();
//            element.normalize();
//
//            NodeList nList = doc.getElementsByTagName("employee");
//            for (int i = 0; i < nList.getLength();i++) {
//                Node node = nList.item(i);
//
//                if (node.getNodeType() == Node.ELEMENT_NODE){
//                    Element element2 = (Element) node;
//                    tv1.setText(tv1.getText()+"\nName: " + getValue("name",element2)+"\n");
//                    tv1.setText(tv1.getText()+"\nSalary: " + getValue("salary",element2)+"\n");
//                    tv1.setText(tv1.getText()+"---------------");
//                }
//            }
//        } catch (IOException | ParserConfigurationException | SAXException e) {
//            e.printStackTrace();
//        }
//    }
//
//    private String getValue(String name, Element element) {
//        NodeList nodeList = element.getElementsByTagName(name).item(0).getChildNodes();
//        Node node = (Node) nodeList.item(0);
//        return node.getNodeValue();
//    }
//}
//        tv = (TextView) findViewById(R.id.textView1);
//        try {
//            SAXParserFactory factory = SAXParserFactory.newInstance();
//            SAXParser saxParser = factory.newSAXParser();
//
//            DefaultHandler handler = new DefaultHandler() {
//                boolean name = false;
//                boolean salary = false;
//
//                public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
//                    if (qName.equalsIgnoreCase("name")) {
//                        name = true;
//                    }
//                    if (qName.equalsIgnoreCase("salary")) {
//                        salary = true;
//                    }
//                }
//
//                public void endElement(String uri, String localName, String qName) throws SAXException {
//
//                }
//
//                public void characters(char ch[], int start, int length) throws SAXException {
//                    if (name) {
//                        tv.setText(tv.getText()+"\n Name: " + new String(ch, start, length));
//                        name=false;
//                    }
//                    if (salary){
//                        tv.setText(tv.getText() +"\n Salary: " + new String(ch, start, length));
//                        salary = false;
//                    }
//                }
////                end of characters method
//            };
//
//            InputStream is = getAssets().open("file.xml");
//            saxParser.parse(is, handler);
//        } catch (SAXException e) {
//            e.printStackTrace();
//        } catch (ParserConfigurationException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}

//    Spinner spinner;
//    Button btnAdd;
//    EditText inputLabel;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        spinner = findViewById(R.id.spinner);
//        btnAdd = findViewById(R.id.btn_add);
//        inputLabel = findViewById(R.id.input_label);
//
//        spinner.setOnItemSelectedListener(this);
//
//        loadSpinnerData();
//
//        btnAdd.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String label = inputLabel.getText().toString();
//
//                if (label.trim().length() > 0) {
//                    DatabaseHandler db = new DatabaseHandler(getApplicationContext());
//                    db.insertLabel(label);
//
//                    inputLabel.setText("");
//
//                    InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
//                    imm.hideSoftInputFromWindow(inputLabel.getWindowToken(),0);
//                    loadSpinnerData();
//                }else {
//                    Toast.makeText(getApplicationContext(),"Please enter label name",Toast.LENGTH_LONG).show();
//                }
//            }
//        });
//    }
//
//    private void loadSpinnerData() {
//        DatabaseHandler db = new DatabaseHandler(getApplicationContext());
//        List<String> labels = db.getAllLabels();
//
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, labels);
//
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner.setAdapter(adapter);
//    }
//
//
//    @Override
//    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
//        String label = adapterView.getItemAtPosition(i).toString();
//
//        Toast.makeText(adapterView.getContext(),"You selected: " + label, Toast.LENGTH_LONG).show();
//    }
//
//    @Override
//    public void onNothingSelected(AdapterView<?> adapterView) {
//    }
//}

//        EditText editTextFileName, editTextData;
//        Button saveButton, readButton;
//        DatabaseHandler db = new DatabaseHandler(this);
//
//        Log.d("Insert: ", "Inserting ...");
//        db.addContact(new Contact("Ravi","910000"));
//        db.addContact(new Contact("Shiva","910000"));
//        db.addContact(new Contact("Tommy","910000"));
//        db.addContact(new Contact("Kathirk","910000"));
//
//        Log.d("Reading...","Reading all contacts");
//        List<Contact> contacts = db.getAllContacts();
//
//        for (Contact c : contacts){
//            String log = "Id: " + c.get_id() + " ,Name: "+c.get_name()+" , phone: " + c.get_phone_number();
//            Log.d("Name: ",log);
//        }
//    }
//}

//        editTextFileName=findViewById(R.id.editText1);
//        editTextData=findViewById(R.id.editText2);
//        saveButton=findViewById(R.id.button1);
//        readButton=findViewById(R.id.button2);
//
//        //Performing action on save button
//        saveButton.setOnClickListener(new View.OnClickListener(){
//
//            @Override
//            public void onClick(View arg0) {
//                String filename=editTextFileName.getText().toString();
//                String data=editTextData.getText().toString();
//
//                FileOutputStream fos;
//                try {
//                    File myFile = new File("/sdcard/"+filename);
//                    myFile.createNewFile();
//                    FileOutputStream fOut = new FileOutputStream(myFile);
//                    OutputStreamWriter myOutWriter = new OutputStreamWriter(fOut);
//                    myOutWriter.append(data);
//                    myOutWriter.close();
//                    fOut.close();
//                    Toast.makeText(getApplicationContext(),filename + "saved",Toast.LENGTH_LONG).show();
//                } catch (FileNotFoundException e) {e.printStackTrace();}
//                catch (IOException e) {e.printStackTrace();}
//            }
//        });
//
//        //Performing action on Read Button
//        readButton.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View arg0) {
//                String filename=editTextFileName.getText().toString();
//                StringBuffer stringBuffer = new StringBuffer();
//                String aDataRow = "";
//                String aBuffer = "";
//                try {
//                    File myFile = new File("/sdcard/"+filename);
//                    FileInputStream fIn = new FileInputStream(myFile);
//                    BufferedReader myReader = new BufferedReader(
//                            new InputStreamReader(fIn));
//                    while ((aDataRow = myReader.readLine()) != null) {
//                        aBuffer += aDataRow + "\n";
//                    }
//                    myReader.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//                Toast.makeText(getApplicationContext(),aBuffer,Toast.LENGTH_LONG).show();
//            }
//        });
//    }
//}

//public class MainActivity extends AppCompatActivity {
//    private EditText editText;
//    private TextView textView;
//    private Button saveButton;
//    private Button readButton;
//    private Button listButton;
//
//    private static final String LOG_TAG = "ExternalStorageDemo";
//
//
//    private static final int REQUEST_ID_READ_PERMISSION = 100;
//    private static final int REQUEST_ID_WRITE_PERMISSION = 200;
//
//    private final String fileName = "note.txt";
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        editText = (EditText) findViewById(R.id.editText);
//        textView = (TextView) findViewById(R.id.textView);
//
//        saveButton = (Button) findViewById(R.id.button_save);
//        readButton = (Button) findViewById(R.id.button_read);
//        listButton = (Button) findViewById(R.id.button_list);
//
//        saveButton.setOnClickListener(new OnClickListener() {
//
//            @Override
//            public void onClick(View arg0) {
//                askPermissionAndWriteFile();
//            }
//
//        });
//
//        readButton.setOnClickListener(new OnClickListener() {
//
//            @Override
//            public void onClick(View arg0) {
//                askPermissionAndReadFile();
//            }
//
//        });
//
//        listButton.setOnClickListener(new OnClickListener() {
//
//            @Override
//            public void onClick(View arg0) {
//                listExternalStorages();
//            }
//
//        });
//    }
//
//    private void askPermissionAndWriteFile() {
//        boolean canWrite = this.askPermission(REQUEST_ID_WRITE_PERMISSION,
//                Manifest.permission.WRITE_EXTERNAL_STORAGE);
//        if (!canWrite) {
//            Toast.makeText(getApplicationContext(),
//                    "You do not allow this app to write files.", Toast.LENGTH_LONG).show();
//            return;
//        }
//        //
//        this.writeFile();
//    }
//
//    private void askPermissionAndReadFile() {
//        boolean canRead = this.askPermission(REQUEST_ID_READ_PERMISSION,
//                Manifest.permission.READ_EXTERNAL_STORAGE);
//        //
//        if (!canRead) {
//            Toast.makeText(getApplicationContext(),
//                    "You do not allow this app to read files.", Toast.LENGTH_LONG).show();
//            return;
//        }
//        //
//        this.readFile();
//    }
//
//    // With Android Level >= 23, you have to ask the user
//    // for permission with device (For example read/write data on the device).
//    private boolean askPermission(int requestId, String permissionName) {
//        Log.i(LOG_TAG, "Ask for Permission: " + permissionName);
//        Log.i(LOG_TAG, "Build.VERSION.SDK_INT: " + android.os.Build.VERSION.SDK_INT);
//        if (android.os.Build.VERSION.SDK_INT >= 23) {
//            // Check if we have permission
//            int permission = ActivityCompat.checkSelfPermission(this, permissionName);
//
//            Log.i(LOG_TAG, "permission: " + permission);
//            Log.i(LOG_TAG, "PackageManager.PERMISSION_GRANTED: " + PackageManager.PERMISSION_GRANTED);
//
//            if (permission != PackageManager.PERMISSION_GRANTED) {
//                // If don't have permission so prompt the user.
//                this.requestPermissions(
//                        new String[]{permissionName},
//                        requestId
//                );
//                return false;
//            }
//        }
//        return true;
//    }
//
//
//    // As soon as the user decides, allows or doesn't allow.
//    @Override
//    public void onRequestPermissionsResult(int requestCode,
//                                           String permissions[], int[] grantResults) {
//
//        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
//        //
//        // Note: If request is cancelled, the result arrays are empty.
//        if (grantResults.length > 0) {
//            switch (requestCode) {
//                case REQUEST_ID_READ_PERMISSION: {
//                    if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
//                        readFile();
//                    }
//                }
//                case REQUEST_ID_WRITE_PERMISSION: {
//                    if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
//                        writeFile();
//                    }
//                }
//            }
//        } else {
//            Toast.makeText(getApplicationContext(), "Permission Cancelled!", Toast.LENGTH_SHORT).show();
//        }
//    }
//
//    // IMPORTANT!!
//    public File getAppExternalFilesDir() {
//        if (android.os.Build.VERSION.SDK_INT >= 29) {
//            // /storage/emulated/0/Android/data/org.o7planning.externalstoragedemo/files
//            return this.getExternalFilesDir(null);
//        } else {
//            // @Deprecated in API 29.
//            // /storage/emulated/0
//            return Environment.getExternalStorageDirectory();
//        }
//    }
//
//
//    private void writeFile() {
//        try {
//            File extStore = this.getAppExternalFilesDir();
//
//            boolean canWrite = extStore.canWrite();
//            Log.i(LOG_TAG, "Can write: " + extStore.getAbsolutePath() + " : " + canWrite);
//
//            // ==> /storage/emulated/0/note.txt  (API < 29)
//            // ==> /storage/emulated/0/Android/data/org.o7planning.externalstoragedemo/files/note.txt (API >=29)
//            String path = extStore.getAbsolutePath() + "/" + fileName;
//            Log.i(LOG_TAG, "Save to: " + path);
//
//            String data = editText.getText().toString();
//            Log.i(LOG_TAG, "Data: " + data);
//            File myFile = new File(path);
//            FileOutputStream fOut = new FileOutputStream(myFile);
//            fOut.write(data.getBytes("UTF-8"));
//            fOut.close();
//            Toast.makeText(getApplicationContext(), fileName + " saved", Toast.LENGTH_LONG).show();
//        } catch (Exception e) {
//            Toast.makeText(getApplicationContext(), "Write Error:" + e.getMessage(), Toast.LENGTH_LONG).show();
//            Log.e(LOG_TAG, "Write Error: " + e.getMessage());
//            e.printStackTrace();
//        }
//    }
//    private void readFile() {
//        File extStore = this.getAppExternalFilesDir();
//        // ==> /storage/emulated/0/note.txt  (API < 29)
//        // ==> /storage/emulated/0/Android/data/org.o7planning.externalstoragedemo/note.txt (API >=29)
//        String path = extStore.getAbsolutePath() + "/" + fileName;
//        Log.i(LOG_TAG, "Read file: " + path);
//
//        String s = "";
//        String fileContent = "";
//        try {
//            File myFile = new File(path);
//            FileInputStream fIn = new FileInputStream(myFile);
//            BufferedReader myReader = new BufferedReader(
//                    new InputStreamReader(fIn));
//            while ((s = myReader.readLine()) != null) {
//                fileContent += s + "\n";
//            }
//            myReader.close();
//            this.textView.setText(fileContent);
//        } catch (IOException e) {
//            Toast.makeText(getApplicationContext(), "Read Error:" + e.getMessage(), Toast.LENGTH_LONG).show();
//            Log.e(LOG_TAG, "Read Error: " + e.getMessage());
//            e.printStackTrace();
//        }
//        Toast.makeText(getApplicationContext(), fileContent, Toast.LENGTH_LONG).show();
//    }
//
//    private void listExternalStorages() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("Data Directory: ").append("\n - ")
//                .append(Environment.getDataDirectory().toString()).append("\n");
//        sb.append("Download Cache Directory: ").append("\n - ")
//                .append(Environment.getDownloadCacheDirectory().toString()).append("\n");
//        sb.append("External Storage State: ").append("\n - ")
//                .append(Environment.getExternalStorageState().toString()).append("\n");
//        sb.append("External Storage Directory: ").append("\n - ")
//                .append(Environment.getExternalStorageDirectory().toString()).append("\n");
//        sb.append("Is External Storage Emulated?: ").append("\n - ")
//                .append(Environment.isExternalStorageEmulated()).append("\n");
//        sb.append("Is External Storage Removable?: ").append("\n - ")
//                .append(Environment.isExternalStorageRemovable()).append("\n");
//        sb.append("External Storage Public Directory (Music): ").append("\n - ")
//                .append(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC).toString()).append("\n");
//        sb.append("Download Cache Directory: ").append("\n - ")
//                .append(Environment.getDownloadCacheDirectory().toString()).append("\n");
//        sb.append("Root Directory: ").append("\n - ")
//                .append(Environment.getRootDirectory().toString()).append("\n");
//        Log.i(LOG_TAG, sb.toString());
//        this.textView.setText(sb.toString());
//    }
//}

//public class MainActivity extends AppCompatActivity {
//
//    Button start;
//    TextView textView;
//    EditText editTextFileName, editTextData;
//    Button saveButton, readButton;
//
//    private void askPermissionAndWriteFile() {
//        boolean canWrite = this.askPermission(REQUEST_ID_WRITE_PERMISSION,
//                Manifest.permission.WRITE_EXTERNAL_STORAGE);
//        if(!canWrite)  {
//            Toast.makeText(getApplicationContext(),
//                    "You do not allow this app to write files.", Toast.LENGTH_LONG).show();
//            return;
//        }
//        //
//        this.writeFile();
//    }
//
//    private void askPermissionAndReadFile() {
//        boolean canRead = this.askPermission(REQUEST_ID_READ_PERMISSION,
//                Manifest.permission.READ_EXTERNAL_STORAGE);
//        //
//        if (!canRead) {
//            Toast.makeText(getApplicationContext(),
//                    "You do not allow this app to read files.", Toast.LENGTH_LONG).show();
//            return;
//        }
//        //
//        this.readFile();
//    }
//
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        editTextFileName = findViewById(R.id.editText1);
//        editTextData = findViewById(R.id.editText2);
//        saveButton = findViewById(R.id.button1);
//        readButton = findViewById(R.id.button2);
//
//        saveButton.setOnClickListener(new View.OnClickListener(){
//
//            @Override
//            public void onClick(View arg0) {
//                String filename=editTextFileName.getText().toString();
//                String data=editTextData.getText().toString();
//
//                FileOutputStream fos;
//                try {
//                    File myFile = new File("/sdcard/"+filename);
//                    myFile.createNewFile();
//                    FileOutputStream fOut = new FileOutputStream(myFile);
//                    OutputStreamWriter myOutWriter = new OutputStreamWriter(fOut);
//                    myOutWriter.append(data);
//                    myOutWriter.close();
//                    fOut.close();
//                    Toast.makeText(getApplicationContext(),filename + "saved",Toast.LENGTH_LONG).show();
//                } catch (FileNotFoundException e) {e.printStackTrace();}
//                catch (IOException e) {e.printStackTrace();}
//            }
//        });
//
//        readButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
////                String filename = editTextFileName.getText().toString();
////                StringBuffer stringBuffer = new StringBuffer();
////                try {
////                    BufferedReader inputStream = new BufferedReader(new InputStreamReader(openFileInput(filename)));
////                    String inputString;
////                    while ((inputString = inputStream.readLine()) != null) {
////                        stringBuffer.append(inputString +"\n");
////                    }
////                } catch (FileNotFoundException e) {
////                    e.printStackTrace();
////                } catch (IOException e) {
////                    e.printStackTrace();
////                }
////                Toast.makeText(getApplicationContext(),stringBuffer.toString(),Toast.LENGTH_LONG).show();
//                String fileName = editTextFileName.getText().toString();
//                StringBuffer stringBuffer = new StringBuffer();
//                String aDataRow = "";
//                String aBuffer = "";
//                try {
//                    File myFile = new File("/sdcard/"+fileName);
//                    FileInputStream fIn = new FileInputStream(myFile);
//                    BufferedReader myReader = new BufferedReader(
//                            new InputStreamReader(fIn)
//                    );
//                    while ((aDataRow = myReader.readLine()) != null){
//                        aBuffer += aDataRow+"\n";
//                    }
//                    myReader.close();
//                } catch (FileNotFoundException e) {
//                    e.printStackTrace();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//                Toast.makeText(getApplicationContext(), aBuffer,Toast.LENGTH_LONG).show();
//            }
//        });
//    }
//}

//        Button storeinformation = findViewById(R.id.storeinformation);
//        Button showinformation = findViewById(R.id.showinformation);
//        textView = findViewById(R.id.txtPrefs);
//
//        View.OnClickListener listener = new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                switch (view.getId()) {
//                    case R.id.storeinformation:
//                        Intent intent = new Intent(MainActivity.this, PrefsActivity.class);
//                        startActivity(intent);
//                        break;
//                    case R.id.showinformation:
//                        displaySharedPreferences();
//                        break;
//                    default:
//                        break;
//                }
//            }
//        };
//        storeinformation.setOnClickListener(listener);
//        showinformation.setOnClickListener(listener);
//    }
//
//    private void displaySharedPreferences() {
//        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(MainActivity.this);
//        String username = prefs.getString("username", "Default NickName");
//        String passw = prefs.getString("password", "Default Password");
//        boolean checkBox = prefs.getBoolean("checkBox", false);
//        String listPrefs = prefs.getString("listpref", "Default list prefs");
//
//        StringBuilder builder = new StringBuilder();
//        builder.append("Username: " + username+"\n");
//        builder.append("Password: "+ passw +"\n");
//        builder.append("Keep me logged in: " + String.valueOf(checkBox) +"\n");
//        builder.append("List preference: " + listPrefs);
//        textView.setText(builder.toString());
//    }
//}
//        start = findViewById(R.id.button);
//
//        start.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                startAlert();
//            }
//        });
//    }
//
//    private void startAlert() {
//        EditText text = findViewById(R.id.time);
//        int i = Integer.parseInt(text.getText().toString());
//        Intent intent = new Intent(this, myBoardcastReceiver.class);
//        PendingIntent pendingIntent = PendingIntent.getBroadcast(this.getApplicationContext(),234324234, intent,0);
//        AlarmManager alarmManager = (AlarmManager)getSystemService(ALARM_SERVICE);
//        alarmManager.set(AlarmManager.RTC_WAKEUP,System.currentTimeMillis()+(i*1000), pendingIntent);
//        Toast.makeText(this,"Alarm set in " + i + " seconds",Toast.LENGTH_LONG).show();
//    }
//}

//public class MainActivity extends AppCompatActivity implements View.OnClickListener {
//
//    Button buttonStart, buttonStop, buttonNext;
//
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

//        buttonStart = findViewById(R.id.buttonStart);
//        buttonStop = findViewById(R.id.buttonStop);
//        buttonNext = findViewById(R.id.buttonNext);
//
//        buttonStart.setOnClickListener(this);
//        buttonStop.setOnClickListener(this);
//        buttonNext.setOnClickListener(this);
//    }
//
//    @Override
//    public void onClick(View view) {
//        switch (view.getId()) {
//            case R.id.buttonStart:
//                startService(new Intent(this, MyService.class));
//                break;
//            case R.id.buttonStop:
//                stopService(new Intent(this, MyService.class));
//                break;
//            case R.id.buttonNext:
//                Intent intent = new Intent(this, NextPage.class);
//                startActivity(intent);
//                break;
//        }
//    }
//}


//        button = findViewById(R.id.button);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                PopupMenu popup = new PopupMenu(MainActivity.this, button);
//                popup.getMenuInflater().inflate(R.menu.poupup_menu, popup.getMenu());
//
//                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
//                    @Override
//                    public boolean onMenuItemClick(MenuItem menuItem) {
//                        Toast.makeText(MainActivity.this,"You clicked: "+ menuItem.getTitle(),Toast.LENGTH_LONG).show();
//                        return true;
//                    }
//                });
//                popup.show();
//            }
//        });
//    }
//}
//    ListView listView;
//    String contacts[] = {"Ajay", "Sachin", "Sumit", "Tarun", "Yogesh"};
//
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        listView = findViewById(R.id.listView);
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, contacts);
//        listView.setAdapter(adapter);
//
//        registerForContextMenu(listView);
//    }
//
//    private void rtegisterForContextMenu(ListView listView) {
//    }
//
//    @Override
//    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
//        super.onCreateContextMenu(menu, v, menuInfo);
//        MenuInflater inflater = getMenuInflater();
//        inflater.inflate(R.menu.menu_main_custome, menu);
//        menu.setHeaderTitle("Select the action");
//    }
//
//    @Override
//    public boolean onContextItemSelected(@NonNull MenuItem item) {
//        if (item.getItemId() == R.id.call) {
//            Toast.makeText(getApplicationContext(), "Calling code", Toast.LENGTH_LONG).show();
//        } else if (item.getItemId() == R.id.sms) {
//            Toast.makeText(getApplicationContext(), "Sending sms code", Toast.LENGTH_LONG).show();
//        } else {
//            return false;
//        }
//        return true;
//    }
//}
//    Button shareButton;
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.menu_main,menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        int id = item.getItemId();
//        switch (id){
//            case R.id.item1:
//                Toast.makeText(getApplicationContext(),"Item 1 selected",Toast.LENGTH_LONG).show();
//                return true;
//            case R.id.item2:
//                Toast.makeText(getApplicationContext(),"Item 2 selected",Toast.LENGTH_LONG).show();
//                return true;
//            case R.id.item3:
//                Toast.makeText(getApplicationContext(),"Item 3 selected",Toast.LENGTH_LONG).show();
//                return true;
//            default:
//                return super.onOptionsItemSelected(item);
//        }
//    }
//
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);


//        shareButton = (Button) findViewById(R.id.button);
//        shareButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent shareIntent = new Intent(Intent.ACTION_SEND);
//                shareIntent.setType("text/plain");
//                shareIntent.putExtra(Intent.EXTRA_SUBJECT,"Insert Subject here");
//                String url = "https://www.javatpoint.com/android-share-app-data";
//                shareIntent.putExtra(android.content.Intent.EXTRA_TEXT, url);
//                startActivity(Intent.createChooser(shareIntent,"Share Via"));
//            }
//        });
//    }
//}

//    Button button;
//    EditText editText;
//    TextView textView1;
//    Button button1;
//
//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//        if (requestCode == 2) {
//            String message = data.getStringExtra("MESSAGE");
//            textView1.setText(message);
//        }
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.main, menu);
//        return true;
//    }
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        textView1 = findViewById(R.id.textView1);
//        button1 = findViewById(R.id.button1);
//
////        button1.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View view) {
////                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
////                startActivityForResult(intent,2);
////            }
////        });
//
//        button1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View arg0) {
//                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
//                startActivityForResult(intent, 2);// Activity is started with requestCode 2
//            }
//        });
//    }
//}

//        button = findViewById(R.id.button);
//        editText = findViewById(R.id.editText);
//
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String url = editText.getText().toString();
//                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
//                startActivity(intent);
//            }
//        });

//    }

//    public void callSecondActivity(View view) {
//        Intent i = new Intent(getApplicationContext(), SecondActivity.class);
//        i.putExtra("Value1","Android By Javatpoint");
//        i.putExtra("Value2", "Simple Tutorial");
//        startActivity(i);
//    }
//}

//    private ListView lv;
//    private EditText editText;
//    private ArrayAdapter<String> adapter;
//
//    private String products[] = {
//            "Apple","Banana","Pinapple","Orange","Papaya","Melon","Grapes","Water melon","Lychee","Mango","Kiwi"
//    };
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        lv = (ListView) findViewById(R.id.listView);
//        editText = (EditText) findViewById(R.id.editText);
//        adapter = new ArrayAdapter<String>(this, R.layout.list_item, R.id.product_name,products);
//        lv.setAdapter(adapter);
//
//        editText.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//                adapter.getFilter().filter(charSequence);
//            }
//
//            @Override
//            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//                Toast.makeText(getApplicationContext(),"before text change",Toast.LENGTH_LONG).show();
//            }
//
//            @Override
//            public void afterTextChanged(Editable editable) {
//                Toast.makeText(getApplicationContext(),"after text change",Toast.LENGTH_LONG).show();
//            }
//        });
//    }
//}


//    SearchView searchView;
//    ListView listView;
//    ArrayList<String> list;
//    ArrayAdapter<String> adapter;
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        MenuInflater inflater = getMenuInflater();
//        inflater.inflate(R.menu.menu, menu);
//        MenuItem searcjViewItem = menu.findItem(R.id.app_bar_search);
//
//        final SearchView searchView = (SearchView) MenuItemCompat.getActionView(searcjViewItem);
//        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
//            @Override
//            public boolean onQueryTextSubmit(String s) {
//                searchView.clearFocus();
//                return false;
//            }
//
//            @Override
//            public boolean onQueryTextChange(String s) {
//                adapter.getFilter().filter(s);
//                return false;
//            }
//        });
//        return super.onCreateOptionsMenu(menu);
//    }
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
////        searchView = (SearchView) findViewById(R.id.searchView);
//        listView = (ListView)findViewById(R.id.lv1);
//
//        list = new ArrayList<>();
//        list.add("Apple");
//        list.add("Banana");
//        list.add("Pineapple");
//        list.add("Orange");
//        list.add("Lychee");
//        list.add("Gavava");
//        list.add("Peech");
//        list.add("Melon");
//        list.add("Watermelon");
//        list.add("Papaya");
//
//        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list);
//        listView.setAdapter(adapter);

//        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
//            @Override
//            public boolean onQueryTextSubmit(String s) {
//                if (list.contains(s)){
//                    adapter.getFilter().filter(s);
//                }
//                return false;
//            }
//
//            @Override
//            public boolean onQueryTextChange(String s) {
//                return false;
//            }
//        });

//    }
//            }
//    TabLayout tabLayout;
//    FrameLayout frameLayout;
//    Fragment fragment = null;
//    FragmentManager fragmentManager;
//    FragmentTransaction fragmentTransaction;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
//        frameLayout = (FrameLayout) findViewById(R.id.frameLayout);
//
//        fragment = new HomeFragment();
//        fragmentManager = getSupportFragmentManager();
//        fragmentTransaction = fragmentManager.beginTransaction();
//        fragmentTransaction.replace(R.id.frameLayout, fragment);
//        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
//        fragmentTransaction.commit();
//
//        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
//            @Override
//            public void onTabSelected(TabLayout.Tab tab) {
//                switch (tab.getPosition()) {
//                    case 0:
//                        fragment = new HomeFragment();
//                        break;
//                    case 1:
//                        fragment = new JavaFragment();
//                        break;
//                    case 2:
//                        fragment = new AndroidFragment();
//                        break;
//                    case 3:
//                        fragment = new PhpFragment();
//                        break;
//                }
//                FragmentManager fm = getSupportFragmentManager();
//                FragmentTransaction ft = fm.beginTransaction();
//                ft.replace(R.id.frameLayout, fragment);
//                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
//                ft.commit();
//            }
//
//            @Override
//            public void onTabUnselected(TabLayout.Tab tab) {
//
//            }
//
//            @Override
//            public void onTabReselected(TabLayout.Tab tab) {
//
//            }
//        });
//    }
//}

//    TabLayout tabLayout;
//    ViewPager viewPager;
//
//
//    @SuppressLint("WrongViewCast")
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        tabLayout = (TabLayout)findViewById(R.id.tabLayout);
//        viewPager = (ViewPager)findViewById(R.id.viewPager);
//
//        tabLayout.addTab(tabLayout.newTab().setText("Home"));
//        tabLayout.addTab(tabLayout.newTab().setText("Sport"));
//        tabLayout.addTab(tabLayout.newTab().setText("Movie"));
//        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
//
//        final MyAdapter adapter = new MyAdapter(this, getSupportFragmentManager(), tabLayout.getTabCount());
//        viewPager.setAdapter(adapter);
//
//        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
//
//        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
//            @Override
//            public void onTabSelected(TabLayout.Tab tab) {
//                viewPager.setCurrentItem(tab.getPosition());
//            }
//
//            @Override
//            public void onTabUnselected(TabLayout.Tab tab) {
//
//            }
//
//            @Override
//            public void onTabReselected(TabLayout.Tab tab) {
//
//            }
//        });
//    }
//}

//       ImageSwitcher imageSwitcher;
//       Button button;
//
//       int imageSwitcherImages[] = {R.drawable.ic_avatar1, R.drawable.ic_avatar2, R.drawable.ic_avatar3, R.drawable.ic_avatar4};
//       int switcherImageLength = imageSwitcherImages.length;
//       int counter = -1;
//
//       ViewStub viewStub;
//       Button show, hide;
//        show = (Button) findViewById(R.id.show);
//        hide = (Button) findViewById(R.id.hide);
//        viewStub = (ViewStub) findViewById(R.id.viewStub);
//        viewStub.inflate();
//
//        show.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                viewStub.setVisibility(View.VISIBLE);
//            }
//        });
//
//        hide.setOnClickListener(new View.OnClickListener(){
//
//            @Override
//            public void onClick(View view) {
//                viewStub.setVisibility(View.GONE);
//            }
//        });

//        ViewPager mViewPager = (ViewPager)findViewById(R.id.viewPage);
//        ImageAdapter adapterView = new ImageAdapter(this);
//        mViewPager.setAdapter(adapterView);
//    }
//}


//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolBar);
////        setSupportActionBar(toolbar);
//        imageSwitcher = (ImageSwitcher) findViewById(R.id.imageSwitcher);
//        button = (Button) findViewById(R.id.button);
//
//        imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
//            @Override
//            public View makeView() {
//                ImageView switcherImageView = new ImageView(getApplicationContext());
//                switcherImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
//                switcherImageView.setImageResource(R.drawable.ic_avatar5);
//
//                return switcherImageView;
//            }
//        });
//
//        Animation aniOut = AnimationUtils.loadAnimation(this, android.R.anim.slide_out_right);
//        Animation aniIn = AnimationUtils.loadAnimation(this, android.R.anim.slide_in_left);
//
//        imageSwitcher.setOutAnimation(aniOut);
//        imageSwitcher.setInAnimation(aniIn);
//
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                counter++;
//                if (counter == switcherImageLength) {
//                    counter = 0;
//                }
//                imageSwitcher.setImageResource(imageSwitcherImages[counter]);
//            }
//        });
//    }
//}
//        Button btnStartProgress;
//        ProgressDialog progressBar;
//        private int progressBarStatus = 0;
//        private Handler progressBarHandler = new Handler();
//        private long fileSize = 0;
//        addListenerOnButtonClick();
//    }
//
//    private void addListenerOnButtonClick() {
//        btnStartProgress = findViewById(R.id.button1);
//        btnStartProgress.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                progressBar = new ProgressDialog(view.getContext());
//                progressBar.setCancelable(true);
//                progressBar.setMessage("File downloading ...");
//                progressBar.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
//                progressBar.setProgress(0);
//                progressBar.setMax(100);
//                progressBar.show();
//
//                progressBarStatus = 0;
//                fileSize = 0;
//
//                new Thread(new Runnable() {
//                    @Override
//                    public void run() {
//                        while (progressBarStatus < 100) {
//                            progressBarStatus = doOperation();
//                            try {
//                                Thread.sleep(1000);
//                            } catch (InterruptedException e) {
//                                e.printStackTrace();
//                            }
//
//                            progressBarHandler.post(new Runnable() {
//                                @Override
//                                public void run() {
//                                    progressBar.setProgress(progressBarStatus);
//                                }
//                            });
//                        }
//                        if (progressBarStatus >= 100) {
//                            try {
//                                Thread.sleep(1000);
//                            } catch (InterruptedException e) {
//                                e.printStackTrace();
//                            }
//
//                            progressBar.dismiss();
//                        }
//                    }
//                }).start();
//            }
//        });
//    }
//
//    private int doOperation() {
//        while (fileSize < 10000) {
//            fileSize++;
//            if (fileSize % 1000 == 0) {
//                return (int) (fileSize / 100);
//            }
////            if (fileSize == 1000) {
////                return 10;
////            } else if (fileSize == 2000) {
////                return 20;
////            } else if (fileSize == 3000) {
////                return 30;
////            } else if (fileSize == 4000) {
////                return 40; // you can add more else if
////            }
//        }
//        return 100;
//    }
//}
//        RatingBar ratingbar;
//        Button button;
//        SeekBar seekBar;
//        DatePicker picker;
//        Button displayDate, changeTime;
//        TextView textView1;
//        TimePicker timePicker;
//        textView1 = (TextView)findViewById(R.id.tv1);
//        timePicker = (TimePicker)findViewById(R.id.tp);
//
//        timePicker.setIs24HourView(true);
//        changeTime = (Button)findViewById(R.id.button1);
//
//        textView1.setText(getCurrentTime());
//        changeTime.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                textView1.setText(getCurrentTime());
//            }
//        });
//    }
//
//    private String getCurrentTime() {
//        String currentTime = "Current time: " + timePicker.getCurrentHour()+" : "+timePicker.getCurrentMinute();
//        return currentTime;
//    }
//}
//        textView1 = (TextView)findViewById(R.id.tv1);
//        picker = (DatePicker)findViewById(R.id.dp);
//        displayDate = (Button)findViewById(R.id.button1);
//
//        textView1.setText("Current Date: " + getCurrentDate());
//
//        displayDate.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                textView1.setText("Change Date: "+getCurrentDate());
//            }
//        });

//        seekBar = (SeekBar)findViewById(R.id.seekBar);
//        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
//            @Override
//            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
//                Toast.makeText(getApplicationContext(),"seekbar progress: " + i,Toast.LENGTH_LONG).show();
//            }
//
//            @Override
//            public void onStartTrackingTouch(SeekBar seekBar) {
//                Toast.makeText(getApplicationContext(),"seekbar touch started!",Toast.LENGTH_LONG).show();
//            }
//
//            @Override
//            public void onStopTrackingTouch(SeekBar seekBar) {
//                Toast.makeText(getApplicationContext(),"seekbar touch stopped!",Toast.LENGTH_LONG).show();
//            }
//        });
//    }
//
//    private String getCurrentDate() {
//        StringBuilder builder = new StringBuilder();
//        builder.append((picker.getMonth() + 1) + "/");
//        builder.append(picker.getDayOfMonth()+"/");
//        builder.append(picker.getYear());
//        return builder.toString();
//    }
//}

//        WebView mywebview = (WebView) findViewById(R.id.wv);
//        mywebview.loadUrl("https://www.howkteam.vn/");
//        mywebview.getSettings().setAllowContentAccess(true);
//        mywebview.getSettings().setAllowFileAccess(true);
//        mywebview = (WebView)findViewById(R.id.wv);
//        mywebview.setWebViewClient(new WebViewClient());
//        mywebview.getSettings().setJavaScriptEnabled(true);
//        mywebview.getSettings().setDomStorageEnabled(true);
//        mywebview.getSettings().setLoadWithOverviewMode(true);
//        mywebview.getSettings().setUseWideViewPort(true);
//        mywebview.getSettings().setBuiltInZoomControls(true);
//        mywebview.getSettings().setPluginState(WebSettings.PluginState.ON);
//        mywebview.getSettings().setAppCacheEnabled(true);
//        mywebview.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
//        WebView web = (WebView) findViewById(R.id.wv);
//        web.setWebViewClient(new WebViewClient());
//
//        web.loadUrl("https://www.google.com/");
//
//        WebSettings websettings = web.getSettings();
//
//        websettings.setJavaScriptEnabled(true);
//
//        websettings.setAllowContentAccess(true);
//        websettings.setAppCacheEnabled(true);
//        websettings.setDomStorageEnabled(true);
//        websettings.setUseWideViewPort(true);

//        mywebview.loadUrl("https://www.javatpoint.com/android-webview-example");
//        addListenerOnButtonClick();
//    }

//    private void addListenerOnButtonClick() {
//        ratingbar = (RatingBar)findViewById(R.id.ratingBar);
//        button = (Button) findViewById(R.id.button);
//
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String rating = String.valueOf(ratingbar.getRating());
//                Toast.makeText(MainActivity.this,rating,Toast.LENGTH_LONG).show();
//            }
//        });
//    }
//}
//
//    String[] language = {"C", "C++", "Java", ".NET", "Iphone", "Android", "APS.net", "PHP"};
//    ListView list;
//    TextView textView;
//    String[] listItem;
//    String[] maintitle = {
//            "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
//    };
//    String[] subtitle = {"Sub Title 1", "Sub Title 2", "Sub Title 3", "Sub Title 4", "Sub Title 5"};
//    Integer[] imgid = {
//            R.drawable.ic_arrow_left,
//            R.drawable.ic_arrow_right,
//            R.drawable.ic_avatar1,
//            R.drawable.ic_avatar2,
//            R.drawable.ic_avatar3,
//    };
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        MyListView adapter = new MyListView(this,maintitle,subtitle,imgid);
//        list = (ListView)findViewById(R.id.listView);
//        list.setAdapter(adapter);
//
//        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                if (i == 0) {
//                    Toast.makeText(getApplicationContext(),"Place Your First option Code", Toast.LENGTH_LONG).show();
//                }else if (i == 1) {
//                    Toast.makeText(getApplicationContext(),"Please Your Second Option Code",Toast.LENGTH_LONG).show();
//                }else if (i==2){
//                    Toast.makeText(getApplicationContext(),"Place Your Third Option Code",Toast.LENGTH_LONG).show();
//                }else if (i==3){
//                    Toast.makeText(getApplicationContext(),"Place Your Forth Option Code",Toast.LENGTH_LONG).show();
//                }else if (i==4){
//                    Toast.makeText(getApplicationContext(),"Place Your Fifth Option Code",Toast.LENGTH_LONG).show();
//                }
//            }
//        });
//    }
//}
//        listView = (ListView)findViewById(R.id.listView);
//        textView = (TextView)findViewById(R.id.textview);
//        listItem = getResources().getStringArray(R.array.array_technology);
//        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listItem);
//        listView.setAdapter(adapter);
//
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                String value = adapter.getItem(i);
//                Toast.makeText(getApplicationContext(), value, Toast.LENGTH_SHORT).show();
//            }
//        });

//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.select_dialog_item, language);
//
//        AutoCompleteTextView actv = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView);
//        actv.setThreshold(1);
//        actv.setAdapter(adapter);
//        actv.setTextColor(Color.RED);
//    }
//}
//public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

//    private CheckBox cb1, cb2;
//    private Button button;
//    private RadioButton genderRadioButton;
//    private RadioGroup radioGroup;
//    private RadioGroup rg;
//    private RelativeLayout rl;
//    private RadioButton rb1, rb2;
//    private Button closeButton;
//    AlertDialog.Builder builder;
//    AdapterView.OnItemSelectedListener {
//        String[] country = {"India", "USA","China","Japan","Other"};
//    }

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        Spinner spin = (Spinner) findViewById(R.id.spinner);
//        spin.setOnItemSelectedListener(this);
//
//        ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, country);
//        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spin.setAdapter(aa);
//    }
//
//    //Performing action onItemSelected and onNothing selected
//    @Override
//    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
//        Toast.makeText(getApplicationContext(),country[position] , Toast.LENGTH_LONG).show();
//    }
//    @Override
//    public void onNothingSelected(AdapterView<?> arg0) {
//    TODO Auto-generated method stub
//    }

//    @Override
//    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//
//    }

//        closeButton = (Button) findViewById(R.id.button);
//        builder = new AlertDialog.Builder(this);
//        closeButton.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View view) {
//                builder.setMessage(R.string.dialog_message).setTitle(R.string.dialog_title);
//                builder.setMessage("Do you want to close this application?")
//                        .setCancelable(false)
//                        .setPositiveButton("YES", new DialogInterface.OnClickListener() {
//                            @Override
//                            public void onClick(DialogInterface dialogInterface, int id) {
//                                finish();
//                                Toast.makeText(getApplicationContext(), "You choose yes action for alterbox", Toast.LENGTH_LONG).show();
//                            }
//                        })
//                        .setNegativeButton("NO", new DialogInterface.OnClickListener() {
//                            @Override
//                            public void onClick(DialogInterface dialogInterface, int i) {
//                                dialogInterface.cancel();
//                                Toast.makeText(getApplicationContext(), "You choose no action for alertbox", Toast.LENGTH_LONG).show();
//                            }
//                        });
//                AlertDialog alert = builder.create();
//                alert.setTitle("Alert Dialog Example");
//                alert.show();
//            }
//        });

//    }
//        radioGroup = (RadioGroup) findViewById(R.id.radiogroup);
//    }
//
//    public void onclickButtonMethod(View v) {
//        int selectedId = radioGroup.getCheckedRadioButtonId();
//        genderRadioButton = (RadioButton) findViewById(selectedId);
//        if (selectedId == -1) {
//            Toast.makeText(MainActivity.this,"Nothing selected",Toast.LENGTH_LONG).show();
//        } else {
//            Toast.makeText(MainActivity.this, genderRadioButton.getText(), Toast.LENGTH_LONG).show();
//        }
//    }
//}

//        rg = new RadioGroup(this);
//        rl = (RelativeLayout) findViewById(R.id.relativeLayout);
//        rb1 = new RadioButton(this);
//        rb2 = new RadioButton(this);
//
//        rb1.setText("Male");
//        rb2.setText("Female");
//        rg.addView(rb1);
//        rg.addView(rb2);
//        rg.setOrientation(RadioGroup.HORIZONTAL);
//
//        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams((int) RelativeLayout.LayoutParams.WRAP_CONTENT, (int) RelativeLayout.LayoutParams.WRAP_CONTENT);
//        params.leftMargin = 150;
//        params.topMargin = 100;
//
//        rg.setLayoutParams(params);
//        rl.addView(rg);
//
//        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
//                RadioButton radioButton = (RadioButton) findViewById(checkedId);
//                Toast.makeText(getApplicationContext(), radioButton.getText(),Toast.LENGTH_LONG).show();
//            }
//        });
//    }
//    radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
//    public void onClickButtonMethod(View v) {
//        int selectedId = radioGroup.getCheckedRadioButtonId();
//        genderRadioButton = (RadioButton) findViewById(selectedId);
//
//        if (selectedId == -1) {
//            Toast.makeText(getApplicationContext(), "Nothing selected", Toast.LENGTH_LONG).show();
//        } else {
//            Toast.makeText(getApplicationContext(),genderRadioButton.getText(), Toast.LENGTH_LONG).show();
//        }
//    }
//}
//        cb1 = (CheckBox)findViewById(R.id.checkBox3);
//        cb2 = (CheckBox)findViewById(R.id.checkBox4);
//        button = (Button)findViewById(R.id.button);
//
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                StringBuilder sb = new StringBuilder("");
//
//                if (cb1.isChecked()) {
//                    String s1 = cb1.getText().toString();
//                    sb.append(s1);
//                }
//
//                if (cb2.isChecked()) {
//                    String s2 = cb2.getText().toString();
//                    sb.append("\n" + s2);
//                }
//
//                if (sb != null && !sb.toString().equals("")) {
//                    Toast.makeText(getApplicationContext(), sb,Toast.LENGTH_LONG).show();
//                } else {
//                    Toast.makeText(getApplicationContext(),"Nothing selected", Toast.LENGTH_LONG).show();
//                }
//            }
//        });
//    }
//}

//    private ListView listview;
//    private RecyclerView rvItems;
//    private EditText edt1, edt2;
//    private Button btn1;
//    private ToggleButton toggleButton1, toggleButton2;
//    private Button buttonSubmit, buttonOrder;
//    private CheckBox pizza, coffee, burger;

//        addListenerOnButtonClick();
//    }
//
//    private void addListenerOnButtonClick() {
//        //Getting instance of CheckBoxes and button
//        pizza = (CheckBox) findViewById(R.id.checkBox);
//        coffee = (CheckBox) findViewById(R.id.checkBox2);
//        burger = (CheckBox) findViewById(R.id.checkBox3);
//        buttonOrder = (Button) findViewById(R.id.button);
//
//        //Applying the listener on the Button
//        buttonOrder.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                int totalamount = 0;
//                StringBuilder result = new StringBuilder();
//                result.append("Select Items: ");
//                if (pizza.isChecked()) {
//                    result.append("\nPizza 100Rs");
//                    totalamount += 100;
//                }
//                if (coffee.isChecked()) {
//                    result.append("\nCoffee 50Rs");
//                    totalamount += 50;
//                }
//                if (burger.isChecked()) {
//                    result.append("\nBurger 120Rs");
//                    totalamount +=120;
//                }
//                result.append("\nTotal: " + totalamount + " Rs");
//
//                // Display the toast
//                Toast.makeText(getApplicationContext(), result, Toast.LENGTH_LONG).show();
//            }
//        });
//    }
//
//}


//        addListenerOnButtonClick();
//    }
//
//    private void addListenerOnButtonClick() {
//        toggleButton1 = (ToggleButton) findViewById(R.id.toggleButton);
//        toggleButton2 = (ToggleButton) findViewById(R.id.toggleButton2);
//        buttonSubmit = (Button) findViewById(R.id.button);
//
//        buttonSubmit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                StringBuilder result = new StringBuilder();
//                result.append("ToggleButton1: ").append(toggleButton1.getText());
//                result.append("ToggleButton2: ").append(toggleButton2.getText());
//
//                // Display the message
//                Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();
//            }
//        });
//    }
//
//}
//        LayoutInflater li = getLayoutInflater();
//        View layout = li.inflate(R.layout.customtoast,(ViewGroup)findViewById(R.id.custom_toast_layout));
//
//        //Creating the Toast Object
//        Toast toast = new Toast(getApplicationContext());
//        toast.setDuration(Toast.LENGTH_LONG);
//        toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
//        toast.setView(layout);
//        toast.show();

//
//        addListenerOnButton();
//    }
//
//    private void addListenerOnButton() {
//        edt1 = (EditText) findViewById(R.id.edt_1);
//        edt2 = (EditText) findViewById(R.id.edt_2);
//        btn1 = (Button) findViewById(R.id.btn_1);
//
//        btn1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String value1 = edt1.getText().toString();
//                String value2 = edt2.getText().toString();
//                int a = Integer.parseInt(value1);
//                int b = Integer.parseInt(value2);
//                int sum = a + b;
//
//                Toast.makeText(getApplicationContext(),String.valueOf(sum), Toast.LENGTH_LONG).show();
//                Toast toast=Toast.makeText(getApplicationContext(),"Hello Javatpoint",Toast.LENGTH_SHORT);
//                toast.setMargin(50,50);
//                toast.show();
//            }
//        });
//    }
//
//    public void btnRegister(View v) {
//        Intent intent = new Intent(MainActivity.this,BackstackActivity.class);
//        startActivity(intent);
//    }
//}


// open full screen mode for app
//    requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
//    getSupportActionBar().hide(); // hide the title bar
//        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
//        WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen

//    public void onBtnClick(View view) {
//        TextView txtHello = findViewById(R.id.txtMessage);
//        EditText edtTxtName = findViewById(R.id.edtTxtname);
//
//        txtHello.setText(edtTxtName.getText().toString());
//TODO do something
//    }

//    public void btnRegister(View view) {
//        System.out.println("Hello world");v
//        EditText edtFirstName = findViewById(R.id.edtFirstName);
//        EditText edtLastName = findViewById(R.id.edtLastName);
//        EditText edtEmail = findViewById(R.id.edtEmail);
//
//        TextView txtFirstName = findViewById(R.id.txtFirstName);
//        TextView txtLastName = findViewById(R.id.txtLastName);
//        TextView txtEmail = findViewById(R.id.txtEmail);
//
//        txtFirstName.setText(edtFirstName.getText().toString());
//        txtLastName.setText(edtLastName.getText().toString());
//        txtEmail.setText(edtEmail.getText().toString());
//
//    }

//}
//        List<Person> people = new ArrayList<>();
//        people.add(new Person("Long", true));
//        people.add(new Person("My", false));
//        people.add(new Person("Duong", true));
//        people.add(new Person("Duyen", false));
//
//        rvItems = (RecyclerView) findViewById(R.id.rv_items);
//        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
//        rvItems.setLayoutManager(layoutManager);
//        rvItems.setHasFixedSize(true);
//        rvItems.setAdapter(new RecyclerDataAdapter(this, people));
//    }
//}

//        String[] items = {"HowKteam", "Free education", "share to better"};
//
//        listview = (ListView) findViewById(R.id.list_view);
//
//        KteamAdapter adapter = new KteamAdapter(this, items);
//
//        listview.setAdapter(adapter);
//
//    }
//}
//    public static final String TAG = MainActivity.class.getSimpleName();
//    Button button;
//    TextView textView;
//    private static final String STATE = "Trang Thai";

//        Log.e(STATE, "onCreate");
//        finish();

//    @Override
//    public void onPause() {
//        super.onPause();
//        Log.e(STATE, "onPause");
//    }
//
//    @Override
//    public void onResume() {
//        super.onResume();
//        Log.e(STATE, "onResume");
//    }
//
//    @Override
//    public void onStop() {
//        super.onStop();
//        Log.e(STATE, "onStop");
//    }
//
//    @Override
//    public void onDestroy() {
//        super.onDestroy();
//        Log.e(STATE, "onDestroy");
//    }
//
//    @Override
//    protected void onRestoreInstanceState(Bundle savedInstanceState){
//        super.onRestoreInstanceState(savedInstanceState);
//
//        Log.e(STATE, "onRestoreInstanceState");
//    }
//
//    @Override
//    protected void onSaveInstanceState(Bundle savedInstanceState){
//        super.onSaveInstanceState(savedInstanceState);
//
//        Log.e(STATE, "onSaveInstanceState");
//    }
//}
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
