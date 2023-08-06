package must.wikisyllabus.semestre;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SemestreServiceImpl implements SemestreService {

	@Autowired SemestreRepository semestreRepo;
	
	public long getNumberSemestresforSectionById(int id) {
		return semestreRepo.findAll()
				.stream()
				.filter(e->e.getSection().getId()== id)
				.count();
	}
	@Override
	public void addSemestre(Semestre s) {

		long count = getNumberSemestresforSectionById(s.getSection().getId());
		
		if (count<2) {
			semestreRepo.save(s);
		}
	}

	@Override
	public Semestre getOne(int id) {
		return semestreRepo.findById(id).get();
	}

	@Override
	public List<Semestre> getAll() {
		return semestreRepo.findAll();
	}

	@Override
	public void deleteSemestre(int id) {
		semestreRepo.deleteById(id);

	}

	@Override
	public void modifierSemestre(int id, Semestre s) {
		Semestre sd = semestreRepo.findById(id).get();
		sd.setNum(s.getNum());
		sd.setSection(s.getSection());
		sd.setTotalCoeff(s.getTotalCoeff());
		sd.setTotalCredit(s.getTotalCredit());
		sd.setTotalVolume(s.getTotalVolume());
		//sd.setSemestres(sd.getSemestres());
		semestreRepo.save(sd);

	}

}
