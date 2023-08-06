package must.wikisyllabus.unité;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnitéRepository extends JpaRepository<Unité, Integer> {}
