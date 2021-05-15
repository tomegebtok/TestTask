package com.gridnine.testing;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilterForTimeOnGroundTest {
    @Test
    void testingCorrectFilteringFlightsWithDeparturesBeforeArrivals() {
        List<Flight> expected = new ArrayList<>(FlightBuilder.createFlights());
        List<Flight> actual = FilterFactory.setFilter(Filter.TIME_ON_GROUND).filter(expected, LocalDateTime.of(0, 1, 1, 2, 0));
        expected.remove(expected.size() - 1);
        expected.remove(expected.size() - 1);
        assertEquals(expected, actual);
    }

}
