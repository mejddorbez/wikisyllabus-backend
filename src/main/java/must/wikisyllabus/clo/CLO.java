package must.wikisyllabus.clo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import must.wikisyllabus.module.Module;
import must.wikisyllabus.so.SO;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class CLO {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id private Integer id;
	
	private String description;

	@ManyToMany
	@JoinTable(
			joinColumns = @JoinColumn(name = "clo_id"),
			inverseJoinColumns = @JoinColumn(name = "so_id"))
	private List<SO> SOs;
	
	@ManyToOne
	@JoinColumn(name="module_id", referencedColumnName = "id")
	private Module module;
}
