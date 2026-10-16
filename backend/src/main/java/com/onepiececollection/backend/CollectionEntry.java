package com.onepiececollection.backend;

public class CollectionEntry {
    private Card card;
    private int quantityOwned;

    public CollectionEntry(Card card, int quantityOwned) {
        
        this.card = card;
        this.quantityOwned = quantityOwned;

    }

    public Card getCard() {
        return card;
    }

    public int getQuantityOwned() {
        return quantityOwned;
    }
}
