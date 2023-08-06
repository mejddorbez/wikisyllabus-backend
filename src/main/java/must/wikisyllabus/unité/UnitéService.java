package must.wikisyllabus.unité;

import java.util.List;

public interface UnitéService {

	public void addUnité(Unité u);
	public List<Unité> getAll();
	public void deleteUnité(int id);
	public void modifierUnité(int id, Unité u);
	Unité getOne(int id);
}
