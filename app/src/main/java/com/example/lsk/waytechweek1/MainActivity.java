package com.example.lsk.waytechweek1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton setting_Btn;
    private ImageButton cloudIamgeView;
    private Intent intentMain2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setting_Btn = (ImageButton) findViewById(R.id.settingimagebutton);
        cloudIamgeView = (ImageButton) findViewById(R.id.cloudImageVIew);
        cloudIamgeView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intentMain2 = new Intent(getApplicationContext(), Main2Activity.class);
                startActivity(intentMain2);
            }
        });

        setting_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SettingActivity.class);
                startActivity(intent);
            }
        });
    }
}
