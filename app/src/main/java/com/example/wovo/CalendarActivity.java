package com.example.wovo;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.applandeo.materialcalendarview.CalendarView;
import com.applandeo.materialcalendarview.EventDay;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


public class CalendarActivity extends AppCompatActivity {

private CalendarView calendarView;

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calendar_activity);
        this.setTitle("Calendar");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        calendarView=findViewById(R.id.calendarView);
        calendarView.setHeaderColor(Color.TRANSPARENT);
        calendarView.setHeaderLabelColor(Color.WHITE);
        calendarView.setForwardButtonImage(getResources().getDrawable(R.drawable.ic_calander_next_arrow_svg));
        calendarView.setPreviousButtonImage(getResources().getDrawable(R.drawable.ic_calander_back_arrow_svg));


    }

    public void setDataCalenderView(List <MedicineModel> medi_list)
    {

        if (medi_list.size()>0)
        {
            List<EventDay> events = new ArrayList<>();

            for (int i=0;i<medi_list.size();i++)
            {

                @SuppressLint("SimpleDateFormat") SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                Date date = null;
                try {
                    date = sdf.parse(medi_list.get(i).getReminder_date());
                } catch (Exception e) {
                    e.printStackTrace();
                }

                Calendar calendar = Calendar.getInstance();
                calendar.setTime(date);

                if(!medi_list.get(i).getColor_code().isEmpty()) {
                    switch (medi_list.get(i).getColor_code()) {

                        case "#f4a742":
                            events.add(new EventDay(calendar, R.drawable.shape_calendar_event_circle_1));
                            break;

                        case "#e6f741":
                            events.add(new EventDay(calendar, R.drawable.shape_calendar_event_circle_2));
                            break;
                        case "#40eea9":
                            events.add(new EventDay(calendar, R.drawable.shape_calendar_event_circle_3));
                            break;
                        case "#2bc3f9":
                            events.add(new EventDay(calendar, R.drawable.shape_calendar_event_circle_4));
                            break;

                        default:
                            events.add(new EventDay(calendar, R.drawable.shape_calendar_event_circle_4));
                            break;

                    }

                }
                else events.add(new EventDay(calendar, R.drawable.shape_calendar_event_circle_4));



            }
            calendarView.setEvents(events);


        }
        else calendarView.setEvents(null);


    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

}
