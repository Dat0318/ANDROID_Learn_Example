
package com.example.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner spinner;
    Button btnAdd;
    EditText inputLabel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);
        btnAdd = findViewById(R.id.btn_add);
        inputLabel = findViewById(R.id.input_label);

        spinner.setOnItemSelectedListener(this);

        loadSpinnerData();

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String label = inputLabel.getText().toString();

                if (label.trim().length() > 0) {
                    DatabaseHandler db = new DatabaseHandler(getApplicationContext());
                    db.insertLabel(label);

                    inputLabel.setText("");

                    InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(inputLabel.getWindowToken(),0);
                    loadSpinnerData();
                }else {
                    Toast.makeText(getApplicationContext(),"Please enter label name",Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    private void loadSpinnerData() {
        DatabaseHandler db = new DatabaseHandler(getApplicationContext());
        List<String> labels = db.getAllLabels();

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.simple_spinner_item, labels);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String label = adapterView.getItemAtPosition(i).toString();

        Toast.makeText(adapterView.getContext(),"You selected: " + label, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}

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
