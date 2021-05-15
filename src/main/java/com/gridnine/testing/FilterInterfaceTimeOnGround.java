package com.gridnine.testing;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

class FilterInterfaceTimeOnGround implements FilterInterface {

    @Override
    public List<Flight> filter(final List<Flight> flights, final LocalDateTime... time) {
        return flights.stream()
                .filter(flight -> {
                    long timeOnGround = 0;
                    for (int i = 0; i < flight.getSegments().size() - 1; i++) {
                        timeOnGround += Duration.between(flight.getSegments().get(i).getArrivalDate(), flight.getSegments().get(i + 1).getDepartureDate()).toHours();
                    }
                    return timeOnGround < time[0].getHour();
                }).collect(Collectors.toList());
    }
}
