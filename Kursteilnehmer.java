// u08_arrays
// auf8.19

// Handelskammerpruefung Fachinformatiker
// Sommer 2011 Kernpruefung G2 Handlungsschritt 5

public class Kursteilnehmer
{
   public int kursnummer;
   public double kursgebuehrEUR;
   public int    kundennummer;
   public int    fruehbucherrabatt;
   public String teilnehmer;
   
   public Kursteilnehmer(int kursNr,
                         double gebuehrEUR,
                         int    kdNrAuftraggeber,
                         int    rabatt,
                         String namen)
   {
      kursnummer        = kursNr;
      kursgebuehrEUR    = gebuehrEUR;
      kundennummer      = kdNrAuftraggeber;
      fruehbucherrabatt = rabatt;
      teilnehmer        = namen;
   }

   public int getKursNr(){
      return this.kursnummer;
   }

   public double getGebuehrEur(){
      return this.kursgebuehrEUR;
   }

   public int getKundenNr(){
      return this.kundennummer;
   }

   public int getFruehbucherrabatt(){
      return this.fruehbucherrabatt;
   }

   public String getTeilnehmer(){
      return this.teilnehmer;
   }
}