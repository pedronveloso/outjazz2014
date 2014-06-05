package com.pedronveloso.outjazz2014.outjazz.logic;

import java.util.GregorianCalendar;

/**
 * A single Jazz Event
 */
public class JazzEvent {

    private String artists;
    private EventLocation location;
    private GregorianCalendar date;

    public JazzEvent(String artists, EventLocation location, GregorianCalendar date) {
        this.artists = artists;
        this.location = location;
        this.date = date;
    }


    public String getArtists() {
        return artists;
    }

    public EventLocation getLocation() {
        return location;
    }

    public GregorianCalendar getDate() {
        return date;
    }
}
