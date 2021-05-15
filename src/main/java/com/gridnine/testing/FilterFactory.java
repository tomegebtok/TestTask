package com.gridnine.testing;

class FilterFactory {

    public static FilterInterface setFilter(Filter filter) {
        switch (filter) {
            case PAST_FLIGHTS:
                return new FilterInterfaceForFlightsPastTime();
            case DEPARTURE_BEFORE_ARRIVAL:
                return new FilterInterfaceDepartureBeforeArrival();
            case TIME_ON_GROUND:
                return new FilterInterfaceTimeOnGround();
        }
        return null;
    }
}
