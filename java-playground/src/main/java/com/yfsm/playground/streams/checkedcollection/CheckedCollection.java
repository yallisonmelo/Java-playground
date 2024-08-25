package com.yfsm.playground.streams.checkedcollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import static java.lang.System.*;

public class CheckedCollection {

    public static void main(String[] args) {
        try {
            Collection customers = Collections.checkedCollection(new ArrayList<>(), String.class);
            customers.add("yallison");
            customers.add("felipe");
            customers.add(2);// add incorrect type in list
        } catch (ClassCastException e) {
            out.println("Exception thrown : " + e);
        }
    }
}
