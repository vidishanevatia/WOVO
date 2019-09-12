package com.example.wovo;

import android.view.View;
import android.widget.RelativeLayout;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;

public class NewsletterViewHolder extends RecyclerView.ViewHolder {
    AppCompatTextView tv_heading, tv_date,tv_nt;
    RelativeLayout rl_root_view_nl;

    NewsletterViewHolder(View itemView)
    {
        super(itemView);
        tv_heading = itemView.findViewById(R.id.tv_heading);
        tv_date = itemView.findViewById(R.id.tv_date);
        tv_nt = itemView.findViewById(R.id.tv_nt);
        rl_root_view_nl = itemView.findViewById(R.id.rl_root_view_nl);

    }
}
