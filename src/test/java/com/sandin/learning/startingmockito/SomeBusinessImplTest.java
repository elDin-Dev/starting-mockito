package com.sandin.learning.startingmockito;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class SomeBusinessImplTest {


    @Mock
    DataService dataServiceMock;

    @InjectMocks
    SomeBusinessImpl businessImpl;


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


    @Test
    public void withMockitoAnnotationTestFindTheGreatestFromAllData (){


        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{ 6, 15});

        int result = businessImpl.findTheGreatestFromAllData();

        assertEquals(15, result);

    }



}