package com.sandin.learning.startingmockito;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SomeBusinessImplTest {


    @Test
    public void testFindTheGreatestFromAllData (){

        SomeBusinessImpl business = new SomeBusinessImpl(new DataServiceStub());

        int result = business.findTheGreatestFromAllData();

        assertEquals(24, result);

    }

    @Test
    public void withMockTestFindTheGreatestFromAllData (){

        DataService dataService = mock(DataService.class);
        when(dataService.retrieveAllData()).thenReturn(new int[]{32, 6, 15});


        SomeBusinessImpl business = new SomeBusinessImpl(dataService);

        int result = business.findTheGreatestFromAllData();

        assertEquals(32, result);

    }


}