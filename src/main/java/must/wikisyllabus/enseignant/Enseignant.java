package must.wikisyllabus.enseignant;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import must.wikisyllabus.module.Module;
import must.wikisyllabus.unité.Unité;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Enseignant {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Integer id;
	private String nom;
	private String prenom;
	private String grade;
	private String pwd;
	private boolean isComité;
	@JsonIgnore
	@OneToMany(mappedBy = "responsableUnite", cascade = CascadeType.ALL)
	private List<Unité> unites;

	@JsonIgnore
	@ManyToMany(mappedBy = "enseignants")
	private List<Module> modules;
	
	public Enseignant(Integer id, String nom, String prenom, String grade) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.grade = grade;
		this.isComité = false;
	}
}
