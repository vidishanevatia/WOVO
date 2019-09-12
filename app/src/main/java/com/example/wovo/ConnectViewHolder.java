package com.example.wovo;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class ConnectViewHolder extends RecyclerView.ViewHolder  {
    TextView idd, day, status,regards;
    RelativeLayout rl_root_view;

    ConnectViewHolder(View itemView)
    {
        super(itemView);
        idd= itemView.findViewById(R.id.idd);
        day= itemView.findViewById(R.id.day);
        status= itemView.findViewById(R.id.status);
        regards= itemView.findViewById(R.id.regards);
        rl_root_view= itemView.findViewById(R.id.rl_root_view);

    }

}
