package com.example.android.justjava;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;


/**
 * this app displays an order form to order coffee
 */
public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * this method is called when the order button is clicked
     */
    public void submitOrder(View view){
        int price=5*quantity;
        String priceMessage="Total: $ " + price +"\nThank you!";
        displayMessage(priceMessage);
    }
    int quantity=0;
    public void increment(View view){
        quantity=quantity+1;
        display(quantity);
    }
    public void decrement(View view){
        quantity=quantity-1;
        display(quantity);

    }

    /**
     * this method display the given quatity value on the screen
     */
    private void display(int number){
        TextView quatityTextView=(TextView)findViewById(R.id.quatity_text_view);
        quatityTextView.setText("" + number);
    }
    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));

    }
    private void displayMessage(String message){
        TextView priceTextView=(TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }
}
