package com.maruf.userdefinedmethod;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Nested_for_loop_magic extends AppCompatActivity {

    Button  bSubmit, bReset;
    EditText    edInput;
    TextView    tvResult1, tvResult2, tvResult3, tvResult4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nested_for_loop_magic);

        bSubmit=findViewById(R.id.bSubmit);
        edInput=findViewById(R.id.edInput);
        tvResult1=findViewById(R.id.tvResult1);
        tvResult2=findViewById(R.id.tvResult2);
        tvResult3=findViewById(R.id.tvResult3);
        tvResult4=findViewById(R.id.tvResult4);
        bReset=findViewById(R.id.bReset);

        bSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tvResult1.setText("");
                tvResult2.setText("");
                tvResult3.setText("");
                tvResult4.setText("");

                String  myString;
                myString= edInput.getText().toString();

                if (myString.isEmpty()){
                    edInput.setError("Please input any Number.");
                    Toast.makeText(Nested_for_loop_magic.this,"Input any number.",Toast.LENGTH_SHORT).show();
                }
                else {
                    int userInt;
                    userInt=Integer.parseInt(myString);
                    for (int x=1; x <=userInt; x++){
                        for (int z=1; z<= x; z++){
                            tvResult1.append(" * ");
                            tvResult2.append(" @ ");
                            tvResult3.append(" $ ");
                            tvResult4.append(" ^ ");
                        }
                        tvResult1.append(" \n");
                        tvResult2.append("\n");
                        tvResult3.append("\n");
                        tvResult4.append("\n");
                    }
                    tvResult1.setVisibility(View.VISIBLE);
                    tvResult2.setVisibility(View.VISIBLE);
                    tvResult3.setVisibility(View.VISIBLE);
                    tvResult4.setVisibility(View.VISIBLE);

                }
            }
        });

        bReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String  clear1, clear2, clear3, clear4, clear5;
                clear1=edInput.getText().toString();
                clear2=tvResult1.getText().toString();
                clear3=tvResult2.getText().toString();
                clear4=tvResult3.getText().toString();
                clear5=tvResult4.getText().toString();

                edInput.setText("");
                tvResult1.setText("");
                tvResult2.setText("");
                tvResult3.setText("");
                tvResult4.setText("");
                Toast.makeText(Nested_for_loop_magic.this,"Emplty..",Toast.LENGTH_LONG ).show();

                tvResult1.setVisibility(View.GONE);
                tvResult2.setVisibility(View.GONE);
                tvResult3.setVisibility(View.GONE);
                tvResult4.setVisibility(View.GONE);
            }
        });
    }
}