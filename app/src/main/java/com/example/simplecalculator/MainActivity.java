package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num_1,num_2;
    TextView result;
    Button btn_add, btn_subtract, btn_multiply, btn_divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();
        setAction();
    }

    public void findViews(){

        num_1 = findViewById(R.id.EditText_1);
        num_2 = findViewById(R.id.EditText_2);

        result = findViewById(R.id.textView_4);

        btn_add = findViewById(R.id.button_1);
        btn_subtract = findViewById(R.id.button_2);
        btn_multiply = findViewById(R.id.button_3);
        btn_divide = findViewById(R.id.button_4);
    }

    public void setAction(){

        btn_add.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                   String num1 = num_1.getText().toString();
                   String num2 = num_2.getText().toString();

                   int number1 = Integer.parseInt(num1);
                   int number2 = Integer.parseInt(num2);

                   int res = number1 + number2;

                   result.setText(String.valueOf(res));
                   result.clearComposingText();
            }
        });

        btn_subtract.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                String num1 = num_1.getText().toString();
                String num2 = num_2.getText().toString();

                int number1 = Integer.parseInt(num1);
                int number2 = Integer.parseInt(num2);

                int res = number1 - number2;

                result.setText(String.valueOf(res));
                result.clearComposingText();
            }
        });

        btn_multiply.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                String num1 = num_1.getText().toString();
                String num2 = num_2.getText().toString();

                int number1 = Integer.parseInt(num1);
                int number2 = Integer.parseInt(num2);

                int res = number1 * number2;

                result.setText(String.valueOf(res));
                result.clearComposingText();
            }
        });

        btn_divide.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                String num1 = num_1.getText().toString();
                String num2 = num_2.getText().toString();

                int number1 = Integer.parseInt(num1);
                int number2 = Integer.parseInt(num2);

                int res = number1 / number2;

                result.setText(String.valueOf(res));
                result.clearComposingText();
            }
        });
    }
}