
package animal;

public class Animal implements Ianimal { //Klasa Animal implementira interfejs

    protected String vrsta; //deklaracija promenljivih
    protected String naziv;
    protected String kontinent;
    protected String staniste;
    
    public Animal(){ //konstruktor
        
    }
    
    public Animal(String vrsta, String naziv, String kontinent, String staniste){//parametrizovani konstruktor
        this.vrsta = vrsta;
        this.naziv = naziv;
        this.kontinent = kontinent;
        this.staniste = staniste;
    }
    
    public String getNaziv(){ //metoda vraca naziv
        return naziv;
    }
    
    public void setNaziv(String naziv){ //setovanje naziva
        this.naziv = naziv;
    }

    public String getKontinent(){ //metoda vraca kontinent
        return kontinent;
    }
    
    public void setKontinent(String kontinent){//setovanje kontinenta
        this.kontinent = kontinent;
    }
    
    public String getStaniste(){ //metoda vraca staniste
        return staniste;
    }
    
    public void setStaniste(String staniste){ //setovanje stanista
        this.staniste = staniste;
    }
    
    @Override
    public void izdajPodatke() { // override-ovana metoda za ispis
        System.out.println("Vrsta: " + vrsta);
        System.out.println("Naziv: " + naziv);
        System.out.println("Kontinent: " + kontinent);
        System.out.println("Staniste: " + staniste);
    }
}
