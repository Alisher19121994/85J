package com.best.a85j.Fragments;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.best.a85j.R;
import com.best.a85j.RecyclerViewAdapter.RecyclerViewAdapterPosts;
import com.best.a85j.RecyclerViewAdapter.RecyclerViewAdapterUsers;

import java.util.ArrayList;

public class FragmentPosts extends Fragment {
    RecyclerView recyclerView;
    Context context;
    RecyclerViewAdapterPosts adapter;
    TextView textView;
    public FragmentPosts() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.posts,container,false);
        recyclerView = view.findViewById(R.id.posts_RecyclerView_ID);
        recyclerView.setLayoutManager(new GridLayoutManager(context,1));

        ArrayList <String> list = new ArrayList<>();
        for (int i = 1; i < 15; i++) {
            list.add("There is some functions!");
        }
        adapter = new RecyclerViewAdapterPosts(list, context);
        recyclerView.setAdapter(adapter);
        return view;
    }
}
