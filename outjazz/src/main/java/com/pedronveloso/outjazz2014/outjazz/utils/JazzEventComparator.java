package com.pedronveloso.outjazz2014.outjazz.utils;

import com.pedronveloso.outjazz2014.outjazz.logic.JazzEvent;

import java.util.Comparator;

/**
 * Used to sort JazzEvents by date
 */
public class JazzEventComparator implements Comparator<JazzEvent> {


    @Override
    public int compare(JazzEvent first, JazzEvent second) {
        return first.getDate().compareTo(second.getDate());
    }
}
