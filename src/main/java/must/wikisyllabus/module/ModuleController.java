package must.wikisyllabus.module;

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
@RequestMapping("/api/modules")
public class ModuleController {

	@Autowired ModuleServiceImpl moduleService;
	
	@PostMapping
	public void addModule(@RequestBody Module m) {
		moduleService.addModule(m);
	}
	
	@GetMapping("/{id}")
	public Module getOne(@PathVariable(name = "id") int id) {
		return moduleService.getOne(id);
	}
	
	@GetMapping
	public List<Module> getAll() {
		return moduleService.getAll();
	}
	
	@DeleteMapping("/{id}")
	public void deleteModule(@PathVariable(name = "id") int id) {
		moduleService.deleteModule(id);
	}
	
	@PutMapping("/{id}")
	public void updateModule(@PathVariable(name = "id") int id, @RequestBody Module m) {
		moduleService.modifierModule(id, m);
	}
	
	@PostMapping("/{id}/enseignant/{id2}")
	public void affecterEnseignantAUnModule(
			@PathVariable(name="id") int idm,
			@PathVariable(name="id2") int ide
			) {
		moduleService.affecterEnseignantAUnModule(idm, ide);
	}
}
