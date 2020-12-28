package com.ferreira.helloandroid;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void convertCurrency(View view) {

        EditText realText = findViewById(R.id.realDolar);
        EditText currencyText = findViewById(R.id.currency);
        TextView textView = findViewById(R.id.textView);

        if ((!currencyText.getText().toString().isEmpty()) & (!realText.getText().toString().equals(""))) {

            Float realValue = Float.valueOf(realText.getText().toString());
            Float currency = Float.valueOf(currencyText.getText().toString());
            Float dollarValue = realValue * currency;
            textView.setText(dollarValue.toString());
        } else {
            textView.setText("");
        }
    }
}