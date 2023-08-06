package must.wikisyllabus.clo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CLOServiceImpl implements CLOService {

	@Autowired CLORepository cloRepo;
	
	@Override
	public void addCLO(CLO c) {
		cloRepo.save(c);
	}

	@Override
	public void deleteCLO(int id) {
		cloRepo.deleteById(id);
	}

	@Override
	public void modifierCLO(int id, CLO c) {
		CLO cd = cloRepo.findById(id).get();
		cd.setDescription(c.getDescription());
		cd.setModule(c.getModule());
		cd.setSOs(c.getSOs());
		cloRepo.save(cd);
	}

	@Override
	public CLO getOne(int id) {
		return cloRepo.findById(id).get();
	}

	@Override
	public List<CLO> getAll() {
		return cloRepo.findAll();
	}

}
