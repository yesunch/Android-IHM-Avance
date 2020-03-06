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

public class EditNameFragment extends Fragment {
    private TextView nameView;
    private Button btShowName;
    private ActivityWithFragment activityWithFragment;

    public EditNameFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Log.i("Life Circle of Fragment","onAttach******************************");
        this.activityWithFragment = (ActivityWithFragment)activity;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("Life Circle of Fragment","onCreate******************************");
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        this.activityWithFragment.showDisplayFragment();
    }
    @Override
    public void onResume() {
        super.onResume();
        Log.i("Life Circle of Fragment","onResume******************************");

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.i("Life Circle of Fragment","onCreateView******************************");
        // Inflate the layout-port for this fragment
        View rootView = inflater.inflate(R.layout.fragment_edit, container, false);
        this.btShowName = (Button) rootView.findViewById(R.id.bt_show_name);
        this.nameView = (TextView) rootView.findViewById(R.id.edit_name);
        btShowName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                actionBtShowName();
            }
        });
        return rootView;
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        Log.i("Life Circle of Fragment","onViewStateRestored******************************");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i("Life Circle of Fragment","onStart******************************");

    }
    @Override
    public void onPause() {
        super.onPause();
        Log.i("Life Circle of Fragment","onPause******************************");

    }
    @Override
    public void onStop() {
        super.onStop();
        Log.i("Life Circle of Fragment","onStop******************************");

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i("Life Circle of Fragment","onDestroyView******************************");

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

    private void actionBtShowName() {
        Toast.makeText(this.getActivity(), this.nameView.getText().toString(), Toast.LENGTH_LONG).show();
        this.activityWithFragment.setNameInDispFrag(this.nameView.getText().toString());
    }
}
