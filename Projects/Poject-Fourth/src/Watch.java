public class Watch implements Interface { protected String brand; protected int price; protected int hours; protected int minutes;
    public Watch() { brand = "N/A"; price = 0; hours = 0; minutes = 0;}
    public Watch(String _brand, int _price) { brand = _brand; if (_price >= 0) { price = _price; } else { throw new NullPointerException("Error: Price < 0!"); } hours = java.time.LocalDateTime.now().getHour(); minutes = java.time.LocalDateTime.now().getMinute(); }
    public Watch(String _brand, int _price, int _hours, int _minutes) { brand = _brand;
        if (_price >= 0) { price = _price; } else { throw new NullPointerException("Error: Price < 0!"); }
        if (_hours >= 0) { hours += _hours; if (hours > 23) hours %= 24; } else { throw new NullPointerException("Error: Hours < 0!"); }
        if (_minutes >= 0) { minutes += _minutes; if (minutes > 59) minutes %= 60; } else { throw new NullPointerException("Error: Minutes < 0!"); } }
    public String getBrand() { return brand; } public int getPrice() { return price; }
    @Override
    public void printWatch() { System.out.println("Brand: '" + brand + '\'' + " - " + "Price: " + price + " $ | " + "Hours: " + hours + " " + "Minutes: " + minutes + ";"); }
    @Override
    public String printBiggestPrice() { return "Brand: '" + brand + "' | Price: " + price + "$;"; }
    public void setTime(Arrow type, int Value) { if (Value >= 0) { if (type == Arrow.Hours) { hours = Value; if (hours > 23) hours %= 24; } else if (type == Arrow.Minutes) { minutes = Value; if (minutes > 59) minutes %= 60; } } else { throw new NullPointerException("Error: Value < 0!"); } } }
