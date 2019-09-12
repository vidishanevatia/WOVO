package com.example.wovo;

import android.app.Dialog;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ReportProblemFragment extends Fragment implements AdapterView.OnItemSelectedListener {

    String[] Tabs = {"Frequenly Asked Questions", "Connect", "Newsletter", "Survey", "Calendar Events","My Company", "Are You Safe",
    "Broadcast", "Payslip", "E-Learning"};

    EditText et_description;
    Button bt_report;

    ReportProblemFragment()
    {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.report_problem, container, false);

        //Spinner Activity
        Spinner spin_prob = view.findViewById(R.id.spin_prob);
        spin_prob.setOnItemSelectedListener(this);
        ArrayAdapter aa = new ArrayAdapter(getActivity(),android.R.layout.simple_spinner_item,Tabs);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin_prob.setAdapter(aa);

        //Report Button
        et_description = view.findViewById(R.id.et_description);
        bt_report =view.findViewById(R.id.bt_report);

        bt_report.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (et_description.getText().toString().trim().equalsIgnoreCase("")) {
                    et_description.setError("This field cannot be blank");
                }
                else
                {
                    Toast toast = Toast.makeText(getActivity(), "Coming Soon", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER_HORIZONTAL, 0, -1000);
                    toast.show();
                }
            }
        });
        return view;
    }

    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }
}
