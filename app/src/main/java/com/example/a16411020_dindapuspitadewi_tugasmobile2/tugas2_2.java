package com.example.a16411020_dindapuspitadewi_tugasmobile2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class tugas2_2 extends AppCompatActivity {
    TextView txtnpm , txtnama;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tugas2_2);

        txtnpm = (TextView) findViewById(R.id.txtPassingData2);
        txtnama = (TextView) findViewById(R.id.txtPassingData1);
        Intent intent =getIntent();

        String npm = intent.getStringExtra("npm");
        txtnpm.setText(npm);
        String nama = intent.getStringExtra("nama");
        txtnama.setText(nama);


    }
}
