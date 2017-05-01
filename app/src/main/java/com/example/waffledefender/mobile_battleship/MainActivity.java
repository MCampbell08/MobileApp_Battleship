package com.example.waffledefender.mobile_battleship;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.startGame){
            TextView textView = (TextView) findViewById(R.id.name);
            Intent intent = new Intent(MainActivity.this, GameActivity.class);
            intent.putExtra("playerName", textView.getText().toString());
            startActivity(intent);
        }
    }
}
