
package knjizara;

public abstract class Proizvod implements UporedivoPoCenama{ /*apstraktna klasa*/
    protected String naziv; /*deklaracija promenljivih*/
    protected double cena;
    
    public Proizvod(String naziv, double cena){ //parametrizovani konstruktor
        this.naziv = naziv;
        if(cena>0) this.cena = cena;
    }
    @Override
    public boolean skupljeOd(UporedivoPoCenama a) { //ovveride-ovana metoda koja uporedjuje proizvode od skipljih do jeftinijih
        Proizvod p = (Proizvod)a;
        return cena>p.cena;
    }

    @Override
    public boolean jeftinijeOd(UporedivoPoCenama a) { //ovveride-ovana metoda koja uporedjuje proizvode od jeftinijih do skupljih
         Proizvod p = (Proizvod)a;
         return cena<p.cena;
    }
    
    public String getNaziv(){ //metoda vraca naziv
        return naziv;
    }
    
    public double getCena(){ //metoda vraca cenu
        return cena;
    }
    
    public void setCena(double cena){ //metoda vraca cenu, ako je cena veca od 0
        if(cena>0) this.cena = cena;
    }
    
    public abstract String ToString(); //apstraktna metoda koja ce se kasnije implementirati
        
    
}
