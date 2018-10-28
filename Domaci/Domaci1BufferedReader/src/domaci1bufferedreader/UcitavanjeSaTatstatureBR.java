
package domaci1bufferedreader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UcitavanjeSaTatstatureBR {
    public void IspisiStringIIscitaj(){ //metoda za ispisivanje stringa
        BufferedReader recenica = new BufferedReader(new InputStreamReader(System.in)); //Kreiranje objekta BufferedReader
        System.out.println("Unesi recenicu: ");
        try{
            String s = recenica.readLine(); //unos
            System.out.println("Uneta recenica je: " + s); //ispis
        }
        catch(IOException ex){ //IOException za BufferedReader
            System.out.println(ex.getMessage());
        }
         
    }
    
     public void UnesiIIspisiKvadrat(){ //metoda za kvadrat broja
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in)); //Kreiranje objekta BufferedReader
        System.out.println("Unesi broj: ");
        try{
             int broj = Integer.parseInt(b.readLine()); //unos broja i konvertovanje u int
             System.out.println("Kvadrat broja " + broj + " je: " + broj*broj); //ispis
        }
        catch(IOException ex){ //IOException za BufferedReader
            System.out.println(ex.getMessage());
        }
    }
    
    public void UnesiIIspisiParnost(){ //metoda za odredjivanje parnosti
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in)); //Kreiranje objekta BufferedReader
        System.out.println("Unesi brojeve. Za kraj unesi 0");
        try{
            double broj = Integer.parseInt(b.readLine()); //unos broja i konvertovanje u int
         
            while(broj>0){ //sve dok je broj veci od 0
                if(broj%2==0) //ako je ostatak pri deljenju 0
                {
                    System.out.println("Broj je paran"); 
                }
                else{
                    System.out.println("Broj je neparan"); 
                }
                broj = Integer.parseInt(b.readLine()); //unos
        }
        }
        catch(IOException ex){ //IOException za BufferedReader
            System.out.println(ex.getMessage()); 
        }
       
    }
}
