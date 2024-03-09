package com.example.day03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MoveAcitivityWithData extends AppCompatActivity {
    public static final String KEY_DATA = "key_name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_acitivity_with_data);
        String name = getIntent().getStringExtra(KEY_DATA);
        // inisialisasi
        TextView tvData = findViewById(R.id.tvData);
        tvData.setText(name);
    }
}