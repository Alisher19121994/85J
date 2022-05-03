package com.best.a85j.RecyclerViewAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.best.a85j.R;

import java.util.ArrayList;

public class RecyclerViewAdapterUsers extends RecyclerView.Adapter<RecyclerViewAdapterUsers.MyViews> {
    ArrayList<String> list;
    Context context;

    public RecyclerViewAdapterUsers(ArrayList<String> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViews onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViews(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.usersrecyclerviewadapter, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViews holder, int position) {
        String users = list.get(position);
        if (holder instanceof MyViews) {
            holder.textView1.setText(users);
            holder.textView2.setText(users);
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViews extends RecyclerView.ViewHolder {
        TextView textView1;
        TextView textView2;

        public MyViews(@NonNull View itemView) {
            super(itemView);
            textView1 = itemView.findViewById(R.id.text_Users_ID);
            textView2 = itemView.findViewById(R.id.text_UsersNumber_ID);

        }
    }
}
