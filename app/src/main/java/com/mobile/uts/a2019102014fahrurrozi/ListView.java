package com.mobile.uts.a2019102014fahrurrozi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;

public class ListView extends AppCompatActivity {

    //DEKLARASI VARIABLE
    android.widget.ListView list;
    //isi dari item-iem nya dijadikan Array
    String[]
            nama_buah={"PHP","JAVA","RUBY","PYTHON","SWIFT","BASIC","JAVASCRIPT",
            "KOTLIN", "DART", "C#", "C", "C++", "PASCAL"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        setContentView(R.layout.activity_list_view);
        // pemanggilan ID ListView yang berada di activity_main
        list=(android.widget.ListView) findViewById(R.id.listView);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //mengisi ListView dengan nilai pada array, kita butuh array adapter
        ArrayAdapter adapter=new
                ArrayAdapter(this,android.R.layout.simple_list_item_1,nama_buah);

        //untuk menampung array ke drop down
        adapter.setDropDownViewResource(android.R.layout.simple_list_item_1);

        //memindahkan data dari arrayadapter ke ListView
        list.setAdapter(adapter);
    }
}