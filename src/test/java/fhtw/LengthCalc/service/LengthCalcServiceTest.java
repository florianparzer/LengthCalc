package fhtw.LengthCalc.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthCalcServiceTest {

    @Test
    void getCentimeter() {
        LengthCalcService service = new LengthCalcService();
        assertEquals((float) 2.54, service.getCentimeter(1));
        assertEquals((float) 12.7, service.getCentimeter(5));
        assertEquals((float) 3.81, service.getCentimeter((float) 1.5));
        assertEquals((float) 0, service.getCentimeter(0));
    }
}