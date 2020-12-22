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

    Button btnChange;
    boolean layoutType = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        btnChange = findViewById(R.id.btnChange);
        countryList = new ArrayList<>();

        countryList.add(new Country(R.drawable.kz_flag, "Kazakhstan", 185));
        countryList.add(new Country(R.drawable.usa_flag, "USA", 840));
        countryList.add(new Country(R.drawable.uk_flag, "UK", 826));
        countryList.add(new Country(R.drawable.spain_flag, "Spain", 724));
        countryList.add(new Country(R.drawable.italy_flag, "Italy", 380));
        countryList.add(new Country(R.drawable.germany_flag, "Germany", 276));
        countryList.add(new Country(R.drawable.france_flag, "France", 250));
        countryList.add(new Country(R.drawable.brazil_flag, "Brazil", 076));

        countryListAdapter = new CountryListAdapter(this, countryList);

        linearLayoutManager = new LinearLayoutManager(this);
        gridLayoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(linearLayoutManager);

        recyclerView.setAdapter(countryListAdapter);

        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutType = !layoutType;
                if(layoutType) {
                    recyclerView.setLayoutManager(gridLayoutManager);
                    countryList.remove(0);
                }else {
                    recyclerView.setLayoutManager(linearLayoutManager);
                }

                countryListAdapter.notifyDataSetChanged();

            }
        });
    }
}