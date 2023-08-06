package must.wikisyllabus.chapitre;

import java.util.Objects;

import must.wikisyllabus.module.Module;

public class ChapitreIdKey {

	private Integer numChapitre;
	private Module module;
	
	public Integer getNumChapitre() {
		return numChapitre;
	}
	public void setNumChapitre(Integer numChapitre) {
		this.numChapitre = numChapitre;
	}

	public Module getModule() {
		return module;
	}
	public void setModule(Module module) {
		this.module = module;
	}
	@Override
	public int hashCode() {
		return Objects.hash(module, numChapitre);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChapitreIdKey other = (ChapitreIdKey) obj;
		return Objects.equals(module, other.module)
				&& Objects.equals(numChapitre, other.numChapitre);
	}
	

	
	
}
