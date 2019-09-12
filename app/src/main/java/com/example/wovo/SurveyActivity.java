package com.example.wovo;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

public class SurveyActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener, AdapterSurvey.OnClickAdapterSurveyListener {

    AdapterSurvey adapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.survey_activity);
        this.setTitle("Survey");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        List<SurveyData> list = new ArrayList<>();
        list = getData();

        recyclerView = (RecyclerView)findViewById(R.id.recyclerView3);
        adapter = new AdapterSurvey(list, getApplication(),this);
        recyclerView.setLayoutManager(new LinearLayoutManager(SurveyActivity.this));
        recyclerView.setAdapter(adapter);
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

    private List<SurveyData> getData()
    {
        List<SurveyData> list = new ArrayList<>();
        list.add(new SurveyData("Survey Testing 136979", "24.05.19", "Completed","SurveyTesting"));
        list.add(new SurveyData("Survey Testing 136979", "24.05.19", "Completed","SurveyTesting"));
        list.add(new SurveyData("Survey Testing 136979", "24.05.19", "Completed","SurveyTesting"));
        list.add(new SurveyData("Survey Testing 136979", "24.05.19", "Completed","SurveyTesting"));
        return list;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        return false;
    }


    @Override
    public void onClick() {
        Intent intent = new Intent(SurveyActivity.this, SurveyNext.class);
        startActivity(intent);
    }
}
