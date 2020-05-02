package com.berlianafd.resepmakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends Activity {
    private RecyclerView rvResep;
    private ArrayList<Resep> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvResep = findViewById(R.id.rv_resep);
        rvResep.setHasFixedSize(true);

        list.addAll(ResepData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvResep.setLayoutManager(new LinearLayoutManager(this));
        ListResepAdapter listResepAdapter = new ListResepAdapter(list);
        rvResep.setAdapter(listResepAdapter);
    }

    public void profilUser(View view) {
        Intent intent = new Intent(MainActivity.this, ProfilActivity.class);
        startActivity(intent);
    }


}
