package emsi.tp2_spring.repository;

import emsi.tp2_spring.entities.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedecinRepository extends JpaRepository<Medecin,Long> {
Medecin findByNom(String name);
}
