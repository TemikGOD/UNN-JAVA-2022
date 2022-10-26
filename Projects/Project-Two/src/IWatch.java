public interface IWatch {
    enum Arrow { Hours, Minutes, Seconds }
    int getPrice();
    String getBrand();
    int getHours();
    int getMinutes();
    void setTime(Arrow type, int value);
}
