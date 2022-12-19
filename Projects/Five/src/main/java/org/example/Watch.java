package org.example;

public class Watch implements Interface { protected String brand; protected int price; protected int hours; protected int minutes;

    public Watch() { brand = "N/A"; price = 0; hours = 0; minutes = 0; }

    public Watch(String _brand, int _price, int _hours, int _minutes) { brand = _brand;
        if (_price >= 0) { price = _price; } else { throw new NullPointerException("Error: Price < 0!"); }
        if (_hours >= 0) { hours += _hours; if (hours > 23) hours %= 24; } else { throw new NullPointerException("Error: Hours < 0!"); }
        if (_minutes >= 0) { minutes += _minutes; if (minutes > 59) minutes %= 60; } else { throw new NullPointerException("Error: Minutes < 0!"); } }

    @Override
    public String toString() { return "X. Brand: '" + brand + "'; " + hours + ":" + minutes + ", Price: " + price + " $;"; } }
