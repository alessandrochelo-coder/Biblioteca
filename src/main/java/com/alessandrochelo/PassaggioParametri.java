package com.alessandrochelo;

public class PassaggioParametri 
{
   String percorsoFile;

   public PassaggioParametri()
   {

   }

   public void riceviParametro(String[] args)
   {
    if (args.length == 1)
     {
        System.out.println("Il percorso del file è: " + args[0]);
        this.percorsoFile = args[0];
        
     } 
     else 
     {
        System.out.println("Inseirsci solo il percosso Es: java -jar Libreria.jar /home/lora/libreria.json");
     }
   }

   public String getPercorsoFile() {
    return this.percorsoFile;
   }
}
