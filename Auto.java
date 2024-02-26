public class Auto {
    private String autoNummer;
    private int kmStand;

    public void setAutoNummer(String autoNummer) {
        this.autoNummer = autoNummer;
    }

    public String getAutoNummer() {
        return autoNummer;
    }

    public int getKmStand() {
        return kmStand;
    }

    public void aktualisiereKmStand(int gefahreneKm) {
        kmStand += gefahreneKm;
    }
}