package com.alessandrochelo;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.alessandrochelo.gson.Catalogo;
import com.alessandrochelo.gson.Libro;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Amministratore {
    
    Libro libroDaAggiungere;

    public Amministratore()
    {

    }

    public void inserisci(Scanner scanner)
    {      
        Libreria libreria = new Libreria();
        libreria.leggiJson();

        System.out.println("Inserisci il titolo");
        String titolo = scanner.nextLine();

        System.out.println("Inserisci l'autore");
        String autore = scanner.nextLine();

        Integer maxChiave = null;
        for (Integer key : libreria.getElencolibri().keySet()) 
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

            
    }

    public void modifica()
    {

    }

    public void elimina()
    {

    }
    
}
