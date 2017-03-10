package com.pinup.pinup.view.activity.view;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pinup.pinup.R;

public class Registration extends Fragment {


    public Registration() {
        // Required empty public constructor
    }

    public static Registration newInstance() {

        Bundle args = new Bundle();

        Registration fragment = new Registration();
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_registration,container,false);

        return view;
    }



}
