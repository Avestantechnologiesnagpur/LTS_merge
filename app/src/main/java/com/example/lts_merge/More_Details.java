package com.example.lts_merge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class More_Details extends AppCompatActivity {
    public Button bt_plan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_details);

        bt_plan = (Button) findViewById(R.id.bt_select_plan);
        bt_plan.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent = new Intent(More_Details.this, Select_Plan.class);
                startActivity(intent);
            }
        });
    }
}