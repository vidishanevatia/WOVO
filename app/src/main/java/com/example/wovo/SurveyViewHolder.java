package com.example.wovo;

import android.view.View;
import android.widget.RelativeLayout;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;

public class SurveyViewHolder  extends RecyclerView.ViewHolder {
    AppCompatTextView tvs_heading, tvs_date, tvs_status, tvs_st;
    RelativeLayout rl_root_view_survey;

    SurveyViewHolder(View itemView) {
        super(itemView);
        tvs_heading = itemView.findViewById(R.id.tvs_heading);
        tvs_date = itemView.findViewById(R.id.tvs_date);
        tvs_status = itemView.findViewById(R.id.tvs_status);
        tvs_st = itemView.findViewById(R.id.tvs_st);
        rl_root_view_survey = itemView.findViewById(R.id.rl_root_view_survey);
    }
}
