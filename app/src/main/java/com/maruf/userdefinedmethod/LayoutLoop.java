package com.maruf.userdefinedmethod;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class LayoutLoop extends AppCompatActivity {

    Button  bClick;
    LinearLayout myLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_loop);

        bClick=findViewById(R.id.bClick);
        myLayout=findViewById(R.id.myLayout);

        bClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                for (int x = 1; x<=20; x++){

                    Button button = new Button(LayoutLoop.this);
                    button.setText("Button "+x);
                    myLayout.addView(button);

                }

            }
        });

    }
}