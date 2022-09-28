public class Main {
    public static void main(String[] args) {
        System.out.println(java.time.LocalDateTime.now().getHour());

        System.out.println("\n");

        System.out.println("Test sample:");
        Clock clock_one = new Clock();
        clock_one.printClock();


        Clock clock_two = new Clock("Casio", 220);
        clock_two.printClock();

        Clock clock_three = new Clock("Patek Philippe", 75000, 10, 36);
        clock_three.printClock();

        System.out.println("Example of work:");
        clock_three.plusTime(21, 25);
        clock_three.printClock();
    }
}