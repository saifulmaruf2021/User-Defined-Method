package com.maruf.userdefinedmethod;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PrimeNumber extends AppCompatActivity {
    Button  bSubmit, bSubmit2, bReset;
    EditText    edInput, edNumber1, edNumber2, tvResult2;
    TextView    tvResult, edSum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prime_number);

        bSubmit = findViewById(R.id.bSubmit);
        edInput = findViewById(R.id.edInput);
        tvResult = findViewById(R.id.tvResult);
        bSubmit2 = findViewById(R.id.bSubmit2);
        edNumber1 = findViewById(R.id.edNumber1);
        edNumber2 = findViewById(R.id.edNumber2);
        tvResult2 = findViewById(R.id.tvResult2);
        edSum = findViewById(R.id.edSum);
        bReset = findViewById(R.id.bReset);


        //>>>>>>>>>>>>>>>>>Prime Number Or Not 1 Input Box<<<<<<<<<<<<<<<<<<<\\
        bSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String  myString;
                myString= edInput.getText().toString();

                if (myString.isEmpty()){
                    edInput.setError("Please input any Number.");
                    Toast.makeText(PrimeNumber.this,"Input any number.",Toast.LENGTH_SHORT).show();
                }
                else {
                    int userInt;
                    userInt=Integer.parseInt(myString);

                    for (int x=2; x<userInt; x++){

                        if (userInt % x ==0){
                            tvResult.setText(userInt+" is not Prime Number.");
                            break;
                        }
                        else {
                            tvResult.setText(userInt+" is a PRIME NUMBER.");
                        }
                    }
                }
            }
        });

       bSubmit2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               tvResult2.setText("All Prime Number: \n");
               String  myString, mySting2;
               myString= edNumber1.getText().toString();
               mySting2=edNumber2.getText().toString();

               if (myString.isEmpty()){
                   edNumber1.setError("Please input any Number.");
                   edNumber2.setError("Please input any Number.");
                   Toast.makeText(PrimeNumber.this,"Input any number.",Toast.LENGTH_SHORT).show();
               }
               else {
                   int userInt1, userInt2;
                   userInt1=Integer.parseInt(myString);
                   userInt2=Integer.parseInt(mySting2);
                   int sum=0;

                   for (int x =userInt1; x<= userInt2; x++){
                       int cout =0;

                       for (int i = 2; i <= x - 1; i++){
                           if (x % i ==0){
                               cout++;
                               break;
                           }
                       }
                       if (cout == 0 && x >1){
                           tvResult2.append(""+x+" , ");
                           sum= sum+x;
                       }
                   }
                   edSum.append("Sum= "+sum);
               }

           }
       });

       bReset.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               String  clear1, clear2, clear3, clear4, clear5, clear6;
               clear1=edInput.getText().toString();
               clear2=tvResult.getText().toString();
               clear3=edNumber1.getText().toString();
               clear4=edNumber2.getText().toString();
               clear5=tvResult2.getText().toString();
               clear6=edSum.getText().toString();

               edNumber1.setText("");
               edNumber2.setText("");
               edInput.setText("");
               tvResult.setText("");
               tvResult2.setText("");
               edSum.setText("");

               Toast.makeText(PrimeNumber.this,"Emplty..",Toast.LENGTH_LONG ).show();
           }
       });
    }
}