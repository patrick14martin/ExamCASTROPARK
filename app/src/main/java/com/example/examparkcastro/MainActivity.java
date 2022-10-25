package com.example.examparkcastro;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public CardView card1, card2, card3, card4, card5, card6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        setContentView(R.layout.activity_main);

        card1 = (CardView) findViewById(R.id.Squid);
        card2 = (CardView) findViewById(R.id.Fish);
        card3 = (CardView) findViewById(R.id.Reptile);
        card4 = (CardView) findViewById(R.id.Tiger);
        card5 = (CardView) findViewById(R.id.Frog);
        card6 = (CardView) findViewById(R.id.Bird);

        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);
        card5.setOnClickListener(this);
        card6.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;

        switch (view.getId()) {
            case R.id.Squid:
                i = new Intent(this,Invertebrate.class);
                startActivity(i);
                break;

            case R.id.Fish:
                i = new Intent(this,Fish.class);
                startActivity(i);
                break;

            case R.id.Reptile:
                i = new Intent(this,Reptile.class);
                startActivity(i);
                break;

            case R.id.Tiger:
                i = new Intent(this,Mammal.class);
                startActivity(i);
                break;

            case R.id.Frog:
                i = new Intent(this,Amphibian.class);
                startActivity(i);
                break;

            case R.id.Bird:
                i = new Intent(this,Bird.class);
                startActivity(i);
                break;
        }
    }
}