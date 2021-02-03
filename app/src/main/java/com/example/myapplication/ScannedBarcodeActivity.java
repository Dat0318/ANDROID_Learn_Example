//package com.example.myapplication;
//
//import android.Manifest;
//import android.content.Intent;
//import android.content.pm.PackageManager;
//import android.net.Uri;
//import android.os.Bundle;
//import android.util.SparseArray;
//import android.view.SurfaceHolder;
//import android.view.SurfaceView;
//import android.view.View;
//import android.widget.Button;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import androidx.annotation.Nullable;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.core.app.ActivityCompat;
//
//import com.google.android.gms.vision.CameraSource;
//import com.google.android.gms.vision.Detector;
//import com.google.android.gms.vision.barcode.Barcode;
//import com.google.android.gms.vision.barcode.BarcodeDetector;
//
//import java.io.IOException;
//
//public class ScannedBarcodeActivity extends AppCompatActivity {
//
//    SurfaceView surfaceView;
//    TextView txtBarcodeValue;
//    private BarcodeDetector barcodeDetector;
//    private CameraSource cameraSource;
//    private static final int REQUEST_CAMERA_PERMISSION = 201;
//    Button btnAction;
//    String intentData = "";
//    boolean isEmail = false;
//
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_scanned_barcode);
//        initViews();
//    }
//
//    private void initViews() {
//        txtBarcodeValue = findViewById(R.id.txtBarcodeValue);
//        surfaceView = findViewById(R.id.surfaceView);
//        btnAction = findViewById(R.id.btnAction);
//
//        btnAction.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (intentData.length() > 0) {
//                    if (isEmail) {
//                        startActivity(new Intent(ScannedBarcodeActivity.this, EmailActivity.class).putExtra("email_address", "dattran0319@gmail.com"));
//                    } else {
//                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(intentData)));
//                    }
//                }
//            }
//        });
//    }
//
//    private void initialiseDetectorsAndSources() {
//        Toast.makeText(getApplicationContext(), "Barcode scanner started", Toast.LENGTH_LONG).show();
//        barcodeDetector = new BarcodeDetector.Builder(this).setBarcodeFormats(Barcode.ALL_FORMATS).build();
//
//        cameraSource = new CameraSource.Builder(this, barcodeDetector).setRequestedPreviewSize(1920, 1080).setAutoFocusEnabled(true).build();
//
//        surfaceView.getHolder().addCallback(new SurfaceHolder.Callback() {
//            @Override
//            public void surfaceCreated(SurfaceHolder surfaceHolder) {
//                try {
//                    if (ActivityCompat.checkSelfPermission(ScannedBarcodeActivity.this, Manifest.permission.CAMERA) == PackageManager.PERMISSION_DENIED) {
//                        cameraSource.start(surfaceView.getHolder());
//                    } else {
//                        ActivityCompat.requestPermissions(ScannedBarcodeActivity.this, new String[]{Manifest.permission.CAMERA}, REQUEST_CAMERA_PERMISSION);
//                    }
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//
//            @Override
//            public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i1, int i2) {
//            }
//
//            @Override
//            public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
//                cameraSource.stop();
//            }
//        });
//
//        barcodeDetector.setProcessor(new Detector.Processor<Barcode>() {
//            @Override
//            public void release() {
//                Toast.makeText(getApplicationContext(),"To prevent memory leaks barcode scanner has been stopped",Toast.LENGTH_LONG).show();
//            }
//
//            @Override
//            public void receiveDetections(Detector.Detections<Barcode> detections) {
//                final SparseArray<Barcode> barcodes = detections.getDetectedItems();
//                if (barcodes.size() != 0) {
//                    txtBarcodeValue.post(new Runnable() {
//                        @Override
//                        public void run() {
//                            if (barcodes.valueAt(0).email != null) {
//                                txtBarcodeValue.removeCallbacks(null);
//                                intentData = barcodes.valueAt(0).email.address;
//                                txtBarcodeValue.setText(intentData);
//                                isEmail = true;
//                                btnAction.setText("ADD Content to email");
//                            } else {
//                                isEmail = false;
//                                btnAction.setText("Lunch Url");
//                                intentData = barcodes.valueAt(0).displayValue;
//                                txtBarcodeValue.setText(intentData);
//                            }
//                        }
//                    });
//                }
//            }
//        });
//    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//        cameraSource.release();
//    }
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//        initialiseDetectorsAndSources();
//    }
//}
