public class Watch implements IWatch
{
    protected String Brand;
    protected int Price;
    protected int Hours;
    protected int Minutes;

    public Watch()
    {
        this.Brand = "N/A";
        this.Price = 0;
        this.Hours = java.time.LocalDateTime.now().getHour();
        this.Minutes = java.time.LocalDateTime.now().getMinute();
    }

    public Watch(String _Brand, int _Price)
    {
        this.Brand = _Brand;

        if (_Price >= 0)
        {
            this.Price = _Price;

        } else { throw new NullPointerException("Error: Price < 0!"); }

        this.Hours = java.time.LocalDateTime.now().getHour();
        this.Minutes = java.time.LocalDateTime.now().getMinute();
    }

    public Watch(String _Brand, int _Price, int _Hours, int _Minutes)
    {
        this.Brand = _Brand;

        if (_Price >= 0)
        {
            this.Price = _Price;

        } else { throw new NullPointerException("Error: Price < 0!"); }

        if (_Hours >= 0)
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
    }

    public String getBrand()
    {
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

    public void plusTime(int _Hours, int _Minutes)
    {
        if (_Hours >= 0)
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

        } else { throw new NullPointerException("Error: Value < 0!"); }

    }

}
