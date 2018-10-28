
package animal;


public class Program {

    public static void main(String[] args) {
        Riba r = new Riba("Riba", "Saran", "Evropa", "Voda", true, true, false); //kreiranje objkta klase pomocu parametrizovanog konstruktora
        
        KopnenaZivotinja k = new KopnenaZivotinja(); //kreiranje objekta klasa pomocu podrazumevanog konstruktora
        k.setNaziv("Lav");
        k.setKontinent("Afrika");
        k.setStaniste("Prasuma");
        k.setJestiva(false);
        k.setOpasna(true);
        
        Ptica p = new Ptica("Ptica", "Patka", "Svi", "Stpljine", true, true, false); //kreiranje objkta klase pomocu parametrizovanog konstruktora
        
        System.out.println("Zivotinja 1: "); //ispis
        r.izdajPodatke();
        
        System.out.println("Zivotinja 2: "); //ispis
        k.izdajPodatke();
        
        System.out.println("Zivotinja 3: "); //ispis
        p.izdajPodatke();
        
    }
    
}
