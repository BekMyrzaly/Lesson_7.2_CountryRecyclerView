package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    CountryListAdapter countryListAdapter;
    ArrayList<Country> countryList;
    private RecyclerView.LayoutManager linearLayoutManager, gridLayoutManager;

    boolean layoutType = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        countryList = new ArrayList<>();

        countryList.add(new Country(R.drawable.kz_flag, "Kazakhstan", "Population: 18 000 000", "Capital: Nursultan", "President: Jomart Tokaev"));
        countryList.add(new Country(R.drawable.usa_flag, "USA", "Population: 328 000 000", "Capital: Washington", "President: Joe Biden"));
        countryList.add(new Country(R.drawable.uk_flag, "UK", "Population: 66 000 000", "Capital: London", "Prime Minister: Boris Johnson"));
        countryList.add(new Country(R.drawable.spain_flag, "Spain", "Population: 47 000 000", "Capital: Madrid", "Prime Minister: Pedro Sanchez"));
        countryList.add(new Country(R.drawable.italy_flag, "Italy", "Population: 60 000 000", "Capital: Rome", "President: Sergio Mattarella"));
        countryList.add(new Country(R.drawable.germany_flag, "Germany", "Population: 83 000 000", "Capital: Berlin", "President: Frank-Walter Steinmeier"));
        countryList.add(new Country(R.drawable.france_flag, "France", "Population: 66 990 000", "Capital: Paris", "President: Frédéric Macron"));
        countryList.add(new Country(R.drawable.brazil_flag, "Brazil", "Population: 209 000 000", "Capital: Brazil", "President: Jair Messias Bolsonaro"));

        countryListAdapter = new CountryListAdapter(this, countryList);

        linearLayoutManager = new LinearLayoutManager(this);
        gridLayoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(linearLayoutManager);

        recyclerView.setAdapter(countryListAdapter);

    }
}