package must.wikisyllabus.semestre;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import must.wikisyllabus.section.Section;
import must.wikisyllabus.unité.Unité;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table (name="semestre")
public class Semestre {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	//@ManyToOne
	//@JoinColumn(name = "id")
	private Integer id; 
	private Integer totalCoeff;
	private Integer totalVolume;
	private Integer totalCredit;
	private Integer num;
	@ManyToOne
	@JoinColumn(name="section_id", referencedColumnName = "id")
	private Section section;
	@JsonIgnore
	@OneToMany(mappedBy = "semestre", cascade = CascadeType.ALL)
	private List<Unité> unites;
}