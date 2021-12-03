
    package com.bytelegend;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;

    public class ChallengeTest {
    @Test
public void test() {
  Assertions.assertEquals(Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144),
      IntStream.range(0, 13).map(Challenge::fibonacci).collect(Collectors.toList());
  )
}

    }
