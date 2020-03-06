package com.example.ihmavance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private DisplayMetrics displayMetrics;
    private Button toActivityWithFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getDeviceDensity();
    }

    @Override
    protected void onResume(){
        super.onResume();
        this.toActivityWithFragment = (Button)findViewById(R.id.bt_to_fragment);
        this.toActivityWithFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                actionToActivityFrag();
            }
        });

    }

    private void getDeviceDensity () {
        this.displayMetrics = this.getResources().getDisplayMetrics();
        this.displayMetrics.density = 1;
    }
    private void actionToActivityFrag() {
        Intent intent = new Intent(this, ActivityWithFragment.class);
        startActivity(intent);
    }


}
