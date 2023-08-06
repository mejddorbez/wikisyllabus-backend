package must.wikisyllabus.semestre;

import java.util.List;

public interface SemestreService {
	
	public void addSemestre(Semestre s);
	public List<Semestre> getAll();
	public void deleteSemestre(int id);
	public void modifierSemestre(int id, Semestre s);
	Semestre getOne(int id);
}
