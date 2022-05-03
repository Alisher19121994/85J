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

public class RecyclerViewAdapterPosts extends RecyclerView.Adapter<RecyclerViewAdapterPosts.MyViews> {
    ArrayList<String> list;

    public RecyclerViewAdapterPosts(ArrayList<String> list, Context context) {
        this.list = list;
    }

    @NonNull
    @Override
    public MyViews onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViews(LayoutInflater.from(parent.getContext()).inflate(R.layout.postsrecyclerviewadapter,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViews holder, int position) {
        String posts = list.get(position);
        holder.textView.setText(posts);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViews extends RecyclerView.ViewHolder{
        TextView textView;
        public MyViews(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.text_Posts_ID);
        }
    }
}
