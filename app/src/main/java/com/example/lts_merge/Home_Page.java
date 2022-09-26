package com.example.lts_merge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Home_Page extends AppCompatActivity {
 public ImageView bt_res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        bt_res = findViewById(R.id.resturant);
        bt_res.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent = new Intent(Home_Page.this, Restaurants.class);
                startActivity(intent);
            }
        });
    }
}