package com.getchefy.funfacts;

import java.util.Random;

/**
 * Created by mshen on 10/20/15.
 */
public class FactBook {
    String[] mFacts = {
            "Ants stretch when they wake up in the morning.",
            "Ostriches can run faster than horses.",
            "Olympic gold medals are mostly made of gold."
    };

    public String getFact(){
        String fact = "";
        Random randomGenerator = new Random(); // Construct a new Random number generator
        int randomNumber = randomGenerator.nextInt(mFacts.length);
        fact = mFacts[randomNumber];

        return fact;
    }
}
