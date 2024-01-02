package com.example.myapplication.tuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.os.Bundle;

import com.example.myapplication.R;

public class Tuan22MainActivity extends AppCompatActivity {
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan22_main);
        lv= findViewById(R.id.Tuan22Listview);
        String[] arr=new String[]{"Mon1","Tuan2","Mon3","Mon4","Mon5","Tuan6","aaa","ccc"};
        ArrayAdapter<String> adapter= new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,arr);
        lv.setAdapter(adapter);
    }
}