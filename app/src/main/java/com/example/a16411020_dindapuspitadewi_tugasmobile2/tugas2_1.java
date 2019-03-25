package com.example.a16411020_dindapuspitadewi_tugasmobile2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class tugas2_1 extends AppCompatActivity {

    Button btnlogin;
    EditText edtNPM, edtNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tugas2_1);

        edtNPM = (EditText) findViewById(R.id.edtNPM);
        edtNama = (EditText) findViewById(R.id.edtNama);
        btnlogin = (Button) findViewById(R.id.btnlogin);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String npm = edtNPM.getText().toString();
                String nama = edtNama.getText().toString();
                Intent a = null;

                if (nama.equals("Dinda")  && npm.equals("16411020")){
                    a = new Intent(tugas2_1.this, tugas2_2.class);
                    a.putExtra("npm", edtNPM.getText().toString());
                    a.putExtra("nama", edtNama.getText().toString());
                    startActivity(a);
                }else{
                    Toast.makeText(getApplicationContext(), "Maaf Inputan Salah", Toast.LENGTH_LONG).show();
                }


            }
        });
    }
}