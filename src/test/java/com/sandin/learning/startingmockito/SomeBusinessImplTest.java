package com.sandin.learning.startingmockito;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SomeBusinessImplTest {


    @Test
    public void findTheGreatestFromAllData (){

        SomeBusinessImpl business = new SomeBusinessImpl(new DataServiceStub());

        int result = business.findTheGreatestFromAllData();

        assertEquals(24, result);

    }
}