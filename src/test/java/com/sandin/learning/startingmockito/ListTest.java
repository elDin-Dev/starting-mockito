package com.sandin.learning.startingmockito;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListTest {

    @Test
    public void test(){
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(10);
        assertEquals(10, listMock.size());
    }


    @Test
    public void test_multiple_returns()
    {
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(10).thenReturn(20).thenReturn(30);
        assertEquals(10, listMock.size());
        assertEquals(20, listMock.size());
        assertEquals(30, listMock.size());
    }

    @Test
    public void test_get_with_zero()
    {
        List listMock = mock(List.class);
        when(listMock.get(0)).thenReturn("zero is ok");
        assertEquals("zero is ok", listMock.get(0));
    }

    @Test
    public void test_get_with_generic()
    {
        List listMock = mock(List.class);
        when(listMock.get(Mockito.anyInt())).thenReturn("int is ok");
        assertEquals("int is ok", listMock.get(59));
    }

}
