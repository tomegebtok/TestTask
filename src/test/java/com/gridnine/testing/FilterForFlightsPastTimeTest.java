package com.gridnine.testing;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilterForFlightsPastTimeTest {

    @Test
    void testingCorrectFilteringFlightsWithDeparturesBeforeArrivals() {
        List<Flight> expected = new ArrayList<>(FlightBuilder.createFlights());
        List<Flight> actual = FilterFactory.setFilter(Filter.PAST_FLIGHTS).filter(expected, LocalDateTime.now());
        expected.remove(2);
        assertEquals(expected, actual);
    }
}
