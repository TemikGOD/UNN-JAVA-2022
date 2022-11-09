public class Watch implements Interface { protected String brand; protected int price; protected int hours; protected int minutes;

    public Watch() { brand = "N/A"; price = 0; hours = 0; minutes = 0; }

    public Watch(String _b, int _p) { brand = _b; if (_p >= 0) { price = _p; } else { throw new NullPointerException("Error: Price < 0!"); } hours = java.time.LocalDateTime.now().getHour(); minutes = java.time.LocalDateTime.now().getMinute(); }

    public Watch(String _b, int _p, int _h, int _m) { brand = _b;

        if (_p >= 0) { price = _p; } else { throw new NullPointerException("Error: Price < 0!"); }

        if (_h >= 0) { hours += _h; if (hours > 23) hours %= 24; } else { throw new NullPointerException("Error: Hours < 0!"); }

        if (_m >= 0) { minutes += _m; if (minutes > 59) minutes %= 60; } else { throw new NullPointerException("Error: Minutes < 0!"); } }

    public String getBrand() { return brand; } public int getPrice() { return price; } // public int getHours() { return hours; } public int getMinutes() { return minutes; }

    public void actionTime(int _h, int _m) { hours += _h; minutes += _m; if (hours > 23) hours %= 24; if (minutes > 59) minutes %= 60; }

    @Override
    public void printWatch() { System.out.println("Brand: '" + brand + '\'' + " - " + "Price: " + price + " $ | " + "Hours: " + hours + " " + "Minutes: " + minutes + ";"); }

    @Override
    public String printBiggestPrice() {
        return "Brand: '" + brand + "' | Price: " + price + " $;";
    }

    public void setTime(Arrow type, int Value) { if (Value >= 0) { if (type == Arrow.Hours) { hours = Value; if (hours > 23) hours %= 24; } else if (type == Arrow.Minutes) { minutes = Value; if (minutes > 59) minutes %= 60; } } else { throw new NullPointerException("Error: Value < 0!"); } } }
