package com.pluralsight.conferencedemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ConferenceDemoApplicationTests {

    @Test
    void contextLoads() {
        assertEquals("David", "David");
    }

}
