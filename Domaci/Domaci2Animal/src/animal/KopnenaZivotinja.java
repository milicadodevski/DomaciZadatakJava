
package animal;

public class KopnenaZivotinja extends Animal { //Klasa KopnenaZivotinja nasledjuje Animal klasu
    protected boolean planinska; //deklaracija promenljivih
    protected boolean jestiva;
    protected boolean opasna;
    
    public KopnenaZivotinja(){ //konstruktor
        vrsta = "Kopnena zivotinja";
    }
    
    public boolean IsPlaninska(){ //metoda ispituje da li je zivotinja planinska
        return planinska;
    }
    
    public void setPlaninska(boolean planinska){ //setuje
        this.planinska = planinska;
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
        super.izdajPodatke();
        
        if(planinska){
            System.out.println("Planinska");
        }
        else{
            System.out.println("Ravnicarska");
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
