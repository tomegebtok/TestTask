package com.gridnine.testing;

import java.time.LocalDateTime;
import java.util.List;

public class FilterHandler implements Runnable {
    private final FilterInterface filter;
    private final LocalDateTime[] time;

    public FilterHandler(final FilterInterface filter, final LocalDateTime... time) {
        this.filter = filter;
        this.time = time;
    }

    @Override
    public void run() {
        List<Flight> flights = FlightBuilder.createFlights();
        if (time.length == 0) {
            System.out.println(filter.filter(flights));
        } else {
            System.out.println(filter.filter(flights, time[0]));
        }
    }
}
