package fr.eni.demo.filmo.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.eni.demo.filmo.bo.Film;
import fr.eni.demo.filmo.bo.Genre;
import fr.eni.demo.filmo.services.FilmothequeService;

@Controller
public class FilmoController {

	private FilmothequeService filmothequeService;

	public FilmoController(FilmothequeService filmothequeService) {
		super();
		this.filmothequeService = filmothequeService;
	}

	@GetMapping({ "/index", "/" })
	public String acceuil(Model model) {
		filmothequeService.listeFilmsEnDure();
		List<Film> listeFilms = filmothequeService.findAllFilms();
		
		model.addAttribute("listeFilms", listeFilms);

		return "index";
	}

	@GetMapping({ "/ajouter" })
	public String afficherFormulaireAjouter(Model model) {
		filmothequeService.ListeGenresEnDure();
		List<Genre> listeGenres = filmothequeService.findAllGenres();
		model.addAttribute("listeGenres",listeGenres);
		model.addAttribute("filmAjout", new Film());
		System.out.println("dans ajouter");

		return "ajouter";
	}

	@PostMapping("/ajouter")
	public String ajouter(@ModelAttribute("filmAjout") Film filmAjout, Model model) {
		
		filmothequeService.ajouterFilm(filmAjout);
		List<Film> listeFilms = filmothequeService.findAllFilms();
		System.out.println(listeFilms);
		model.addAttribute("listeFilms", listeFilms);
		return "redirect:/index";

	}
	@GetMapping({ "/detail/{id}" })
	public String afficherDetailFilm(@PathVariable("id") int id, Model model) {
		List<Film> listeFilms = filmothequeService.findAllFilms();
		
		for (Film film : listeFilms) {
			if (film.getFilmId() == id) {
				model.addAttribute("film",film);
			}
		}
		

		return "detail";
	}

}
