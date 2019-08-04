package com.example.listviewinputuser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListViewActivity extends AppCompatActivity {
    List<Gambar> mylist;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        listView = (ListView) findViewById(R.id.list_view);
        mylist = new ArrayList<>();

        mylist.add(new Gambar(R.drawable.batman ,"Batman"));
        mylist.add(new Gambar(R.drawable.ironman ,"ironman"));


        Adapter adapter = new Adapter(this , R.layout.custom_list , mylist);
        listView.setAdapter(adapter);
    }
}
