package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Contact[] myData = new Contact[]{
          new Contact("Andrew ajskldasjdl sada jdlajda kldjak djadjalskjda sldjalk dalja dlkajlkdjalkjdaljdadlkjda djk ",R.drawable.andrew),
          new Contact("Barton",R.drawable.b),
          new Contact("Charles",R.drawable.c),
          new Contact("Dave",R.drawable.d),
          new Contact("Edwin",R.drawable.e),
        };
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rView);
        MyListAdapter adapter = new MyListAdapter(myData);
//        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, LinearLayout.VERTICAL));
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}