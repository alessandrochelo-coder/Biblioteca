package com.alessandrochelo;


import com.alessandrochelo.gson.Libro;
import com.alessandrochelo.utils.Utils;



import java.util.Map;
import java.util.Scanner;


public class Utente {
    
     
     //Scanner scan = new Scanner(System.in);
    Libro libroConStatoPrestitoAggiornato;
    Map<Integer, Libro> mappaLibriAggiornata;
    Utils utils;

    public Utente()
    {
         this.utils = new Utils();
    }

    public void visualizzaElenco (Libreria lib)
    {
        lib.leggiJson();
        lib.stampaMappa();
    }

    //metodo per prendere in prestito un libro

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

            utils.caricaMappa(mappaLibriAggiornata);
            //utils.caricaMappa( mappaLibriAggiornata);
            // //da hash ottenere lista<Libro>
            // List<Libro> listaLibriAggiornata = new ArrayList<>();
            
            // for ( Libro libroDaMappa : mappaLibriAggiornata.values()) 
            //     {
            //        listaLibriAggiornata.add(libroDaMappa);
            //     }
                
            // // creare catalogo aggiornato con dentro la lista<Libro>
            //  Catalogo catalogoAggiornato = new Catalogo();
            //  catalogoAggiornato.setLista(listaLibriAggiornata);
            // //Usi il catalogo per aggiornare il json con la libreria GSON
            // Gson gson = new GsonBuilder().setPrettyPrinting().create();


            // try (FileWriter writer = new FileWriter("C:\\\\Java-workspace\\\\libreria\\\\src\\\\main\\\\java\\\\com\\\\alessandrochelo\\\\Libreria.json")) 
            // {
            //     gson.toJson(catalogoAggiornato, writer);
            // }catch (IOException e)
            // {
            // e.printStackTrace();
            // }
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
            
            utils.caricaMappa(mappaLibriAggiornata);

            //  List<Libro> listaLibriAggiornata = new ArrayList<>();
            
            // for ( Libro libroDaMappa : mappaLibriAggiornata.values()) 
            //     {
            //        listaLibriAggiornata.add(libroDaMappa);
            //     }
 
            // Catalogo catalogoAggiornato = new Catalogo();
            // catalogoAggiornato.setLista(listaLibriAggiornata);
            // Gson gson = new GsonBuilder().setPrettyPrinting().create();

            // try (FileWriter writer = new FileWriter("C:\\\\Java-workspace\\\\libreria\\\\src\\\\main\\\\java\\\\com\\\\alessandrochelo\\\\Libreria.json")) 
            // {
            //     gson.toJson(catalogoAggiornato, writer);
            // }catch (IOException e)
            // {
            // e.printStackTrace();
            // }

        }
        
    }

    public void scriviSuJson ()
    {
        
    }
}
