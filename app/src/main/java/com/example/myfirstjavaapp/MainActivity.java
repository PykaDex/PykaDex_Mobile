/*
package com.example.myfirstjavaapp;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myfirstjavaapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private static final String[] CAMERA_PERMISSION = new String[]{Manifest.permission.CAMERA};
    private static final int CAMERA_REQUEST_CODE = 10;


    private AppBarConfiguration mAppBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Button enableCamera = findViewById(R.id.enableCamera);
        enableCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (hasCameraPermission()) {
                    enableCamera();
                } else {
                    requestPermission();
                }
            }
        });

*/
/**        FloatingActionButton enableCamera = findViewById(R.id.fab);
        enableCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (hasCameraPermission()) {
                    enableCamera();
                } else {
                    requestPermission();
                }
            }
        });
 **//*


        setSupportActionBar(binding.appBarMain.toolbar);
        binding.appBarMain.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "this will take a photo", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        DrawerLayout drawer = binding.drawerLayout;
        NavigationView navigationView = binding.navView;
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }

    private boolean hasCameraPermission() {
        return ContextCompat.checkSelfPermission(
                this,
                Manifest.permission.CAMERA
        ) == PackageManager.PERMISSION_GRANTED;
    }

    private void requestPermission() {
        ActivityCompat.requestPermissions(
                this,
                CAMERA_PERMISSION,
                CAMERA_REQUEST_CODE
        );
    }

    public void enableCamera() {
        //Intent intent = new Intent(this, CameraActivity.class);
        //startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
//
//    private static final String[] PERMISSIONS ={
//            Manifest.permission.CAMERA
//    };
//
//    private static final int REQUEST_PERMISSIONS = 34;
//
//    private static final int PERMISSIONS_COUNT = 1;
//
//    @SuppressLint("NewApi")
//    private boolean arePermissionsDenied(){
//        for(int i =0; i < PERMISSIONS_COUNT; i++){
//            if(checkSelfPermission(PERMISSIONS[i])!=PackageManager.PERMISSION_GRANTED){
//                return true;
//            }
//        }
//        return false;
//
//    }
//
//    @Override
//    public void onRequestPermissionResult(int requestCode,String[] permissions,
//                                          int[] grantResults){
//        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
//        if(requestCode == REQUEST_PERMISSIONS && grantResults.length > 0){
//            if(arePermissionsDenied()){
//                ((ActivityManager) (this.getSystemService(ACTIVITY_SERVICE))).clearApplicationUserData();{
//                recreate();
//
//            }else{
//                onResume();
//            }
//        }
//    }
//
//    private  boolean isCameraInitialized;
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M && arePermissionsDenied()){
//            requestPermissions(PERMISSIONS,REQUEST_PERMISSIONS);
//            return;
//        }
//        if(!isCameraInitialized){
//
//        }
//    }
}*/
