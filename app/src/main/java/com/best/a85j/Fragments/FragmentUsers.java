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
import com.best.a85j.RecyclerViewAdapter.RecyclerViewAdapterContacts;
import com.best.a85j.RecyclerViewAdapter.RecyclerViewAdapterUsers;

import java.util.ArrayList;

public class FragmentUsers extends Fragment {
    RecyclerView recyclerView;
    Context context;
    RecyclerViewAdapterUsers adapter;
    TextView textView1;
    TextView textView2;

    public FragmentUsers() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.users_fragment, container, false);
        recyclerView = view.findViewById(R.id.users_RecyclerView_ID);
        recyclerView.setLayoutManager(new GridLayoutManager(context, 1));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 18; i++) {
            list.add("Alisher");
        }
        adapter = new RecyclerViewAdapterUsers(list, context);
        recyclerView.setAdapter(adapter);
        return view;
    }
}
