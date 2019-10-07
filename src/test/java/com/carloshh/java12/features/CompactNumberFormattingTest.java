package com.carloshh.java12.features;

import org.junit.jupiter.api.Test;

import java.text.NumberFormat;
import java.util.Locale;

import static org.assertj.core.api.Assertions.assertThat;

public class CompactNumberFormattingTest {

    @Test
    void testCompactNumberShort() {
        var locale = new Locale.Builder()
                            .setLanguage("en")
                            .setRegion("US")
                            .build();
        var compactNumberInstance = NumberFormat.getCompactNumberInstance(locale, NumberFormat.Style.SHORT);

        var result = compactNumberInstance.format(100_000);

        assertThat(result).isEqualTo("100K");
    }

    @Test
    void testCompactNumberLong() {
        var locale = new Locale.Builder()
                .setLanguage("en")
                .setRegion("US")
                .build();
        var compactNumberInstance = NumberFormat.getCompactNumberInstance(locale, NumberFormat.Style.LONG);

        var result = compactNumberInstance.format(100_000);

        assertThat(result).isEqualTo("100 thousand");
    }

}
