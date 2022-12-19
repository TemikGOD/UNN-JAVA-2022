package org.example;

public class Seconds extends Watch { protected int seconds;

    public Seconds(String _brand, int _price, int _hours, int _minutes,int _seconds) {
        brand = _brand;
        if (_price >= 0) { price = _price; } else { throw new NullPointerException("Error: Price < 0!"); }
        if (_hours >= 0 ) { hours += _hours; if (hours > 23) { hours %= 24; } } else { throw new NullPointerException("Error: Hours < 0!"); }
        if (_minutes >= 0) { minutes += _minutes; if (minutes > 59) { minutes %= 60; } } else { throw new NullPointerException("Error: Minutes < 0!"); }
        if (_seconds >= 0) { seconds += _seconds; if (seconds > 59) { seconds %= 60; } } else { throw new NullPointerException("Error: Seconds < 0!"); } }

    @Override
    public String toString() { return "X. Brand: '" + brand + "'; " + hours + ":" + minutes + ":" + seconds + ", Price: " + price + " $;"; } }
