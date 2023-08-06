package must.wikisyllabus.section;

import java.util.List;

public interface SectionService {

	public void addSection(Section s);
	public List<Section> getAll();
	public void deleteSection(int id);
	public void modifierSection(int id, Section s);
	Section getOne(int id);
}
