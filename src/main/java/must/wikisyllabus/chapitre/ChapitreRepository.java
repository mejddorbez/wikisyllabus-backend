package must.wikisyllabus.chapitre;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import must.wikisyllabus.module.Module;

@Repository
public interface ChapitreRepository extends JpaRepository<Chapitre, Integer> {

	public List<Chapitre> findChapitresByModule(Module m);
}
