package must.wikisyllabus.module;

import java.util.List;

public interface ModuleService {
	
	public void addModule(Module m);
	public List<Module> getAll();
	public void deleteModule(int id);
	public void modifierModule(int id, Module m);
	public Module getOne(int id);
	public void affecterEnseignantAUnModule(int idm, int ide);
}
