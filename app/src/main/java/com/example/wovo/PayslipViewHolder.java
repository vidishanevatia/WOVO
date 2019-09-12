package com.example.wovo;

import android.content.Context;
import android.view.View;
import android.widget.ListView;

import androidx.recyclerview.widget.RecyclerView;

public class PayslipViewHolder extends RecyclerView.ViewHolder {
    public View tl_content;
    View dp;
    View d;
    View status;

    public PayslipViewHolder(View itemView) {
        super(itemView);
        tl_content = itemView.findViewById(R.id.tl_content);
        dp = itemView.findViewById(R.id.tv_dp);
        d = itemView.findViewById(R.id.tv_d);
        status = itemView.findViewById(R.id.tv_status);



    }
}
