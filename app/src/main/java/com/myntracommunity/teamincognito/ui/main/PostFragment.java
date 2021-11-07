package com.myntracommunity.teamincognito.ui.main;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.myntracommunity.teamincognito.R;
import com.myntracommunity.teamincognito.ui.adapter.PostAdapter;
import com.myntracommunity.teamincognito.ui.model.PostModel;

import java.util.ArrayList;

public class PostFragment extends Fragment {




    RecyclerView recyclerView;
    ArrayList<PostModel> dataholder;

    public PostFragment() {

    }


// for button to post activity to videos activity
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_post, container, false);

       Button button =(Button) view.findViewById(R.id.button);
       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(getActivity(), VideoActivity.class);
               intent.putExtra("some","data");
               startActivity(intent);


           }
       });


        recyclerView = view.findViewById(R.id.recview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        dataholder = new ArrayList<>();

        PostModel ob1 = new PostModel(R.drawable.postb, "Amaan", "My new Roadster Tshirt");
        dataholder.add(ob1);

        PostModel ob2 = new PostModel(R.drawable.naman, "Naman", "Thanks Myntra");

        dataholder.add(ob2);


        PostModel ob3 = new PostModel(R.drawable.postc, "Ankita", "Nice one");
        dataholder.add(ob3);

        PostModel ob4 = new PostModel(R.drawable.postd, "Akshay", "Awesome");
        dataholder.add(ob4);

        PostModel ob5 = new PostModel(R.drawable.naman, "Naman", "Prfect");
        dataholder.add(ob5);

        PostModel ob6 = new PostModel(R.drawable.posta, "Ankita", "Thanks myntra");
        dataholder.add(ob6);

        PostModel ob7 = new PostModel(R.drawable.postc, "Shradha", "Awesome");
        dataholder.add(ob7);

        PostModel ob8 = new PostModel(R.drawable.postd, "Kashish", "Great");
        dataholder.add(ob8);

        PostModel ob9 = new PostModel(R.drawable.postd, "Nikita", "Perfect");
        dataholder.add(ob9);

        PostModel ob10 = new PostModel(R.drawable.posta, "Aryan", "Stay Wrogn");
        dataholder.add(ob10);


        recyclerView.setAdapter(new PostAdapter(dataholder));

        return view;



    }
}
