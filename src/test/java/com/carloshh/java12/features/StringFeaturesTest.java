package com.carloshh.java12.features;

import org.junit.jupiter.api.Test;

import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class StringFeaturesTest {

    @Test
    void testIndentOneLine() {
        var result = "Hello World".indent(5);

        //WTF finding here a end line character after indenting the string is weird
        assertThat(result).isEqualTo("     Hello World\n");
    }

    @Test
    void testIndentMultipleLines() {
        var result = "Hello\nWorld".indent(5);

        var firstLine = result.lines().collect(Collectors.toList()).get(0);
        assertThat(firstLine).isEqualTo("     Hello");

        var secondLine = result.lines().collect(Collectors.toList()).get(1);
        assertThat(secondLine).isEqualTo("     World");
    }

    @Test
    void testTransform() {
        var result = "Hello World".transform(String::toUpperCase);

        assertThat(result).isEqualTo("HELLO WORLD");
    }

}
