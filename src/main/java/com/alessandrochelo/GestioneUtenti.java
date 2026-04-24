package com.alessandrochelo;
import java.util.Scanner;

public class GestioneUtenti {
    Scanner scan = null;
    public GestioneUtenti(Scanner scanner)
    {
      this.scan = scanner;
    }
    
    

    public void utente(Libreria lib, Scanner scanner)
    {
         System.out.println("Digita 1 per visualizza l'elenco dei libri o digita 2 per prendere in prestito un libro o 3 per restituire un libro");
         int numero = scanner.nextInt();
         Utente utente1 = new Utente();

         if(numero == 1)
         {
            utente1.visualizzaElenco(lib);
         } 
         if(numero == 2)
         {
            utente1.prendiInPrestito(lib, scanner);
         }
         if(numero == 3)
         {
            utente1.restituzione(lib, scanner);
         }
    }

    public void amministratore(int numero, Scanner scanner)
    {
        System.out.println(" Digita 1 per inserisre un libro, 2 per modificare, 3 per eliminare");
        int c = scanner.nextInt();
        scanner.nextLine(); // Consuma il newline lasciato da nextInt()
        Amministratore amministratore1 = new Amministratore();

        if(c == 1)
        {
           amministratore1.inserisci(scanner);
        }
        if (c == 2) 
        {
           amministratore1.modifica(scanner);
        }
        if(c == 3)
        {
           amministratore1.elimina();
        }
    }
}
