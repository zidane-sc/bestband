package com.scproduction.bestband;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvBands;
    private ArrayList<Band> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvBands = findViewById(R.id.rv_bands);
        rvBands.setHasFixedSize(true);

        list.addAll(BandsData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){

        rvBands.setLayoutManager(new LinearLayoutManager(this));
        ListBandAdapter listBandAdapter = new ListBandAdapter(list);
        rvBands.setAdapter(listBandAdapter);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main,menu);
        return true;
    }

    public void aboutMeActivity(MenuItem item) {
        Intent intent = new Intent(MainActivity.this, AboutMeActivity.class);
        startActivity(intent);
    }

}