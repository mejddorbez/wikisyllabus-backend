package must.wikisyllabus.unité;

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
@RequestMapping("/api/unités")
public class UnitéController {
	
	@Autowired UnitéServiceImpl unitéService;
	
	@PostMapping
	public void addUnité(@RequestBody Unité u) {
		unitéService.addUnité(u);
	}
	
	@GetMapping("/{id}")
	public Unité getOne(@PathVariable(name = "id") int id) {
		return unitéService.getOne(id);
	}
	
	@GetMapping
	public List<Unité> getAll() {
		return unitéService.getAll();
	}

	@DeleteMapping("/{id}")
	public void deleteUnité(@PathVariable(name = "id") int id) {
		unitéService.deleteUnité(id);
	}
	
	@PutMapping("/{id}")
	public void updateUnité(@PathVariable(name = "id") int id, @RequestBody Unité u) {
		unitéService.modifierUnité(id, u);
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
