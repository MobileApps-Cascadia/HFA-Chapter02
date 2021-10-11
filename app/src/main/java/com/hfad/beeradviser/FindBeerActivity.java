package com.hfad.beeradviser;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Based on example from Head First Android Chapter 02
 */
public class FindBeerActivity extends Activity {
    private final BeerExpert expert = new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }

    //Called when the button gets clicked
    public void onClickFindBeer(View view) {
        //Gets a reference to the TextView and Spinner
        TextView brandsListView = findViewById(R.id.brands);
        Spinner colorSpinnerView = findViewById(R.id.color);

        //Gets the selected item in the Spinner
        String beerType = String.valueOf(colorSpinnerView.getSelectedItem());

        //TODO: WRITE code to get recommendations from the BeerExpert class
        expert.setColor(beerType);
        String brands = expert.getRecommendation();

        //TODO: MODIFY code to display the brands instead of the beerType using the BeerExpert class
        brandsListView.setText(brands);
    }
}
