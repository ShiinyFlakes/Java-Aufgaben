// u08_arrays
// auf8.19

// Handelskammerpruefung Fachinformatiker
// Sommer 2011 Kernpruefung G2 Handlungsschritt 5

public class Buchhaltung
{
   public Kursteilnehmer[] kursteilnehmer;
   
   // Folgende Felder stehen zur Verfuegeung:
   //
   // kursteilnehmer[i].kundennummer
   // kursteilnehmer[i].kursgebuehrEUR
   // kursteilnehmer[i].fruehbucherrabatt
   
   public double rechnungsbetrag_ermittlung(int kundennummer, int anzahl)
   {
      double rechnungsbetrag = 0.0;
      
      // Hier wird der Algorithmus implementiert.
      for (int i = 0; i < kursteilnehmer.length; i++) {
         // Überprüfe, ob die Kundennummer übereinstimmt
         if (kursteilnehmer[i].getKundenNr() == kundennummer) {
             // Berechne den Rabatt 
             double rabatt = kursteilnehmer[i].getFruehbucherrabatt() * kursteilnehmer[i].getGebuehrEur() / 100.0;
             
             // Berechne den Rechnungsbetrag
             rechnungsbetrag = (kursteilnehmer[i].getGebuehrEur() - rabatt) * anzahl;
             break; // Verlasse die Schleife, da der Kursteilnehmer gefunden wurde
         }
     }
      
      return rechnungsbetrag;
   }
}