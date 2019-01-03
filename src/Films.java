import java.util.*;

public class Films{
    public void Drukuj(){
        System.out.println("Nazwa filmu to: "+tytul+ ", a gatunek to : "+gatunek);
    }

    String tytul, gatunek;
    
    
    public static void main (String [] args){
       
      Films film1 = new Films();
      film1.tytul = "Titanic";
      film1.gatunek = "Dramat";
      
      Films film2 = new Films();
      film2.tytul = "Jango";
      film2.gatunek ="Western";
      
      Films film3 = new Films();
      film3.tytul = "Leon";
      film3.gatunek = "Triller";
      
      Films [] mojeFilmy = new Films[3];
      mojeFilmy [0] = film1;
      mojeFilmy [1] = film2;
      mojeFilmy [2] = film3;
      

        int x = 0;
        while (x < mojeFilmy.length){
           mojeFilmy[x].Drukuj();
      
        x = x+1;
        }; 
        
        
        
        
    }
    
}

