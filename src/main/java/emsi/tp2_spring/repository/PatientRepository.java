package emsi.tp2_spring.repository;

import emsi.tp2_spring.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient,Long> {
@Query("select p from Patient p where p.nom like %:x% ")
    List<Patient> ChercherPatient(@Param("x") String name);
Patient findByNom(String name);

}
