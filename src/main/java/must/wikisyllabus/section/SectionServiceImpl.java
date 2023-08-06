package must.wikisyllabus.section;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SectionServiceImpl implements SectionService {

	@Autowired SectionRepository sectionRepo;
	
	@Override
	public void addSection(Section s) {
		sectionRepo.save(s);
	}

	@Override
	public Section getOne(int id) {
		return sectionRepo.findById(id).get();
	}

	@Override
	public List<Section> getAll() {
		return sectionRepo.findAll();
	}

	@Override
	public void deleteSection(int id) {
		sectionRepo.deleteById(id);

	}

	@Override
	public void modifierSection(int id, Section s) {
		Section sd = sectionRepo.findById(id).get();
		sd.setNom(s.getNom());
		//sd.setSemestres(sd.getSemestres());
		sectionRepo.save(sd);

	}

}
