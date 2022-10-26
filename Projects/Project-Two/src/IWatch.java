public interface IWatch {
    String getBrand();
    int getPrice();
    int getHours();
    int getMinutes();

    void printWatch();
    enum Arrow { Hours, Minutes, Seconds }
    void setTime(Arrow type, int Value);
}
