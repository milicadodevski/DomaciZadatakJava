
package knjizara;

public class Knjiga extends Proizvod{
        public String autor; /*deklaracija promenljive*/
        
        public Knjiga(String naziv, String autor, double cena){ //parametrizovani konstruktor sa nasledjivanjem promenljivih
            super(naziv, cena);
            this.autor = autor;
        }
        
        public String getAutor(){ /*metoda koja vraca autora*/
            return autor;
        }

    @Override
    public String ToString() { //metoda za ispis
       return "Naziv: " + naziv + ", autor: " + autor + ", cena: " + cena;
    }
}
