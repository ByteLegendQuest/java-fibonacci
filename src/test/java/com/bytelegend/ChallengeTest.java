package com.bytelegend;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ChallengeTest {
    @Test
    public void test() {
        Assertions.assertEquals(
                Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144),
                IntStream.range(0, 13).mapToObj(Challenge::fibonacci).collect(Collectors.toList()));
    }
}
