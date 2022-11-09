import java.util.ArrayList; import java.util.HashMap; import java.util.SortedSet; import java.util.TreeSet; import java.util.Collections; import java.util.Comparator;

public class Store { ArrayList<Watch> list = new ArrayList<>(); HashMap<String, Integer> HashMap = new HashMap<>(); SortedSet<String> SortedSet = new TreeSet<>();

    public Store() { Collections.addAll(list, new Watch("'Casio'", 220), new Watch("'Philipp Plein'", 75000, 10, 36), new Second_Watch("'Casio'", 2500), new Second_Watch("'Patek Philippe'", 95000, 22, 5, 36) ); }

    public String getBiggestPrice() { Comparator<Watch> comparator = Comparator.comparingInt(Watch::getPrice); return Collections.max(list, comparator).printBiggestPrice(); }

    public String getMostPopularBrand() {
        for (Watch item : list) { if (HashMap.containsKey(item.getBrand())) { int count = HashMap.get(item.getBrand()); HashMap.put(item.getBrand(), ++count); } else HashMap.put(item.getBrand(), 1); }
        int max = 0; for (Watch o : list) { int itemc = HashMap.get(o.getBrand()); if (itemc > max) max = itemc; }
        String reaction = "N/A"; for (Watch o: list) { if (HashMap.get(o.getBrand()) == max) reaction = o.getBrand(); } return reaction;
    }

    public void printAllBrands() { for (Watch o : list) { SortedSet.add(o.getBrand()); } SortedSet.forEach(System.out::println); } }
