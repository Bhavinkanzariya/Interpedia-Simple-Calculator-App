package com.example.celculation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn01,btn02,btn03,btn04,btn05,btn09,btn08;

    TextView number,result;

    String data;

    String opration;

    String num1,num2;

    Double res;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn01 = findViewById(R.id.btn01);
        btn02= findViewById(R.id.btn02);
        btn03= findViewById(R.id.btn03);
        btn04= findViewById(R.id.btn04);
        btn05 = findViewById(R.id.btn05);
        btn09 = findViewById(R.id.btn09);
        btn08 = findViewById(R.id.btn08);

        number = findViewById(R.id.number);
        result = findViewById(R.id.result);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                data =number.getText().toString();
                number.setText(data+"1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                data =number.getText().toString();
                number.setText(data+"2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                data =number.getText().toString();
                number.setText(data+"3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                data =number.getText().toString();
                number.setText(data+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                data =number.getText().toString();
                number.setText(data+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                data =number.getText().toString();
                number.setText(data+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                data =number.getText().toString();
                number.setText(data+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                data =number.getText().toString();
                number.setText(data+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                data =number.getText().toString();
                number.setText(data+"9");
            }
        });
        btn04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                data =number.getText().toString();
                number.setText(data+"0");
            }
        });
        btn08.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                number.setText("");
                result.setText("");
            }
        });
        btn01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                data =number.getText().toString();
                number.setText(data+"+");
                num1 =data;
                number.setText("");

                opration = "plush";
            }
        });
        btn02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                data =number.getText().toString();
                number.setText(data+"-");
                num1 =data;
                number.setText("");

                opration = "minus";
            }
        });
        btn03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                data =number.getText().toString();
                number.setText(data+"*");
                num1 =data;
                number.setText("");
                opration = "mul";
            }
        });
        btn09.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                data =number.getText().toString();
                number.setText(data+"/");
                num1 =data;
                number.setText("");

                opration = "div";
            }
        });
        btn05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                data =number.getText().toString();
                Toast.makeText(MainActivity.this, "data", Toast.LENGTH_SHORT).show();
                num2 =data;

                 if(opration.equals("plush")){

                      Double number = Double.parseDouble(num1);
                      Double number1 = Double.parseDouble(num2);
                      res = number1+number;
                      String r = String.valueOf(res);
                      result.setText(r);

                 }
                if(opration.equals("minus")){

                    Double number = Double.parseDouble(num1);
                    Double number1 = Double.parseDouble(num2);
                    res = number-number1;
                    String r = String.valueOf(res);
                    result.setText(r);

                }
                if(opration.equals("mul")){

                    Double number = Double.parseDouble(num1);
                    Double number1 = Double.parseDouble(num2);
                    res = number1*number;
                    String r = String.valueOf(res);
                    result.setText(r);

                }
                if(opration.equals("div")){

                    Double number = Double.parseDouble(num1);
                    Double number1 = Double.parseDouble(num2);
                    res = number/number1;
                    String r = String.valueOf(res);
                    result.setText(r);

                }
            }
        });




    }
}