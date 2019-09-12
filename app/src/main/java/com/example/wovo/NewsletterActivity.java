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

public class NewsletterActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener, AdapterNewsletter.OnClickAdapterNewsletterListener {

    AdapterNewsletter adapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newsletter_activity);
        this.setTitle("Newsletter");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        List<NewsletterData> list = new ArrayList<>();
        list = getData();

        recyclerView = (RecyclerView)findViewById(R.id.recyclerView2);
        adapter = new AdapterNewsletter(list, getApplication(),this);
        recyclerView.setLayoutManager(new LinearLayoutManager(NewsletterActivity.this));
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

    private List<NewsletterData> getData()
    {
        List<NewsletterData> list = new ArrayList<>();
        list.add(new NewsletterData("Newsletter Testing", "5/23/2019", "Newsletter Testing"));
        list.add(new NewsletterData("Newsletter Testing", "5/23/2019", "Newsletter Testing"));
        list.add(new NewsletterData("Newsletter Testing", "5/23/2019", "Newsletter Testing"));
        return list;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        return false;
    }

    @Override
    public void onClick() {
        Intent intent = new Intent(NewsletterActivity.this, NewsletterNext.class);
        startActivity(intent);
    }
}
