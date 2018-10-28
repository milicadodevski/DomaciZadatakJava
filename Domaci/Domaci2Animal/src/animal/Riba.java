
package animal;

public class Riba extends Animal { //Klasa Riba je nasledila metodu Animal
    protected boolean slatkovodna; //deklarisanje promenljivih
    protected boolean jestiva;
    protected boolean opasna;
    
    public Riba(){ //konstruktor
        vrsta = "Riba";
    }
    
    public Riba(String vrsta, String naziv, String kontinent, String staniste, boolean slatkovodna, boolean jestiva, boolean opasna){  //parametrizovani konstruktor sa nasledjivanjem
        super(vrsta, naziv, kontinent, staniste); //nasledjuje parametre iz Klase Animal
        this.slatkovodna = slatkovodna;
        this.jestiva = jestiva;
        this.opasna = opasna;
    }
    
    public boolean IsSlatkovodna(){ //metoda ispituje da li je Riba slatkovodna
        return slatkovodna;
    }
    
    public void setSlatkovodna(boolean slatkovodna){ //setuje
        this.slatkovodna = slatkovodna;
    }
    
    public boolean IsJestiva(){ //metoda ispituje da li je Riba jestiva
        return jestiva;
    }
    
    public void setJestiva(boolean jestiva){ //setuje
        this.jestiva = jestiva;
    }
    
      public boolean IsOpasna(){ //metoda ispituje da li je Riba opasna
        return opasna;
    }
    
    public void setOpasna(boolean opasna){ //setuje 
        this.opasna = opasna;
    }
    
    @Override
    public void izdajPodatke(){ //override-ovana metoda za ispis
        super.izdajPodatke();
        if(slatkovodna){
            System.out.println("Slatkovodna");
        }
        else{
            System.out.println("Morska");
        }
        if(jestiva){
            System.out.println("Jestiva");
        }
        else{
            System.out.println("Nije jestiva");
        }
        if(opasna){
            System.out.println("Opasna");
        }
        else{
            System.out.println("Nije opasna");
        }
    }
    
}
