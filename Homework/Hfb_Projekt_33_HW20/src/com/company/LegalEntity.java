package com.company;

public class LegalEntity extends Client{
    private String typeOfOwnership;
    private String firmName;

    public LegalEntity(String typeOfOwnership, String firmName) {
        this.typeOfOwnership = typeOfOwnership;
        this.firmName = firmName;
    }

    public String getTypeOfOwnership() {
        return typeOfOwnership;
    }

    public String getFirmName() {
        return firmName;
    }

    @Override
    public String toString() {
        return "Firm: " +firmName+", "+
                typeOfOwnership ;
    }
}
