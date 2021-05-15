package com.gridnine.testing;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

class FilterInterfaceDepartureBeforeArrival implements FilterInterface {

    @Override
    public List<Flight> filter(final List<Flight> flights, final LocalDateTime ... time) {
        return flights.stream()
                .filter(flight -> flight.getSegments().stream()
                        .anyMatch(segment -> segment.getArrivalDate().isAfter(segment.getDepartureDate()))).collect(Collectors.toList());
    }
}
