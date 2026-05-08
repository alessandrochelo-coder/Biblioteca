package com.alessandrochelo;
import com.alessandrochelo.gson.Catalogo;
import com.alessandrochelo.gson.Libro;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Libreria 
{
    Map<Integer, Libro> elencolibri = new HashMap<>();

    

    public Libreria()
    {

    }

    public Map<Integer, Libro> getElencolibri() 
    {
        return elencolibri;
    }

    
    
    public void leggiJson(PassaggioParametri pass)
    {
        //"C:\\\\Java-workspace\\\\libreria\\\\src\\\\main\\\\java\\\\com\\\\alessandrochelo\\\\Libreria.json"
        Gson gson = new Gson();
        System.out.println("Stampa percorso file: " + pass.getPercorsoFile());
        try (Reader reader = new FileReader(pass.getPercorsoFile())) 
        {  
            System.out.println("Percorso del file: " + pass.getPercorsoFile());
            // Mappa il JSON a una classe Java specifica
            Catalogo catalogo = gson.fromJson(reader, Catalogo.class);
            System.out.println("la libreria contiene: " + catalogo.getLista().size() + " libri");
            
            //Stampa a video l'oggetto catalogo
            Gson gson1 = new GsonBuilder().setPrettyPrinting().create();
        
            String jsonPretty = gson1.toJson(catalogo);
            //System.out.println(jsonPretty);
            //riempire mappa
            //ottenere lista libri con getter
            //Iterare lista libri e popolare la mappa
            List<Libro> tmplista = catalogo.getLista();
            
            for(int i = 0; i < tmplista.size(); i++)
            {
               Libro tmplibro = tmplista.get(i);
               int id = tmplibro.getId();
               elencolibri.put(id, tmplibro);
            }

        } catch (IOException e) 
        {
            e.printStackTrace();
        }
        
        
    }

    public void stampaMappa()
    { 
         for (Map.Entry<Integer, Libro> entry : elencolibri.entrySet())
             {
                int chiave = entry.getKey();
                Libro libro =  entry.getValue();
                String titolo = libro.getTitolo();
                String autore = libro.getAutore();
                int numeroCopie = libro.getNumeroCopie();

                System.out.println("Chiave: " + chiave + ", libro: titolo - " + titolo + " autore - "+ autore + "in prestito - " + numeroCopie);
             }
    }

}