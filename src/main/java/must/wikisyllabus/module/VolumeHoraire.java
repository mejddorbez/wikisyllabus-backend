package must.wikisyllabus.module;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@IdClass(VolumeHoraireIdKey.class)
public class VolumeHoraire {
	
	private Integer nbSemaine;
	
	@Enumerated(EnumType.STRING)
	@Id private Categorie type;
	
	@ManyToOne
	@JoinColumn(name="module_id", referencedColumnName = "id")
	@Id private Module module;
	
	
}
