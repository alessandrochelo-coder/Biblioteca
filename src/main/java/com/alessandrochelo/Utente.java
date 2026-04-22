package com.alessandrochelo;

import com.alessandrochelo.gson.Catalogo;
import com.alessandrochelo.gson.Libro;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class Utente {
    
     
     //Scanner scan = new Scanner(System.in);
    Libro libroConStatoPrestitoAggiornato;
    Map<Integer, Libro> mappaLibriAggiornata;
    public Utente()
    {
         
    }

    public void visualizzaElenco (Libreria lib)
    {
        lib.leggiJson();
        lib.stampaMappa();
    }

    public void prendiInPrestito(Libreria lib, Scanner scanner)
    {
        System.out.println("Inserisci id del libro");
        int b = scanner.nextInt();
        mappaLibriAggiornata = lib.getElencolibri();
        

        if(mappaLibriAggiornata.get(b) == null)
        {
             System.out.println("Il libro selezionato non è presente");
        }
        else
        if (mappaLibriAggiornata.get(b) != null)
        {
            libroConStatoPrestitoAggiornato = mappaLibriAggiornata.get(b);
            libroConStatoPrestitoAggiornato.Presta();

            //da hash ottenere lista<Libro>
            List<Libro> listaLibriAggiornata = new ArrayList<>();
            
            for ( Libro libroDaMappa : mappaLibriAggiornata.values()) 
                {
                   listaLibriAggiornata.add(libroDaMappa);
                }
                
            // creare catalogo aggiornato con dentro la lista<Libro>
             Catalogo catalogoAggiornato = new Catalogo();
             catalogoAggiornato.setLista(listaLibriAggiornata);
            //Usi il catalogo per aggiornare il json con la libreria GSON
            Gson gson = new GsonBuilder().setPrettyPrinting().create();


            try (FileWriter writer = new FileWriter("C:\\\\Java-workspace\\\\libreria\\\\src\\\\main\\\\java\\\\com\\\\alessandrochelo\\\\Libreria.json")) 
            {
                gson.toJson(catalogoAggiornato, writer);
            }catch (IOException e)
            {
            e.printStackTrace();
            }
            //riguardare il javadoc del 1 giorno della libreria GSON per vedere se esiste il metofo toJson
            //da capire come usarlo per aggiornare il file Libreria.json
        }
    }
    
    public void restituzione(Libreria lib, Scanner scanner)
    {
        System.out.println("Inserisci id del libro");
        int d = scanner.nextInt();
        mappaLibriAggiornata = lib.getElencolibri();
        

        if(mappaLibriAggiornata.get(d) == null)
        {
             System.out.println("Il libro non esiste nel catalogo");
        }
        else if(mappaLibriAggiornata.get(d) != null)
        {
            libroConStatoPrestitoAggiornato = mappaLibriAggiornata.get(d);
            libroConStatoPrestitoAggiornato.Restituisci();

             List<Libro> listaLibriAggiornata = new ArrayList<>();
            
            for ( Libro libroDaMappa : mappaLibriAggiornata.values()) 
                {
                   listaLibriAggiornata.add(libroDaMappa);
                }

            Catalogo catalogoAggiornato = new Catalogo();
            catalogoAggiornato.setLista(listaLibriAggiornata);
            Gson gson = new GsonBuilder().setPrettyPrinting().create();

            try (FileWriter writer = new FileWriter("C:\\\\Java-workspace\\\\libreria\\\\src\\\\main\\\\java\\\\com\\\\alessandrochelo\\\\Libreria.json")) 
            {
                gson.toJson(catalogoAggiornato, writer);
            }catch (IOException e)
            {
            e.printStackTrace();
            }

        }
        
    }
}
