package must.wikisyllabus.section;

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
@RequestMapping("/api/sections")
public class SectionController {


	@Autowired SectionServiceImpl sectionService;
	
	@PostMapping
	public void addSection(@RequestBody Section s) {
		sectionService.addSection(s);
	}
	
	@GetMapping("/{id}")
	public Section getOne(@PathVariable(name = "id") int id) {
		return sectionService.getOne(id);
	}
	
	@GetMapping
	public List<Section> getAll() {
		return sectionService.getAll();
	}

	@DeleteMapping("/{id}")
	public void deleteSection(@PathVariable(name = "id") int id) {
		sectionService.deleteSection(id);
	}
	
	@PutMapping("/{id}")
	public void updateSection(@PathVariable(name = "id") int id, @RequestBody Section s) {
		sectionService.modifierSection(id, s);
	}
	
	/*
	@PostMapping("/all")
	public void initSections() {
		sectionService.initSections();
	}
	*/

	/*
	@DeleteMapping
	public void deleteAllSections() {
		sectionService.deleteAllSections();
	}
	*/
}
