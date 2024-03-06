public class Fundsache extends Fundbuero{
    private String bezeichnung;
    private String fundort;
    private double wert;

    public Fundsache(String bezeichnung, String fundort, double wert){
        this.bezeichnung = bezeichnung;
        this.fundort = fundort;
        this.wert = wert;
    }

    public String getBezeichnung(){
        return bezeichnung;
    }
    public String getFundort(){
        return fundort;
    }
    public double getWert(){
        return wert;
    }

    
}
