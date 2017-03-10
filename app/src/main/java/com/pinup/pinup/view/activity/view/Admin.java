package com.pinup.pinup.view.activity.view;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pinup.pinup.R;

public class Admin extends Fragment {

    public Admin() {
        // Required empty public constructor
    }

     public static Admin newInstance(String param1, String param2) {
        Admin fragment = new Admin();
        Bundle args = new Bundle();
         fragment.setArguments(args);
        return fragment;
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_admin, container, false);
    }

}
