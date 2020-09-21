package com.company;

public enum TypeOfOwnership {
    GMBH
            {
                @Override
                public String getTypeString(){
                    return "GmbH";
                }
            },
    AG {
        @Override
        public String getTypeString() {
            return "AG";
        }
    },
    EV {
        @Override
        public String getTypeString() {
            return "e.V.";
        }
    };

    public abstract String getTypeString();

    public static TypeOfOwnership getTypeStringByString(String s){
        if(s.equals("GmbH")){
            return TypeOfOwnership.GMBH;
        }
        if(s.equals("AG")) {
            return TypeOfOwnership.AG;
        }
        if (s.equals("e.V.")){
           return TypeOfOwnership.EV;
        }
        return null;

    }

    @Override
    public String toString() {
        return getTypeString();
    }
}
