package com.lks.lkscalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etFirstValue, etSecondValue;
    TextView tvAns;
    Button Add, Sub, Mul, Div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFirstValue=findViewById(R.id.etFirstValue);
        etSecondValue=findViewById(R.id.etSecondValue);

        tvAns=findViewById(R.id.tvAns);

        Add=findViewById(R.id.btnAdd);
        Sub=findViewById(R.id.btnSub);
        Mul=findViewById(R.id.btnMul);
        Div=findViewById(R.id.btnDiv);

        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstValue, secondValue, Ans;

                firstValue=Integer.parseInt(etFirstValue.getText().toString());
                secondValue=Integer.parseInt(etSecondValue.getText().toString());

                Ans=firstValue+secondValue;
                Toast.makeText(getApplicationContext(), "Addition", Toast.LENGTH_LONG).show();
                tvAns.setText("Answer is : "+Ans);
            }
        });
        Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstValue, secondValue, Ans;

                firstValue=Integer.parseInt(etFirstValue.getText().toString());
                secondValue=Integer.parseInt(etSecondValue.getText().toString());

                Ans=firstValue-secondValue;
                Toast.makeText(getApplicationContext(), "Subtraction", Toast.LENGTH_LONG).show();
                tvAns.setText("Answer is : "+Ans);
            }
        });
        Mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstValue, secondValue, Ans;

                firstValue=Integer.parseInt(etFirstValue.getText().toString());
                secondValue=Integer.parseInt(etSecondValue.getText().toString());

                Ans=firstValue*secondValue;
                Toast.makeText(getApplicationContext(), "Multiplication", Toast.LENGTH_LONG).show();
                tvAns.setText("Answer is : "+Ans);
            }
        });
        Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstValue, secondValue, Ans;

                firstValue=Integer.parseInt(etFirstValue.getText().toString());
                secondValue=Integer.parseInt(etSecondValue.getText().toString());

                Ans=firstValue/secondValue;
                Toast.makeText(getApplicationContext(), "Division", Toast.LENGTH_LONG).show();
                tvAns.setText("Answer is : "+Ans);
            }
        });
    }


}