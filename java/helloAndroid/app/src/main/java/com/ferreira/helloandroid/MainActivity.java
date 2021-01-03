package com.ferreira.helloandroid;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.ferreira.helloandroid.databinding.ActivityMainBinding;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // implemetation of view binding
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
    }
    public void convertCurrency(View view) {


        /*      without view binding
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

         */
        if((!binding.realDolar.getText().toString().isEmpty()) & (!binding.currency.getText().toString().isEmpty())){
            Float realValue = Float.valueOf(binding.realDolar.getText().toString());
            Float currency = Float.valueOf(binding.currency.getText().toString());
            Float dollarValue = realValue * currency;
            binding.textView.setText(dollarValue.toString());
        }
        else{
            binding.textView.setText("");
        }
    }
}