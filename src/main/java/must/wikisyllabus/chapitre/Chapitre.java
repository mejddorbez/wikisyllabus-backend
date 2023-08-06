package must.wikisyllabus.chapitre;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import must.wikisyllabus.module.Module;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@IdClass(ChapitreIdKey.class)
public class Chapitre {
	
	@Id private Integer numChapitre;

	private String titreChapitre;
	private String descChapitre;
	private String versionSyllabus;
	
	@ManyToOne
	@JoinColumn(name="module_id", referencedColumnName = "id")
	@JsonIgnore
	@Id private Module module;
}
