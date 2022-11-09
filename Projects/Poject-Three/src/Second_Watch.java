public class Second_Watch extends Watch { protected int seconds;

    // public Second_Watch() { brand = "N/A"; price = 0; hours = 0; minutes = 0; seconds = 0; }

    public Second_Watch(String _b, int _p) { brand = _b;
        if (_p >= 0) price = _p; else { throw new NullPointerException("Error: Price < 0!"); }

        hours = java.time.LocalDateTime.now().getHour(); minutes = java.time.LocalDateTime.now().getMinute(); seconds = java.time.LocalDateTime.now().getSecond();
    }

    public Second_Watch(String _b, int _p, int _h, int _m, int _s) { brand = _b;
        if (_p >= 0) price = _p; else { throw new NullPointerException("Error: Price < 0!"); }
        if (_h >= 0 ) { hours += _h;
            if (hours > 23) hours %= 24; } else { throw new NullPointerException("Error: Hours < 0!"); }

        if (_m >= 0) { minutes += _m;
            if (minutes > 59) minutes %= 60; } else { throw new NullPointerException("Error: Minutes < 0!"); }

        if (_s >= 0) { seconds += _s;
            if (seconds > 59) seconds %= 60; } else { throw new NullPointerException("Error: Seconds < 0"); } }

    public String getBrand() { return brand; } public int getPrice() { return price; } // public int getHours() { return hours; } public int getMinutes() { return minutes; } public int getSeconds() { return seconds; }

    @Override
    public void printWatch() { System.out.println("Brand: '" + brand + '\'' + " - " + "Price: " + price + " $ | " + "Hours: " + hours + " " + "Minutes: " + minutes + " " + "Seconds: " + seconds + ";"); }

    public void setTime(Arrow type, int Value) {
        if (Value >= 0) {
            if (type == Arrow.Hours) { hours = Value;
                if (hours > 23) hours %= 24;
                if (minutes > 59) minutes %= 60; } else if (type == Arrow.Seconds) seconds = Value;
            if (seconds > 59) seconds %= 60; } else { throw new NullPointerException("Error: Value < 0!"); } } }

