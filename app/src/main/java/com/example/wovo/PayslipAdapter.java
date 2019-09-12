package com.example.wovo;

import android.content.ClipData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class PayslipAdapter extends RecyclerView.Adapter<PayslipViewHolder> {

    List<PayslipData> list;
    Context context;
    OnClickPayslips onClickPayslips;

    public PayslipAdapter(List<PayslipData> list, Context context,OnClickPayslips onClickPayslips) {
        this.list = list;
        this.context = context;
        this.onClickPayslips = onClickPayslips;

    }

    public PayslipViewHolder onCreateViewHolder(ViewGroup parent,
                                             int viewType) {

        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the layout

        View photoView = inflater.inflate(R.layout.payslip_table, parent, false);

        PayslipViewHolder viewHolder = new PayslipViewHolder(photoView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final PayslipViewHolder viewHolder,
                                 final int position) {

        viewHolder.tl_content.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(onClickPayslips!=null)
                {
                    onClickPayslips.OnClick();
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
    // Insert a new item to the RecyclerView on a predefined position


    private List<PayslipData> getData() {
        List<PayslipData> list = new ArrayList<>();
        list.add(new PayslipData("December Payslips", "December", "Read"));
        list.add(new PayslipData("December Payslips", "December", "Read"));
        list.add(new PayslipData("December Payslips", "December", "Read"));
        list.add(new PayslipData("December Payslips", "December", "Read"));
        list.add(new PayslipData("December Payslips", "December", "Read"));


        return list;
    }

    public interface OnClickPayslips
    {
        void OnClick();
    }
    }

