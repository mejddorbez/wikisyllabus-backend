package must.wikisyllabus.enseignant;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import must.wikisyllabus.module.Module;
import must.wikisyllabus.module.ModuleRepository;

@Service
public class EnseignantServiceImpl implements EnseignantService {

@Autowired EnseignantRepository enseignantRepo;
@Autowired ModuleRepository moduleRepo;
	
	@Override
	public void addENS(Enseignant e) {
		enseignantRepo.save(e);
	}
	
	@Override
	public Enseignant getOne(Integer Id) {
		return enseignantRepo.findById(Id).get();
	}
	
	@Override
	public List<Enseignant> getAll() {
		return enseignantRepo.findAll();
	}

	@Override
	public void deleteENS(int id) {
		enseignantRepo.deleteById(id);
	}
	
	@Override
	public void updateENS(int id, Enseignant e) {
		Enseignant ed = enseignantRepo.findById(id).get();
		ed.setNom(e.getNom());
		ed.setPrenom(e.getPrenom());
		ed.setPwd(e.getPwd());
		ed.setGrade(e.getGrade());
		ed.setComité(e.isComité());
		ed.setModules(e.getModules());
		ed.setUnites(e.getUnites());
		enseignantRepo.save(ed);
	}

	@Override
	public void deleteAllENS() {
		enseignantRepo.deleteAll();
	}

	public void initENS() {
		Enseignant e1 = new Enseignant(null, "Mejd", "Dorbez", "MA");
		Enseignant e2 = new Enseignant(null, "Hayfa", "Rajhi", "MC");
		Enseignant e3 = new Enseignant(null, "Habib", "Fathallah", "A");
		enseignantRepo.saveAll(Arrays.asList(e1, e2, e3));
	}
	
	@Override
	public List<Enseignant> getEnseignantsByModule(int id) {
		Module m = moduleRepo.findById(id).get();
		return enseignantRepo.findEnseignantsByModules(m);
	}
	/*
	 * String sql1 = "SET @num:=0;";
	 * String sql2 = "UPDATE enseignant SET id = @num := (@num+1);";
	 * String sql3 = "ALTER TABLE enseignant AUTO_INCREMENT = 1;";
	 */

}
