
package animal;

public class Ptica extends Animal { //Klasa Riba nasledjuje klasu Animal
    protected boolean gradska; //deklaracija promenljivih
    protected boolean jestiva;
    protected boolean opasna;
    
    public Ptica(){ //podrazumevani konstruktor
        vrsta = "Ptica";
    }
    
    public Ptica(String vrsta, String naziv, String kontinent, String staniste, boolean grdska, boolean jestiva, boolean opasna){ //parametrizovani konstruktor 
        super(vrsta, naziv, kontinent, staniste);
        this.gradska = gradska;
        this.jestiva = jestiva;
        this.opasna = opasna;
    }
    
    public boolean IsGradska(){ //metoda ispituje da li je zivotinja gradska
        return gradska;
    }
    
    public void setGradska(boolean gradska){ //setuje
        this.gradska = gradska;
    }
    
    public boolean IsJestiva(){ //metoda ispituje da li je zivotinja jestiva
        return jestiva;
    }
    
    public void setJestiva(boolean jestiva){ //setuje
        this.jestiva = jestiva;
    }
    
    public boolean IsOpasna(){ //metoda ispituje da li je zivotinja opasna
        return opasna;
    }
    
    public void setOpasna(boolean opasna){ //setuje
        this.opasna = opasna;
    }
    
    @Override
    public void izdajPodatke(){ //override-ovana metoda za ispis
        super.izdajPodatke(); //ispis iz bazne klase
        
        if(gradska){
            System.out.println("Gradska");
        }
        else{
            System.out.println("Zivi u divljini");
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
