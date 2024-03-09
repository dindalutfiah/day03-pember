package com.example.day03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;

public class MoveWithObjectActivity extends AppCompatActivity {

    public static final String KEY_DATA = "key_name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_object);

        TextView tvName = findViewById(R.id.tvName);
        TextView tvType = findViewById(R.id.tvType);
        TextView tvAge = findViewById(R.id.tvAge);

        Marvel marvel;
        if (Build.VERSION.SDK_INT >= 33) {
            marvel = getIntent().getParcelableExtra(KEY_DATA, Marvel.class);
        } else {
            marvel = getIntent().getParcelableExtra(KEY_DATA);
        }

        String nama = marvel.getName();
        String tipe = marvel.getType();
        int umur = marvel.getAge();
        String umurr = Integer.toString(umur);

        tvName.setText(nama);
        tvType.setText(tipe);
        tvType.setText(umurr);
    }
}