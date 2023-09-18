package com.maruf.userdefinedmethod;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Multiplication_Factorial extends AppCompatActivity {

    Button bSubmit, bSubmit2, bReset;
    EditText edInput, edInput2;
    TextView tvResult, tvResult2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplication_factorial);

        bSubmit=findViewById(R.id.bSubmit);
        edInput=findViewById(R.id.edInput);
        tvResult=findViewById(R.id.tvResult);
        bSubmit2=findViewById(R.id.bSubmit2);
        edInput2=findViewById(R.id.edInput2);
        tvResult2=findViewById(R.id.tvResult2);
        bReset=findViewById(R.id.bReset);

        //>>>>>>>>>>>>>>>>>>>Multiplication<<<<<<<<<<<<<<<<<<<<<<<\\

        bSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText("");
                String  myString;
                myString= edInput.getText().toString();

                if (myString.isEmpty()){
                    edInput.setError("Please input any Number.");
                    Toast.makeText(Multiplication_Factorial.this,"Input any number.",Toast.LENGTH_SHORT).show();
                }
                else {
                    int myInt;
                    myInt=Integer.parseInt(myString);

                    for (int x =1; x<=10; x++){
                        int mul= myInt * x;
                        tvResult.append(myInt+" * "+x+"=" +mul+"\n");
                    }
                }
            }
        });

        //>>>>>>>>>>>>>>>>>>>FACTORIAL<<<<<<<<<<<<<<<<<<<<<<<\\

        bSubmit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String  myString;
                myString= edInput2.getText().toString();

                if (myString.isEmpty()){
                    edInput2.setError("Please input any Number.");
                    Toast.makeText(Multiplication_Factorial.this,"Input any number.",Toast.LENGTH_SHORT).show();
                }
                else {
                    int userInt;
                    userInt = Integer.parseInt(myString);
                    int factorial = 1;

                    for (int x=1; x<= userInt; x++){
                        factorial = factorial * x;
                        tvResult2.setText("Factorial of "+userInt+" is"+" ="+factorial);
                    }
                }
            }
        });

        //>>>>>>>>>>>>>>>>>>Reset/Clear<<<<<<<<<<<<<<<<<<<<\\

        bReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String  clear1, clear2, clear3, clear4;
                clear1=edInput.getText().toString();
                clear2=edInput2.getText().toString();
                clear3=tvResult.getText().toString();
                clear4=tvResult2.getText().toString();

                edInput.setText("");
                edInput2.setText("");
                tvResult.setText("");
                tvResult2.setText("");
                Toast.makeText(Multiplication_Factorial.this,"Emplty..",Toast.LENGTH_LONG ).show();
            }
        });
    }
}