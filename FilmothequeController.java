package fr.eni.demo.filmo.bo;




import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import fr.eni.demo.filmotheque.bo.Film;
import fr.eni.demo.filmotheque.bo.Genre;
import fr.eni.demo.filmotheque.bo.Personne;
import fr.eni.demo.filmotheque.services.FilmothequeService;


@Controller
@SessionAttributes("listeFilms")
public class FilmothequeController {
	
	private FilmothequeService filmothequeService;
	
	
	public FilmothequeController(FilmothequeService filmothequeService) {
		this.filmothequeService = filmothequeService;
	}
	
	@ModelAttribute("leBonLaBruteEtLeTruand")
	public Film filmAffichage(Model model) {
		Film film1 = filmothequeService.afficherFilm();
		model.addAttribute("film1",film1
				);
		return  film1;
	}

	@GetMapping({ "/index" })
	public String acceuil(Model model){
		
		ArrayList<Personne> lstLebon = new ArrayList<Personne>();
		Personne WallackEli = new Personne("Wallach","Eli");
		Personne EastwoodClint = new Personne("Eastwood","Clint");
		Personne VanCleefLee = new Personne("Van Cleef","Lee");
		Personne realisateur = new Personne ("Leone","Sergio");
		lstLebon.add(WallackEli);
		lstLebon.add(EastwoodClint);
		lstLebon.add(VanCleefLee);
		
		Film leBonLaBruteEtLeTruand = new Film("Le bon la brute et le truand",1966,179,
		lstLebon,realisateur,new Genre("Western"));
		
		model.addAttribute("leBonLaBruteEtLeTruand",leBonLaBruteEtLeTruand);
		
		return "index";
	}
	
	@ModelAttribute("listeFilms")
	public ArrayList<Film> initListeFilms() {
		return new ArrayList<Film>();
	}
	
	@GetMapping( "/formulaireAjouter" )
	public String afficherFormulaire(Model model) {
		model.addAttribute("filmAjout", new Film());
		
		return "ajouter";
	}
	
	@PostMapping("/formulaireAjouter")
	public String ajouterFilm(@ModelAttribute("filmAjout") Film filmAjout,
			@ModelAttribute("listeFilms") List<Film> listeFilms) {
		System.out.println("dans ajouter");
		listeFilms.add(filmAjout);
		return "redirect:/listeFilms";
	}
	
	@GetMapping({"/listeFilms","/"})
	public String afficherListeFilms() {
		return "listeFilms";
	}

	@RequestMapping("/afficher")
	public String bonjour(@RequestParam Film film1) {
		System.out.println("Film" + film1);
		return "afficher";
	}
	
}
