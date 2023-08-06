package must.wikisyllabus.so;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SORepository extends JpaRepository<SO, Integer> {}
