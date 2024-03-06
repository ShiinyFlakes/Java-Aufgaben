// u08_array
// auf8.08

public class Hausverwaltung
{
   private Wohnung[] wohnung;
   
   public void setWohnungen(Wohnung[] wohnung)
   {
      this.wohnung = wohnung;
   }
   
   public double gesamtmiete(int mieterNr)
   {
      double gesamtMiete = 0;
      for (Wohnung w : wohnung) {
         if (w.getMieterNr() == mieterNr) {
            gesamtMiete += (w.getFlaecheInQm() * w.getPreisProQm()) + w.getNebenkosten();
         }
      }
      return gesamtMiete;
   }
}