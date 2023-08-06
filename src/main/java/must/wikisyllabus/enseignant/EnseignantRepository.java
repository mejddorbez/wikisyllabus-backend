package must.wikisyllabus.enseignant;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import must.wikisyllabus.module.Module;

@Repository
public interface EnseignantRepository extends JpaRepository<Enseignant, Integer>{

	List<Enseignant> findEnseignantsByModules (Module m);
}
