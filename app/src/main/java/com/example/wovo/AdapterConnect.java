package com.example.wovo;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class AdapterConnect extends RecyclerView.Adapter<ConnectViewHolder> {

    List<ConnectData> list = Collections.emptyList();

    Context context;
    OnClickAdapterConnectListener onClickAdapterConnectListener;

    public AdapterConnect(List<ConnectData> list, Context context,OnClickAdapterConnectListener onClickAdapterConnectListener) {
        this.list = list;
        this.context = context;
        this.onClickAdapterConnectListener = onClickAdapterConnectListener;
    }



    @Override
    public ConnectViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the layout

        View photoView = inflater.inflate(R.layout.card_layout, parent, false);

        ConnectViewHolder viewHolder = new ConnectViewHolder (photoView);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final ConnectViewHolder viewHolder, final int position) {

        viewHolder.idd.setText(list.get(position).idd);
        viewHolder.day.setText(list.get(position).day);
        viewHolder.status.setText(list.get(position).status);
        viewHolder.regards.setText(list.get(position).regards);

        viewHolder.rl_root_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(onClickAdapterConnectListener!=null)
                {
                    onClickAdapterConnectListener.onClick();
                }
            }
        });



    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }



    public interface OnClickAdapterConnectListener
    {
        void onClick();

    }




}

