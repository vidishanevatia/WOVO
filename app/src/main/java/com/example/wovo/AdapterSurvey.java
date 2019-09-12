package com.example.wovo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import java.util.Collections;
import java.util.List;

class AdapterSurvey extends RecyclerView.Adapter<SurveyViewHolder>

{
    List<SurveyData> list = Collections.emptyList();

    Context context;
    OnClickAdapterSurveyListener onClickAdapterSurveyListener;

    public AdapterSurvey(List<SurveyData> list, Context context,OnClickAdapterSurveyListener onClickAdapterSurveyListener) {
        this.list = list;
        this.context = context;
        this.onClickAdapterSurveyListener=onClickAdapterSurveyListener;
    }



    @Override
    public SurveyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the layout

        View photoView = inflater.inflate(R.layout.survey_card, parent, false);

        SurveyViewHolder viewHolder = new SurveyViewHolder (photoView);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final SurveyViewHolder viewHolder, final int position) {

        viewHolder.tvs_heading.setText(list.get(position).tvs_heading);
        viewHolder.tvs_date.setText(list.get(position).tvs_date);
        viewHolder.tvs_status.setText(list.get(position).tvs_status);
        viewHolder.tvs_st.setText(list.get(position).tvs_st);
        viewHolder.rl_root_view_survey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(onClickAdapterSurveyListener!=null)
                {
                    onClickAdapterSurveyListener.onClick();
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

    public interface OnClickAdapterSurveyListener
    {
        void onClick();

    }



}
