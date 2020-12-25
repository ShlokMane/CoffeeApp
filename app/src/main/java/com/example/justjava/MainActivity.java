package com.example.justjava;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.os.Bundle;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    // This app displays an order from , to order coffee

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int numberOfCoffees = 0;

    // This function is called when order button is clicked

    public void SubmitOrder(View view)
    {
        String priceMessage="Total Price  : " + NumberFormat.getCurrencyInstance().format(numberOfCoffees*20) + "\nThank You!";
        displayMessage (priceMessage);
        //displayPrice(numberOfCoffees*20);
    }
    //These functions are to increase and decrease no of coffees you wanna order
    public void increment(View view)
    {
        numberOfCoffees++;
        display(numberOfCoffees);
        //displayPrice(numberOfCoffees*20);
    }
    public void decrement(View view)
    {
        numberOfCoffees--;
        if(numberOfCoffees < 0)
        {
            numberOfCoffees=0;
        }
        display(numberOfCoffees);
        //displayPrice(numberOfCoffees*20);
    }

    //This method displays given quantity on screen (defines what happens after clicking the button)

    private void display(int number)
    {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
    //This method tells the price on the screen
    private void displayPrice(int number)
    {
        TextView priceTextView= (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
    private void displayMessage(String message)
    {
        TextView priceTextView=  (TextView) findViewById(R.id.price_text_view );
        priceTextView.setText(message);
    }
}
