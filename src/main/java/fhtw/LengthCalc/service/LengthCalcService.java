package fhtw.LengthCalc.service;

import org.springframework.stereotype.Service;

@Service
public class LengthCalcService {

    public float getCentimeter(float inch){
        return inch*(float)2.54;
    }

    public float getMeter(float yard){
        return yard/(float) 1.094;
    }
}
