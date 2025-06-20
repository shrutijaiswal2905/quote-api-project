package com.devops;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuoteControllerTest {
    @Test
    void testGetQuote() {
        QuoteController qc = new QuoteController();
        assertNotNull(qc.getQuote());
    }
}
