public class Seconds extends Watch { protected int seconds;
    public Seconds(String _brand, int _p) { brand = _brand; if (_p >= 0) price = _p; else { throw new NullPointerException("Error: Price < 0!"); } hours = java.time.LocalDateTime.now().getHour(); minutes = java.time.LocalDateTime.now().getMinute(); seconds = java.time.LocalDateTime.now().getSecond(); }
    public Seconds(String _brand, int _price, int _hours, int _minutes, int _seconds) { brand = _brand;
        if (_price >= 0) price = _price; else { throw new NullPointerException("Error: Price < 0!"); }
        if (_hours >= 0 ) { hours += _hours; if (hours > 23) hours %= 24; } else { throw new NullPointerException("Error: Hours < 0!"); }
        if (_minutes >= 0) { minutes += _minutes; if (minutes > 59) minutes %= 60; } else { throw new NullPointerException("Error: Minutes < 0!"); }
        if (_seconds >= 0) { seconds += _seconds; if (seconds > 59) seconds %= 60; } else { throw new NullPointerException("Error: Seconds < 0"); } }
    public String getBrand() { return brand; } public int getPrice() { return price; }
    @Override
    public void printWatch() { System.out.println("Brand: '" + brand + '\'' + " - " + "Price: " + price + " $ | " + "Hours: " + hours + " " + "Minutes: " + minutes + " " + "Seconds: " + seconds + ";"); }
    public void setTime(Arrow type, int Value) { if (Value >= 0) { if (type == Arrow.Hours) { hours = Value; if (hours > 23) hours %= 24; if (minutes > 59) minutes %= 60; } else if (type == Arrow.Seconds) seconds = Value; if (seconds > 59) seconds %= 60; } else { throw new NullPointerException("Error: Value < 0!"); } } }

