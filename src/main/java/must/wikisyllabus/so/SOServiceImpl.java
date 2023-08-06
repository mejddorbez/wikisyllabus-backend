package must.wikisyllabus.so;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SOServiceImpl implements SOService{

	@Autowired SORepository soRepo;
	
	@Override
	public void addSO(SO s) {
		soRepo.save(s);
	}

	@Override
	public List<SO> getAll() {
		return soRepo.findAll();
	}

	@Override
	public void deleteSO(int id) {
		soRepo.deleteById(id);
	}

	@Override
	public void modifierSO(int id, SO s) {
		SO sd = soRepo.findById(id).get();
		sd.setClo(s.getClo());
		sd.setDescription(s.getDescription());
		
	}

	@Override
	public SO getOne(int id) {
		return soRepo.findById(id).get();
	}

}
