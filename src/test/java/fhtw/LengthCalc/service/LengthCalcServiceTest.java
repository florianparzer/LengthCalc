package fhtw.LengthCalc.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthCalcServiceTest {

    @Test
    void getCentimeter() {
        LengthCalcService service = new LengthCalcService();
        assertEquals((float) 2.54, service.getCentimeter(1));
    }
}