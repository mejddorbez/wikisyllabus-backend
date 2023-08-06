package must.wikisyllabus.enseignant;

import java.util.List;

public interface EnseignantService {

	public void addENS(Enseignant e);
	public List<Enseignant> getAll();
	public void deleteENS(int id);
	public void updateENS(int id, Enseignant e);
	Enseignant getOne(Integer Id);
	void deleteAllENS();
	void initENS();
	public List<Enseignant> getEnseignantsByModule(int id);

}
