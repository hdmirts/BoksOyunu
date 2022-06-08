public class Main {
    

    public static void main(String[] args) {
        Fighter f1 = new Fighter(" X oyuncusu", 10, 120, 100, 30, 60);
        Fighter f2 = new Fighter(" Y oyuncusu", 20, 85, 85, 45, 60);


        Match match = new Match(f1, f2, 85, 100);
        match.run();
    }
}
