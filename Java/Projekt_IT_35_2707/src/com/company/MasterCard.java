package com.company;

public class MasterCard extends Card{
    public MasterCard(Person owner, String card) {
        super(owner, card);
    }

    @Override
    public String toString() {
        return "MasterCard Card \t" +
                "owner= " + getOwner().getName() +
                ", card='" + getCard() + '\'' +
                "\n";
    }

    @Override
    public String toSecureString(){
        return "MasterCard Card \t" +
                "owner= " + getOwner().getName() +
                ", card='" + getSecureCard() + '\'' +
                "\n";

    }

    private String getSecureCard() {
        String stars="";
        for (int i=0; i<getCard().length()-6;++i){
            stars+="*";
        }
        return getCard().substring(0,2)+stars+getCard().substring(getCard().length()-2);
    }
}
