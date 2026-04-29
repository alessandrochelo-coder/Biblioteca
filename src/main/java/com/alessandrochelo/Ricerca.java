package com.alessandrochelo;

import java.util.Map;
import java.util.Scanner;

import com.alessandrochelo.gson.Libro;

public class Ricerca 
{
    Libreria lib = new Libreria();
    Map<Integer, Libro> mappaLibriAggiornata;
        

    public Ricerca()
    {
        
    }

    public void ricercaTitolo(Scanner scanner)
    {
         System.out.println("Inserisci il titolo del libro da cercare");
         String titoloDaCercare = scanner.nextLine(); 

         lib.leggiJson();
         mappaLibriAggiornata = lib.getElencolibri();

            for (Libro libro : mappaLibriAggiornata.values()) 
                {
                    if (libro.getTitolo().equalsIgnoreCase(titoloDaCercare)) 
                    {
                        System.out.println("Libro trovato: " + libro);
                        return; // Esce dal metodo dopo aver trovato il libro
                    }
                }
            System.out.println("Il libro selezionato non è presente");

            
    }

    public void ricercaAutore(Scanner scanner)
    {
        System.out.println("Inserisci l'autore del libro da cercare");
        String autoreDaCercare = scanner.nextLine(); 

        lib.leggiJson();
        mappaLibriAggiornata = lib.getElencolibri();

            for (Libro libro : mappaLibriAggiornata.values()) 
                {
                    if (libro.getAutore().equalsIgnoreCase(autoreDaCercare)) 
                    {
                        System.out.println("Libro trovato: " + libro);
                        
                    }
                }
            System.out.println("Il libro selezionato non è presente");
    }
}
