package fr.eni.demo.filmo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.eni.demo.filmo.bo.Film;
import fr.eni.demo.filmo.bo.Genre;



@Service
public interface FilmothequeService {
	public List<Film> ajouterFilm(Film film);
	public List<Film>findAllFilms ();
	public List<Film >listeFilmsEnDure();
	
	
	public List<Genre> ajouterGenre(Genre genre);
	public List<Genre> findAllGenres();
	public List<Genre> ListeGenresEnDure();
}
