package com.example.listviewinputuser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

     EditText bil1, bil2;
     TextView hasil;
     Button btn_hasil;
    int angka1 , angka2, total;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.latihan1);


    bil1 = (EditText)findViewById(R.id.edit_bil1);
    bil2 = (EditText)findViewById(R.id.edit_bil2);
    hasil = (TextView)findViewById(R.id.hasil);
    btn_hasil = (Button)findViewById(R.id.btn_hitung);

    btn_hasil.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
             angka1 = Integer.parseInt(bil1.getText().toString());
             angka2 = Integer.parseInt(bil2.getText().toString());
             total = angka1+angka2;
            hasil.setText(total+"");
        }
    });



    }



}
