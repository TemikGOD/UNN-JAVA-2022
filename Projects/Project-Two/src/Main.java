public class Main {
    public static void main(String args[]) {
        System.out.println(java.time.LocalDateTime.now().getHour());

        System.out.println(" ");

        Watch watch_one = new Watch();
        watch_one.printWatch();

        System.out.println(" ");

        System.out.print("1) ");
        Watch watch_two = new Watch("Casio", 220);
        watch_two.printWatch();

        System.out.println(" ");

        System.out.print("2) ");
        Watch watch_three = new Watch("Patek Philippe", 75000, 10, 36);
        watch_three.printWatch();
        System.out.print("Example of work: ");
        watch_three.minusTime(-5, -25);
        watch_three.printWatch();

        System.out.println(" ");

        SWatch swatch_one = new SWatch();
        swatch_one.printWatch();

        System.out.println(" ");

        System.out.print("3) ");
        SWatch swatch_two = new SWatch("New Casio", 2500);
        swatch_two.printWatch();

        System.out.println(" ");

        System.out.print("4) ");
        SWatch swatch_three = new SWatch("New Patek Philippe", 95000, 22,5, 36);
        swatch_three.printWatch();
        System.out.print("Example of work: ");
        swatch_three.setTime(IWatch.Arrow.Hours, 2);
        swatch_three.printWatch();
    }
}