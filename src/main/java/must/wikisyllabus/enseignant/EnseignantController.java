package must.wikisyllabus.enseignant;

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

@RequestMapping("/api/enseignants")
@RestController
public class EnseignantController {

	@Autowired EnseignantServiceImpl enseignantService;
	
	@PostMapping
	public void addENS(@RequestBody Enseignant e) {
		enseignantService.addENS(e);
	}
	
	@GetMapping("/{id}")
	public Enseignant getOne(@PathVariable(name = "id") int id) {
		return enseignantService.getOne(id);
	}
	
	@GetMapping
	public List<Enseignant> getAll() {
		return enseignantService.getAll();
	}

	@DeleteMapping("/{id}")
	public void deleteENS(@PathVariable(name = "id") int id) {
		enseignantService.deleteENS(id);
	}
	
	@PutMapping("/{id}")
	public void updateENS(@PathVariable(name = "id") int id, @RequestBody Enseignant e) {
		enseignantService.updateENS(id, e);
	}
	@PostMapping("/all")
	public void initENS() {
		enseignantService.initENS();
	}

	@DeleteMapping
	public void deleteAllENS() {
		enseignantService.deleteAllENS();
	}
	

	@GetMapping("modules/{id}")
	public List<Enseignant> test(@PathVariable(name = "id") int id){
		return enseignantService.getEnseignantsByModule(id);
	}
}
