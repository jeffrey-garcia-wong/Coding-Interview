package com.jeffrey.facebook;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ReverseMakesEqualTests {

    @Test
    public void test_001() {
        int[] array_a_1 = {1, 2, 3, 4};
        int[] array_b_1 = {1, 4, 3, 2};
        assertTrue(ReverseMakesEqual.execute(array_a_1, array_b_1));
    }

    @Test
    public void test_002() {
        int[] array_a_2 = {1, 2, 3, 4};
        int[] array_b_2 = {1, 4, 3, 3};
        assertFalse(ReverseMakesEqual.execute(array_a_2, array_b_2));
    }
}