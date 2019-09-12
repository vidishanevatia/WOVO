package com.example.wovo;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;


class GridVIewFragment extends Fragment {

    public static String[] gridViewStrings = {
            "Connect",
            "Newsletter",
            "Survey",
            "Calendar",
            "My Company",
            "Settings",
            "Payslips",
            "E-Learning"

    };

    public static int[] gridViewImages = {
            R.drawable.connectt, R.drawable.newsletter,R.drawable.survey,
            R.drawable.calendar, R.drawable.mycompany,R.drawable.settings,
            R.drawable.payslip,R.drawable.elearning

    };

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.grid_view,container,false);
        final GridView gridview = (GridView) view.findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(getActivity(),gridViewStrings, gridViewImages));
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {


                switch(position)
                {
                    case 0:
                    {
                       Intent intent =  new Intent(getActivity(), ConnectActivity.class);
                        startActivity(intent);
                        break;
                    }


                    case 1:
                    {
                        Intent intent =  new Intent(getActivity(), NewsletterActivity.class);
                        startActivity(intent);
                        break;
                    }


                    case 2:
                    {
                        Intent intent =  new Intent(getActivity(), SurveyActivity.class);
                        startActivity(intent);
                        break;
                    }

                    case 3:
                    {
                        Intent intent =  new Intent(getActivity(), CalendarActivity.class);
                        startActivity(intent);
                        break;
                    }

                    case 4:
                    {
                        Intent intent =  new Intent(getActivity(), MyCompanyActivity.class);
                        startActivity(intent);
                        break;
                    }

                    case 5:
                    {
                        Intent intent =  new Intent(getActivity(), SettingsActivity.class);
                        startActivity(intent);
                        break;
                    }

                    case 6:
                    {
                        Intent intent =  new Intent(getActivity(), PayslipsActivity.class);
                        startActivity(intent);
                        break;
                    }

                    case 7:
                    {
                        Toast toast = Toast.makeText(getActivity(), "Coming Soon", Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER_HORIZONTAL, 0, -1000);
                        toast.show();
                    }


                    default:
                        break;
                }



            }
        });

        return view;
    }
}
