package com.carloshh.java12.features;

import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;

import static org.assertj.core.api.Assertions.assertThat;

public class SwitchExpressionsTest {

    @Test
    void testExample() {
        var isWorkingDay = switch (DayOfWeek.SUNDAY) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY  -> true;
            case SATURDAY, SUNDAY  -> false;
        };

        assertThat(isWorkingDay).isFalse();
    }

}
