package must.wikisyllabus.module;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import must.wikisyllabus.enseignant.Enseignant;
import must.wikisyllabus.enseignant.EnseignantRepository;

@Service
public class ModuleServiceImpl implements ModuleService {

	@Autowired ModuleRepository moduleRepo;
	@Autowired EnseignantRepository enseignantRepo;
	
	@Override
	public void addModule(Module m) {
		moduleRepo.save(m);

	}

	@Override
	public List<Module> getAll() {
		return moduleRepo.findAll();
	}

	@Override
	public void deleteModule(int id) {
		moduleRepo.deleteById(id);
	}

	@Override
	public void modifierModule(int id, Module m) {
		Module md = moduleRepo.findById(id).get();
		md.setNom(m.getNom());
		md.setCLOs(m.getCLOs());
		md.setCoeff(m.getCoeff());
		md.setEnseignants(m.getEnseignants());
		md.setMotCles(md.getMotCles());
		md.setPreRequis(m.getPreRequis());
		md.setRéférences(m.getRéférences());
		md.setSyllabus(m.getSyllabus());
		md.setUnité(m.getUnité());
		md.setVolumesHoraires(m.getVolumesHoraires());
		moduleRepo.save(md);
	}

	@Override
	public Module getOne(int id) {
		return moduleRepo.findById(id).get();
	}

	@Override
	public void affecterEnseignantAUnModule(int idm, int ide) {
		Module md = moduleRepo.findById(idm).get();
		Enseignant me = enseignantRepo.findById(ide).get();
		md.addEnseignant(me);
		addModule(md);
	}



	
}
