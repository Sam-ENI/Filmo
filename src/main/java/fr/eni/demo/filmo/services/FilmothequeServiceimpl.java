package fr.eni.demo.filmo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import fr.eni.demo.filmo.bo.Film;
import fr.eni.demo.filmo.bo.Genre;
import fr.eni.demo.filmo.bo.Personne;

@Service
public class FilmothequeServiceimpl implements FilmothequeService {

	private List<Film> listeFilms;
	private List<Genre> listeGenre;
	private int compteurAppelListeFilmsEnDure = 0;
	private int compteurAppelListeGenresEnDure = 0; 


	public List<Film> ajouterFilm(Film film) {
		if(listeFilms == null) {
			listeFilms = new ArrayList<Film>();
		}
		if(!listeFilms.contains(film)) {
		listeFilms.add(film);
		}
		return listeFilms;
	}

	public List<Film> findAllFilms() {
		return listeFilms;

	}

	public void setListeFilms(List<Film> listeFilms) {
		this.listeFilms = listeFilms;
	}
	
	public List<Film >listeFilmsEnDure(){
		
		
//		Personne WallackEli = new Personne("Wallach","Eli");
//		Personne EastwoodClint = new Personne("Eastwood","Clint");
//		Personne VanCleefLee = new Personne("Van Cleef","Lee");
		Personne realisateurLeBon = new Personne("Leone", "Sergio");
		Personne realisateurRetour = new Personne("Zemeckis","Robert");
		Personne realisateurKong = new Personne("Vogt Roberts","Jordan");
		Film leBonLaBruteEtLeTruand = new Film("Le bon la brute et le truand", 1966, 179, realisateurLeBon,
				new Genre("Western"));
		
		
		Film retourVersLeFutur = new Film("retour vers le futur",1985,116,realisateurRetour,
				new Genre("Science Fiction"));
		
		Film kong = new Film("kong",2017,118,realisateurKong,new Genre("aventure"));
		
		// compteur pour ne pas ajouter plusieurs fois les films à l'appel de l'URL /index
		if (compteurAppelListeFilmsEnDure == 0) {
			ajouterFilm(leBonLaBruteEtLeTruand);
			ajouterFilm(retourVersLeFutur);
			ajouterFilm(kong);
			compteurAppelListeFilmsEnDure +=1;
		}
		
		
		return listeFilms;
		
	}

	public List<Genre> findAllGenres() {
		return listeGenre;
	}

	public void setListeGenre(List<Genre> listeGenre) {
		this.listeGenre = listeGenre;
	}
	
	public List<Genre> ListeGenresEnDure(){
		Genre comedie = new Genre("comedie");
		Genre horreur = new Genre("horreur");
		Genre sciencFiction = new Genre("science fiction");
		Genre policier = new Genre("policier");
		Genre western = new Genre("western");
		Genre action = new Genre("action");
		
		if(compteurAppelListeGenresEnDure == 0 ) {
			ajouterGenre(comedie);
			ajouterGenre(horreur);
			ajouterGenre(sciencFiction);
			ajouterGenre(policier);
			ajouterGenre(western);
			ajouterGenre(action);
			
			compteurAppelListeGenresEnDure+=1;
		}
		return listeGenre;
		
	}

	
	@Override
	public List<Genre> ajouterGenre(Genre genre) {
		if(listeGenre == null) {
			listeGenre = new ArrayList<Genre>();
		}
		if(!listeGenre.contains(genre)) {
			listeGenre.add(genre);
		}
		return listeGenre;
		
	}
	
	

	

}
