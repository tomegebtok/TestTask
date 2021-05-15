package com.gridnine.testing;

import java.time.LocalDateTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        FilterHandler handler = new FilterHandler(FilterFactory.setFilter(Filter.DEPARTURE_BEFORE_ARRIVAL));
        executorService.execute(handler);

        handler = new FilterHandler(FilterFactory.setFilter(Filter.PAST_FLIGHTS), LocalDateTime.now());
        executorService.execute(handler);

        handler = new FilterHandler(FilterFactory.setFilter(Filter.TIME_ON_GROUND), LocalDateTime.of(0, 1, 1, 2, 0));
        executorService.execute(handler);

        executorService.shutdown();
    }
}
