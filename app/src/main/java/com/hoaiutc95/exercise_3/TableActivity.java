package com.hoaiutc95.exercise_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TableActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btnRed, btnYellow, btnBlue, btnClear;
    private TextView tvShowColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);
        btnRed = (Button) findViewById(R.id.btnColor1);
        btnYellow = (Button) findViewById(R.id.btnColor2);
        btnBlue = (Button) findViewById(R.id.btnColor3);
        btnClear = (Button) findViewById(R.id.btnClear);
        tvShowColor = (TextView) findViewById(R.id.tv1);
        btnRed.setOnClickListener(this);
        btnBlue.setOnClickListener(this);
        btnYellow.setOnClickListener(this);
        btnClear.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int mRed =
                getResources().getColor(R.color.color_red);
        int mYellow =
                getResources().getColor(R.color.color_yel);
        int mBlue =
                getResources().getColor(R.color.color_blue);
        int mBlack =
                getResources().getColor(R.color.color_black);

        switch (v.getId()) {
            case R.id.btnColor1: {
                tvShowColor.setBackgroundColor(mRed);
            }
            break;
            case R.id.btnColor2: {
                tvShowColor.setBackgroundColor(mYellow);
            }
            break;
            case R.id.btnColor3: {
                tvShowColor.setBackgroundColor(mRed);
            }
            break;
            case R.id.btnClear: {
                tvShowColor.setBackgroundColor(mBlack);
            }
            break;
        }

    }
}
