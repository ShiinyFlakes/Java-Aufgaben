public class Fundbuero {
    public static void main(String[] args){
    Fundsache fund1 = new Fundsache("Geldbeutel", "Bahnhof", 20); 
    Fundsache fund2 = new Fundsache("Hund", "Straße", 500); 
    Fundsache fund3 = new Fundsache("Mütze", "Halle", 5);  
    
    System.out.println("Fundsache 1 Bezeichnung: " + fund1.getBezeichnung() + " Fundort: " + fund1.getFundort() + " Wert: " + fund1.getWert() );
    System.out.println("Fundsache 1 Bezeichnung: " + fund2.getBezeichnung() + " Fundort: " + fund2.getFundort() + " Wert: " + fund2.getWert() );
    System.out.println("Fundsache 1 Bezeichnung: " + fund3.getBezeichnung() + " Fundort: " + fund3.getFundort() + " Wert: " + fund3.getWert() );
}
}