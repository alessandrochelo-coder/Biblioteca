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
        pass.riceviParametro(args);

        Menu menu = new Menu();
        menu.selezione(pass);
    } 
}
 