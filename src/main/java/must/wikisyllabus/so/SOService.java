package must.wikisyllabus.so;

import java.util.List;

public interface SOService {
	public void addSO(SO s);
	public List<SO> getAll();
	public void deleteSO(int id);
	public void modifierSO(int id, SO s);
	SO getOne(int id);
}