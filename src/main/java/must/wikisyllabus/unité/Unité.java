package must.wikisyllabus.unité;


import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import must.wikisyllabus.enseignant.Enseignant;
import must.wikisyllabus.module.Module;
import must.wikisyllabus.semestre.Semestre;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Unité {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nom;
	@ManyToOne
	@JoinColumn(name="semestre_id", referencedColumnName = "id")
	private Semestre semestre;
	@ManyToOne
	@JoinColumn(name="resp_id", referencedColumnName = "id")
	private Enseignant responsableUnite;
	@OneToMany(mappedBy = "unité", cascade = CascadeType.ALL)
	private List<Module> modules;
}
