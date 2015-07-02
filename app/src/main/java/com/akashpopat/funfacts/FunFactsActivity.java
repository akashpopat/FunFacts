package com.akashpopat.funfacts;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class FunFactsActivity extends ActionBarActivity {

    FactBook mFactBook = new FactBook();
    ColorWheel mColorWheel = new ColorWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Initialize text and button
        final TextView factsText = (TextView) findViewById(R.id.factsText);
        final Button getFactsButton = (Button) findViewById(R.id.getFactsButton);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        OnClickListener listener = new OnClickListener() {
            @Override
            public void onClick(View v) {

                factsText.setText(mFactBook.getFact());
                int color = mColorWheel.getColor();
                relativeLayout.setBackgroundColor(color);
                getFactsButton.setTextColor(color);
            }
        };
        getFactsButton.setOnClickListener(listener);
    }
}
