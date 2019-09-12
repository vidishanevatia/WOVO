package com.example.wovo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.List;

class AdapterNewsletter extends RecyclerView.Adapter<NewsletterViewHolder>
{
List<NewsletterData> list = Collections.emptyList();

        Context context;
        AdapterNewsletter.OnClickAdapterNewsletterListener onClickAdapterNewsletterListener;

public AdapterNewsletter(List<NewsletterData> list, Context context,OnClickAdapterNewsletterListener onClickAdapterNewsletterListener) {
        this.list = list;
        this.context = context;
        this.onClickAdapterNewsletterListener=onClickAdapterNewsletterListener;
        }



@Override
public NewsletterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the layout

        View photoView = inflater.inflate(R.layout.newsletter_card, parent, false);

      NewsletterViewHolder viewHolder = new NewsletterViewHolder (photoView);

        return viewHolder;
        }

@Override
public void onBindViewHolder(final NewsletterViewHolder viewHolder, final int position) {

        viewHolder.tv_heading.setText(list.get(position).tv_heading);
        viewHolder.tv_date.setText(list.get(position).tv_date);
        viewHolder.tv_nt.setText(list.get(position).tv_nt);
        viewHolder.rl_root_view_nl.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                        if(onClickAdapterNewsletterListener!=null)
                        {
                                onClickAdapterNewsletterListener.onClick();
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

        public interface OnClickAdapterNewsletterListener
        {
                void onClick();

        }

}
