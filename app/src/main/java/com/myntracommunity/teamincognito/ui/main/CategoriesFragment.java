package com.myntracommunity.teamincognito.ui.main;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.myntracommunity.teamincognito.R;
import com.myntracommunity.teamincognito.util.KidsActivity;
import com.myntracommunity.teamincognito.util.MenActivity;


public class CategoriesFragment extends Fragment {


    public CategoriesFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_categories, container, false);

        Button women = (Button) view.findViewById(R.id.women);
        women.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ProductActivity.class);
                intent.putExtra("some", "data");
                startActivity(intent);


            }
        });


        Button men = (Button) view.findViewById(R.id.men);
        men.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MenActivity.class);
                intent.putExtra("some", "data");
                startActivity(intent);


            }
        });

        Button kids = (Button) view.findViewById(R.id. kids );
        kids .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), KidsActivity.class);
                intent.putExtra("some", "data");
                startActivity(intent);


            }
        });
        return view;


    }
}