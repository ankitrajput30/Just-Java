package com.example.justjava;

import androidx.appcompat.app.AppCompatActivity;

import android.text.InputFilter;
import android.widget.TextView;
import android.os.Bundle;
import android.view.View;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity
{
    int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void increment(View view)
    {
        quantity = quantity+1;
        display(quantity);
    }

    public void decrement(View view)
    {
        quantity = quantity-1;
        display(quantity);
    }

    public void SubmitOrder(View view)
    {
        displayPrice(quantity * 5);
    }

    private void displayPrice(int number)
    {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    private void display(int number)
    {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText(""+ number);
    }
}