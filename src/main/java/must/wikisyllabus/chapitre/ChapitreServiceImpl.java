package must.wikisyllabus.chapitre;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import must.wikisyllabus.module.Module;
import must.wikisyllabus.module.ModuleRepository;

@Service
public class ChapitreServiceImpl implements ChapitreService {

	@Autowired ChapitreRepository chapitreRepo;
	@Autowired ModuleRepository moduleRepo;
	
	@Override
	public void addChapitre(Chapitre c) {
		chapitreRepo.save(c);
	}

	@Override
	public List<Chapitre> getAll() {
		return chapitreRepo.findAll();
	}

	@Override
	public void deleteChapitre(int id) {
		chapitreRepo.deleteById(id);
	}

	@Override
	public void modifierChapitre(int id, Chapitre c) {
		Chapitre cd = chapitreRepo.findById(id).get();
		cd.setDescChapitre(c.getDescChapitre());
		cd.setModule(c.getModule());
		cd.setNumChapitre(c.getNumChapitre());
		cd.setTitreChapitre(c.getTitreChapitre());
		chapitreRepo.save(c);
	}

	@Override
	public Chapitre getOne(int id) {
		return chapitreRepo.findById(id).get();
	}

	@Override
	public List<Chapitre> findSyllabusByIdModule(int id, int vers) {
		Module m = moduleRepo.findById(id).get();
		return chapitreRepo.findChapitresByModuleAndVersionSyllabus(m, vers);
	}
}
