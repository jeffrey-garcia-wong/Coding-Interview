package com.jeffrey.hackkerank;

import com.jeffrey.hackkerank.PdfViewer;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PdfViewerTests {

    @Test
    public void test_001() {
        List<Integer> list = Arrays.asList(1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5);
        String word = "abc";
        assertEquals(9, PdfViewer.execute(list, word));
    }

}
