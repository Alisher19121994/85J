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

import java.util.ArrayList;
import java.util.List;

public class FragmentContact extends Fragment {
    RecyclerView recyclerView;
    Context context;
    RecyclerViewAdapterContacts adapter;
    TextView textView;
    ArrayList<String> list;


    public FragmentContact() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.contact_fragment, container, false);
        recyclerView = view.findViewById(R.id.contacts_RecyclerView_ID);
        recyclerView.setLayoutManager(new GridLayoutManager(context, 1));

        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i < 20; i++) {
            list.add("Alisher d");
        }
        adapter = new RecyclerViewAdapterContacts(list, context);
        recyclerView.setAdapter(adapter);
        return view;
    }

}
