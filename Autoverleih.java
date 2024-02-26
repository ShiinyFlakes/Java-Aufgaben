public class Autoverleih {
    public static void main(String[] args) {
        Auto auto = new Auto();

        auto.setAutoNummer("HHAMG5555");

        auto.aktualisiereKmStand(381);
        auto.aktualisiereKmStand(433);
        auto.aktualisiereKmStand(186);

        System.out.println("Autonummer: " + auto.getAutoNummer());
        System.out.println("Aktueller km-Stand: " + auto.getKmStand() + " km");
    }
}