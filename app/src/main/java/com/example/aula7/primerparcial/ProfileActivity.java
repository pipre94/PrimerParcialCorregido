package com.example.aula7.primerparcial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }
        public void onConfigToolbar (){
            Toolbar toolbar =(Toolbar) findViewById(R.id.Toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Volver a la Lista");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}
