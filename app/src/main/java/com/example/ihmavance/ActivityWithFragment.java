package com.example.ihmavance;

import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import java.util.List;

public class ActivityWithFragment extends AppCompatActivity {

    public static String TAG_DISPLAY_FRAG = "display frag";
    public static String TAG_EDIT_FRAG = "edit frag";

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_withfrag);
//
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("Life Circle ActFragment","onResume******************************");

    }



    @Override
    public void onStart() {
        super.onStart();
        Log.i("Life Circle ActFragment","onStart******************************");

    }
    @Override
    public void onPause() {
        super.onPause();
        Log.i("Life Circle ActFragment","onPause******************************");

    }
    @Override
    public void onStop() {
        super.onStop();
        Log.i("Life Circle ActFragment","onStop******************************");

    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("Life Circle ActFragment","onDestroy******************************");

    }

    public boolean isMultiPane() {
        return getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE;
    }

    public void showDisplayFragment() {
        Log.i("ActFragment","showDisplayFragment******************************");
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().add(R.id.frag_display_container, new DisplayFragment(),this.TAG_DISPLAY_FRAG).commit();
    }


    public void setNameInDispFrag(String name) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        DisplayFragment displayFragment = (DisplayFragment)fragmentManager.findFragmentByTag(this.TAG_DISPLAY_FRAG);
        List<Fragment> fragmentList = fragmentManager.getFragments();
        if (displayFragment!= null)
            displayFragment.setShowName(name);
        else Log.e("Disp Frag","Trying to change the name of displayfragemnt which is null");
    }

}
