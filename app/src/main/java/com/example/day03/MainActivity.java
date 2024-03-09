package com.example.day03;

import static com.example.day03.MoveAcitivityWithData.KEY_DATA;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMove = findViewById(R.id.btnMove);
        Button btnWithData = findViewById(R.id.btnMoveWithData);
        Button btnWithObj = findViewById(R.id.btnMoveWithObj);
        Button btnImplicit = findViewById(R.id.btnImplicit);

        btnMove.setOnClickListener(this);
        btnWithData.setOnClickListener(this);
        btnWithObj.setOnClickListener(this);
        btnImplicit.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnMove) {
            Intent intent = new Intent(this, MoveActivity.class);
            startActivity(intent);

        } else if (v.getId() == R.id.btnMoveWithData) {
            Intent intent = new Intent(this, MoveAcitivityWithData.class);
            intent.putExtra(KEY_DATA, "FULAN");
            startActivity(intent);

        } else if (v.getId() == R.id.btnMoveWithObj) {
            Marvel marvel = new Marvel();
            marvel.setName("Spiderman");
            marvel.setType("Spiderman");
            marvel.setAge(20);

            Intent intent = new Intent(this, MoveWithObjectActivity.class);
            intent.putExtra(MoveWithObjectActivity.KEY_DATA, marvel);
            startActivity(intent);

        } else if (v.getId() == R.id.btnImplicit) {
            String phone = "082290871090";
            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + phone));
            startActivity(intent);
        }
    }
}