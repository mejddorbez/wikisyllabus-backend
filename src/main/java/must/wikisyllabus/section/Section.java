package must.wikisyllabus.section;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.persistence.IdClass;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import must.wikisyllabus.semestre.Semestre;

@Entity
@Data
@ToString
@NoArgsConstructor
//@IdClass(MyTableId.class)
public class Section {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id; 
	//@Id 
	@Enumerated(EnumType.STRING)
	private Type nom;
	@JsonIgnore
	@OneToMany(mappedBy = "section", cascade = CascadeType.ALL)
	private List<Semestre> semestres;
	
	public Section(Integer id, Type nom) {
		super();
		this.id = id;
		this.nom = nom;
		this.semestres = new ArrayList<>();
	}
}
