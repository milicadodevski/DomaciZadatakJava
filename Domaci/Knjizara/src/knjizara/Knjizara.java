
package knjizara;

import java.util.ArrayList;

/*hnuihiu*/
public class Knjizara {
    public static void main(String[] args) {
        ArrayList<Proizvod> p = new ArrayList<Proizvod>(); //array lista
        p.add((Proizvod)(new Knjiga("Noc u Lisabonu", "Remark",500))); //kreiranje nekoliko proizvoda
        p.add((Proizvod)(new Knjiga("Znakovi pored puta", "Ivo Andric",700)));
        p.add((Proizvod)(new Knjiga("Sjaj zvezda", "Sidni Seldon",600)));
        p.add((Proizvod)(new Pribor("Olovka", "Faber-Castell",120)));
        p.add((Proizvod)(new Pribor("Gumica", "Faber-Castell",100)));
        
        for(int i = 0; i<p.size();i++) //bubble sort
            for(int j=i+1; j<p.size();j++)
                if(p.get(j).jeftinijeOd(p.get(i))){ //uporedjivanje cena 
                    Proizvod pom = p.get(i); //zamena
                    p.set(i, p.get(j));
                    p.set(j,pom);
        }
        for(int i = 0; i<p.size(); i++){ //for petlja prolazi kroz sve proizvode
            if(p.get(i)instanceof Knjiga){ 
                Knjiga knjiga = (Knjiga)p.get(i);
                System.out.println(knjiga.ToString()); //stampa knjigu
            }
            else if(p.get(i)instanceof Pribor){
                    Pribor pribor = (Pribor)p.get(i);
                    System.out.println(pribor.ToString()); //stampa pribor
                }
        }
    }
}
