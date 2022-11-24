import java.util.ArrayList; import java.util.HashMap; import java.util.SortedSet; import java.util.TreeSet; import java.util.Collections; import java.util.Comparator;
public class Store { ArrayList<Watch> list = new ArrayList<>(); HashMap<String, Integer> HashMap = new HashMap<>(); SortedSet<String> SortedSet = new TreeSet<>();
    public Store() { Collections.addAll(list, new Watch("Casio", 220), new Watch("Philipp Plein", 75000, 10, 36)); }
    public String getDataElements(int _value) { return list.get(_value).getBrand(); }
    public int size() { return list.size(); }
    public String getBiggestPrice() { Comparator<Watch> comparator = Comparator.comparingInt(Watch::getPrice); return Collections.max(list, comparator).printBiggestPrice(); }
    public String getMostPopularBrand() {
        for (Watch item : list) { if (HashMap.containsKey(item.getBrand())) { int count = HashMap.get(item.getBrand()); HashMap.put(item.getBrand(), ++count); } else HashMap.put(item.getBrand(), 1); }
        // int max = 0; for (Watch o : list) { int item = HashMap.get(o.getBrand()); if (item > max) max = item; }
        String reaction = "N/A"; for (Watch o: list) { if (HashMap.get(o.getBrand()) == 0) reaction = o.getBrand(); } return reaction; }
    public void setTimeAllWatches(Watch.Arrow type, int Value) { for (Watch o: list) o.setTime(type, Value); }
    /* public void printAllBrands() { for (Watch o : list) { SortedSet.add(o.getBrand()); } SortedSet.forEach(System.out::println); } */ }
