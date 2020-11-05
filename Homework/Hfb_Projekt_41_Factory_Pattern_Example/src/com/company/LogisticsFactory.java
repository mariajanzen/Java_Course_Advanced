package com.company;

public class LogisticsFactory {
    public Transports chooseATransport(String transportType) {
        if (transportType == null || transportType.isEmpty()) {
            return null;
        }

        if ("ROAD".equals(transportType)) {
            return new RoadTransport();
        } else if ("SHIP".equals(transportType)) {
            return new ShipTransport();
        } else if ("AVIA".equals(transportType)) {
            return new AviaTransport();
        }
        return null;
    }
}
