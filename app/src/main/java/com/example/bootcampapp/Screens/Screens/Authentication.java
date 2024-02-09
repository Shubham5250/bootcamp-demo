package com.example.bootcampapp.Screens.Screens;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;


import com.example.bootcampapp.R;

public class Authentication extends AppCompatActivity {




    public static final String PREFS_NAME = "MyPrefsFile";
    public static final String PREF_NAME = "MyPrefFile";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authentication);


    }
}
