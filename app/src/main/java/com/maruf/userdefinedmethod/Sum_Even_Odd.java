package com.maruf.userdefinedmethod;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Sum_Even_Odd extends AppCompatActivity {

    EditText edNumber1, edNumber2, edResult1, edResult2, edResult3, edSum1, edSum2, edSum3;
    Button bAll, bEven, bOdd, bReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sum_even_odd);

        edNumber1=findViewById(R.id.edNumber1);
        edNumber2=findViewById(R.id.edNumber2);
        edResult1=findViewById(R.id.edResult1);
        edResult2=findViewById(R.id.edResult2);
        edResult3=findViewById(R.id.edResult3);
        bAll=findViewById(R.id.bAll);
        bEven=findViewById(R.id.bEven);
        bOdd=findViewById(R.id.bOdd);
        bReset=findViewById(R.id.bReset);
        edSum1=findViewById(R.id.edSum1);
        edSum2=findViewById(R.id.edSum2);
        edSum3=findViewById(R.id.edSum3);


        bAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String   myString1, myString2;
                myString1=edNumber1.getText().toString();
                myString2=edNumber2.getText().toString();

                if (myString1.isEmpty()){
                    edNumber1.setError("Please Input all the fields");
                    edNumber2.setError("Please Input all the fields");
                }
                else {
                    int  myInt1, myInt2, sum;
                    myInt1=Integer.parseInt(myString1);
                    myInt2=Integer.parseInt(myString2);
                    sum = 0;

                    for (int x=myInt1; x<=myInt2; x++){
                        edResult1.append(""+x+", ");
                        sum = sum + x;
                        edSum1.setText("="+sum);
                    }
                }

            }
        });

        bEven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String  myString1, myString2;
                myString1= edNumber1.getText().toString();
                myString2= edNumber2.getText().toString();

                if (myString1.isEmpty()){
                    edNumber1.setError("Please Input all the fields");
                    edNumber2.setError("Please Input all the fields");
                }
                else {
                    int myInt1, myInt2, sum;

                    myInt1=Integer.parseInt(myString1);
                    myInt2=Integer.parseInt(myString2);
                    sum=0;

                    for (int x=myInt1; x<=myInt2; x++){
                        if (x % 2 == 0){
                            edResult2.append(""+x+", ");
                            sum = sum +x;
                            edSum2.setText("="+ sum);
                        }
                    }
                }

            }
        });

        bOdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String  myString1, myString2;
                myString1=edNumber1.getText().toString();
                myString2=edNumber2.getText().toString();

                if (myString1.isEmpty()){
                    edNumber1.setError("Please Input all the fields");
                    edNumber2.setError("Please Input all the fields");
                }
                else {

                    int myInt1, myInt2, sum;
                    myInt1=Integer.parseInt(myString1);
                    myInt2=Integer.parseInt(myString2);
                    sum= 0;

                    for (int x=myInt1; x<=myInt2; x++){
                        if (x % 2!=0){
                            edResult3.append(""+x+", ");
                            sum = sum +x;
                            edSum3.setText("="+sum);
                        }

                    }

                }

            }
        });

        bReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String  clear1, clear2, clear3, clear4, clear5, clear6, clear7, clear8;
                clear1=edNumber1.getText().toString();
                clear2=edNumber2.getText().toString();
                clear3=edResult1.getText().toString();
                clear4=edResult2.getText().toString();
                clear5=edResult3.getText().toString();
                clear6=edSum1.getText().toString();
                clear7=edSum2.getText().toString();
                clear8=edSum3.getText().toString();

                edNumber1.setText("");
                edNumber2.setText("");
                edResult1.setText("");
                edResult2.setText("");
                edResult3.setText("");
                edSum1.setText("");
                edSum2.setText("");
                edSum3.setText("");
                Toast.makeText(Sum_Even_Odd.this,"Emplty..",Toast.LENGTH_LONG ).show();
            }
        });
    }
}