package com.wxf.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class XMyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //in main activity
        setContentView(R.layout.activity_xmy);

        for (int i = 0; i < 7; i++)
        {
            Toast.makeText(XMyActivity.this, "Kukuuu", Toast.LENGTH_SHORT).show();
        }
    }
}
