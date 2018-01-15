package org.hocrox.mockitodemo;

import java.util.ArrayList;

/**
 * Created by sahilgoyal on 25/10/17.
 */
public class Example {

    public  int hewllo;
    public ArrayList<Integer> Calculate(int x, int y){

        int sum =x+y;

        ArrayList<Integer> arrayList=new ArrayList();
        arrayList.add(sum);
        return arrayList;

    }
    public int sum(int x, int y){

        int sum =x+y;

        return sum;

    }
}
