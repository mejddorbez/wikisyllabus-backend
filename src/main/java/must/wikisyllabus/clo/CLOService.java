package must.wikisyllabus.clo;

import java.util.List;

public interface CLOService {
	public void addCLO(CLO c);
	public List<CLO> getAll();
	public void deleteCLO(int id);
	public void modifierCLO(int id, CLO c);
	CLO getOne(int id);
}
