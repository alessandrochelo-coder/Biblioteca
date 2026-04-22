package com.alessandrochelo.gson;



public class Libro {
private String autore;
private String titolo;
private int id;
private boolean inPrestito;
    
public Libro(String autore, String titolo, int codice){
    this.autore = autore;
    this.titolo = titolo;
    this.inPrestito = false;
    this.id = codice;
}

public String getAutore(){
    return autore;
}

public String getTitolo(){
    return titolo;
}

public boolean isInPrestito(){
    return inPrestito;
}

public int getId(){
    return id;
}

public void Presta()
{
    if(!inPrestito)
        {
            inPrestito = true;
            System.out.println(titolo + "- è stato prestato.");
    }else
        {
            System.out.println(titolo + "- è in prestito");
        }
}

public void Restituisci()
{
    if(inPrestito)
        { 
            inPrestito = false;
            System.out.println(titolo + "- è stato restituito");
        }else
        {
            System.out.println(titolo + "- non è in prestito");
        }
}

}
