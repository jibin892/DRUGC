package com.msg91.sendotp.sample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Admin_home extends AppCompatActivity {
Button phycologist_btn,terapy_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_home);
        phycologist_btn=findViewById(R.id.phycologist_btn);
        terapy_btn=findViewById(R.id.terapy_btn);
terapy_btn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent j= new Intent(getApplicationContext(), Terapy_detailes.class);
        startActivity(j);
    }
});

        phycologist_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(getApplicationContext(), Phycologist_detailes.class);
                startActivity(i);
            }
        });
    }

}

