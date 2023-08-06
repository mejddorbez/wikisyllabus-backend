package must.wikisyllabus.unité;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UnitéServiceImpl implements UnitéService{

	@Autowired UnitéRepository unitéRepo;
	
	@Override
	public void addUnité(Unité u) {
		unitéRepo.save(u);
	}

	@Override
	public List<Unité> getAll() {
		return unitéRepo.findAll();
	}

	@Override
	public void deleteUnité(int id) {
		unitéRepo.deleteById(id);
	}

	@Override
	public void modifierUnité(int id, Unité u) {
		Unité ud = unitéRepo.findById(id).get();
		ud.setNom(u.getNom());
		unitéRepo.save(ud);
	}

	@Override
	public Unité getOne(int id) {
		return unitéRepo.findById(id).get();
	}

}
