package com.maruf.userdefinedmethod;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Palindrome_Square_Series_Even extends AppCompatActivity {

    Button  bSubmit1, bSubmit2, bSubmit3, bSubmit4, bReset1, bReset2, bReset3, bReset4;
    EditText    edInput1, tvResult1, edSum1, edInput2, tvResult2, edSum2, edInput3, tvResult3, edSum3, edInput4, tvResult4;

    long    t=0;
    long    sum=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palindrome_square_series_even);

        bSubmit1=findViewById(R.id.bSubmit1);
        edInput1=findViewById(R.id.edInput1);
        tvResult1=findViewById(R.id.tvResult1);
        edSum1=findViewById(R.id.edSum1);
        bSubmit2=findViewById(R.id.bSubmit2);
        edInput2=findViewById(R.id.edInput2);
        tvResult2=findViewById(R.id.tvResult2);
        edSum2=findViewById(R.id.edSum2);
        bSubmit3=findViewById(R.id.bSubmit3);
        edInput3=findViewById(R.id.edInput3);
        tvResult3=findViewById(R.id.tvResult3);
        edSum3=findViewById(R.id.edSum3);
        bSubmit4=findViewById(R.id.bSubmit4);
        edInput4=findViewById(R.id.edInput4);
        tvResult4=findViewById(R.id.tvResult4);
        bReset1=findViewById(R.id.bReset1);
        bReset2=findViewById(R.id.bReset2);
        bReset3=findViewById(R.id.bReset3);
        bReset4=findViewById(R.id.bReset4);


        //>>>>>>>>>>>>>>>>>>>>Even Number And Sum<<<<<<<<<<<<<<<<<\\

        bSubmit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tvResult1.setText("");
                String  myString;
                myString= edInput1.getText().toString();

                if (myString.isEmpty()){
                    edInput1.setError("Please input any Number.");
                    Toast.makeText(Palindrome_Square_Series_Even.this,"Input any number.",Toast.LENGTH_SHORT).show();
                }
                else {
                    int userInt, sum;
                    userInt=Integer.parseInt(myString);
                    sum=0;
                    for (int x=1; x<=userInt; x++){
                        int i = x * 2;
                        tvResult1.append(" "+i);
                        sum = sum + i;
                        edSum1.setText("Sum= "+sum);
                    }
                }
            }
        });

        bReset1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String  clear1, clear2, clear3;
                clear1=edInput1.getText().toString();
                clear2=tvResult1.getText().toString();
                clear3=edSum1.getText().toString();

                edInput1.setText("");
                tvResult1.setText("");
                edSum1.setText("");

                Toast.makeText(Palindrome_Square_Series_Even.this,"Emplty..",Toast.LENGTH_LONG ).show();

            }
        });

        //>>>>>>>>>>>>>>>>>>>Series Number<<<<<<<<<<<<<<<<<<<<<<\\
        bSubmit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tvResult2.setText("");
                String  myString;
                myString= edInput2.getText().toString();

                if (myString.isEmpty()){
                    edInput2.setError("Please input any Number.");
                    Toast.makeText(Palindrome_Square_Series_Even.this,"Input any number.",Toast.LENGTH_SHORT).show();
                }
                else {
                    int userInt;
                    userInt=Integer.parseInt(myString);
                    for (int x =1; x <=userInt; x++){
                        t = t * 10+9;
                        tvResult2.append(" " + t);
                        sum= sum+t;
                        edSum2.setText("Sum= "+sum);
                    }
                }

            }
        });

        bReset2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String  clear1, clear2, clear3;
                clear1=edInput2.getText().toString();
                clear2=tvResult2.getText().toString();
                clear3=edSum2.getText().toString();

                edInput2.setText("");
                tvResult2.setText("");
                edSum2.setText("");

                Toast.makeText(Palindrome_Square_Series_Even.this,"Emplty..",Toast.LENGTH_LONG ).show();
            }
        });

        //>>>>>>>>>>>>>>>>Square Number<<<<<<<<<<<<<<<<<<<<<<\\
        bSubmit3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tvResult3.setText("");
                String  myString;
                myString= edInput3.getText().toString();

                if (myString.isEmpty()){
                    edInput3.setError("Please input any Number.");
                    Toast.makeText(Palindrome_Square_Series_Even.this,"Input any number.",Toast.LENGTH_SHORT).show();
                }
                else {
                    int userInt, sum;
                    userInt=Integer.parseInt(myString);
                    sum=0;
                    for (int x =1; x <=userInt; x++){
                        int i= x*x;
                        tvResult3.append(" "+i);
                        sum = sum+i;
                        edSum3.setText("Sum= "+sum);
                    }
                }
            }
        });

        bReset3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String  clear1, clear2, clear3;
                clear1=edInput3.getText().toString();
                clear2=tvResult3.getText().toString();
                clear3=edSum3.getText().toString();

                edInput3.setText("");
                tvResult3.setText("");
                edSum3.setText("");

                Toast.makeText(Palindrome_Square_Series_Even.this,"Emplty..",Toast.LENGTH_LONG ).show();
            }
        });


        //>>>>>>>>>>>>>>>>>>Palindrome Number<<<<<<<<<<<<<<<<<<<\\
        bSubmit4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult4.setText("");
                String  myString;
                myString= edInput4.getText().toString();

                if (myString.isEmpty()){
                    edInput4.setError("Please input any Number.");
                    Toast.makeText(Palindrome_Square_Series_Even.this,"Input any number.",Toast.LENGTH_SHORT).show();
                }
                else {
                    int reversed = 0, remainder, original;
                    int n = Integer.parseInt(myString);
                    original= n;

                    while (n != 0){
                        remainder = n % 10;
                        reversed = reversed * 10 + remainder;
                        n /= 10;

                        if (original == reversed){
                            tvResult4.setText(original+ " is a Palindrome Number.");
                        }
                        else {
                            tvResult4.setText(original+" is not a Palindrome Number.");
                        }
                    }
                }

            }
        });

        bReset4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String  clear1, clear2, clear3;
                clear1=edInput4.getText().toString();
                clear2=tvResult4.getText().toString();

                edInput4.setText("");
                tvResult4.setText("");

                Toast.makeText(Palindrome_Square_Series_Even.this,"Emplty..",Toast.LENGTH_LONG ).show();
            }
        });

    }
}