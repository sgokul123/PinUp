package com.pinup.pinup.view.activity.view;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.pinup.pinup.R;

public class SignIn extends Fragment implements View.OnClickListener {
    private static Context mContext;
    Button mButtonSignIn;

    public static SignIn newInstance(Context context) {
        mContext=context;
        Bundle args = new Bundle();

        SignIn fragment = new SignIn();
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
           View view =inflater.inflate(R.layout.fragment_sin_in,container,false);
        mButtonSignIn=(Button) view.findViewById(R.id.button_signin);
        mButtonSignIn.setOnClickListener(this);
        return  view;
    }

    @Override
    public void onClick(View v) {

        getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.layout_signin_root,SetDomain.newInstance()).addToBackStack(null).commit();

    }

}
