package must.wikisyllabus.semestre;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SemestreRepository extends JpaRepository<Semestre, Integer> {

}
