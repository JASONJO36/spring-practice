package com.jasonhome.springpractice.service;

import com.jasonhome.springpractice.logic.BubbleSort;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortServiceTest {

    private final SortService sortService = new SortService(
            new BubbleSort<>()
    );

    @Test
    void test() {
        List<String> actual = sortService.doSort(List.of("3", "2", "1"));

        assertEquals(List.of("1", "2","3"), actual);
    }



}