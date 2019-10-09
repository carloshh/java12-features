package com.carloshh.java12.features;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TeeingCollectorsTest {

    @Test
    void testCollectorsTeeing() {
        var numbers = List.of(1, 2, 3, 4, 5);

        var mean = numbers.stream()
                .collect(Collectors.teeing(
                        Collectors.summingDouble(i -> i),
                        counting(),
                        (sum, n) -> sum / n));

        assertThat(mean).isEqualTo(3);
    }

}
