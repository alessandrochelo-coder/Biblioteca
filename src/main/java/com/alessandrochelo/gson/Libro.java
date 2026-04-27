package com.alessandrochelo.gson;



public class Libro {
private String autore;
private String titolo;
private int id;
private int numeroCopie;
    
public Libro(String autore, String titolo, int codice){
    this.autore = autore;
    this.titolo = titolo;
    this.id = codice;
}

public String getAutore(){
    return autore;
}

public String getTitolo(){
    return titolo;
}

public int getNumeroCopie()
{
    return numeroCopie;
}

public int getId(){
    return id;
}

public void Presta()
{
    // if(!inPrestito)
    //     {
    //         inPrestito = true;
    //         System.out.println(titolo + "- è stato prestato.");
    // }else
    //     {
    //         System.out.println(titolo + "- è in prestito");
    //     } 

    if(numeroCopie > 0)
    {
        numeroCopie--;
        System.out.println(titolo + " - è stato prestato.");
    }else if (numeroCopie == 0)
    {
        System.out.println(titolo + " - non è disponibile per il prestito.");
    }
}

public void Restituisci()
{
    // if()
    //     { 
    //         //
    //         System.out.println(titolo + "- è stato restituito");
    //     }else
    //     {
    //         System.out.println(titolo + "- non è in prestito");
    //     }
    numeroCopie++;
    System.out.println(titolo + " - è stato restituito.");
}

}
