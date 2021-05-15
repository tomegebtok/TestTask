package com.gridnine.testing;


import com.gridnine.testing.Flight;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilterForDepartureBeforeArrivalTest {

    @Test
    void testingCorrectFilteringFlightsWithDeparturesBeforeArrivals() {
        List<Flight> expected = new ArrayList<>(FlightBuilder.createFlights());
        List<Flight> actual = FilterFactory.setFilter(Filter.DEPARTURE_BEFORE_ARRIVAL).filter(expected);
        expected.remove(3);
        assertEquals(expected, actual);
    }
}
