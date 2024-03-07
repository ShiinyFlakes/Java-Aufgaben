// u08_arrays
// auf8.19

// Handelskammerpruefung Fachinformatiker
// Sommer 2011 Kernpruefung G2 Handlungsschritt 5

public class TestBuchhaltung
{
   public static void main(String[] args)
   {
      Kursteilnehmer[] kursteilnehmer = new Kursteilnehmer[16];
      
      kursteilnehmer[0] = new Kursteilnehmer(201105, 480.00, 5001, 20, "Anders, Max"    );
      kursteilnehmer[1] = new Kursteilnehmer(201105, 480.00, 5002,  0, "Meier, Paul"    );
      kursteilnehmer[2] = new Kursteilnehmer(201105, 480.00, 5003,  0, "Mueller, Anna"  );
      kursteilnehmer[3] = new Kursteilnehmer(201105, 480.00, 5004,  0, "Mueller, Klaus" );
      kursteilnehmer[4] = new Kursteilnehmer(201105, 980.00, 5005, 20, "Schneider, Hans");
      kursteilnehmer[5] = new Kursteilnehmer(201105, 980.00, 5006,  0, "Zuse, Maria"    );
      kursteilnehmer[6] = new Kursteilnehmer(201105, 980.00, 5007,  0, "Lippmann, Jan"  );
      kursteilnehmer[7] = new Kursteilnehmer(201105, 480.00, 5008, 20, "Mirkan, Arin"   );
      kursteilnehmer[8] = new Kursteilnehmer(201105, 480.00, 5009, 20, "Leila, Abu"     );
      kursteilnehmer[9] = new Kursteilnehmer(201105, 480.00, 5010, 20, "Polat, Can"     );
      kursteilnehmer[10]= new Kursteilnehmer(201105, 480.00, 5011, 20, "Kendal, Biharin");
      kursteilnehmer[11]= new Kursteilnehmer(201105, 480.00, 5012,  0, "Jochim, Kevin"  );
      kursteilnehmer[12]= new Kursteilnehmer(201105, 480.00, 5013,  0, "Cudi, Zozan"    );
      kursteilnehmer[13]= new Kursteilnehmer(201105, 480.00, 5014,  0, "Levi, Shirley"  );
      kursteilnehmer[14]= new Kursteilnehmer(201105, 480.00, 5015,  0, "Savage, William");
      kursteilnehmer[15]= new Kursteilnehmer(201105, 480.00, 5016,  0, "Helsten, Gunter");
      
      Buchhaltung buchhaltung    = new Buchhaltung();
      buchhaltung.kursteilnehmer = kursteilnehmer;
      
      double betrag1;
      double betrag2;
      double betrag3;
      double betrag4; 
      double betrag5; 
      double betrag6; 
      double betrag7; 
      double betrag8; 
      double betrag9; 
      double betrag10; 
      double betrag11; 
      double betrag12; 
      double betrag13; 
      double betrag14; 
      double betrag15; 
      double betrag16; 
      
      betrag1 = buchhaltung.rechnungsbetrag_ermittlung(5001,16);
      betrag2 = buchhaltung.rechnungsbetrag_ermittlung(5002,16);
      betrag3 = buchhaltung.rechnungsbetrag_ermittlung(5003,16);
      betrag4 = buchhaltung.rechnungsbetrag_ermittlung(5004,16);
      betrag5 = buchhaltung.rechnungsbetrag_ermittlung(5005,16);
      betrag6 = buchhaltung.rechnungsbetrag_ermittlung(5006,16);
      betrag7 = buchhaltung.rechnungsbetrag_ermittlung(5007,16);
      betrag8 = buchhaltung.rechnungsbetrag_ermittlung(5008,16);
      betrag9 = buchhaltung.rechnungsbetrag_ermittlung(5009,16);
      betrag10 = buchhaltung.rechnungsbetrag_ermittlung(5010,16);
      betrag11 = buchhaltung.rechnungsbetrag_ermittlung(5011,16);
      betrag12 = buchhaltung.rechnungsbetrag_ermittlung(5012,16);
      betrag13 = buchhaltung.rechnungsbetrag_ermittlung(5013,16);
      betrag14 = buchhaltung.rechnungsbetrag_ermittlung(5014,16);
      betrag15= buchhaltung.rechnungsbetrag_ermittlung(5015,16);
      betrag16 = buchhaltung.rechnungsbetrag_ermittlung(5016,16);
      
      System.out.println("Kunde 5001:  Soll = 784.0   Ist = " + betrag1);
      System.out.println("Kunde 5002:  Soll = 1460.0  Ist = " + betrag2);
      System.out.println("Kunde 5003:  Soll = 1881.8  Ist = " + betrag3);
      System.out.println("Kunde 5004:  Soll = 4104.0  Ist = " + betrag4);
      System.out.println("Kunde 5005:  Soll = 4104.0  Ist = " + betrag5);
      System.out.println("Kunde 5006:  Soll = 4104.0  Ist = " + betrag6);
      System.out.println("Kunde 5007:  Soll = 4104.0  Ist = " + betrag7);
      System.out.println("Kunde 5008:  Soll = 4104.0  Ist = " + betrag8);
      System.out.println("Kunde 5009:  Soll = 4104.0  Ist = " + betrag9);
      System.out.println("Kunde 5010:  Soll = 4104.0  Ist = " + betrag10);
      System.out.println("Kunde 5011:  Soll = 4104.0  Ist = " + betrag11);
      System.out.println("Kunde 5012:  Soll = 4104.0  Ist = " + betrag12);
      System.out.println("Kunde 5013:  Soll = 4104.0  Ist = " + betrag13);
      System.out.println("Kunde 5014:  Soll = 4104.0  Ist = " + betrag14);
      System.out.println("Kunde 5015:  Soll = 4104.0  Ist = " + betrag15);
      System.out.println("Kunde 5016:  Soll = 4104.0  Ist = " + betrag16);
   }
}