package com.example.lsk.waytechweek1;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Switch;
import android.widget.ToggleButton;

public class SettingActivity extends AppCompatActivity {


    private Drawable toggleDrawable;
    private ToggleButton gentleman_Brn;
    private ToggleButton girl_Brn;
    private ToggleButton mCurrentCheckedButton;
    private Switch fasionSwitch;
    private Switch figureSwitch;


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        toggleDrawable = getResources().getDrawable(R.drawable.toggle);
        Drawable changedToggleDrawable = changSizeOfToggleButton(100, 100);

        //binding xml
        fasionSwitch = (Switch) findViewById(R.id.setting_activity_switch_fasion);
        figureSwitch = (Switch) findViewById(R.id.setting_activity_switch_figure);
        gentleman_Brn = (ToggleButton) findViewById(R.id.gentleman_Btn);
        girl_Brn = (ToggleButton) findViewById(R.id.girl_Btn);

        gentleman_Brn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetBothToggleButtonOff();
                mCurrentCheckedButton = gentleman_Brn;
            }
        });

        girl_Brn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetBothToggleButtonOff();
                mCurrentCheckedButton = girl_Brn;
            }
        });

        figureSwitch.setThumbDrawable(changedToggleDrawable);
        fasionSwitch.setThumbDrawable(changedToggleDrawable);

    }

    private void resetBothToggleButtonOff() {
        if (gentleman_Brn.isChecked() && girl_Brn.isChecked()) {
            mCurrentCheckedButton.setChecked(false);
        }
    }
    private Drawable changSizeOfToggleButton(int sizeX, int sizeY) {

        Bitmap bitmap = ((BitmapDrawable) toggleDrawable).getBitmap();
        // Scale it to 50 x 50
        Drawable d = new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(bitmap, sizeX, sizeY, true));
        return d;
    }
}
