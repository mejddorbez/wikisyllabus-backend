package must.wikisyllabus.clo;

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
@RequestMapping("/api/clos")
public class CLOController {

	
	@Autowired CLOServiceImpl cloService;
	
	@PostMapping
	public void addclo(@RequestBody CLO u) {
		cloService.addCLO(u);
	}
	
	@GetMapping("/{id}")
	public CLO getOne(@PathVariable(name = "id") int id) {
		return cloService.getOne(id);
	}
	
	@GetMapping
	public List<CLO> getAll() {
		return cloService.getAll();
	}

	@DeleteMapping("/{id}")
	public void deleteclo(@PathVariable(name = "id") int id) {
		cloService.deleteCLO(id);
	}
	
	@PutMapping("/{id}")
	public void updateclo(@PathVariable(name = "id") int id, @RequestBody CLO u) {
		cloService.modifierCLO(id, u);
	}
	
}
