package com.maruf.userdefinedmethod;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class New_Array extends AppCompatActivity {
    Button  button;
    TextView    textView;

    String[] names = {"Saiful", "Islam", "Maruf", "Bangladesh"};

    int[] myCounts = {100, 200, 500, 1000};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_array);

        button=findViewById(R.id.button);
        textView=findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setText("");

                for (int x =0; x<names.length; x++){


                    for (int a = 0; a<myCounts.length; a++){

                        textView.append(names[x]+"= "+myCounts[a]+"\n");
                    }
                }
            }
        });
    }
}