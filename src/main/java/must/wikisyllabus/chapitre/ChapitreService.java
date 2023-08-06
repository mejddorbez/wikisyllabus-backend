package must.wikisyllabus.chapitre;

import java.util.List;

public interface ChapitreService {

	public void addChapitre(Chapitre c);
	public List<Chapitre> getAll();
	public void deleteChapitre(int id);
	public void modifierChapitre(int id, Chapitre c);
	public List<Chapitre> findSyllabusByIdModule(int id);
	Chapitre getOne(int id);
}
