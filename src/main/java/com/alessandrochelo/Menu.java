package com.alessandrochelo;

import java.util.Scanner;

public class Menu {

        Scanner scanner = new Scanner(System.in);
        int a;
        Libreria lib = new Libreria();
        GestioneUtenti g = new GestioneUtenti(scanner);
        
    public Menu()
    {
       
    }

    public void selezione()
    {
        

        do{
        
        System.out.println("1 Per entrare come utente");
        System.out.println("2 Per entrare come amministratore");
        System.out.println("0 Per uscire");
       
        a = scanner.nextInt();
        
        if(a == 1)
            {
                g.utente(lib, scanner);
            }else if (a == 2)
                {
                    g.amministratore(a, scanner);
                }
        
        
        System.out.println("Libreria inizializzata");
            }while(a !=0);
        scanner.close();
    }

}
