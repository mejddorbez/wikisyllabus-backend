package must.wikisyllabus.semestre;

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
@RequestMapping("/api/semestres")
public class SemestreController {


	@Autowired SemestreServiceImpl semestreService;
	
	@PostMapping
	public void addSemestre(@RequestBody Semestre s) {
		semestreService.addSemestre(s);
	}
	
	@GetMapping("/{id}")
	public Semestre getOne(@PathVariable(name = "id") int id) {
		return semestreService.getOne(id);
	}
	
	@GetMapping
	public List<Semestre> getAll() {
		return semestreService.getAll();
	}

	@DeleteMapping("/{id}")
	public void deleteSemestre(@PathVariable(name = "id") int id) {
		semestreService.deleteSemestre(id);
	}
	
	@PutMapping("/{id}")
	public void updateSemestre(@PathVariable(name = "id") int id, @RequestBody Semestre s) {
		semestreService.modifierSemestre(id, s);
	}
	
	/*
	@PostMapping("/all")
	public void initSemestres() {
		semestreService.initSemestres();
	}
	*/

	/*
	@DeleteMapping
	public void deleteAllSemestres() {
		semestreService.deleteAllSemestres();
	}
	*/
	
}
