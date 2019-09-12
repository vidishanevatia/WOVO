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

public class ConnectActivity extends AppCompatActivity implements AdapterConnect.OnClickAdapterConnectListener {

    AdapterConnect adapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.connect_activity);
        setTitle("Connect");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        List<ConnectData> list = new ArrayList<>();
        list = getData();

        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        adapter = new AdapterConnect(list, getApplication(),this );
        recyclerView.setLayoutManager(new LinearLayoutManager(ConnectActivity.this));
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

    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
    }

    // sample data for RecyclerView
    private List<ConnectData> getData()
    {
        List<ConnectData> list = new ArrayList<>();
        list.add(new ConnectData("CASE ID 597: SUGGEST", "Thursday", "Status: In Progress", "Thanks"));
        list.add(new ConnectData("CASE ID 597: SUGGEST", "Thursday", "Status: In Progress", "Thanks"));
        list.add(new ConnectData("CASE ID 597: SUGGEST", "Thursday", "Status: In Progress", "Thanks"));
        return list;
    }



    @Override
    public void onClick() {
        Intent intent = new Intent(ConnectActivity.this, ConnectNext.class);
        startActivity(intent);
    }


}
