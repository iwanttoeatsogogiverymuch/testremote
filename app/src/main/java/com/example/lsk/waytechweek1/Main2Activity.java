package com.example.lsk.waytechweek1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class Main2Activity extends AppCompatActivity {

    private ImageButton setting_btn;
    private Intent settingIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        setting_btn=(ImageButton)findViewById(R.id.setting_btn);
        setting_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                settingIntent=new Intent(getApplicationContext(),SettingActivity.class);
                startActivity(settingIntent);
                finish();

            }
        });
    }
}
