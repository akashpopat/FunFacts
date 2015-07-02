package com.akashpopat.funfacts;

import java.util.Random;

/**
 * Created by AkashP on 02-Jul-15.
 */
public class FactBook {
    public String getFact() {
        String[] facts = {"It is impossible to lick your elbow",
                "A crocodile can't stick it's tongue out.",
                "A shrimp's heart is in it's head.",
                "People say \"Bless you\" when you sneeze because when you sneeze,your heart stops for a mili-second.",
                "It is physically impossible for pigs to look up into the sky.",
                "More than 50% of the people in the world have never made or received a telephone call.",
                "Rats and horses can't vomit.", "If you sneeze too hard, you can fracture a rib."};

        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(facts.length);
        return facts[randomNumber];
    }
}
