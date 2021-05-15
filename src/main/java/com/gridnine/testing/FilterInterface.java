package com.gridnine.testing;

import java.time.LocalDateTime;
import java.util.List;

interface FilterInterface {
    List<Flight> filter(final List<Flight> flights, final LocalDateTime... time);
}
