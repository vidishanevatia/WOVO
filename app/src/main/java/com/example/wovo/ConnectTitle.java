package com.example.wovo;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ConnectTitle extends AppCompatActivity  implements AdapterView.OnItemSelectedListener{

    String mt[]={"Ask", "Report", "Suggest"};
    String category[]={"Account", "Demo PIC", "Engineer", "English Testing","Facilities_Team","HR","Help Desk","HelpDesk Team123","Payroll", "Security", "Service Desk" };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.connect_title);
        setTitle("Connect");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Spinner Activity
        Spinner spin_mt = findViewById(R.id.spin_mt);
        spin_mt.setOnItemSelectedListener(this);
        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,mt);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin_mt.setAdapter(aa);

        Spinner spin_category = findViewById(R.id.spin_category);
        spin_category.setOnItemSelectedListener(this);
        ArrayAdapter bb = new ArrayAdapter(this,android.R.layout.simple_spinner_item,category);
        bb.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin_category.setAdapter(bb);
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

    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }
}
