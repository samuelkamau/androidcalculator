package com.gmosa.myfirstcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button add,subtract,multiply,divide;
    private EditText number1,number2;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init ();

    }
    private void init(){
        add=(Button) findViewById(R.id.button);
        subtract=(Button) findViewById(R.id.button2);
        multiply=(Button)findViewById(R.id.button3);
        divide=(Button)findViewById(R.id.button4);
        number1=(EditText)findViewById(R.id.number1);
        number2=(EditText)findViewById(R.id.number2);
        result=(TextView)findViewById(R.id.result);
        add.setOnClickListener(this);
        subtract.setOnClickListener(this);
        multiply.setOnClickListener(this);
        divide.setOnClickListener(this);


    }
    public void onClick(View view){
        String num1=number1.getText().toString();
        String num2=number2.getText().toString();
        switch (view.getId()){
            case R.id.button:
                double add=Double.parseDouble(num1)+Double.parseDouble(num2);
                result.setText(String.valueOf(add));
                break;
            case R.id.button2:
                double subtract=Double.parseDouble(num1)-Double.parseDouble(num2);
                result.setText(String.valueOf(subtract));
                break;
            case R.id.button3:
                double multiply=Double.parseDouble(num1)*Double.parseDouble(num2);
                result.setText(String.valueOf(multiply));
                break;
            case R.id.button4:
                double divide=Double.parseDouble(num1)/Double.parseDouble(num2);
                result.setText(String.valueOf(divide));
        }
    }
}
