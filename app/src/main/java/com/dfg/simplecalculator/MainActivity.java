package com.dfg.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText value1;
    EditText value2;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        value1=findViewById(R.id.number1);
        value2=findViewById(R.id.number2);
        result=findViewById(R.id.result);
    }
    public void sum(View view){

        if(value1.getText().toString().matches("")|| value2.getText().toString().matches("")){
            result.setText("ERROR: Enter Number!");
        }else {
            int v1=Integer.parseInt(value1.getText().toString());
            int v2=Integer.parseInt(value2.getText().toString());

            int equal =v1+v2;

            result.setText("Result: "+equal);
        }
    }
    public void deduct(View view){
        if(value1.getText().toString().matches("")|| value2.getText().toString().matches("")){
            result.setText("ERROR: Enter Number!");
        }else {
            int v1=Integer.parseInt(value1.getText().toString());
            int v2=Integer.parseInt(value2.getText().toString());

            int equal =v1-v2;

            result.setText("Result: "+equal);
        }
    }
    public void multiply(View view){
        if(value1.getText().toString().matches("")|| value2.getText().toString().matches("")){
            result.setText("ERROR: Enter Number!");
        }else {
            int v1=Integer.parseInt(value1.getText().toString());
            int v2=Integer.parseInt(value2.getText().toString());

            int equal =v1*v2;

            result.setText("Result: "+equal);
        }
    }
    public void divide(View view){
        if((value1.getText().toString().matches("")|| value2.getText().toString().matches(""))){
            result.setText("ERROR: Enter Number!");
        }else if (value2.getText().toString().equals("0")){
            result.setText("ERROR: Value 2 can not be ZERO");
        }
        else {
            int v1=Integer.parseInt(value1.getText().toString());
            int v2=Integer.parseInt(value2.getText().toString());

            int equal =v1/v2;

            result.setText("Result: "+equal);
        }
    }
}