package com.myapplicationdev.android.p11_mydatabook;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class BioFragment extends Fragment {

    EditText etBio;
    TextView tvBio;
    Button btnokay;
    public BioFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_bio, container, false);

        etBio = view.findViewById(R.id.etBio);
        tvBio = view.findViewById(R.id.tvBio);
        btnokay = view.findViewById(R.id.btnokay);

        btnokay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String bio = etBio.getText().toString();
                tvBio.setText(bio);
            }
        });
        return view;
    }
}
