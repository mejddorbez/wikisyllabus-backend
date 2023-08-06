package must.wikisyllabus.so;

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
@RequestMapping("/api/sos")
public class SOController {

	@Autowired SOServiceImpl soService;
	
	@PostMapping
	public void addSO(@RequestBody SO s) {
		soService.addSO(s);
	}
	
	@GetMapping("/{id}")
	public SO getOne(@PathVariable(name = "id") int id) {
		return soService.getOne(id);
	}
	
	@GetMapping
	public List<SO> getAll() {
		return soService.getAll();
	}

	@DeleteMapping("/{id}")
	public void deleteSO(@PathVariable(name = "id") int id) {
		soService.deleteSO(id);
	}
	
	@PutMapping("/{id}")
	public void updateclo(@PathVariable(name = "id") int id, @RequestBody SO s) {
		soService.modifierSO(id, s);
	}
}
