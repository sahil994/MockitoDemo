package org.hocrox.mockitodemo;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

/**
 * Created by sahilgoyal on 25/10/17.
 */

@RunWith(MockitoJUnitRunner.class)

public class MainActivityTest {

    @InjectMocks
    ArrayList<String> arrayList = new ArrayList<>();


    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Mock
    Example example;
    @Mock
    List<String> namesList;
    @Mock
    Comparable comparable;

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Test
    public void testquery() {


       ArrayList<String> arrayList1 = spy(arrayList);



        verify(arrayList1).add("hey Mr.");
        assertEquals(arrayList1.size(),1);







       /* when(example.Calculate(10, 15)).thenReturn(new ArrayList<Integer>());

        when(example.sum(10, 15)).thenReturn(10).thenReturn(15);
        namesList.add("sahil");

        verify(namesList).add("Sahil Goyal");
        String value = doReturn("sahil").when(namesList).get(0);
        boolean b = namesList.contains("sahil");
        boolean b1 = verify(namesList.size()).equals(1);
//        assertEquals("sahil", value);
        // assertTrue(b);
        assertEquals(true, b1);
        assertTrue(b1);*/
        //namesList.get(0);

       /* assertEquals(example.Calculate(10, 15), new ArrayList<Integer>());


        try {

            if (example.Calculate(10, 15) == new ArrayList<Integer>()) {

                try {

                    throw new IllegalArgumentException();

                } catch (Exception e) {
                    fail("Are youj idiot" + ">>>" + e.getMessage());

                }

            }

        } catch (Exception e) {
            fail("Hey what are you passing check your arguments" + ">>>" + e.getMessage());


        }*/
        // assertEquals(new ArrayList<Integer>(), example.Calculate(10, 15));

    }

}
