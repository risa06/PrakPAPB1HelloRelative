package com.prakpapb1.hellorelative;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private TextView mShowCount;
    private int mCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount=findViewById(R.id.textCount);
    }

    public void showToast(View view) {
        Toast.makeText(context:this. text:"HELLO TOAST!", Toast.LENGTH_LONG).show();
    }

    public void countUp(View view) {
        mCount++;
        if(mShowCount!=null) {
            mShowCount.setText(Integer.toString(mCount));
        }
    }
}