package com.alessandrochelo.utils;


import com.alessandrochelo.gson.Catalogo;
import com.alessandrochelo.gson.Libro;
import com.alessandrochelo.utils.Utils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import java.util.List;
import java.util.Map;


public class Utils {

	Libro libroConStatoPrestitoAggiornato;

	public Utils() {

	}

	public void caricaMappa(Map<Integer, Libro> mappaLibriAggiornata) {
		List<Libro> listaLibriAggiornata = new ArrayList<>();

		for (Libro libroDaMappa : mappaLibriAggiornata.values()) {
			listaLibriAggiornata.add(libroDaMappa);
		}

		Catalogo catalogoAggiornato = new Catalogo();
		catalogoAggiornato.setLista(listaLibriAggiornata);
		Gson gson = new GsonBuilder().setPrettyPrinting().create();

		try (FileWriter writer = new FileWriter(
				"C:\\\\Java-workspace\\\\libreria\\\\src\\\\main\\\\java\\\\com\\\\alessandrochelo\\\\Libreria.json")) {
			gson.toJson(catalogoAggiornato, writer);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
