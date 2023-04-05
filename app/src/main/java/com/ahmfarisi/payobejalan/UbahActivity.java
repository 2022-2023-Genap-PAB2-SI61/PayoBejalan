package com.ahmfarisi.payobejalan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class UbahActivity extends AppCompatActivity {
    private EditText etNama, etAlamat, etJam;
    private Button btnUbah;
    private String yId, yNama, yAlamat, yJam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ubah);

        etNama = findViewById(R.id.et_nama);
        etAlamat = findViewById(R.id.et_alamat);
        etJam = findViewById(R.id.et_jam);
        btnUbah = findViewById(R.id.btn_ubah);

        Intent terima = getIntent();
    }
}