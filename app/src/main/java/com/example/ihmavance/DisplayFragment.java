package com.example.ihmavance;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class DisplayFragment extends Fragment {
    private TextView showName;




    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Log.i("Life Circle of Fragment","onAttach******************************");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("Life Circle of Fragment","onCreate******************************");
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
    }
    @Override
    public void onResume() {
        super.onResume();
        Log.i("Life Circle DPFragment","onResume******************************");

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.i("Life Circle DPFragment","onCreateView******************************");
        // Inflate the layout-port for this fragment
        View rootView = inflater.inflate(R.layout.fragment_display, container, false);
       this.showName = (TextView)rootView.findViewById(R.id.frag_display_name);
       this.showName.setText("llalllll");
        return rootView;
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        Log.i("Life Circle DPFragment","onViewStateRestored******************************");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i("Life Circle DPFragment","onStart******************************");

    }
    @Override
    public void onPause() {
        super.onPause();
        Log.i("Life Circle DPFragment","onPause******************************");

    }
    @Override
    public void onStop() {
        super.onStop();
        Log.i("Life Circle DPFragment","onStop******************************");

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i("Life Circle DPFragment","onDestroyView******************************");

    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("Life Circle of Fragment","onDestroy******************************");

    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i("Life Circle of Fragment","onDetach******************************");

    }

    public void setShowName(String name) {
        this.showName.setText(name);
    }


    public interface setNameListener {
        public void onNameEdited(String name);
    }


}
