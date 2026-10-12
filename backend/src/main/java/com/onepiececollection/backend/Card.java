package com.onepiececollection.backend;

public class Card {
    private String cardNumber; 
    private String name;
    private String type;
    private String colour;
    
    public Card(String cardNumber, String name, String type, String colour) {

        this.cardNumber = cardNumber;
        this.name = name;
        this.type = type;
        this.colour = colour;

    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getColour() {
        return colour;
    }
}
