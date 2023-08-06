package must.wikisyllabus.chapitre;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class ChapitreController {

@Autowired ChapitreServiceImpl chapitreService;
	
	@PostMapping
	public void addChapitre(@RequestBody Chapitre u) {
		chapitreService.addChapitre(u);
	}
	
	@GetMapping("chapitres/{id}")
	public Chapitre getOne(@PathVariable(name = "id") int id) {
		return chapitreService.getOne(id);
	}
	
	@GetMapping("chapitres")
	public List<Chapitre> getAll() {
		return chapitreService.getAll();
	}

	@DeleteMapping("chapitres/{id}")
	public void deleteChapitre(@PathVariable(name = "id") int id) {
		chapitreService.deleteChapitre(id);
	}
	
	@PutMapping("chapitres/{id}")
	public void updateChapitre(@PathVariable(name = "id") int id, @RequestBody Chapitre u) {
		chapitreService.modifierChapitre(id, u);
	}
	
	@GetMapping("syllabus/{id}")
	public List<Chapitre> findSyllabusByIdModule(@PathVariable(name="id") int id) {
		return chapitreService.findSyllabusByIdModule(id);
	}
}
