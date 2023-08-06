package must.wikisyllabus.clo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CLORepository extends JpaRepository<CLO, Integer> {
}
