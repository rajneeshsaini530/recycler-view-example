package com.mcti.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {

    ArrayList<Model> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arrayList = new ArrayList<>();
        Model model = new Model("Title",1000);
        Model mode2 = new Model("Java",1000);
        Model mode3 = new Model("Android",1000);
        Model mode4 = new Model("PHP",1000);
        Model mode5 = new Model("HTML",1000);
        arrayList.add(model);
        arrayList.add(mode2);
        arrayList.add(mode3);
        arrayList.add(mode4);
        arrayList.add(mode5);
        RecyclerView recyclerView = findViewById(R.id.recycler);
        RecyclerAdapter recyclerAdapter = new RecyclerAdapter(arrayList,this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,true);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(recyclerAdapter);
    }
}
