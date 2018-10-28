
package knjizara;


public class Pribor extends Proizvod {
        protected String proizvodjac; /*deklaraija promenljive*/
        
         public Pribor(String naziv, String proizvodjac, double cena){ //parametrizovani konstruktor sa nasledjivanjem promenljivih*/
            super(naziv, cena);
            this.proizvodjac = proizvodjac;
        }
        
        public String getProizvodjac(){ /*metoda koja vraca proizvodjaca*/
            return proizvodjac;
        }

    @Override
    public String ToString() { //metoda za ispis
       return "Naziv: " + naziv + ", proizvodjac: " + proizvodjac + ", cena: " + cena;
    }
    
}
