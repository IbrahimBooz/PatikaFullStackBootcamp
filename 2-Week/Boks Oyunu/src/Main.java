public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("İbra", 10, 110, 100,20);
        Fighter f2 = new Fighter("Husa", 20, 85, 90,100);

        Match match = new Match(f1,f2,85,100);
        match.run();
    }
}
