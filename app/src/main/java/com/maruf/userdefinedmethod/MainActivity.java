package com.maruf.userdefinedmethod;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button, button2, button3, button4, button5, button6, button7, button8;
    TextView tvDisplay;

    int count = 0;
    int added = 0;
    int mul = 0;
    int again = 0;
    int number = 0;
    int seven  = 0;
    int butn = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.button);
        button2=findViewById(R.id.button2);
        tvDisplay=findViewById(R.id.tvDisplay);
        button3=findViewById(R.id.button3);
        button4=findViewById(R.id.button4);
        button5=findViewById(R.id.button5);
        button6=findViewById(R.id.button6);
        button7=findViewById(R.id.button7);
        button8=findViewById(R.id.button8);

        //>>>>>>>>>>>>>>>>>>>>UserDefinedMethod<<<<<<<<<<<<<<<<<<<<\\

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if ( checkInternet() ){
                    showToast("Internet Connected");
                }else {

                    new AlertDialog.Builder(MainActivity.this)
                            .setTitle("Internet Disconnected")
                            .setIcon(R.drawable.ic_internet)
                            .setPositiveButton("Reload", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {

                                    checkInternet();
                                }
                            })
                            .show();
                }


            }

        });

        //>>>>>>>>>>>>>>>>>Button Click to Another Page<<<<<<<<<<<<<<<<<<<<<\\

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                count++;
                if (count == 1){
                    Toast.makeText(MainActivity.this,"Click Again.",Toast.LENGTH_SHORT).show();
                }
                else if (count == 2){
                    count = 0;

                    Intent myint;
                    myint= new Intent(MainActivity.this, LayoutLoop.class);
                    startActivity(myint);
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                added++;
                if (added == 1){
                    Toast.makeText(MainActivity.this,"Click Again.",Toast.LENGTH_SHORT).show();
                }
                else if (added == 2){
                    added = 0;

                    Intent myint;
                    myint= new Intent(MainActivity.this, Sum_Even_Odd.class);
                    startActivity(myint);
                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mul++;
                if (mul ==1){
                    Toast.makeText(MainActivity.this,"Click Agian.", Toast.LENGTH_SHORT).show();
                }
                else if (mul == 2){
                    mul= 0;

                    Intent    myInt;
                    myInt= new Intent(MainActivity.this,Multiplication_Factorial.class);
                    startActivity(myInt);
                }


            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                again++;
                if (again ==1){
                    Toast.makeText(MainActivity.this,"Click Agian.", Toast.LENGTH_SHORT).show();
                }
                else if (again == 2){
                    again= 0;

                    Intent    myInt;
                    myInt= new Intent(MainActivity.this,Nested_for_loop_magic.class);
                    startActivity(myInt);
                }


            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number++;
                if (number ==1){
                    Toast.makeText(MainActivity.this,"Click Agian.", Toast.LENGTH_SHORT).show();
                }
                else if (number == 2){
                    number= 0;

                    Intent    myInt;
                    myInt= new Intent(MainActivity.this,Palindrome_Square_Series_Even.class);
                    startActivity(myInt);
                }


            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                seven++;
                if (seven ==1){
                    Toast.makeText(MainActivity.this,"Click Agian.", Toast.LENGTH_SHORT).show();
                }
                else if (seven == 2){
                    seven= 0;

                    Intent    myInt;
                    myInt= new Intent(MainActivity.this,PrimeNumber.class);
                    startActivity(myInt);
                }


            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                butn++;
                if (butn ==1){
                    Toast.makeText(MainActivity.this,"Click Agian.", Toast.LENGTH_SHORT).show();
                }
                else if (butn == 2){
                    butn= 0;

                    Intent    myInt;
                    myInt= new Intent(MainActivity.this,New_Array.class);
                    startActivity(myInt);
                }


            }
        });


    }



    //>>>>>>>>>>>>>>>>>>>>>>>>PrivateClass<<<<<<<<<<<<<<<<<<<<\\


    private boolean checkInternet(){

        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();

        if (networkInfo!=null && networkInfo.isConnected()){
            return true;
        }else {
            return false;
        }
    }


    private void showToast(String myString){

        Toast.makeText(MainActivity.this,""+myString,Toast.LENGTH_SHORT).show();
    }

}