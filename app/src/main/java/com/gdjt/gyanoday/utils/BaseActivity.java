package com.gdjt.gyanoday.utils;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;


public class BaseActivity extends AppCompatActivity {

    @Override
    protected void attachBaseContext(Context newBase) {
        //super.attachBaseContext(MyContextWrapper.wrap(newBase, AppData.getInstance(newBase).getSelectedLocale(newBase)));
    }
}
