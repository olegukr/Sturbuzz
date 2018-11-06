package com.hfad.sturbuzz;

public class Drink {
    private String name;
    private String description;
    private int imageResourceID;

    //Drinks is an array of Drinks

    public static final Drink[] drinks = {
            new Drink ("Latte", "A couple espresso shots with steamed milk", R.drawable.latte),
            new Drink( "Cappuccino", "Esspresso, hot milk and steamed milk foam", R.drawable.cappuccino),
            new Drink( "Filter", "Highest quality beans rasted and brewed frash", R.drawable.filter)
    };

    //Each Drinks has a name, description and image resource

    private Drink (String name, String description, int imageResourceID) {
        this.name = name;
        this.description = description;
        this.imageResourceID = imageResourceID;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceID() {
        return imageResourceID;
    }

    public String toString() {
        return this.name;
    }
}
