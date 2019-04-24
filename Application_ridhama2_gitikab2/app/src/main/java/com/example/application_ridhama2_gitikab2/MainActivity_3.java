package com.example.application_ridhama2_gitikab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity_3 extends AppCompatActivity {
    private ImageButton button;
    public void MainActivity_3() {
        Intent changing_pages_for_resources = new Intent(this, MainActivity_3.class);
        startActivity(changing_pages_for_resources);
    }
    @Override
    protected void onCreate(Bundle SaveInstanceState) {
        super.onCreate(SaveInstanceState);
        setContentView(R.layout.activity_main_2);
        button = (ImageButton) findViewById(R.id.the_calendar);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity_3();
            }
        });
    }

}
