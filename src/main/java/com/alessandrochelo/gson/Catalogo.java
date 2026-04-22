package com.alessandrochelo.gson;

import java.util.ArrayList;
import java.util.List;

import com.alessandrochelo.Libreria;



public class Catalogo
{
  
  public Catalogo()
  {
     
  }

  List<Libro> libri = new ArrayList<>();

  public List<Libro> getLista()
  {
     return libri;
  }

  public void setLista(List<Libro> listaLibri)
  {
     for (Libro libro : listaLibri) 
      {
         libri.add(libro);     
      } 
     
  }
}