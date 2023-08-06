package must.wikisyllabus.so;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import must.wikisyllabus.clo.CLO;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SO {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id private Integer id;
	
	private String description;

	@ManyToOne
	@JoinColumn(name="clo_id", referencedColumnName = "id")
	private CLO clo;
}
