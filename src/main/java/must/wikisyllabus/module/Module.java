package must.wikisyllabus.module;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import must.wikisyllabus.chapitre.Chapitre;
import must.wikisyllabus.clo.CLO;
import must.wikisyllabus.enseignant.Enseignant;
import must.wikisyllabus.unité.Unité;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Module {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id private Integer id;
	
	private String nom;
	private Integer coeff;
	private String preRequis;
	private String références;
	private String motCles;
	
	@OneToMany(mappedBy="module", cascade = CascadeType.ALL)
	private List<VolumeHoraire> volumesHoraires;

	@ManyToOne
	@JoinColumn(name="unité_id", referencedColumnName = "id")
	private Unité unité;

	@JsonIgnore
	@ManyToMany
	@JoinTable(
			joinColumns = @JoinColumn(name = "module_id"),
			inverseJoinColumns = @JoinColumn(name = "ens_id"))
	private List<Enseignant> enseignants;

	@JsonIgnore
	@OneToMany(mappedBy="module", cascade = CascadeType.ALL)
	private List<Chapitre> syllabus;
	
	@OneToMany(mappedBy="module", cascade = CascadeType.ALL)
	private List<CLO> CLOs;

	public void addEnseignant(Enseignant me) {
		enseignants.add(me);
	}
	
}
