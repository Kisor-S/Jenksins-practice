package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    void testGetMessage() {
        assertEquals("Hello from Jenkins!", Main.getMessage());
    }
}