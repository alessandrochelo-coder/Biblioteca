package com.alessandrochelo;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import com.alessandrochelo.gson.Catalogo;
import com.alessandrochelo.gson.Libro;
import com.alessandrochelo.utils.Utils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Amministratore {
    
    Libreria libreria = new Libreria();
    Map<Integer, Libro> mappaLibriAggiornata;
    Utils utils = new Utils();

    public Amministratore()
    {

    }

    public void inserisci(Scanner scanner)
    {      
        
        libreria.leggiJson();

        System.out.println("Inserisci il titolo");
        String titolo = scanner.nextLine();

        System.out.println("Inserisci l'autore");
        String autore = scanner.nextLine();

         mappaLibriAggiornata = libreria.getElencolibri();
        Integer maxChiave = null;
        for (Integer key : mappaLibriAggiornata.keySet()) 
            {
                if (maxChiave == null || key > maxChiave) 
                 {
                     maxChiave = key;
                     System.out.println("Chiave : " + maxChiave);
                 }
            }

            maxChiave = maxChiave + 1;
            System.out.println("Chiave : " + maxChiave);

            //creare nuovo libro
            Libro nuovoLibro = new Libro(autore, titolo, maxChiave);
            mappaLibriAggiornata.put(maxChiave, nuovoLibro);
            
            utils.caricaMappa(mappaLibriAggiornata);
    }

    public void modifica(Scanner scanner)
    {

         libreria.leggiJson();
         
         System.out.println("Inserisci id del libro da modificare");
         int id = scanner.nextInt();
            scanner.nextLine(); // Consuma il newline lasciato da nextInt()

         System.out.println("Inserisci il nuovo titolo");
         String nuovoTitolo =scanner.nextLine(); // Consuma il carattere di nuova riga
         
         System.out.println("Inserisci il nuovo autore");
         String nuovoAutore = scanner.nextLine();

         Libro libroModificato = new Libro(nuovoAutore, nuovoTitolo, id);
         mappaLibriAggiornata = libreria.getElencolibri();
         mappaLibriAggiornata.put(id, libroModificato);
         utils.caricaMappa(mappaLibriAggiornata);
    }

    public void elimina()
    {
         
    }
    
}
