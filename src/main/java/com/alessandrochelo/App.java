package com.alessandrochelo;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        PassaggioParametri pass = new PassaggioParametri();
        System.out.println("App - Creato oggetto passaggio parametri");
        pass.riceviParametro(args);
        System.out.println("App - Chiamato metodo per ricevere parametro");
        Menu menu = new Menu();
        menu.selezione(pass);
    } 
}
 