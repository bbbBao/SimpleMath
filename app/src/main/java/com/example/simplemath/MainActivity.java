package com.example.simplemath;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edtOp1;
    private EditText edtOp2;
    private Button btnCalculate;
    private Button btnCalculate2;
    private Button btnCalculate3;
    private Button btnCalculate4;
    private Button btnCalculate5;

    private TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //  tvAnswer = new TextView(null);

        tvAnswer = (TextView) findViewById(R.id.tvAnswer);
        edtOp1 = (EditText) findViewById(R.id.edtOp1);
        edtOp2 = (EditText) findViewById(R.id.edtOp2);
        btnCalculate = (Button) findViewById(R.id.btnCalculate);
        btnCalculate2 = (Button) findViewById(R.id.btnCalculate2);
        btnCalculate3 = (Button) findViewById(R.id.btnCalculate3);
        btnCalculate4 = (Button) findViewById(R.id.btnCalculate4);
        btnCalculate5 = (Button) findViewById(R.id.btnCalculate5);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double result;
                result = Double.parseDouble(edtOp1.getText().toString()) +
                        Double.parseDouble(edtOp2.getText().toString());
                tvAnswer.setText(result.toString());
            }
        });

        btnCalculate2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double result;
                result = Double.parseDouble(edtOp1.getText().toString()) -
                        Double.parseDouble(edtOp2.getText().toString());
                tvAnswer.setText(result.toString());


            }
        });

        btnCalculate3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double result;
                result = Double.parseDouble(edtOp1.getText().toString()) *
                        Double.parseDouble(edtOp2.getText().toString());
                tvAnswer.setText(result.toString());


            }
        });

        btnCalculate4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double result;
                if (edtOp2.getText().toString().equals("0")){

                    tvAnswer.setText("Not allowed");

                } else {
                    result = Double.parseDouble(edtOp1.getText().toString()) /
                            Double.parseDouble(edtOp2.getText().toString());
                    tvAnswer.setText(result.toString());
                }

            }
        });

        btnCalculate5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double result;
                if (edtOp2.getText().toString().equals("0")){

                    tvAnswer.setText("Not allowed");

                } else {
                    result = Double.parseDouble(edtOp1.getText().toString()) %
                            Double.parseDouble(edtOp2.getText().toString());
                    tvAnswer.setText(result.toString());
                }

            }
        });

    }

    public void onClick(View view){
        Double result;
        result = Double.parseDouble(edtOp1.getText().toString()) +
                Double.parseDouble(edtOp2.getText().toString());
        tvAnswer.setText(result.toString());
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();


    }
}