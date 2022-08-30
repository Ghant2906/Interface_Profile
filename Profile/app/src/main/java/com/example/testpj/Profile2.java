package com.example.testpj;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Profile2 extends AppCompatActivity {
    TextView backTV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile2);
        backTV =  (TextView) findViewById(R.id.textView3);
        backTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainAc = new Intent(Profile2.this, MainActivity.class);
                startActivity(mainAc);
            }
        });
    }
}