package com.pinup.pinup.view.activity.view;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pinup.pinup.R;

public class SetDomain extends Fragment {

    public static SetDomain newInstance() {
        
        Bundle args = new Bundle();
        
        SetDomain fragment = new SetDomain();
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_set_domain,container,false);
        return view;
    }
    
}
