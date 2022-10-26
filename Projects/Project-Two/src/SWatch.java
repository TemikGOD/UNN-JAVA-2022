public class SWatch extends Watch
{
    protected int Seconds;

    public SWatch()
    {
        this.Brand = "N/A";
        this.Price = 0;
        this.Hours = java.time.LocalDateTime.now().getHour();
        this.Minutes = java.time.LocalDateTime.now().getMinute();
        this.Seconds = java.time.LocalDateTime.now().getSecond();
    }

    public SWatch(String _Brand, int _Price)
    {
        this.Brand = _Brand;

        if (_Price >= 0)
            this.Price = _Price;

        else { throw new NullPointerException("Exception: Cost < 0!"); }

        this.Hours = java.time.LocalDateTime.now().getHour();
        this.Minutes = java.time.LocalDateTime.now().getMinute();
        this.Seconds = java.time.LocalDateTime.now().getSecond();
    }

    public SWatch(String _Brand, int _Price, int _Hours, int _Minutes, int _Seconds) {
        this.Brand = _Brand;
        if (_Price >= 0)
            this.Price = _Price;
        else { throw new NullPointerException("Exception: Price < 0!"); }

        if (_Hours >= 0 )
        {
            this.Hours += _Hours;

            if (this.Hours > 12)
                this.Hours %= 12;
        } else { throw new NullPointerException("Exception: Hours < 0!"); }

        if (_Minutes >= 0) {
            this.Minutes += _Minutes;
            if (this.Minutes > 12)
                this.Minutes %= 12;
        } else { throw new NullPointerException("Exception: Minutes < 0!"); }

        if (_Seconds >= 0)
        {
            this.Seconds += _Seconds;

            if (this.Seconds > 60)
                this.Seconds %= 60;
        } else { throw new NullPointerException("Exception: Seconds < 0"); }
    }

    public String getBrand(){
        return this.Brand;
    }

    public int getPrice()
    {
        return this.Price;
    }

    public int getHours()
    {
        return Hours;
    }

    public int getMinutes()
    {
        return Minutes;
    }

    public int getSeconds()
    {
        return Seconds;
    }

    public void plusTime(int _Hours, int _Minutes, int _Seconds)
    {
        if (_Hours >= 0 )
        {
            this.Hours += _Hours;

            if (this.Hours > 12)
                this.Hours %= 12;

        } else { throw new NullPointerException("Error: Hours < 0!"); }

        if (_Minutes >= 0)
        {
            this.Minutes += _Minutes;

            if (this.Minutes > 12)
                this.Minutes %= 12;
        } else { throw new NullPointerException("Error: Minutes < 0!"); }

        if (_Seconds >= 0)
        {
            this.Seconds += _Seconds;

            if (this.Seconds > 60)
                this.Seconds %= 60;
        } else { throw new NullPointerException("Error: Seconds < 0!"); }
    }

    public void setTime(Arrow type, int Value)
    {
        if (Value >= 0)
        {
            if (type == Arrow.Hours)
            {
                this.Hours = Value;

                if (this.Hours > 12)
                    this.Hours %= 12;
            }

            else if (type == Arrow.Minutes)
            {
                this.Minutes = Value;

                if (this.Minutes > 12)
                    this.Minutes %= 12;
            }

            else if (type == Arrow.Seconds)
            {
                this.Seconds = Value;

                if (this.Seconds > 60)
                    this.Seconds %= 60;
            }

        } else { throw new NullPointerException("Error: Value < 0!"); }
    }
}