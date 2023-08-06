package must.wikisyllabus.module;

import java.io.Serializable;
import java.util.Objects;

public class VolumeHoraireIdKey implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 899945310447171185L;
	
    private Categorie type;
    private Module module;
    
	@Override
	public int hashCode() {
		return Objects.hash(module, type);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VolumeHoraireIdKey other = (VolumeHoraireIdKey) obj;
		return Objects.equals(module, other.module) && type == other.type;
	}
	
	public Categorie getType() {
		return type;
	}
	public void setType(Categorie type) {
		this.type = type;
	}
	public Module getModule() {
		return module;
	}
	public void setModule(Module module) {
		this.module = module;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}	
}