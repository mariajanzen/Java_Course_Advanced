package com.company;

public abstract class Card {
    private Person owner;
    private String card;

    public Card(Person owner, String card) {
        this.owner = owner;
        this.card = card;
    }

    public Person getOwner() {
        return owner;
    }

    public String getCard() {
        return card;
    }

    @Override
    public String toString() {
        return "Card " +
                "owner=" + owner +
                ", card='" + card + '\'' +
                '}';
    }

    public abstract String toSecureString();

}
